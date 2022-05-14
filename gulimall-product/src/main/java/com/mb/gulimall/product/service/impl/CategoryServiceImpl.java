package com.mb.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mb.common.utils.PageUtils;
import com.mb.common.utils.Query;

import com.mb.gulimall.product.dao.CategoryDao;
import com.mb.gulimall.product.entity.CategoryEntity;
import com.mb.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

//    @Autowired
//    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }
    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有的分类
        List<CategoryEntity> entityList = baseMapper.selectList(null);

        //组装成父子的树形结构

        //找到所有的以及分类
        List<CategoryEntity> level1Menus = entityList
                .stream()
                .filter((categoryEntity) -> categoryEntity.getParentCid() == 0)
                .map((menu)->{
                    menu.setChildren(getChildrens(menu,entityList));
                    return menu;
                })
                .sorted((menu1,menu2) -> {
                    return (menu1.getSort() == null ? 0 : (menu1.getSort()) - (menu2.getSort()==null ? 0:(menu2.getSort())));})
                .collect(Collectors.toList());


        return level1Menus;
    }

    //递归找所有的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all){
        List<CategoryEntity> collect = all
                .stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId())
                .map(categoryEntity -> {
                    //找到子菜单
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;
                })
                .sorted((menu1,menu2)->{
                    return (menu1.getSort() == null ? 0 : (menu1.getSort()) - (menu2.getSort()==null ? 0:(menu2.getSort())));
                })
                .collect(Collectors.toList());


        return collect;
    }


}

package com.mb.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mb.gulimall.product.entity.BrandEntity;
import com.mb.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.function.Consumer;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }
    @Test
    void test() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("这是小米手机");
        brandService.updateById(brandEntity);
        System.out.println("保存成功");
    }
    @Test
    void test1() {
        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("brand_id",1L);
        List<BrandEntity> list = brandService.list(wrapper);
        list.forEach(System.out::println);

    }




}

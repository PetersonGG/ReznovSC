package com.mb.gulimall.coupon;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用Nacos作为配置中心统一 管理配置
 * 1)、引入依赖,
 <dependency>
 <groupId>com. alibaba. cloud</groupId>
 <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 </dependency>
 * 2)、创建一个bootstrap. properties。
        spring. application. name=gulimal L - coupon
        spring.cloud. nacos. config. server-addr=127.0.0.1:8848
 * 3)、需要给配置中心默认添加一个叫数据集(Data Id) gul imall-coupon. properties. 默认规则，应用名.propertid
 * 4)、给应用名.properties添加任何配置
 * 5)、动态获取配置。
        @RefreshScope:动态获取并刷新配置
        @Value( "${配置项的名}"):获取到配置。
 如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
  *2.细节
  *1)、命名空间
         * 默认 public ：默认新增的所有配置都在public
         1.开发，测试，生产：利用命名空间来做环境隔离
             注意：在bootstrap.properties;配置上，需要使用阿哥命名空间下的配置
             spring.cloud.nacos.config.namespace=50eb6f5e-ac6a-489d-a5e7-669bc60a9844
         2、每一个微服务之间互相隔离配置，每一一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置

  2)、配置集：所有配置的集合
  3)、配置集ID：类似文件名
      Data ID：
  4)、配置分组：
        默认所有的配置集都属于：DEFAULT_GROUP:
        1111
每个微服务创建自己的命名空间，使用配置分组区分环境，dev, test, prod  在bootstrap.properties
spring.cloud.nacos.config.namespace=c616cf77-d859-441d-bf4e-6233c3a7df91
使用分组
spring.cloud.nacos.config.group=1111

        3、同时加载多个配置集
        1)、微服务任何配置信息，任何配置文件都可以放在配置中心中
        2)、只需要在bootstrap. properties说明加载配置中心中哪些配置文件即可
        3)、@Value, @ConfigurationProperties。 。。
        以前SpringBoot任何方法从配置文件中获取值，都能使用。
        配置中心有的优先使用配置中心中的，

 */


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.mb.gulimall.coupon.dao")
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}

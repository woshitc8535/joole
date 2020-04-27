package com.itlize.jooleSpringBoot.services.serviceImp;

import com.itlize.jooleSpringBoot.entities.Product;
import com.itlize.jooleSpringBoot.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceImpTest {
    @Autowired
    private ProductService productService;

    @Test
    void creatProduct() {
        Product product = new Product();
        product.setProductType("HVAC Fans");
        product.setManufacturer("Big ass");
        product.setSeries("Haiku H");
        product.setModel("S3150-S0-BC-04-01-C-01");
        product.setType("Commercial");
        product.setApplication("Indoor");
        product.setMountingLocation("Roof");
        product.setAccessories("With light");
        product.setModelYear("2016");
        product.setAirflow("5467");
        product.setPowerMin("1.95");
        product.setPowerMax("21.14");
        product.setOperatingVoltageMin("100");
        product.setOperatingVoltageMax("240");
        product.setFanSpeedMin("35");
        product.setFanSpeedMax("200");
        product.setNumberOfFanSpeeds("7");
        product.setSoundAtMaxSpeed("35");
        product.setFanSweepDiameter("60");
        product.setHeightMin("12.3");
        product.setHeightMax("57");
        product.setWeight("13");
        product.setUrl("https://storage.cloud.google.com/wliu-bucket/1.png");

        Product product1 = new Product();
        product1.setProductType("HVAC Fans");
        product1.setManufacturer("Emerson");
        product1.setSeries("Luray Eco");
        product1.setModel("CF860");
        product1.setType("Commercial");
        product1.setApplication("Indoor");
        product1.setMountingLocation("Roof");
        product1.setAccessories("With light");
        product1.setModelYear("2014");
        product1.setAirflow("8500");
        product1.setPowerMin("2.85");
        product1.setPowerMax("33.00");
        product1.setOperatingVoltageMin("100");
        product1.setOperatingVoltageMax("240");
        product1.setFanSpeedMin("46");
        product1.setFanSpeedMax("240");
        product1.setNumberOfFanSpeeds("8");
        product1.setSoundAtMaxSpeed("31");
        product1.setFanSweepDiameter("60");
        product1.setHeightMin("10.2");
        product1.setHeightMax("60.5");
        product1.setWeight("14");
        product1.setUrl("https://storage.cloud.google.com/wliu-bucket/2.png");

        Product product2 = new Product();
        product2.setProductType("HVAC Other");
        product2.setManufacturer("Big");
        product2.setSeries("KaFuKa H");
        product2.setModel("BC-04-01-C-01");
        product2.setType("Commercial");
        product2.setApplication("Indoor");
        product2.setMountingLocation("Roof");
        product2.setAccessories("With light");
        product2.setModelYear("2016");
        product2.setAirflow("5467");
        product2.setPowerMin("1.95");
        product2.setPowerMax("21.14");
        product2.setOperatingVoltageMin("100");
        product2.setOperatingVoltageMax("240");
        product2.setFanSpeedMin("35");
        product2.setFanSpeedMax("200");
        product2.setNumberOfFanSpeeds("7");
        product2.setSoundAtMaxSpeed("35");
        product2.setFanSweepDiameter("60");
        product2.setHeightMin("12.3");
        product2.setHeightMax("57");
        product2.setWeight("13");
        product2.setUrl("https://storage.cloud.google.com/wliu-bucket/3.png");


        Product product3 = new Product();
        product3.setProductType("AVAC Fans");
        product3.setManufacturer("Big boot");
        product3.setSeries("Hello Ass");
        product3.setUrl("https://storage.cloud.google.com/wliu-bucket/4.png");

        Product product4 = new Product();
        product4.setProductType("HVAC Fans");
        product4.setManufacturer("Jerson");
        product4.setSeries("Luray ");
        product4.setModel("CF860-873");
        product4.setType("Residential");
        product4.setApplication("Outdoor");
        product4.setMountingLocation("Wall");
        product4.setAccessories("With light");
        product4.setModelYear("2010");
        product4.setAirflow("4500");
        product4.setPowerMin("1.85");
        product4.setPowerMax("20.00");
        product4.setOperatingVoltageMin("100");
        product4.setOperatingVoltageMax("240");
        product4.setFanSpeedMin("46");
        product4.setFanSpeedMax("240");
        product4.setNumberOfFanSpeeds("8");
        product4.setSoundAtMaxSpeed("31");
        product4.setFanSweepDiameter("60");
        product4.setHeightMin("10.2");
        product4.setHeightMax("60.5");
        product4.setWeight("14");
        product4.setUrl("https://storage.cloud.google.com/wliu-bucket/2.png");

        Product product5 = new Product();
        product5.setProductType("HVAC Fans");
        product5.setManufacturer("Minka");
        product5.setSeries("Aviation");
        product5.setModel("F853-RW");
        product5.setType("Commercial");
        product5.setApplication("Indoor");
        product5.setMountingLocation("Roof");
        product5.setAccessories("With light");
        product5.setModelYear("2000");
        product5.setAirflow("6604");
        product5.setPowerMin("4.85");
        product5.setPowerMax("39.00");
        product5.setOperatingVoltageMin("90");
        product5.setOperatingVoltageMax("340");
        product5.setFanSpeedMin("50");
        product5.setFanSpeedMax("250");
        product5.setNumberOfFanSpeeds("8");
        product5.setSoundAtMaxSpeed("31");
        product5.setFanSweepDiameter("60");
        product5.setHeightMin("10.2");
        product5.setHeightMax("60.5");
        product5.setWeight("14");
        product5.setUrl("https://storage.cloud.google.com/wliu-bucket/3.png");

        Product product6 = new Product();
        product6.setProductType("HVAC Fans");
        product6.setManufacturer("WestingHouse");
        product6.setSeries("Industrial celling");
        product6.setModel("S3150-s0-BC-04-01-C-01");
        product6.setType("Industrial");
        product6.setApplication("Indoor");
        product6.setMountingLocation("Roof");
        product6.setAccessories("With light");
        product6.setModelYear("2014");
        product6.setAirflow("5467");
        product6.setPowerMin("1.85");
        product6.setPowerMax("23.00");
        product6.setOperatingVoltageMin("80");
        product6.setOperatingVoltageMax("140");
        product6.setFanSpeedMin("46");
        product6.setFanSpeedMax("240");
        product6.setNumberOfFanSpeeds("8");
        product6.setSoundAtMaxSpeed("31");
        product6.setFanSweepDiameter("60");
        product6.setHeightMin("10.2");
        product6.setHeightMax("60.5");
        product6.setWeight("14");
        product6.setUrl("https://storage.cloud.google.com/wliu-bucket/4.png");


        productService.creatProduct(product);
        productService.creatProduct(product1);
        productService.creatProduct(product2);
        productService.creatProduct(product3);
        productService.creatProduct(product4);
        productService.creatProduct(product5);
        productService.creatProduct(product6);
    }

    @Test
    void findByProductType() {
    }

    @Test
    void findAllProduct() {
    }
}

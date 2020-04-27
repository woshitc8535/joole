package com.itlize.jooleSpringBoot.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String manufacturer;
    @Column(name = "productType")
    private String productType;

    @JsonIgnore
    @OneToMany(targetEntity = ProductToProject.class, cascade = CascadeType.REMOVE, mappedBy = "product")
    private Set<Project> projects = new HashSet<>();

    private String series;

    private String model;

    private String type;

    private String application;

    private String mountingLocation;

    private String accessories;

    private String modelYear;

    private String airflow;
    private String powerMax;
    private String powerMin;
    private String OperatingVoltageMax;
    private String OperatingVoltageMin;
    private String FanSpeedMax;
    private String FanSpeedMin;
    private String NumberOfFanSpeeds;

    private String SoundAtMaxSpeed;
    private String FanSweepDiameter;
    private String HeightMin;
    private String HeightMax;
    private String Weight;

    private String url;


    public Product() {
    }

    public Product(String productType, String series ,String manufacturer, String model, String type, String application, String mountingLocation, String accessories, String modelYear, String airflow, String powerMax, String powerMin, String operatingVoltageMax, String operatingVoltageMin, String fanSpeedMax, String fanSpeedMin, String numberOfFanSpeeds, String soundAtMaxSpeed, String fanSweepDiameter, String heightMin, String heightMax, String weight) {
        this.productType = productType;
        this.manufacturer = manufacturer;
        this.series = series;
        this.model = model;
        this.type = type;
        this.application = application;
        this.mountingLocation = mountingLocation;
        this.accessories = accessories;
        this.modelYear = modelYear;
        this.airflow = airflow;
        this.powerMax = powerMax;
        this.powerMin = powerMin;
        OperatingVoltageMax = operatingVoltageMax;
        OperatingVoltageMin = operatingVoltageMin;
        FanSpeedMax = fanSpeedMax;
        FanSpeedMin = fanSpeedMin;
        NumberOfFanSpeeds = numberOfFanSpeeds;
        SoundAtMaxSpeed = soundAtMaxSpeed;
        FanSweepDiameter = fanSweepDiameter;
        HeightMin = heightMin;
        HeightMax = heightMax;
        Weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMountingLocation() {
        return mountingLocation;
    }

    public void setMountingLocation(String mountingLocation) {
        this.mountingLocation = mountingLocation;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getAirflow() {
        return airflow;
    }

    public void setAirflow(String airflow) {
        this.airflow = airflow;
    }

    public String getPowerMax() {
        return powerMax;
    }

    public void setPowerMax(String powerMax) {
        this.powerMax = powerMax;
    }

    public String getPowerMin() {
        return powerMin;
    }

    public void setPowerMin(String powerMin) {
        this.powerMin = powerMin;
    }

    public String getOperatingVoltageMax() {
        return OperatingVoltageMax;
    }

    public void setOperatingVoltageMax(String operatingVoltageMax) {
        OperatingVoltageMax = operatingVoltageMax;
    }

    public String getOperatingVoltageMin() {
        return OperatingVoltageMin;
    }

    public void setOperatingVoltageMin(String operatingVoltageMin) {
        OperatingVoltageMin = operatingVoltageMin;
    }

    public String getFanSpeedMax() {
        return FanSpeedMax;
    }

    public void setFanSpeedMax(String fanSpeedMax) {
        FanSpeedMax = fanSpeedMax;
    }

    public String getFanSpeedMin() {
        return FanSpeedMin;
    }

    public void setFanSpeedMin(String fanSpeedMin) {
        FanSpeedMin = fanSpeedMin;
    }

    public String getNumberOfFanSpeeds() {
        return NumberOfFanSpeeds;
    }

    public void setNumberOfFanSpeeds(String numberOfFanSpeeds) {
        NumberOfFanSpeeds = numberOfFanSpeeds;
    }

    public String getSoundAtMaxSpeed() {
        return SoundAtMaxSpeed;
    }

    public void setSoundAtMaxSpeed(String soundAtMaxSpeed) {
        SoundAtMaxSpeed = soundAtMaxSpeed;
    }

    public String getFanSweepDiameter() {
        return FanSweepDiameter;
    }

    public void setFanSweepDiameter(String fanSweepDiameter) {
        FanSweepDiameter = fanSweepDiameter;
    }

    public String getHeightMin() {
        return HeightMin;
    }

    public void setHeightMin(String heightMin) {
        HeightMin = heightMin;
    }

    public String getHeightMax() {
        return HeightMax;
    }

    public void setHeightMax(String heightMax) {
        HeightMax = heightMax;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product(String productType, String manufacturer, String model, String type) {
        this.productType = productType;
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
    }
}

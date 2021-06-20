package com.carwash.service.washing_package_service.model;

public class Washing_Packages {

    private String packageId;
    private String packageName;
    private double packagePrice;
    public Washing_Packages(){

    }
    public Washing_Packages(String packageId, String packageName, double packagePrice) {
        this.packageId = packageId;
        this.packageName = packageName;
        this.packagePrice = packagePrice;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }
}

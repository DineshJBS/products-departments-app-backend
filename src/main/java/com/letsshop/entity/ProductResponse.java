package com.letsshop.entity;

public class ProductResponse {

    private String productName;

    private String deptName;

    public ProductResponse(String productName, String deptName) {
        this.productName = productName;
        this.deptName = deptName;
    }
    public ProductResponse(){}

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "productName='" + productName + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patronas.open.commerce.CatalogVO;

import java.io.Serializable;

/**
 *
 * @author Abhinav Kumar
 */
public class CatalogVO implements Serializable {

    private static final long serialVersionUID = -4299852986776301618L;

    private String sSKU;

    private String vendorID;

    private String vendorName;

    private String productSKU;

    private String skuType;

    private String productID;

    private String productFamilyCode;

    private String productFamilyName;

    public String getsSKU() {
        return sSKU;
    }

    public void setsSKU(String sSKU) {
        this.sSKU = sSKU;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public String getSkuType() {
        return skuType;
    }

    public void setSkuType(String skuType) {
        this.skuType = skuType;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductFamilyCode() {
        return productFamilyCode;
    }

    public void setProductFamilyCode(String productFamilyCode) {
        this.productFamilyCode = productFamilyCode;
    }

    public String getProductFamilyName() {
        return productFamilyName;
    }

    public void setProductFamilyName(String productFamilyName) {
        this.productFamilyName = productFamilyName;
    }

}

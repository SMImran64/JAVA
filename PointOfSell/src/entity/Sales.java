/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Sales {
    
    private int id;
    private String category;
    private String productName;
    private String cutomerName;
    private float unitPrice;
    private float quantity;
    private float discountRate;
    private float totalPrice;
    private float actualPrice;
    private Date date;

    public Sales() {
    }

    public Sales(int id, String category, String productName, String cutomerName, float unitPrice, float quantity, float discountRate, float totalPrice, float actualPrice, Date date) {
        this.id = id;
        this.category = category;
        this.productName = productName;
        this.cutomerName = cutomerName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.totalPrice = totalPrice;
        this.actualPrice = actualPrice;
        this.date = date;
    }

    public Sales(String category, String productName, String cutomerName, float unitPrice, float quantity, float discountRate, float totalPrice, float actualPrice, Date date) {
        this.category = category;
        this.productName = productName;
        this.cutomerName = cutomerName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.totalPrice = totalPrice;
        this.actualPrice = actualPrice;
        this.date = date;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCutomerName() {
        return cutomerName;
    }

    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(float actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    

    
    
    
}

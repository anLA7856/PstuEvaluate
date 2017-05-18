package com.ld.model;



/**
 * Item entity. @author MyEclipse Persistence Tools
 */

public class Item  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String itemName;
     private Float itemWeight;


    // Constructors

    /** default constructor */
    public Item() {
    }

    
    /** full constructor */
    public Item(String itemName, Float itemWeight) {
        this.itemName = itemName;
        this.itemWeight = itemWeight;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Float getItemWeight() {
        return this.itemWeight;
    }
    
    public void setItemWeight(Float itemWeight) {
        this.itemWeight = itemWeight;
    }
   








}
package com.example.hw2;

public class ItemData {
    private Integer itemImage;
    private String itemName;
    private String itemDesc;
    private String itemUrl;

    public ItemData(Integer itemImage, String itemName, String itemDesc, String itemUrl) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemUrl = itemUrl;
    }

    public Integer getItemImage() {
        return itemImage;
    }

    public void setItemImage(Integer itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }
}

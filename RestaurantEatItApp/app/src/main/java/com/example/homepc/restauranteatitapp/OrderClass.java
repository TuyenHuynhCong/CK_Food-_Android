package com.example.homepc.restauranteatitapp;

/**
 * Created by Huỳnh Công Tuyển on 12/12/2019.
 */

public class OrderClass {
    private String Itemid;
    private String Itemname;
    private String Itemquantity;
    public String Itemprice;
    public String ItemIda;

    public OrderClass(String iId, String iName, String iQuantity,String iPrice,String itemIda)
    {
        Itemid = iId;
        Itemname = iName;
        Itemquantity = iQuantity;
        Itemprice = iPrice;
        itemIda = itemIda;

    }


    public String getItemId() {
        return Itemid;
    }

    public String getItemName() {
        return Itemname;
    }

    public String getItemPrice() {return Itemprice;}

    public String getItemquantity() {return Itemquantity;}

    public String getItemIda() {
        return ItemIda;
    }

    public void setItemIda(String itemIda) {
        ItemIda = itemIda;
    }
}

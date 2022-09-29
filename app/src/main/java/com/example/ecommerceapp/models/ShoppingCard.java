package com.example.ecommerceapp.models;

import androidx.room.Entity;

import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.List;


@Entity
public class ShoppingCard {
    @PrimaryKey(autoGenerate = true)
    public int ShoppingCard__ID;

    private int Cust_ID;

    private int Pro_ID;

    public ShoppingCard() {
    }

    public int getShoppingCard__ID() {
        return ShoppingCard__ID;
    }

    public int getCust_ID() {
        return Cust_ID;
    }

    public void setCust_ID(int cust_ID) {
        Cust_ID = cust_ID;
    }



    public int getPro_ID() {
        return Pro_ID;
    }

    public void setPro_ID(int pro_ID) {
        Pro_ID = pro_ID;
    }
}

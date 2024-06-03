package com.example.quanlycuahangbandoanvat.BUS;

import com.example.quanlycuahangbandoanvat.DAO.Callback.OnDataLoadedCallbackCartDetail;
import com.example.quanlycuahangbandoanvat.DTO.Cart;
import com.example.quanlycuahangbandoanvat.DTO.CartDetail;

import java.util.ArrayList;

public class CartDetailBUS {
    private ArrayList<CartDetail> listCartDetail = new ArrayList<>();

    public ArrayList<CartDetail> getListCart() {
        return listCartDetail;
    }

    public void setListCustomer(ArrayList<CartDetail> listCartDetail) {
        this.listCartDetail = listCartDetail;
    }

    public CartDetailBUS(ArrayList<CartDetail> listCartDetail) {
        this.listCartDetail = listCartDetail;
    }

    public CartDetailBUS() {

    }
}
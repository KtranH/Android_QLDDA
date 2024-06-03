package com.example.quanlycuahangbandoanvat.DAO.Callback;

import com.example.quanlycuahangbandoanvat.DTO.Cart;

import java.util.ArrayList;

public interface OnDataLoadedCallbackCart {
    void onDataLoaded(ArrayList<Cart> t);
    void onError(String errorMessage);
}

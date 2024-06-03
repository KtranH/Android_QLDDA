package com.example.quanlycuahangbandoanvat.DAO.Callback;

import com.example.quanlycuahangbandoanvat.DTO.Food;
import com.example.quanlycuahangbandoanvat.DTO.Promotion;

import java.util.ArrayList;

public interface OnDataLoadedCallbackPromotion {
    void onDataLoaded(ArrayList<Promotion> t);
    void onError(String errorMessage);
}

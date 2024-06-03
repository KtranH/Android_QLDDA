package com.example.quanlycuahangbandoanvat.DTO;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CartViewModel extends ViewModel {
    private Cart cart;
    private final MutableLiveData<Cart> cartLiveData = new MutableLiveData<>();
    public LiveData<Cart> getCart() {
        return cartLiveData;
    }

    public void setCart(Cart cart) {
        cartLiveData.setValue(cart);
    }
}

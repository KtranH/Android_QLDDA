package com.example.quanlycuahangbandoanvat.BUS;

import com.example.quanlycuahangbandoanvat.DAO.Callback.CRUDCallback;
import com.example.quanlycuahangbandoanvat.DTO.Cart;
import com.example.quanlycuahangbandoanvat.DTO.Customer;
import com.example.quanlycuahangbandoanvat.DTO.Food;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;

public class CartBUS {
    private ArrayList<Cart> listCart = new ArrayList<>();

    public ArrayList<Cart> getListCart() {
        return listCart;
    }

    public void setListCart(ArrayList<Cart> listCart) {
        this.listCart = listCart;
    }

    public CartBUS(ArrayList<Cart> listCart) {
        this.listCart = listCart;
    }

    public CartBUS() {

    }

    public Cart getCartByCustomerID(String cus_id){
        Cart cart = new Cart();
        if (!cus_id.equals("")){
            for(Cart carts : this.listCart) {
                if(carts.getCus_ID().equals(cus_id)) {
                    cart = carts;
                }
            }
        }
        return cart;
    }

    public Cart getCartByCustomerIDs(String id) {
        int vitri = -1;
        int i = 0;
        while (i <= this.listCart.size() && vitri == -1) {
            if (this.listCart.get(i).getCus_ID().equals(id)) {
                vitri = i;
            } else {
                i++;
            }
        }
        return this.listCart.get(vitri);
    }
}
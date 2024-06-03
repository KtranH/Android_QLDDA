package com.example.quanlycuahangbandoanvat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.quanlycuahangbandoanvat.DAO.FoodDAO;
import com.example.quanlycuahangbandoanvat.DTO.Cart;
import com.example.quanlycuahangbandoanvat.DTO.CartDetail;
import com.example.quanlycuahangbandoanvat.DTO.Food;
import com.example.quanlycuahangbandoanvat.Helper.Formatter;
import com.example.quanlycuahangbandoanvat.R;

import java.util.ArrayList;
import android.content.SharedPreferences;

public class CustomAdapterListViewCart extends ArrayAdapter<Cart> {
    private Context context;
    private int layoutItem;
    private ArrayList<Cart> listCart;
    private ArrayList<CartDetail> listCartDetail;


    public CustomAdapterListViewCart(@NonNull Context context, int layoutItem, @NonNull ArrayList<Cart> listCart) {
        super(context, layoutItem, listCart);
        this.context = context;
        this.layoutItem = layoutItem;
        this.listCart = listCart;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CartDetail cartDetail = listCartDetail.get(position);
        View view = LayoutInflater.from(context).inflate(layoutItem, parent, false);

        //Control
        ImageView imageView = convertView.findViewById(R.id.imageItemCart);
        TextView txtNameFood = convertView.findViewById(R.id.txtFoodName);
        TextView txtTotalFoodItem = convertView.findViewById(R.id.txtTotalFoodItem);
        Button btnRemoveFoodItemInCart = convertView.findViewById(R.id.btnDeleteFood);
        Button btnDeleteQuantity = convertView.findViewById(R.id.btnDeleteQuantity);
        Button btnAddQuantity = convertView.findViewById(R.id.btnAddQuantity);


        return view;
    }

}
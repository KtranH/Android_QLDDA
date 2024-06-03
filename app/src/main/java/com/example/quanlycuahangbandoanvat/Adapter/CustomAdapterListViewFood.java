package com.example.quanlycuahangbandoanvat.Adapter;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.quanlycuahangbandoanvat.BUS.CartBUS;
import com.example.quanlycuahangbandoanvat.BUS.CartDetailBUS;
import com.example.quanlycuahangbandoanvat.DAO.Callback.CRUDCallback;
import com.example.quanlycuahangbandoanvat.DAO.CartDAO;
import com.example.quanlycuahangbandoanvat.DAO.CartDetailDAO;
import com.example.quanlycuahangbandoanvat.DTO.Cart;
import com.example.quanlycuahangbandoanvat.DTO.CartDetail;
import com.example.quanlycuahangbandoanvat.DTO.Customer;
import com.example.quanlycuahangbandoanvat.DTO.CustomerViewModel;
import com.example.quanlycuahangbandoanvat.DTO.Food;
import com.example.quanlycuahangbandoanvat.Helper.Formatter;
import com.example.quanlycuahangbandoanvat.R;

import java.util.ArrayList;

public class CustomAdapterListViewFood extends ArrayAdapter<Food> {
    Context context;
    int layoutItem;
    ArrayList<Food> listFood;
    CartBUS cartBUS = new CartBUS();
    CartDetailBUS cartDetailBUS = new CartDetailBUS();
    CartDAO cartDAO = new CartDAO();
    CartDetailDAO cartDetailDAO = new CartDetailDAO();

    public CustomAdapterListViewFood(@NonNull Context context, int layoutItem, @NonNull ArrayList<Food> listFood) {
        super(context, layoutItem, listFood);
        this.context = context;
        this.layoutItem = layoutItem;
        this.listFood = listFood;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Food food = listFood.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layoutItem, null);
        }

        ImageView imageView = convertView.findViewById(R.id.imgFood);
        String urlImage = food.getFood_Image();

        Glide.with(getContext())
                .load(urlImage)
                .placeholder(R.drawable.logokfc3)
                .error(R.drawable.image_error)
                .into(imageView);

        TextView tvName = convertView.findViewById(R.id.tvFoodName);
        tvName.setText(food.getFood_Name());

        TextView tvPrice = convertView.findViewById(R.id.tvFoodPrice);
        String priceFormat = Formatter.FormatVND(food.getFood_Price());
        tvPrice.setText(priceFormat);

        TextView tvDes = convertView.findViewById(R.id.tvFoodDescription);
        tvDes.setText(String.valueOf(food.getFood_Description()));

        Button btnAddFoodToCart = convertView.findViewById(R.id.btnFoodAddToCart);

        btnAddFoodToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentCustomerID = getCustomerIDFromSharedReferences();
            }
        });

        return convertView;
    }

    private String getCustomerIDFromSharedReferences(){
        SharedPreferences sharedPref = this.context.getSharedPreferences("GUI.MainActivity", Context.MODE_PRIVATE);
        String currentCustomerID = sharedPref.getString("current_customer_id", "");
        return currentCustomerID;
    }
}

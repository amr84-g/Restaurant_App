package com.example.ecommerceapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.activities.ItemViewActivity;

public class DashBoardFragment extends Fragment {

    private Button btn_hamburger,btn_pizza,btn_pasta;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.dashbord_fragment,container,false);

        btn_hamburger = root.findViewById(R.id.btn_hamburger);
        btn_pizza = root.findViewById(R.id.btn_pizza);
        btn_pasta = root.findViewById(R.id.btn_pasta);

        btn_pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendToActivity("pizza");
            }
        });

        btn_hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendToActivity("hamburger");
            }
        });

        btn_pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendToActivity("pasta");
            }
        });
        return  root;
    }



    private void SendToActivity(String s) {
        Intent intent = new Intent(getActivity().getApplicationContext(), ItemViewActivity.class);
        intent.putExtra("val",s);
        startActivity(intent);
    }
}

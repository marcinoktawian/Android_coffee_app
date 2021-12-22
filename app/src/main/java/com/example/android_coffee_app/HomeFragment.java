package com.example.android_coffee_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class HomeFragment extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        this.OnCLickListener(view);

        return view;
    }


    public void OnCLickListener(View view){
        FragmentManager fm = getActivity().getSupportFragmentManager();
        Bundle bundle = new Bundle();
        MethodFragment method = new MethodFragment();

        CardView aeropressView = (CardView) view.findViewById(R.id.cv_aeropress);
        aeropressView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name","Aeropress");
                method.setArguments(bundle);
                fm.beginTransaction().replace(R.id.fragment_container, method).commit();
            }
        });

        CardView chemexView = (CardView) view.findViewById(R.id.cv_chemex);
        chemexView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name","Chemex");
                method.setArguments(bundle);
                fm.beginTransaction().replace(R.id.fragment_container, method).commit();
            }
        });

        CardView dripView = (CardView) view.findViewById(R.id.cv_v60);
        dripView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name","Drip v60");
                method.setArguments(bundle);
                fm.beginTransaction().replace(R.id.fragment_container, method).commit();
            }
        });

        CardView kalitaView = (CardView) view.findViewById(R.id.cv_kalita);
        kalitaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name","Kalita");
                method.setArguments(bundle);
                fm.beginTransaction().replace(R.id.fragment_container, method).commit();
            }
        });

        CardView frenchPressView = (CardView) view.findViewById(R.id.cv_french_press);
        frenchPressView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name","French Press");
                method.setArguments(bundle);
                fm.beginTransaction().replace(R.id.fragment_container, method).commit();
            }
        });

        CardView syphonView = (CardView) view.findViewById(R.id.cv_syphon);
        syphonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name","Syfon");
                method.setArguments(bundle);
                fm.beginTransaction().replace(R.id.fragment_container, method).commit();
            }
        });

        CardView cafetiereView = (CardView) view.findViewById(R.id.cv_cafetiere);
        cafetiereView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name","Kawiarka");
                method.setArguments(bundle);
                fm.beginTransaction().replace(R.id.fragment_container, method).commit();
            }
        });

        CardView randomView = (CardView) view.findViewById(R.id.cv_random);
        randomView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("name","Wylosuj Metodę");
                method.setArguments(bundle);
                fm.beginTransaction().replace(R.id.fragment_container, method).commit();
            }
        });
    }

}
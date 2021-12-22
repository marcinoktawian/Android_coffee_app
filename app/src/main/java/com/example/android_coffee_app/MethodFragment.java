package com.example.android_coffee_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MethodFragment extends Fragment {

    Bundle version;
    String ver;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_method,container,false);
        Bundle extras = getArguments();
        if (extras != null){
            ver = extras.getString("name");
        }

        TextView titleTextView = (TextView) view.findViewById(R.id.tv_method);
        titleTextView.setText(ver);

        return view;

    }
}

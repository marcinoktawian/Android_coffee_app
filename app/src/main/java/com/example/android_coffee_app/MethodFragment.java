package com.example.android_coffee_app;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MethodFragment extends Fragment {

    Bundle version;
    String ver;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_method, container, false);
        Bundle extras = getArguments();
        if (extras != null) {
            ver = extras.getString("name");
        }


        ImageView methodImageView = (ImageView) view.findViewById(R.id.iv_method);

        int drawableId = this.getResources().getIdentifier(ver, "drawable", getContext().getPackageName());
        methodImageView.setImageResource(drawableId);

        TextView titleTextView = (TextView) view.findViewById(R.id.tv_method);
        int resMethodName = this.getResources().getIdentifier("name_" + ver, "string", getContext().getPackageName());
        titleTextView.setText(resMethodName);

        ListView recipeListView = (ListView) view.findViewById(R.id.lw_method);
        HashMap<String, String> recipeList = new HashMap<>();
        recipeList.put("Czas", this.getResources().getString(this.getResources().getIdentifier("time_" + ver, "string", getContext().getPackageName())));
        recipeList.put("Grubość zmielenia", this.getResources().getString(this.getResources().getIdentifier("grind_" + ver, "string", getContext().getPackageName())));
        recipeList.put("Ilość kawy", this.getResources().getString(this.getResources().getIdentifier("coffee_" + ver, "string", getContext().getPackageName())));
        recipeList.put("Ilość wody", this.getResources().getString(this.getResources().getIdentifier("water_" + ver, "string", getContext().getPackageName())));
        recipeList.put("Temperatura wody", this.getResources().getString(this.getResources().getIdentifier("temp_" + ver, "string", getContext().getPackageName())));

        List<HashMap<String, String>> listItems = new ArrayList<>();

        SimpleAdapter adapter = new SimpleAdapter(getContext(), listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.list_item_title, R.id.list_item_text});
        Iterator iterator = recipeList.entrySet().iterator();
        while (iterator.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)iterator.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultsMap);
        }
        recipeListView.setAdapter(adapter);

        return view;

    }
}

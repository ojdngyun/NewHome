package com.example.oliverng.newhome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by OliverNg on 4/16/2015.
 */
public class OneFragment extends Fragment {

    String[] BrandName = {"Brooklyn Bridge", "Golden Gates", "Tower Bridge",
            "Sydney Harbour Bridge", "Cloudy Mountains", "Cracked Dirt",
            "Cathedral", "Shanghai Bay", "Paris", "Eifel Tower", "Paris Bridge"};
    String[] Location = {"New York", "San Francisco", "London", "Sydney",
            "Mountain", "Desert", "Moscow", "Shanghai", "Paris", "Paris", "Paris"};
    int[] rating = {2, 3, 5, 10, 0, 7, 4, 5, 2, 1, 8};
    int[] likes = {1000, 29382, 23094, 49034, 30458, 5820, 23423, 34523, 8539, 2342, 23842};
    int[] saves = {20394, 29503, 89843, 3485, 5202, 8583, 4923, 3592, 34982, 3249, 23948};
    String[] background = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk"};

    Brand[] mBrand;
    RecyclerView mRecyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.one_fragment, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        return rootView;
    }
//git test

    @Override
    public void onResume() {
        super.onResume();

        getBrands();

        BrandAdapter adapter = new BrandAdapter(mBrand, mRecyclerView.getContext());


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(adapter);

    }

    private void getBrands() {
        mBrand = new Brand[BrandName.length];

        for(int i = 0; i < BrandName.length; i++){
            Brand brand = new Brand();

            brand.brandName = BrandName[i];
            brand.background = background[i];
            brand.location = Location[i];
            brand.likes = likes[i];
            brand.saves = saves[i];
            brand.rating = rating[i];

            mBrand[i] = brand;
        }
    }


}

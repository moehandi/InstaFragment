package com.moehandi.instafragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moehandi.instafragment.R;
import com.moehandi.instafragment.activities.MainActivity;


public class SearchFragment extends BaseFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search, container, false);

        ( (MainActivity)getActivity()).updateToolbarTitle("Search");

        return view;
    }

}

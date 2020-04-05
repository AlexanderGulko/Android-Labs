package com.example.lab4_doubleactivitywithwebview;


import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class DetailsFragment extends Fragment {

    private static final String ARG_PARAM1 = "https://www.google.com/";

    private String mParam1;

    public DetailsFragment() {}

    public static DetailsFragment newInstance(String param1) {

        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        // transfer data to the fragment using the Arguments mechanism

        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

            // set the value of the text field i.e. the string that was transmitted using the Arguments mechanism

            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    // override callback method

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // create a new object using webview

        WebView web = view.findViewById(R.id.web_view);

        // setting web settings for correctly work of network components

        WebSettings webSettings = web.getSettings();
        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(webSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setAllowFileAccess(true);

        // if SDK version is greater of 19 then activate hardware acceleration otherwise activate software acceleration

        web.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        web.loadUrl(mParam1);
    }
}

package com.example.lab4_doubleactivitywithwebview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements ChoicePageFragment.OnFragmentInteractionListener {

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.menu,new ChoicePageFragment(),"fragment1")
                .commit();
    }
    @Override
    public void onFragmentInteraction(String result) {

        String url = result;
        switch (result){
            case "Google":
                url = "https://www.google.com/";
                break;
            case "Facebook":
                url = "https://m.facebook.com/";
                break;
            case "Twitter":
                url = "https://mobile.twitter.com/";
                break;
            case "Xda-developers":
                url = "https://www.xda-developers.com/";
                break;
        }

        manager.beginTransaction()
                .add(R.id.details, DetailsFragment.newInstance(url),"fragment2")
                .commit();
    }
}

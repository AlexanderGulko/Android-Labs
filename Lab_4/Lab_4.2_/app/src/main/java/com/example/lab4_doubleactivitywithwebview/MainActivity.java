package com.example.lab4_doubleactivitywithwebview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements ChoicePageFragment.OnFragmentInteractionListener {

    // to manage fragments in Activity, use the FragmentManager object

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to get the FragmentManager object, call the getSupportFragmentManager () method

        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.menu,new ChoicePageFragment(),"fragment1")
                .commit();
    }
    @Override
    public void onFragmentInteraction(String result) {

        String url = result;

        // set a special selection operator

        switch (result){

            // URL setting for required resources

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

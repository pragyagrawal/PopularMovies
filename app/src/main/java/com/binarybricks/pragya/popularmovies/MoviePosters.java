package com.binarybricks.pragya.popularmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MoviePosters extends AppCompatActivity {

    private boolean mTwoPane;
    private static final String MOVIEDETAILFRAGMENT_TAG = "DFTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_posters);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

//        MoviePostersFragment moviePostersFragment = new MoviePostersFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.movie_poster_container,moviePostersFragment,"tag").commit();
//
//        if (findViewById(R.id.movie_detail_container)!= null){
//            // The detail container view will be present only in the large-screen layouts
//            // (res/layout-sw600dp). If this view is present, then the activity should be
//            // in two-pane mode.
//            mTwoPane = true;
//            // In two-pane mode, show the detail view in this activity by
//            // adding or replacing the detail fragment using a
//            // fragment transaction.
//            if(savedInstanceState == null){
//                getSupportFragmentManager().beginTransaction().
//                        replace(R.id.movie_detail_container, new MovieDetailActivityFragment(), MOVIEDETAILFRAGMENT_TAG).commit();
//            }
//        }else {
//            mTwoPane = false;
//        getSupportActionBar().setElevation(0f);
//    }
        setSupportActionBar(toolbar);
}
}
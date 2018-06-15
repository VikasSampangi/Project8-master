package com.example.priyanka2005.railwayapp.inside_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_watc_fragments.ConstructionFragment;
import com.example.priyanka2005.railwayapp.inside_watc_fragments.WorkshopFragment;

public class InsideWatc extends AppCompatActivity {


    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_watc );

        Intent intent = getIntent();
        data = intent.getStringExtra( "reference" );

        switch (data){
            case "construction":
                getSupportFragmentManager().beginTransaction().add( R.id.inside_fragment_container ,new ConstructionFragment()).commit();
                break;
            case "workshop":
                getSupportFragmentManager().beginTransaction().add( R.id.inside_fragment_container ,new WorkshopFragment()).commit();
                break;
        }

    }
}

package com.example.priyanka2005.railwayapp.fragments_nav;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_activities.InsideWatc;

public class WatcFragment extends Fragment implements View.OnClickListener {

    private CardView construction,workshop;
    public WatcFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_watc,container,false);

        construction = (CardView)view.findViewById( R.id.construction );
        workshop = (CardView)view.findViewById( R.id.workshop );

        construction.setOnClickListener( this );
        workshop.setOnClickListener( this );


        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.construction:
                startActivity( new Intent( getContext(), InsideWatc.class ).putExtra( "reference","construction" ) );
                break;
            case R.id.workshop:
                startActivity( new Intent( getContext(), InsideWatc.class ).putExtra( "reference","workshop" ));
                break;
        }
    }
}

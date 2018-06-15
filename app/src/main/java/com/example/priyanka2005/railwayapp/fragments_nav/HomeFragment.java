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
import com.example.priyanka2005.railwayapp.inside_activities.InsideHome;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private CardView principal,infrastructure,faculty,courses,history,aboutus;


    public HomeFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container,false);

        principal = (CardView)view.findViewById( R.id.principalCardView );
        infrastructure = (CardView)view.findViewById( R.id.infrastructureCardView );
        faculty = (CardView)view.findViewById( R.id.facultyCardView );
        courses = (CardView)view.findViewById( R.id.coursesCardView );
        history = (CardView)view.findViewById( R.id.historyCardView );
        aboutus = (CardView)view.findViewById( R.id.aboutusCardView );

        principal.setOnClickListener( this );
        infrastructure.setOnClickListener( this );
        faculty.setOnClickListener( this );
        courses.setOnClickListener( this );
        history.setOnClickListener( this );
        aboutus.setOnClickListener( this );


        return view;
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.principalCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","principal" ) );
                break;
            case R.id.infrastructureCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","infra" ));
                break;
            case R.id.facultyCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","faculty" ) );
                break;
            case R.id.coursesCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","courses" ) );
                break;
            case R.id.historyCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","history" ) );
                break;
            case R.id.aboutusCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","aboutus" ) );
                break;
        }


    }
}

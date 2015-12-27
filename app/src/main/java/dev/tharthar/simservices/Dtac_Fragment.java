package dev.tharthar.simservices;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dtac_Fragment extends Fragment {



    FrameLayout fld1 , fld2 , fld3 , fld4 , fld5 , fld6;



    public Dtac_Fragment() {
        // Required empty public constructor


    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dtac, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // find the id on Dtac Fragment
        fld1 = (FrameLayout) getActivity().findViewById(R.id.fld1);
        fld2 = (FrameLayout) getActivity().findViewById(R.id.fld2);
        fld3 = (FrameLayout) getActivity().findViewById(R.id.fld3);
        fld4 = (FrameLayout) getActivity().findViewById(R.id.fld4);
        fld5 = (FrameLayout) getActivity().findViewById(R.id.fld5);
        fld6 = (FrameLayout) getActivity().findViewById(R.id.fld6);

        // Dtac Fragment - 1 FrameLayout On Click Action
        fld1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("dev.tharthar.simservices.DTAC_LAYOUT_1"));
            }
        });


        // Dtac Fragment - 2 FrameLayout On Click Action
        fld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Dtac Fragment - 3 FrameLayout On Click Action
        fld3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Dtac Fragment - 4 FrameLayout On Click Action
        fld4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Dtac Fragment - 5 FrameLayout On Click Action
        fld5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Dtac Fragment - 6 FrameLayout On Click Action
        fld6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });






    }
}
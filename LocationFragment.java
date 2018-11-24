package com.example.talha.albumlisteningevent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by talha on 30/03/2018.
 */

public class LocationFragment extends Fragment {
    Button button;
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_location, container, false);
        myView.findViewById(R.id.button3).setOnClickListener(mListener);
        return myView;
    }

    private final View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button3:
                    Intent mapIntent = new Intent(getActivity(), MapsActivity.class);
                    startActivity(mapIntent);
                    break;
            }
        }
    };
}

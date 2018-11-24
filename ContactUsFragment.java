package com.example.talha.albumlisteningevent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ShareActionProvider;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by talha on 30/03/2018.
 */

public class ContactUsFragment extends Fragment {
    Button button;
    View newView;
    private ShareActionProvider mShareActionProvider;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        newView = inflater.inflate(R.layout.fragment_contactus, container, false);
        newView.findViewById(R.id.button2).setOnClickListener(shareListener);
        return newView;
    }
    private final View.OnClickListener shareListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button2:
                    Intent shareIntent = new Intent (Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    String shareBody = "2014 Forest Hills Drive album listening event.";
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Share");
                    shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(shareIntent, "Share using:"));
                    break;
            }
        }
    };
}

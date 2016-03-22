package com.example.android.favmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MovieDetailsActivityFragment extends Fragment {

    public MovieDetailsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movie_details, container, false);
        Intent showMovieDetailsFromIntent = getActivity().getIntent();
        String movieDetailsFromIntent = showMovieDetailsFromIntent.getStringExtra(Intent.EXTRA_TEXT);
        TextView detailsTextView = (TextView) rootView.findViewById(R.id.details_text_view);
        detailsTextView.setText(movieDetailsFromIntent);
        return rootView;
    }
}

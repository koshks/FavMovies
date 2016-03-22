package com.example.android.favmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] dummyData = new String[] {
                "FIRST",
                "SECOND",
                "THIRD",
                "FOURTH",
                "FIFTH",
                "SIXTH",
                "SEVENTH",
                "EIGHTH",
                "NINTH",
                "TENS",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON",
                "AND SO ON"

        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(dummyData));

        mForecastAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.image_grod_fragment,
                R.id.imageView,
                weekForecast);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view_thumbnails);
        gridView.setAdapter(mForecastAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String movieDetails = mForecastAdapter.getItem(position);
                Intent showMovieDetails = new Intent(getActivity(), MovieDetailsActivity.class);
                showMovieDetails.putExtra(Intent.EXTRA_TEXT, movieDetails);
                startActivity(showMovieDetails);
            }
        });
        return rootView;
    }
}

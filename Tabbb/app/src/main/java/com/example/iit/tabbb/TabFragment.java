package com.example.iit.tabbb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TabFragment extends Fragment {

    private int position;
    private TextView content;
    private ImageView image;

    public static Fragment getInstance(int position) {
        TabFragment f = new TabFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get data from Argument
        position = getArguments().getInt("position");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view , Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //image = (ImageView) view.findViewById(R.id.image);
        content = (TextView) view.findViewById(R.id.textView);
        setContentView();
    }

    private void setContentView() {
        if (position == 0) {
            //food fragment
           // image.setImageResource(R.mipmap.food);
           // content.setText("This is Food Fragment");
        } else if (position == 1) {
            //movie fragment
           // image.setImageResource(R.mipmap.movie);
            content.setText("This is Movie Fragment");
        } else if (position == 2) {
            //shopping fragment
            //image.setImageResource(R.mipmap.shopping);
            content.setText("This is Shopping Fragment");
        } else {
            //travel fragment
            //image.setImageResource(R.mipmap.travel);
            content.setText("This is Travel Fragment");
        }
    }
}
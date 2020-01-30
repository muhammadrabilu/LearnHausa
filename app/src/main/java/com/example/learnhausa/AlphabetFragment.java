package com.example.learnhausa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class AlphabetFragment extends Fragment {


    ArrayList<Alphabet> alphabets = new ArrayList<Alphabet>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alphabet, container, false);

        alphabets.add(new Alphabet("Bb", R.raw.a_sound));
        alphabets.add(new Alphabet("Cc", R.raw.a_sound));
        alphabets.add(new Alphabet("Dd", R.raw.a_sound));
        alphabets.add(new Alphabet("Ff", R.raw.a_sound));
        alphabets.add(new Alphabet("Gg", R.raw.a_sound));
        alphabets.add(new Alphabet("Hh", R.raw.a_sound));
        alphabets.add(new Alphabet("Jj", R.raw.a_sound));
        alphabets.add(new Alphabet("Kk", R.raw.a_sound));
        alphabets.add(new Alphabet("Ll", R.raw.a_sound));
        alphabets.add(new Alphabet("Mm", R.raw.a_sound));
        alphabets.add(new Alphabet("Nn", R.raw.a_sound));
        alphabets.add(new Alphabet("Rr", R.raw.a_sound));
        alphabets.add(new Alphabet("Ss", R.raw.a_sound));
        alphabets.add(new Alphabet("Tt", R.raw.a_sound));
        alphabets.add(new Alphabet("Yy", R.raw.a_sound));
        alphabets.add(new Alphabet("Zz", R.raw.a_sound));

        recyclerView = view.findViewById(R.id.rvRecycler);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);


        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new AlphabetAdapter(alphabets, getContext());

        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}

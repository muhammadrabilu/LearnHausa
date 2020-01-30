package com.example.learnhausa;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.ViewHolder>{


    ArrayList<Alphabet> alphabets;
     private Context context;
    MediaPlayer mediaPlayer;

    public AlphabetAdapter(ArrayList<Alphabet> alphabets, Context context) {
        this.alphabets = alphabets;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Alphabet alphabet = alphabets.get(position);
        holder.alphabetTv.setText(alphabet.getAlphabet());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(context, alphabet.getAudio());
                mediaPlayer.start();
            }
        });
    }

    @Override
    public int getItemCount() {
        return alphabets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView alphabetTv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            alphabetTv = itemView.findViewById(R.id.tvAlphabet);

        }
    }
}

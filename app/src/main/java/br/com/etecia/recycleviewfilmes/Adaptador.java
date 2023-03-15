package br.com.etecia.recycleviewfilmes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private Context mContexto;
    private List<Filmes> lstFilmes;

    public Adaptador(Context mContexto, List<Filmes> lstFilmes) {
        this.mContexto = mContexto;
        this.lstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //criando classe viewholder
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView idTituloFilme;
        ImageView idImgFIlmes;
        CardView idCardFilmes;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTituloFilme = itemView.findViewById(R.id.idTituloFilme);
            idImgFIlmes = itemView.findViewById(R.id.idImgFilmes);
            idCardFilmes = itemView.findViewById(R.id.idCardFilmes);
        }
    }



}

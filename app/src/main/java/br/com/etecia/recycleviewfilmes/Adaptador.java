package br.com.etecia.recycleviewfilmes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
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
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        //criar layout novo e aplicar
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_filmes,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //Carrega todas as informações de uma página para outra

        holder.idTituloFilme.setText(lstFilmes.get(position).getTitulo());
        holder.idImgFIlmes.setImageResource(lstFilmes.get(position).getImagem());

        holder.idCardFilmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, ApresentaFilmeActivity.class);

                intent.putExtra("Titulo", lstFilmes.get(position).getTitulo());
                intent.putExtra("Categoria", lstFilmes.get(position).getCategoria());
                intent.putExtra("Descricao", lstFilmes.get(position).getDescricao());
                intent.putExtra("ImagemFilme", lstFilmes.get(position).getImagem());

                mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            }
        });
    }

    @Override
    public int getItemCount()
    {
        return lstFilmes.size();
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

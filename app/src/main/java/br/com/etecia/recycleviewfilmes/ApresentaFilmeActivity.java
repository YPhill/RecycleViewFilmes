package br.com.etecia.recycleviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ApresentaFilmeActivity extends AppCompatActivity {


    TextView mTituloFilme, mCategoriaFilme, mDescricao;

    ImageView mImagemFilme;

    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);


        mTituloFilme = findViewById(R.id.aprTituloFilme);
        mCategoriaFilme = findViewById(R.id.aprCategoriaFilme);
        mDescricao = findViewById(R.id.aprDescricao);
        mImagemFilme = findViewById(R.id.aprImagemFilme);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


        Intent intent = getIntent();
        //declarando as variaveis que irão receber o valor
        String titulo, descricao, categoria;
        int imagemFilme;

        titulo = intent.getExtras().getString("titulo");
        descricao = intent.getExtras().getString("descricao");
        categoria = intent.getExtras().getString("categoria");

        imagemFilme = intent.getExtras().getInt("imagemFilme");


        mTituloFilme.setText(titulo);
        mDescricao.setText(descricao);
        mCategoriaFilme.setText(categoria);
        mImagemFilme.setImageResource(imagemFilme);
    }
}
package br.com.etecia.recycleviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;

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

    Toolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);


        mTituloFilme = findViewById(R.id.mTituloFilme);
        mCategoriaFilme = findViewById(R.id.mCategoriaFilme);
        mDescricao = findViewById(R.id.mDescricao);
        mImagemFilme = findViewById(R.id.mImagemFilme);
        btnVoltar = findViewById(R.id.btnVoltar);
        idToolbar = findViewById(R.id.idToolBar);

        //clique o botão toolbar
        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


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
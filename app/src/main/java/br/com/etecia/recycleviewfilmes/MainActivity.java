package br.com.etecia.recycleviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> ListaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Criando a base de dados para carregamento da lista de filmes
        ListaFilmes = new ArrayList<>();

        ListaFilmes.add(
                new Filmes("Conspiração",
                        "Val Kilmer estrela ao lado de Jennifer Esposito e Gary Cole neste filme",
                        "Ação",
                        R.drawable.conspiracao));



        //criando a classe adaptadora e passando os parãmetros
        Adaptador adapter = new Adaptador(getApplicationContext(),ListaFilmes);

    }
}
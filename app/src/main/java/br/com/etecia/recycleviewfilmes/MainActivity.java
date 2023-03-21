package br.com.etecia.recycleviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> ListaFilmes;

    //declarar o recycleView
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //apresentando xml para o java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //Criando a base de dados para carregamento da lista de filmes
        ListaFilmes = new ArrayList<>();

        ListaFilmes.add(
                new Filmes("Conspiração",
                        "Val Kilmer estrela ao lado de Jennifer Esposito e Gary Cole neste filme",
                        "Ação",
                        R.drawable.conspiracao));
        ListaFilmes.add(
        new Filmes("A Viagem",
                "O filme percorre séculos para revelar a formação das almas e o impacto duradouro das ações.",
                "Ação",
                R.drawable.a_viagem));
        ListaFilmes.add(
        new Filmes("Área 51",
                "Área 51 é conhecida como o local ultra secreto em que são feitas experiências com objetos voadores não identificados e possíveis seres de outros planetas.",
                "Terror",
                R.drawable.area_51));
        ListaFilmes.add(
        new Filmes("Linha de ação",
                "Nicholas Hostetler é o prefeito de Nova York, um sujeito arrogante e ambicioso, que se prepara para a reeleição dentro de alguns dias.",
                "Ação",
                R.drawable.linha_de_acao));
        ListaFilmes.add(
        new Filmes("7 Segundos",
                "O superastro de ação é um ladrão profissional que aposta alto e se dá muito mal neste explosivo, brilhante e imprevisível filme policial de suspense.",
                "Ação",
                R.drawable.sete_segundos));
        ListaFilmes.add(
        new Filmes("24 horas",
                "Uma corrida repleta de ação e contra o tempo. Uma equipe de elite da SWAT tem que parar um terrorista que esta matando inocentes e destruindo a cidade de Los Angeles.",
                "Suspense",
                R.drawable.vinteequatro_horas));


        //criando a classe adaptadora e passando os parãmetros
        Adaptador adapter = new Adaptador(getApplicationContext(), ListaFilmes);


        //Tipo de layout (grid)
        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //fixador de tamanho da lista - deixar a lista mais rapida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recycleView ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}


















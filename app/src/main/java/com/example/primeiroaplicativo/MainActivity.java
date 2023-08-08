package com.example.primeiroaplicativo;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primeiroaplicativo.adapter.ProdutosAdaptador;
import com.example.primeiroaplicativo.model.Produtos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView listaProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaProdutos = findViewById(R.id.grid);

        ArrayList<Produtos> produtosArrayList = new ArrayList<Produtos>();
        produtosArrayList.add(new Produtos("Capuccino", "R$ 21,00", R.drawable.capuccino));
        produtosArrayList.add(new Produtos("Croissant", "R$ 9,00", R.drawable.croissant));
        produtosArrayList.add(new Produtos("Espresso", "R$ 12,00", R.drawable.espresso));
        produtosArrayList.add(new Produtos("Pao de Queijo", "R$ 18,00", R.drawable.paodequeijo));
        produtosArrayList.add(new Produtos("Café Coado", "R$ 5,00", R.drawable.cafecoado));

        ProdutosAdaptador adapter = new ProdutosAdaptador(this, produtosArrayList);
        listaProdutos.setAdapter(adapter);
    }
}
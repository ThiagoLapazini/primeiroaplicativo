package com.example.primeiroaplicativo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.primeiroaplicativo.R;
import com.example.primeiroaplicativo.model.Produtos;

import java.util.ArrayList;

public class ProdutosAdaptador extends ArrayAdapter<Produtos> {
    public ProdutosAdaptador(@NonNull Context context, ArrayList<Produtos> produtosArrayList) {
        super(context, 0,produtosArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.produtos_layout, parent, false);
        }
        Produtos produtos = getItem(position);
        TextView viewDeTexto = listItemView.findViewById(R.id.nome_produto);
        viewDeTexto.setText(produtos.getNomeProduto());
        viewDeTexto = listItemView.findViewById(R.id.valor_produto);
        viewDeTexto.setText(produtos.getPrecoProduto());
        ImageView viewDeImagem = listItemView.findViewById(R.id.grid_imagem);
        viewDeImagem.setImageResource(produtos.getImagemProduto());
        return listItemView;
    }
}

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
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.produtos_layout, parent, false);
        }
        Produtos produtos = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.nome_produto);
        courseTV.setText(produtos.getNomeProduto());
        courseTV = listitemView.findViewById(R.id.valor_produto);
        courseTV.setText(produtos.getPrecoProduto());
        ImageView courseIV = listitemView.findViewById(R.id.grid_imagem);
        courseIV.setImageResource(produtos.getImagemProduto());
        return listitemView;
    }
}

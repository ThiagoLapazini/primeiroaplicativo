package com.example.primeiroaplicativo.model;

public class Produtos {

        private String nomeProduto, precoProduto;
        private int imagemProduto;

    public Produtos(String nomeProduto, String precoProduto, int imagemProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.imagemProduto = imagemProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getImagemProduto() {
        return imagemProduto;
    }

    public void setImagemProduto(int imagemProduto) {
        this.imagemProduto = imagemProduto;
    }


}

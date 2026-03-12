
package br.ulbra;


public class livro extends produto {

    private String autor;

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void exibirAutor(){
        System.out.println("Autor: " + autor);
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
    }
}

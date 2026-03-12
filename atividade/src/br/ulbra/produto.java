
package br.ulbra;


public class produto {
   
    private int codigo;
    private String nome;
    private double precoUnitario;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public void descontarBlackFriday(){
        precoUnitario = precoUnitario * 0.8;
    }

    public void exibirDetalhes(){
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + precoUnitario);
    }
}
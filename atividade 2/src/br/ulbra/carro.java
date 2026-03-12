
package br.ulbra;

public class carro extends veiculo{
     private int portas;

    public void setPortas(int portas){
        this.portas = portas;
    }

    public int getPortas(){
        return portas;
    }

    public double calcularSeguro(){
        return getPreco() * 0.05;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Número de portas: " + portas);
        System.out.println("Valor do seguro: " + calcularSeguro());
    }

    
}

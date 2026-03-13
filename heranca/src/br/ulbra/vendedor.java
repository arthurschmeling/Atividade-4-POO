
package br.ulbra;


public class vendedor extends funcionario{
     private double comissao;

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    public double getComissao(){
        return comissao;
    }

    public double calcularSalarioComComissao(){
        return getSalario() + comissao;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário com comissão: " + calcularSalarioComComissao());
    }
}

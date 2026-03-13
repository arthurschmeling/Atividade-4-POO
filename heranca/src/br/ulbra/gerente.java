
package br.ulbra;


public class gerente extends funcionario{
     private String departamento;

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public double calcularBonus(){
        return (getSalario() * 10) / 100;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bônus: " + calcularBonus());
    }
}

package br.ulbra;


public class loja {
  public void testar(){

        eletronico e1 = new eletronico();
        e1.setCodigo(1);
        e1.setNome("Celular");
        e1.setPrecoUnitario(2000);
        e1.setGarantiaMeses(12);

        System.out.println("Garantia estendida: " + e1.calculaGarantiaEstendida());

        livro l1 = new livro();
        l1.setCodigo(2);
        l1.setNome("Java Básico");
        l1.setPrecoUnitario(80);
        l1.setAutor("João Silva");

        l1.exibirAutor();
    }
}  


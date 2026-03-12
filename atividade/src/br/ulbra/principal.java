
package br.ulbra;

import java.util.Scanner;


public class principal {
   public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        produto p = new produto();
        eletronico e = new eletronico();
        livro l = new livro();

        System.out.println("Digite o código do produto:");
        p.setCodigo(ler.nextInt());
        ler.nextLine();

        System.out.println("Digite o nome do produto:");
        p.setNome(ler.nextLine());

        System.out.println("Digite o preço do produto:");
        p.setPrecoUnitario(ler.nextDouble());

        p.descontarBlackFriday();

        System.out.println("Produto com desconto:");
        p.exibirDetalhes();

        System.out.println("Cadastro Eletrônico");

        System.out.println("Código:");
        e.setCodigo(ler.nextInt());
        ler.nextLine();

        System.out.println("Nome:");
        e.setNome(ler.nextLine());

        System.out.println("Preço:");
        e.setPrecoUnitario(ler.nextDouble());

        System.out.println("Garantia (meses):");
        e.setGarantiaMeses(ler.nextInt());

        System.out.println("Garantia estendida: " + e.calculaGarantiaEstendida());
        e.exibirDetalhes();

        ler.nextLine();

        System.out.println("Cadastro Livro");

        System.out.println("Código:");
        l.setCodigo(ler.nextInt());
        ler.nextLine();

        System.out.println("Nome:");
        l.setNome(ler.nextLine());

        System.out.println("Preço:");
        l.setPrecoUnitario(ler.nextDouble());
        ler.nextLine();

        System.out.println("Autor:");
        l.setAutor(ler.nextLine());

        l.exibirAutor();
        l.exibirDetalhes();
    }

}

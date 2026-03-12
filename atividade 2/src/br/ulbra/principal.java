
package br.ulbra;

import java.util.Scanner;


public class principal {
    
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        carro c = new carro();
        moto m = new moto();

        System.out.println("=== Cadastro de Carro ===");

        System.out.println("Marca:");
        c.setMarca(ler.nextLine());

        System.out.println("Modelo:");
        c.setModelo(ler.nextLine());

        System.out.println("Ano:");
        c.setAno(ler.nextInt());

        System.out.println("Preço:");
        c.setPreco(ler.nextDouble());

        System.out.println("Número de portas:");
        c.setPortas(ler.nextInt());

        ler.nextLine();

        System.out.println("=== Cadastro de Moto ===");

        System.out.println("Marca:");
        m.setMarca(ler.nextLine());

        System.out.println("Modelo:");
        m.setModelo(ler.nextLine());

        System.out.println("Ano:");
        m.setAno(ler.nextInt());

        System.out.println("Preço:");
        m.setPreco(ler.nextDouble());

        System.out.println("Cilindradas:");
        m.setCilindradas(ler.nextInt());

        System.out.println("--- Detalhes do Carro ---");
        c.exibirDetalhes();

        System.out.println("--- Detalhes da Moto ---");
        m.exibirDetalhes();

    }
}


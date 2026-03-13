
package br.ulbra;

import java.util.Scanner;


public class principal {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        gerente g = new gerente();
        vendedor v = new vendedor();

        System.out.println("=== Cadastro Gerente ===");

        System.out.println("Nome:");
        g.setNome(ler.nextLine());

        System.out.println("CPF:");
        g.setCpf(ler.nextLine());

        System.out.println("Salário:");
        g.setSalario(ler.nextDouble());
        ler.nextLine();

        System.out.println("Departamento:");
        g.setDepartamento(ler.nextLine());

        System.out.println("Cadastro Vendedor");

        System.out.println("Nome:");
        v.setNome(ler.nextLine());

        System.out.println("CPF:");
        v.setCpf(ler.nextLine());

        System.out.println("Salário:");
        v.setSalario(ler.nextDouble());

        System.out.println("Comissão:");
        v.setComissao(ler.nextDouble());

        System.out.println("----Dados do Gerente----");
        g.exibirDetalhes();

        System.out.println("\n----Dados do Vendedor----");
        v.exibirDetalhes();
    }
}


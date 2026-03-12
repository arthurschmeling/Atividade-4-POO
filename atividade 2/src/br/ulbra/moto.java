
package br.ulbra;

public class moto extends veiculo {
    private int cilindradas;

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    public void exibirCilindradas(){
        System.out.println("Cilindradas: " + cilindradas);
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }

}


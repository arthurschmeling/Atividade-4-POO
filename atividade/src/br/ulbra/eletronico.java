
package br.ulbra;

public class eletronico extends produto {

    private int garantiaMeses;

    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses(){
        return garantiaMeses;
    }

    public int calculaGarantiaEstendida(){
        return garantiaMeses + 12;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Garantia (meses): " + garantiaMeses);
    }
}
package ex02;

public class TitulosDoGoverno implements IRecebivel {
    private int prazo;

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    @Override
    public void calcularValorRecebido(double valor) {
        if(this.prazo == 30){
            valor = valor - (valor * 0.03);
        } else if (this.prazo == 60) {
            valor = valor - (valor * 0.055);
        } else if (this.prazo == 90) {
            valor = valor - (valor * 0.065);
        } else if (prazo > 90) {
            valor = valor - (valor * 0.065) + (1*0.03);
        }
        System.out.println("O valor a ser recebido é de: " +valor);
    }

}

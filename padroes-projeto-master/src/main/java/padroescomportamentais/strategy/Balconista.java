package padroescomportamentais.strategy;

public class Balconista {

    private float caixa;

    public float getCaixa() {
        return caixa;
    }

    public void somarCaixa(float valorCaixa, float valorRecebido) {
        Caixa caixa = new Caixa(valorCaixa, valorRecebido);
        this.caixa = caixa.calcular(new OperacaoReceberCaixa());
    }

    public void subtrairCaixa(float nota1, float nota2) {
        Caixa caixa = new Caixa(nota1, nota2);
        this.caixa = caixa.calcular(new OperacaoTrocoCaixa());
    }


}

package padroescomportamentais.strategy;

public class OperacaoReceberCaixa implements Operacao {

    public float calcular(float valor1, float valor2) {
        return valor1 + valor2;
    }
}

package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalconistaTest {

    @Test
    void deveSomarValorCaixa() {
        Balconista balconista = new Balconista();
        balconista.somarCaixa(400.00f, 149.04f);
        assertEquals(549.04f, balconista.getCaixa());
    }

    @Test
    void deveSubtrairValorCaixa() {
        Balconista balconista = new Balconista();
        balconista.subtrairCaixa(549.04f, 36.24f);
        assertEquals(512.80f, balconista.getCaixa());
    }

}
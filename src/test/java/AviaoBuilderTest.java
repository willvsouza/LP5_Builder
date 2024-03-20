import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AviaoBuilderTest {

    @Test
    void deveRetornarExcecaoParaAviaoSemNumeroDeSerie() {
        try {
            AviaoBuilder aviaoBuilder = new AviaoBuilder();
            Aviao aviao = aviaoBuilder
                    .setFabricante("Boeing")
                    .setTipoMotor("TurboFan")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de série inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAviaoSemFabricante() {
        try {
            AviaoBuilder aviaoBuilder = new AviaoBuilder();
            Aviao aviao = aviaoBuilder
                    .setNumeroDeSerie(101254)
                    .setTipoMotor("TurboFan")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fabricante inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAviaoValido() {
        AviaoBuilder aviaoBuilder = new AviaoBuilder();
        Aviao aviao = aviaoBuilder
                .setNumeroDeSerie(101254)
                .setFabricante("Boeing")
                .setModelo("737 MAX")
                .setNumeroPassageiros(200)
                .build();

        assertNotNull(aviao);
    }
}

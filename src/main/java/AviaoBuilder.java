import java.util.Date;

public class AviaoBuilder {

    private Aviao aviao;

    public AviaoBuilder() {
        aviao = new Aviao();
    }

    public Aviao build() {
        if (aviao.getNumeroDeSerie() == 0) {
            throw new IllegalArgumentException("Número de série inválido");
        }
        if (aviao.getFabricante().equals("")) {
            throw new IllegalArgumentException("Fabricante inválido");
        }
        return aviao;
    }

    public AviaoBuilder setNumeroDeSerie(int numeroDeSerie) {
        aviao.setNumeroDeSerie(numeroDeSerie);
        return this;
    }

    public AviaoBuilder setFabricante(String fabricante) {
        aviao.setFabricante(fabricante);
        return this;
    }

    public AviaoBuilder setModelo(String modelo) {
        aviao.setModelo(modelo);
        return this;
    }

    public AviaoBuilder setAnoLancamento(Date anoLancamento) {
        aviao.setAnoLancamento(anoLancamento);
        return this;
    }

    public AviaoBuilder setAnoFabricacao(Date anoFabricacao) {
        aviao.setAnoFabricacao(anoFabricacao);
        return this;
    }

    public AviaoBuilder setCategoriaContraIncendio(int categoriaContraIncendio) {
        aviao.setCategoriaContraIncendio(categoriaContraIncendio);
        return this;
    }

    public AviaoBuilder setNumeroPassageiros(int numeroPassageiros) {
        aviao.setNumeroPassageiros(numeroPassageiros);
        return this;
    }

    public AviaoBuilder setNumeroMotores(int numeroMotores) {
        aviao.setNumeroMotores(numeroMotores);
        return this;
    }

    public AviaoBuilder setTipoMotor(String tipoMotor) {
        aviao.setTipoMotor(tipoMotor);
        return this;
    }

    public AviaoBuilder setPesoMaxDecolagem(Float pesoMaxDecolagem) {
        aviao.setPesoMaxDecolagem(pesoMaxDecolagem);
        return this;
    }

    public AviaoBuilder setVelocidadeDeAproximacao(Float velocidadeDeAproximacao) {
        aviao.setVelocidadeDeAproximacao(velocidadeDeAproximacao);
        return this;
    }

    public AviaoBuilder setEnvergadura(Float envergadura) {
        aviao.setEnvergadura(envergadura);
        return this;
    }

    public AviaoBuilder setComprimentoAeronave(Float comprimentoAeronave) {
        aviao.setComprimentoAeronave(comprimentoAeronave);
        return this;
    }

    public AviaoBuilder setComprimentoBasicoDePista(Float comprimentoBasicoDePista) {
        aviao.setComprimentoBasicoDePista(comprimentoBasicoDePista);
        return this;
    }

    public AviaoBuilder setDistanciaEntreTrensDePouso(Float distanciaEntreTrensDePouso) {
        aviao.setDistanciaEntreTrensDePouso(distanciaEntreTrensDePouso);
        return this;
    }
}

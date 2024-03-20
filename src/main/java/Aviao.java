import java.util.Date;

public class Aviao {

    private int numeroDeSerie;
    private String fabricante;
    private String modelo;
    private Date anoLancamento;
    private Date anoFabricacao;
    private int categoriaContraIncendio;
    private int numeroPassageiros;
    private int numeroMotores;
    private String tipoMotor;
    private Float pesoMaxDecolagem;
    private Float velocidadeDeAproximacao;
    private Float envergadura;
    private Float comprimentoAeronave;
    private Float comprimentoBasicoDePista;
    private Float distanciaEntreTrensDePouso;

    public Aviao() {
        this.numeroDeSerie = 0;
        this.fabricante = "";
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Date anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getCategoriaContraIncendio() {
        return categoriaContraIncendio;
    }

    public void setCategoriaContraIncendio(int categoriaContraIncendio) {
        this.categoriaContraIncendio = categoriaContraIncendio;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Float getPesoMaxDecolagem() {
        return pesoMaxDecolagem;
    }

    public void setPesoMaxDecolagem(Float pesoMaxDecolagem) {
        this.pesoMaxDecolagem = pesoMaxDecolagem;
    }

    public Float getVelocidadeDeAproximacao() {
        return velocidadeDeAproximacao;
    }

    public void setVelocidadeDeAproximacao(Float velocidadeDeAproximacao) {
        this.velocidadeDeAproximacao = velocidadeDeAproximacao;
    }

    public Float getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Float envergadura) {
        this.envergadura = envergadura;
    }

    public Float getComprimentoAeronave() {
        return comprimentoAeronave;
    }

    public void setComprimentoAeronave(Float comprimentoAeronave) {
        this.comprimentoAeronave = comprimentoAeronave;
    }

    public Float getComprimentoBasicoDePista() {
        return comprimentoBasicoDePista;
    }

    public void setComprimentoBasicoDePista(Float comprimentoBasicoDePista) {
        this.comprimentoBasicoDePista = comprimentoBasicoDePista;
    }

    public Float getDistanciaEntreTrensDePouso() {
        return distanciaEntreTrensDePouso;
    }

    public void setDistanciaEntreTrensDePouso(Float distanciaEntreTrensDePouso) {
        this.distanciaEntreTrensDePouso = distanciaEntreTrensDePouso;
    }
}

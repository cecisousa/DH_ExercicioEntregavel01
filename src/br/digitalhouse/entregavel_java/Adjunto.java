package br.digitalhouse.entregavel_java;

public class Adjunto extends Professor {

    private Integer qtdHorasMonitoria;

    public Adjunto(String novoNome, String novoSobrenome, Integer novoTempoCasa, Integer novoCodigoProf, Integer novaQtdHorasMonitoria) {
        super(novoNome, novoSobrenome, novoTempoCasa, novoCodigoProf);
        qtdHorasMonitoria = novaQtdHorasMonitoria;
    }

    public Integer getQtdHorasMonitoria() {
        return qtdHorasMonitoria;
    }

    public void setQtdHorasMonitoria(Integer qtdHorasMonitoria) {
        this.qtdHorasMonitoria = qtdHorasMonitoria;
    }


}

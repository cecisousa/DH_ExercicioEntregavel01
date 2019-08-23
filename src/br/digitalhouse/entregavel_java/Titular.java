package br.digitalhouse.entregavel_java;

public class Titular extends Professor {

    private String especialidade;

    public Titular(String novoNome, String novoSobrenome, Integer novoTempoCasa, Integer novoCodigoProf, String novaEspecialidade) {
        super(novoNome, novoSobrenome, novoTempoCasa, novoCodigoProf);
        especialidade = novaEspecialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}

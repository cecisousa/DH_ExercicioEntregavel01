package br.digitalhouse.entregavel_java;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codigoAluno;

    public Aluno (String novoNome, String novoSobrenome, Integer novoCodigoAluno){
        nome = novoNome;
        sobrenome = novoSobrenome;
        codigoAluno = novoCodigoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigo) {
        this.codigoAluno = codigo;
    }

}

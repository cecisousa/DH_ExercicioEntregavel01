package br.digitalhouse.entregavel_java;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codigo;

    public Aluno (String novoNome, String novoSobrenome, Integer novoCodigo){
        nome = novoNome;
        sobrenome = novoSobrenome;
        codigo = novoCodigo;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}

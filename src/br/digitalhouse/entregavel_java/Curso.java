package br.digitalhouse.entregavel_java;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private Titular profTitular;
    private Adjunto profAdjunto;
    private Integer qtdMaxAlunos;
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public Curso (String novoNome, Integer novoCodigoCurso, Titular novoProfTitular, Adjunto novoProfAdjunto, Integer novaQtdMaxAlunos, List novosAlunosMatriculados){
        nome = novoNome;
        codigoCurso = novoCodigoCurso;
        profTitular = novoProfTitular;
        profAdjunto = novoProfAdjunto;
        qtdMaxAlunos = novaQtdMaxAlunos;
        alunosMatriculados = novosAlunosMatriculados;
    }

    public Curso() {

    }

    public boolean adicionarUmAluno(Aluno umAluno){
        if (alunosMatriculados.add(umAluno)){
            return true;
        } else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno) {
        alunosMatriculados.remove(umAluno);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Titular getProfTitular() {
        return profTitular;
    }

    public void setProfTitular(Titular profTitular) {
        this.profTitular = profTitular;
    }

    public Adjunto getProfAdjunto() {
        return profAdjunto;
    }

    public void setProfAdjunto(Adjunto profAdjunto) {
        this.profAdjunto = profAdjunto;
    }

    public Integer getQtdMaxAlunos() {
        return qtdMaxAlunos;
    }

    public void setQtdMaxAlunos(Integer qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

}

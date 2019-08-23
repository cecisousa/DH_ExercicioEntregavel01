package br.digitalhouse.entregavel_java;

public class Matricula {
    private Aluno umAluno;
    private Curso umCurso;

    Date umaData = new Date();

    public Matricula (Aluno novoUmAluno, Curso novoUmCurso, Date novaUmaData){
        umAluno = novoUmAluno;
        umCurso = novoUmCurso;
        umaData = novaUmaData;
    }

    public Aluno getUmAluno() {
        return umAluno;
    }

    public void setUmAluno(Aluno umAluno) {
        this.umAluno = umAluno;
    }

    public Curso getUmCurso() {
        return umCurso;
    }

    public void setUmCurso(Curso umCurso) {
        this.umCurso = umCurso;
    }

    public Date getUmaData() {
        return umaData;
    }

    public void setUmaData(Date umaData) {
        this.umaData = umaData;
    }
    
}

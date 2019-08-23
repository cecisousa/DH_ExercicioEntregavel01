package br.digitalhouse.entregavel_java;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> alunosDH = new ArrayList<>();
    private List<Professor> professoresDH = new ArrayList<>();
    private List<Curso> cursosDH = new ArrayList<>();
    private List<Matricula> matriculasDH = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdMaxAlunos){
        Curso novoCurso = new Curso();
        cursosDH.add(novoCurso);
    }

    public void excluirCurso(Integer codigoCurso){
        for (int i = 0; i < cursosDH.size(); i++) {
            if (cursosDH.get(i).getCodigoCurso().equals(codigoCurso)){
                cursosDH.remove(cursosDH.get(i));
            } else {
                System.out.println("Curso não encontrado.");
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProf, Integer quantidadeDeHoras){

       

    }

}

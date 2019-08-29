package br.digitalhouse.entregavel_java;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> alunosDH = new ArrayList<>();
    private List<Professor> professoresDH = new ArrayList<>();
    private List<Curso> cursosDH = new ArrayList<>();
    private List<Matricula> matriculasDH = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdMaxAlunos){
        Curso novoCurso = new Curso(nome, codigoCurso, qtdMaxAlunos);
        cursosDH.add(novoCurso);
    }

    public void excluirCurso(Integer codigoCurso){
        for (int i = 0; i < cursosDH.size(); i++) {
            if (cursosDH.get(i).getCodigoCurso().equals(codigoCurso)){
                cursosDH.remove(cursosDH.get(i));
                return;
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProf, Integer qtdHorasMonitoria){
        Adjunto umProfAdjunto = new Adjunto(nome, sobrenome, 0, codigoProf, qtdHorasMonitoria);
        professoresDH.add(umProfAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProf, String especialidade){
        Titular umProfTitular = new Titular(nome, sobrenome, 0, codigoProf, especialidade);
        professoresDH.add(umProfTitular);
    }

    public void excluirProfessor(Integer codigoProf){
        for (int i = 0; i < professoresDH.size(); i++) {
            if (professoresDH.get(i).getCodigoProf().equals(codigoProf)){
                professoresDH.remove(professoresDH.get(i));
                return;
            }
        }
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno umAluno = new Aluno(nome, sobrenome, codigoAluno);
        alunosDH.add(umAluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Curso cursoEscolhido = null;
        Aluno alunoInteressado = null;
        for (int i = 0; i < cursosDH.size(); i++) {
            if (cursosDH.get(i).getCodigoCurso().equals(codigoCurso)){
                cursoEscolhido = cursosDH.get(i);
                break;
            }
        }
        if (cursoEscolhido == null){
            System.out.println("Curso não encontrado!");
            return;
        }
        for (int i = 0; i < alunosDH.size(); i++) {
            if (alunosDH.get(i).getCodigoAluno().equals(codigoAluno)){
                alunoInteressado = alunosDH.get(i);
                break;
            }
        }
        if (alunoInteressado == null){
            System.out.println("Aluno não encontrado!");
            return;
        }
        if (cursoEscolhido.adicionarUmAluno(alunoInteressado)){
            System.out.println("Matrícula realizada! Seja bem-vindo (a) à Digital House! :)");
        } else {
            System.out.println("Desculpe, não foi possível realizar sua matrícula. Não há vagas! :(");
        }
    }

    public void alocarProfessores (Integer codigoCurso, Integer codigoProfTitular, Integer codigoProfAdjunto){
        Professor profTitularAlocado = null;
        Professor profAdjuntoAlocado = null;
        Curso cursoSendoAlocado = null;
        for (int i = 0; i < professoresDH.size(); i++) {
            if (professoresDH.get(i).getCodigoProf().equals(codigoProfTitular)){
                profTitularAlocado = professoresDH.get(i);
            }
            if (professoresDH.get(i).getCodigoProf().equals(codigoProfAdjunto)){
                profAdjuntoAlocado = professoresDH.get(i);
            }
            if (profTitularAlocado != null && profAdjuntoAlocado != null){
                break;
            }
        }
        if (profTitularAlocado == null){
            System.out.println("Professor titular não existe!");
            return;
        }
        if (profAdjuntoAlocado == null){
            System.out.println("Professor adjunto não existe!");
            return;
        }
        for (int i = 0; i < cursosDH.size(); i++) {
            if (cursosDH.get(i).getCodigoCurso().equals(codigoCurso)){
                cursoSendoAlocado = cursosDH.get(i);
                break;
            }
        }
        if (cursoSendoAlocado == null){
            System.out.println("Curso não existe!");
            return;
        }
        cursoSendoAlocado.setProfTitular((Titular) profTitularAlocado);
        cursoSendoAlocado.setProfAdjunto((Adjunto) profAdjuntoAlocado);
    }
}


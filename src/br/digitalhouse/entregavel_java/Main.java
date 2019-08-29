package br.digitalhouse.entregavel_java;

public class Main {
    public static void main(String[] args) {

        DigitalHouseManager DHGerente = new DigitalHouseManager();

//        *****Registro de professores*****
        DHGerente.registrarProfessorTitular("Ana", "Fernandes", 10, "Android");
        DHGerente.registrarProfessorTitular("Pedro", "Santos", 20, "iOS");
        DHGerente.registrarProfessorAdjunto("Maria", "Silva", 100, 20);
        DHGerente.registrarProfessorAdjunto("José", "Oliveira", 200, 30);
//        DHGerente.excluirProfessor(999);

//        *****Registro de cursos*****
        DHGerente.registrarCurso("Full Stack", 20001, 3);
        DHGerente.registrarCurso("Android", 20002, 2);
//        DHGerente.excluirCurso(999);

//        *****Alocação de professores*****
        DHGerente.alocarProfessores(20001, 10, 100);
        DHGerente.alocarProfessores(20002, 20, 200);
//        DHGerente.alocarProfessores(999, 10, 100);
//        DHGerente.alocarProfessores(20001, 999, 100);
//        DHGerente.alocarProfessores(20001, 10, 999);

//        *****Matrículas em Full Stack*****
        DHGerente.matricularAluno("Carlos", "Lins", 1000);
        DHGerente.matricularAluno("Patricia", "Sousa", 2000);
        DHGerente.matricularAluno(1000, 20001);
        DHGerente.matricularAluno(2000, 20001);
//        DHGerente.matricularAluno(999, 20001);
//        DHGerente.matricularAluno(1000, 999);

//        *****Matrículas em Android*****
        DHGerente.matricularAluno("Paula", "Soares", 3000);
        DHGerente.matricularAluno("Kelly", "Drummond", 4000);
        DHGerente.matricularAluno("Ricardo", "Brito", 5000);
        DHGerente.matricularAluno(3000, 20002);
        DHGerente.matricularAluno(4000, 20002);
        DHGerente.matricularAluno(5000, 20002);

    }
}

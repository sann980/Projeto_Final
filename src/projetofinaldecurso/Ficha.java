/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaldecurso;

/**
 *
 * @author Conservix
 */
public class Ficha{
    
    //ATRIBUTOS
    private int numeroMatricula;
    private Alunos aluno;
    private Mae mae;
    private Pai pai;
    private ResponsavelContratual responsavel;
    private CadastroCursos curso;

    public Ficha(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    //METODOS GETs e SETs
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Mae getMae() {
        return mae;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }

    public Pai getPai() {
        return pai;
    }

    public void setPai(Pai pai) {
        this.pai = pai;
    }

    public ResponsavelContratual getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelContratual responsavel) {
        this.responsavel = responsavel;
    }

    public CadastroCursos getCurso() {
        return curso;
    }

    public void setCurso(CadastroCursos curso) {
        this.curso = curso;
    }
    
}

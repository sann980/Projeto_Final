/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaldecurso;

/**
 *
 * @author lima
 */
public class Cursos {
    private int NumCurso;
    private double valor ;
    private String nomeDoCurso;
    private int duracao ;
    private String Professor;
    private int QuantVagas;
    private String turno;
    
Cursos curso[] = new Cursos [10];
    public Cursos() {
        for(int i = 0 ;i < curso.length; i++){
            curso[i]= new Cursos();
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getProfessor() {
        return Professor;
    }

    public void setProfessor(String Professor) {
        this.Professor = Professor;
    }

    public int getQuantVagas() {
        return QuantVagas;
    }

    public void setQuantVagas(int QuantVagas) {
        this.QuantVagas = QuantVagas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
  
    public void cadastrarCursos () {
        
        
        
        
        
    }
}

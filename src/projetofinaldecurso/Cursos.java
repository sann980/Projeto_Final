//---------- CLASSE PARA CADASTROS DOS CURSO ----------------

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
public class Cursos{
    //ATRIBUTOS
    private int numCurso;
    private String nomeDoCurso;
    private double valor;
    private int duracao;
    
    //METODOS GETs E SETs
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

    public void setNumCurso(int numCurso) {
        this.numCurso = numCurso;
    }

    public int getNumCurso() {
        return numCurso;
    }
    
}

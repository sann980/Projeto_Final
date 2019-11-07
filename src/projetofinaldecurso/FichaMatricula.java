/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaldecurso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Conservix
 */
public class FichaMatricula implements Funcionalidades{
    Scanner in = new Scanner(System.in);
    
    //ATRIBUTOS
    private int numeroMatricula;
    private Alunos aluno;
    private Mae mae;
    private Pai pai;
    private ResponsavelContratual responsavel;
    
    ArrayList<FichaMatricula> ficha = new ArrayList();    

    //FUNCIONALIDADES INTERFACE
    @Override //INÍCIO DO METODO CADASTRAR
    public void cadastrar() {
        int op, cont = 1;
        do{
            FichaMatricula f = new FichaMatricula();
            f.setNumeroMatricula(cont);
            f.setAluno(aluno);
            f.setPai(pai);
            f.setMae(mae);
            f.setResponsavel(responsavel);
            ficha.add(f);
            System.out.println("Deseja cadastrar outro aluno?" + 
                    " Se sim digite - 1" +
                    " Ou se não, digite qualquer outro número");
            op = Integer.parseInt(in.nextLine());
            cont++;
        }while(op == 1);   
    } //FIM DO METODO CADASTRAR

    @Override //INÍCIO DO METODO BUSCAR
    public void buscar() {
        
    } //FIM DO METODO BUSCAR

    @Override //INÍCIO DO METODO LISTAR
    public void listar() {
        System.out.println("Lista de fichas cadastradas");
        for(int i = 0; i<ficha.size(); i++){
            System.out.println("_____________________________");
            System.out.println(" " + ficha.get(i).getNumeroMatricula() +
                    "\n " +ficha.get(i).getAluno() + 
                    "\n " + ficha.get(i).getMae() + 
                    "\n " + ficha.get(i).getPai() + 
                    "\n " + ficha.get(i).getResponsavel());
        }
    } //FIM DO METODO LISTAR

    @Override //INÍCIO DO METODO EXCLUIR
    public void excuir() {
        
    } //FIM DO METODO EXCLUIR
    
    //METODOS SETs E GETs
    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }

    public void setPai(Pai pai) {
        this.pai = pai;
    }

    public void setResponsavel(ResponsavelContratual responsavel) {
        this.responsavel = responsavel;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public Mae getMae() {
        return mae;
    }

    public Pai getPai() {
        return pai;
    }
    
    public ResponsavelContratual getResponsavel() {
        return responsavel;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}

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
public class ProjetoFinalDeCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alunos ca = new Alunos();
        Funcionarios cf = new Funcionarios();
        Mae cm = new Mae();
        Pai cp = new Pai();
        ResponsavelContratual cr = new ResponsavelContratual();
        
        ca.cadastrar();
        ca.listar();
        ca.buscar();
        ca.excuir();
        ca.buscar();
        ca.listar();
    }
}

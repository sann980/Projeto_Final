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
        Mae cm = new Mae();
        Pai cp = new Pai();
        ResponsavelContratual cr = new ResponsavelContratual();
        CadastroCursos b = new CadastroCursos();
        Cursos h = new Cursos();
        
        b.cadastrar();
        b.listar();
        b.buscar();
        b.excuir();
        b.listar();
        /*ca.cadastrar();
        ca.listar();
        ca.buscar();
        ca.excuir();
        ca.buscar();
        ca.listar();*/
       
    }
}

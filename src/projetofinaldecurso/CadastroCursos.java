//---------- CLASSE PARA CADASTRO DE CURSOS----------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaldecurso;

//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Conservix
 */
public class CadastroCursos implements Funcionalidades{
    Scanner in = new Scanner(System.in);
    
    
    /*Date data = new Date();     //Metodo Date puxa a data do systema
    SimpleDateFormat formatar = new SimpleDateFormat("y");      //Formata a data mostrando apenas o ano
    String dataFormatada = formatar.format(data);       //Imprime a data formatada*/
    
    
    ArrayList<Cursos> curso = new ArrayList();
    
    //FUNCIONALIDADES INTERFACE
    @Override //INÍCIO DO METODO CADASTRAR
    public void cadastrar() {
        int op;
        int cont = 1;
        do{
            Cursos c = new Cursos();
            c.setNumCurso(cont);
            System.out.println("Número do curso: " +cont);
            System.out.println("Nome do Curso");
            c.setNomeDoCurso(in.nextLine());
            System.out.println("Valor");
            c.setValor(Float.parseFloat(in.nextLine()));
            System.out.println("Duração");
            c.setDuracao(Integer.parseInt(in.nextLine()));
            curso.add(c);
            System.out.println("Deseja cadastrar outro curso?" + 
                    " Se sim digite - 1" +
                    " Ou se não, digite qualquer outro número");
            op = Integer.parseInt(in.nextLine());
            cont++;
        }while(op == 1);
    }   //FIM DO METODO CADASTRAR

    @Override //INÍCIO DO METODO BUSCAR
    public void buscar() {
        int op = 0;
        int cont = 0;
        System.out.println("Deseja buscar por: 1 - Número do curso ou 2 - Nome do curso" );
        op = Integer.parseInt(in.nextLine());
        switch (op){
            case 1:
                System.out.println("Digite o número do curso");
                int num = Integer.parseInt(in.nextLine());
                for(int i = 0; i<curso.size(); i++){
                    if(curso.get(i).getNumCurso() == num){
                        System.out.println("Número do curso: " + curso.get(i).getNumCurso() 
                    + "\nNome do curso: " +curso.get(i).getNomeDoCurso() 
                    + "\nvalor: R$ " +curso.get(i).getValor() + 
                    "\nDuração: " +curso.get(i).getDuracao() + " Meses");
                        cont++;
                    }
                }
                if(cont == 0){
                    System.out.println("Curso não encontrado em nossos registros");
                }
                break;
            case 2:
                System.out.println("Digite o nome do cuso");
                String nome = in.nextLine();
                for(int i = 0; i<curso.size(); i++){
                    if(curso.get(i).getNomeDoCurso().equals(nome)){
                        System.out.println("Número do curso: " + curso.get(i).getNumCurso() 
                    + "\nNome do curso: " +curso.get(i).getNomeDoCurso() 
                    + "\nvalor: R$ " +curso.get(i).getValor() + 
                    "\nDuração: " +curso.get(i).getDuracao() + " Meses");
                        cont++;
                    }
                }
                if(cont == 0){
                 System.out.println("Curso não encontrado em nossos registros");   
                }
                break;
            default:
                System.out.println("Ops! Opção invalida!");
                break;
        }
    }  //FIM DO METODO BUSCAR

    @Override //INÍCIO DO METODO LISTAR
    public void listar() {
        System.out.println("Lista de Cursos Cadastrados");
        for(int i = 0; i<curso.size(); i++){
            System.out.println("_____________________________");
            System.out.println("Número do curso: " + curso.get(i).getNumCurso() 
                    + "\nNome do curso: " +curso.get(i).getNomeDoCurso() 
                    + "\nvalor: R$ " +curso.get(i).getValor() + 
                    "\nDuração: " +curso.get(i).getDuracao() + " Meses");
        }
    } //FIM DO METODO LISTAR

    @Override //INÍCIO DO METODO EXCLUIR
    public void excuir() {
        int op = 0;
        int cont = 0;
        System.out.println("Deseja excluir por: 1 - Número do curso ou 2 - Nome do curso" );
        op = Integer.parseInt(in.nextLine());
        switch (op){
            case 1:
                System.out.println("Digite o número do curso");
                int num = Integer.parseInt(in.nextLine());
                for(int i = 0; i<curso.size(); i++){
                    if(curso.get(i).getNumCurso() == num){
                        curso.remove(i);
                        System.out.println("Curso excuido com sucesso!");
                        cont++;
                    }
                }
                if(cont == 0){
                 System.out.println("Curso não encontrado em nossos registros");   
                }
                break;
            case 2:
                System.out.println("Digite o nome do cuso");
                String nome = in.nextLine();
                for(int i = 0; i<curso.size(); i++){
                    if(curso.get(i).getNomeDoCurso().equals(nome)){
                        curso.remove(i);
                        System.out.println("Curso excuido com sucesso!");
                        cont++;
                    }
                }
                if(cont == 0){
                 System.out.println("Curso não encontrado em nossos registros");   
                }
                break;
            default:
                System.out.println("Ops! Opção invalida!");
                break;
        }
    } //FIM DO METODO EXCLUIR
}
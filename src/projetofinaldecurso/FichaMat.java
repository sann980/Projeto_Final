/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaldecurso;

import java.util.ArrayList;

/**
 *
 * @author Conservix
 */
public class FichaMat{
    int id;
    ArrayList<Ficha> fichaCadastro = new ArrayList(); //INSTANCIA UM ARRAYLIST DO TIPO FICHACADASTRO

    public FichaMat(){
        this.id=1;
    }
    
    //INÍCIO DO METODO CADASTRAR
    public void cadastrarFicha(String nome, String sexo, String reside, double telefone, 
                    String dataDeNascimento, String naturalidade, String uf, 
                    String certidaoDeNascimento, int folha, int livro, double rg,
                    String orgaoExpedidor, String dataDeExpedicao, double cpf, 
                    String nomem, String ruam, int numerom, String bairrom, double rgm, 
                    String orgaoExpedidorm, String dataDeExpedicaom, double cpfm, String profissaom,
                    String nomep, String ruap, int numerop, String bairrop, double rgp, 
                    String orgaoExpedidorp, String dataDeExpedicaop, double cpfp, String profissaop,
                    String nomer, double rgr, double cpfr, String profissaor, 
                    String nomeDoCurso, float valor, int duracao, String turno, float valorMensalidade){
        
                                                               //GERADE MATRICULA E CRIA UMA NOVA MATRICULA
        
        Ficha ficha = new Ficha(this.id);   //ESTENCIA UM OBIJETO DO TIPO FICHA
        
        Alunos aluno = new Alunos(nome, sexo, reside, telefone, dataDeNascimento, //INSTANCIA UM OBJETO DO TIPO ALUNOS
                                    naturalidade, uf, certidaoDeNascimento, folha, 
                                    livro, rg, orgaoExpedidor, dataDeExpedicao, cpf);
       
        Mae mae = new Mae(nomem, ruam, numerom, bairrom, rgm, orgaoExpedidorm, dataDeExpedicaom, //INSTANCIANDO UM OBJETO DO TIPO MAE
                            cpfm, profissaom);
        
        Pai pai = new Pai(nomep, ruap, numerop, bairrop, rgp, orgaoExpedidorp, dataDeExpedicaop, //INSTANCIANDO UM OBJETO DO TIPO PAI
                            cpfp, profissaop);
        
        ResponsavelContratual responsavel = new ResponsavelContratual(nomer, rgr, cpfr, profissaor); //INSTANCIANDO UM OBJETO DO TIPO RESPONSAVELCONTRATUAL
        
        CadastroCursos novoCurso = new CadastroCursos(nomeDoCurso, valor, duracao, turno, valorMensalidade); //INSTANCIANDO UM OBJETO DO TIPO CADASTROCURSO
        
        //ficha.setNumeroMatricula(gerador);
        ficha.setAluno(aluno);
        ficha.setCurso(novoCurso);
        ficha.setPai(pai);
        ficha.setMae(mae);
        ficha.setResponsavel(responsavel);
        fichaCadastro.add(ficha);
        this.id++;
        
    } //FIM DO METODO CADASTRAR
    
    //INÍCIO DO METODO BUSCAR
    public void buscarFicha(String nome){
        for (int i = 0; i<fichaCadastro.size(); i++) {
            if(nome.equals(fichaCadastro.get(i).getAluno().nome));
            fichaCadastro.get(i).getNumeroMatricula();
            fichaCadastro.get(i).getAluno();
            fichaCadastro.get(i).getPai();
            fichaCadastro.get(i).getMae();
            fichaCadastro.get(i).getResponsavel();            
        }
    } //FIM DO METODO BUSCAR
    
    //INÍCIO DO METODO EXCLUIR
    public void excluirFicha(String nome){
        for(int i = 0; i<fichaCadastro.size(); i++){
        if(nome.equals(fichaCadastro.get(i).getAluno().nome)){
            fichaCadastro.remove(i);
        }
        }
    } //FIM DO METODO EXCLUIR
    
    //INÍCIO DO METODO LISTAR
    public void listar( String nome, int numero){
        for(int i = 0; i<fichaCadastro.size(); i++){
            nome = fichaCadastro.get(i).getAluno().nome;
            numero = fichaCadastro.get(i).getNumeroMatricula();
        }
    } //FIM DO METODO LISTAR
}

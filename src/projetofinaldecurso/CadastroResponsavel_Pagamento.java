/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaldecurso;

import java.util.Scanner;

/**
 *
 * @author Conservix
 */
public class CadastroResponsavel_Pagamento extends Dados{
    Scanner tec = new Scanner(System.in);
    
    //ATRIBUTOS
    private String profisao;
    
    //METODOS SETs

    public void setProfisao(String profisao) {
        this.profisao = profisao;
    }
    
    //METODOS GETs
    public String getProfisao() {
        return profisao;
    }
    
    //Vetor do tipo dados de 10 posições
    Dados dad[] = new Dados[10];
    
    //METODO CONSTRUTOR
    public CadastroResponsavel_Pagamento(){    
        for(int i = 0; i<10; i++){
            dad[i] = null;
        }
    }

    //Metodo Cadastro de responsavel por pagamento
    public void cadastroDoResponsavel_Pagamento() {
        for(int i=0; i<10; i++){
            if(dad[i] == null){
                System.out.println("Nome do responsavel por pagamento: ");
                this.setNome(tec.nextLine());
                System.out.println("RG: ");
                this.setRg(Double.parseDouble(tec.nextLine()));
                System.out.println("CPF: ");
                this.setCpf(Double.parseDouble(tec.nextLine()));
                System.out.println("Profissão: ");
                this.setProfisao(tec.nextLine());   
            }
        }
    }
}
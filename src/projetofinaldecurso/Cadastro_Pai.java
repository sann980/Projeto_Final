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
public class Cadastro_Pai extends Dados{
    
    Scanner tec = new Scanner(System.in);
    
//  METODO CONSTRUTOR
    public Cadastro_Pai() {
         for(int i = 0; i<dad.length; i++){
            dad[i] = new Dados();
            
        }
        this.res = false;
    }
    
    //METODO CADASTRO DE RESPONSAVEL PAI
    void cadastroDoResponsavel_Pai(){ //INICIO DO METODO
        for (Dados dad1 : dad) {
            if (dad1 != null) {
                res= false;
                System.out.println("Nome do Pai:");
                dad1.setNome(tec.nextLine());
                System.out.println("RG: ");
                dad1.setRg(Double.parseDouble(tec.nextLine()));
                System.out.println("Orgão expedidor: ");
                dad1.setOrgaoExpedidor(tec.nextLine());
                System.out.println("Data de expedição: ");
                dad1.setDataDeExpedicao(tec.nextLine());
                System.out.println("CPF: ");
                dad1.setCpf(Double.parseDouble(tec.nextLine()));
                System.out.println("Profissão: ");
                dad1.setProfisao(tec.nextLine());
                this.Quebra_Loop();
                if(res){
                    break;
                }
            }
        }
    } //FIM DO METODO
}
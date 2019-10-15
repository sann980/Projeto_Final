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
    
    //METODO CONSTRUTOR
    public CadastroResponsavel_Pagamento(){    
        for(int i = 0; i<dad.length; i++){
            dad[i] = new Dados();
            
        }
        this.res = false;
    }
    
    //Metodo Cadastro de responsavel por pagamento
    public void cadastroDoResponsavel_Pagamento() {
        for (Dados dad1 : dad) {
            if (dad1 != null) {
                res= false;
                System.out.println("Nome do responsavel por pagamento: ");
                dad1.setNome(tec.nextLine());
                System.out.println("RG: ");
                dad1.setRg(Double.parseDouble(tec.nextLine()));
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
    }
}
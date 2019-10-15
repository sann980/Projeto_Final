/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaldecurso;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Conservix
 */
public class CadastroDeAluno extends Dados{
    
    Scanner tec = new Scanner(System.in);

    public CadastroDeAluno() {
         for(int i = 0; i<dad.length; i++){
            dad[i] = new Dados();     
        }
        this.res = false;
    }
    
    //METODO CADASTRO DE ALUNOS
    public void cadastroDeAluno() { //INICIO DO METODO
        for (Dados dad1 : dad) {
            if (dad1 != null) {
                res= false;
                System.out.println("Nome do Aluno: ");
                dad1.setNome(tec.nextLine());
                System.out.println("Data de Nacimento: ");
                dad1.setDataDeNascimento(tec.nextLine());
                System.out.println("Naturalidade: ");
                dad1.setNaturalidade(tec.nextLine());
                System.out.println("UF: ");
                dad1.setUf(tec.nextLine());
                System.out.println("Certidão de Nascimento Nº: ");
                dad1.setCertidaoDeNascimento(tec.nextLine());
                System.out.println("Folha Nº: ");
                dad1.setFolha(Integer.parseInt(tec.nextLine()));
                System.out.println("Livro Nº: ");
                dad1.setLivro(tec.nextLine());
                System.out.println("Sexo: ");
                dad1.setSexo(tec.nextLine());
                System.out.println("RG: ");
                dad1.setRg(Double.parseDouble(tec.nextLine()));
                System.out.println("Orgão expedidor: ");
                dad1.setOrgaoExpedidor(tec.nextLine());
                System.out.println("Data de expedição: ");
                dad1.setDataDeExpedicao(tec.nextLine());
                System.out.println("CPF: ");
                setCpf(Double.parseDouble(tec.nextLine()));
                this.Quebra_Loop();
                if(res){
                    break;
                }
            }
        }
    } //FIM DO METODO
}
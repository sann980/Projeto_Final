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
public class Cadastro_Mae extends Dados{
    Scanner tec = new Scanner(System.in);
    
    //Metodo Cadastro de Responsavel Mae
    public void cadastroDoResponsavel_mae(){
        System.out.println("Nome da mãe:");
        this.setNome(tec.nextLine());
        System.out.println("RG: ");
        this.setRg(tec.nextLong());
        System.out.println("Orgão expedidor: ");
        this.setOrgaoExpedidor(tec.nextLine());
        System.out.println("Data de expedição: ");
        this.setDataDeExpedicao(tec.nextLine());
        System.out.println("CPF: ");
        setCpf(tec.nextDouble());
        System.out.println("Profissão: ");
        this.setProfisao(tec.nextLine());
    }
}

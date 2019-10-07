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
    //ATRIBUTO DO TIPO VETOR DADOS
    
    //METODO CADASTRO DE ALUNOS
    public void cadastroDeAluno(){
        System.out.println("Nome do Aluno: ");
        this.setNome(tec.nextLine());
        System.out.println("Data de Nacimento: ");
        this.setDataDeNascimento(tec.nextLine());
        System.out.println("Naturalidade: ");
        this.setNaturalidade(tec.nextLine());
        System.out.println("UF: ");
        this.setUf(tec.nextLine());
        System.out.println("Certidão de Nascimento Nº: ");
        this.setCertidaoDeNascimento(tec.nextLine());
        System.out.println("Folha Nº: ");
        this.setFolha(Integer.parseInt(tec.nextLine()));
        System.out.println("Livro Nº: ");
        this.setLivro(tec.nextLine());
        System.out.println("Sexo: ");
        this.setSexo(tec.nextLine());
        System.out.println("RG: ");
        this.setRg(tec.nextLong());
        System.out.println("Orgão expedidor: ");
        this.setOrgaoExpedidor(tec.nextLine());
        System.out.println("Data de expedição: ");
        this.setDataDeExpedicao(tec.nextLine());
        System.out.println("CPF: ");
        setCpf(tec.nextDouble());
    }
        
}
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
public class Cadastrando extends DadosCadastros{
    
    Scanner tec = new Scanner(System.in);

    public void cadastroDeAluno(){
        System.out.println("Nome do Aluno: ");
        nome = tec.nextLine();
        System.out.println("Data de Nacimento: ");
        dataDeNascimento = tec.nextLine();
        System.out.println("Naturalidade: ");
        naturalidade = tec.nextLine();
        System.out.println("UF: ");
        uf = tec.nextLine();
        System.out.println("Certidão de Nascimento Nº: ");
        certidaoDeNascimento = tec.nextLine();
        System.out.println("Folha Nº: ");
        folha = Integer.parseInt(tec.nextLine());
        System.out.println("Livro Nº: ");
        livro = tec.nextLine();
        System.out.println("Sexo: ");
        sexo = tec.nextLine();
        System.out.println("RG: ");
        rg = tec.nextLong();
        System.out.println("Orgão expedidor: ");
        orgaoExpedidor = tec.nextLine();
        System.out.println("Data de expedição: ");
        dataDeExpedicao = tec.nextLine();
        System.out.println("CPF: ");
        cpf = tec.nextDouble();
    }
    
}
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
    
    //ATRIBUTOS
    private int codigoDeMatricula;
    private String dataDeNascimento;
    private String naturalidade;
    private String uf;
    private String certidaoDeNascimento;
    private int folha;
    private String livro;
    private String sexo;
    private String orgaoExpedidor;
    private String dataDeExpedicao;
    
    //ATRIBUTO DO TIPO VETOR DADOS
    
    //METODOS GETs
    public Scanner getTec(){
        return tec;
    }

    public int getCodigoDeMatricula() {
        return codigoDeMatricula;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCertidaoDeNascimento() {
        return certidaoDeNascimento;
    }

    public int getFolha() {
        return folha;
    }

    public String getLivro() {
        return livro;
    }

    public String getSexo() {
        return sexo;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public String getDataDeExpedicao() {
        return dataDeExpedicao;
    }
    
    //MTODOS SETs
    public void setTec(Scanner tec) {
        this.tec = tec;
    }

    public void setCodigoDeMatricula(int codigoDeMatricula) {
        this.codigoDeMatricula = codigoDeMatricula;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCertidaoDeNascimento(String certidaoDeNascimento) {
        this.certidaoDeNascimento = certidaoDeNascimento;
    }

    public void setFolha(int folha) {
        this.folha = folha;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public void setDataDeExpedicao(String dataDeExpedicao) {
        this.dataDeExpedicao = dataDeExpedicao;
    }
    
    //METODO CADASTRO DE ALUNOS
    public void cadastroDeAluno() { //INICIO DO METODO
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
        this.setRg(Double.parseDouble(tec.nextLine()));
        System.out.println("Orgão expedidor: ");
        this.setOrgaoExpedidor(tec.nextLine());
        System.out.println("Data de expedição: ");
        this.setDataDeExpedicao(tec.nextLine());
        System.out.println("CPF: ");
        setCpf(Double.parseDouble(tec.nextLine()));
    } //FIM DO METODO
}
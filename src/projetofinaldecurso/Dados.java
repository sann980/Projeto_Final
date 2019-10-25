//---------- CLASSE DO TIPO DADOS ----------------

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
public class Dados extends DadosCadastrais{
   
    Dados dad[] = new Dados[10]; 
   
    //Metodos SETs
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(double rg) {
        this.rg = rg;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public void setCelular(double celular) {
        this.celular = celular;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //METODOS GETs
    public String getNome() {
        return nome;
    }

    public double getRg() {
        return rg;
    }

    public double getCpf() {
        return cpf;
    }

    public double getTelefone() {
        return telefone;
    }

    public double getCelular() {
        return celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getProfisao() {
        return profisao;
    }

    public void setProfisao(String profisao) {
        this.profisao = profisao;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String getDataDeExpedicao() {
        return dataDeExpedicao;
    }

    public void setDataDeExpedicao(String dataDeExpedicao) {
        this.dataDeExpedicao = dataDeExpedicao;
    }

    public int getCodigoDeMatricula() {
        return codigoDeMatricula;
    }

    public void setCodigoDeMatricula(int codigoDeMatricula) {
        this.codigoDeMatricula = codigoDeMatricula;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCertidaoDeNascimento() {
        return certidaoDeNascimento;
    }

    public void setCertidaoDeNascimento(String certidaoDeNascimento) {
        this.certidaoDeNascimento = certidaoDeNascimento;
    }

    public int getFolha() {
        return folha;
    }

    public void setFolha(int folha) {
        this.folha = folha;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // Metodos funcoes
Scanner in = new Scanner(System.in);

     // mtedo pra quebra um loop
    protected void Quebra_Loop(){
         String a ="s"; 
       System.out.println("Deseja adiociona outro (Se sim digite qualquer teclar //n pra sair) ");
                a =  in.nextLine();
        if("n".equals(a)||"N".equals(a)) {
           System.out.println("Saindo....");
            res = true;   
        }else
             System.out.println("Adicionando outro");
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaldecurso;

/**
 *
 * @author Conservix
 */
public class Dados extends DadosCadastros{
    
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
}
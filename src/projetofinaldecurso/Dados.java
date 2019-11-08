//---------- CLASSE DO TIPO DADOS ----------------

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
public class Dados extends DadosCadastrais{ 
   
    //Metodos SETs e GETs
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
        this.rua = endereco;
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setReside(String reside) {
        this.reside = reside;
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
        return profissao;
    }

    public void setProfisao(String profisao) {
        this.profissao = profisao;
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

    public int getLivro() {
        return livro;
    }

    public void setLivro(int livro) {
        this.livro = livro;
    }

    public String getSexo() {
        return sexo;
    }

    public String getReside() {
        return reside;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

}

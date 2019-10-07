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
    
    //ATRIBUTOS
    private String orgaoExpedidor;
    private String dataDeExpedicao;
    private String profisao;
    
    //METODOS SETs

    public void setTec(Scanner tec) {
        this.tec = tec;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public void setDataDeExpedicao(String dataDeExpedicao) {
        this.dataDeExpedicao = dataDeExpedicao;
    }

    public void setProfisao(String profisao) {
        this.profisao = profisao;
    }
    
    //METODOS GETs
    public Scanner getTec() {
        return tec;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public String getDataDeExpedicao() {
        return dataDeExpedicao;
    }

    public String getProfisao() {
        return profisao;
    }
    
    //Metodo Cadastro de Responsavel Mae
    public void cadastroDoResponsavel_mae(){ //INICIO DO METODO
        System.out.println("Nome da mãe:");
        this.setNome(tec.nextLine());
        System.out.println("RG: ");
        this.setRg(Double.parseDouble(tec.nextLine()));
        System.out.println("Orgão expedidor: ");
        this.setOrgaoExpedidor(tec.nextLine());
        System.out.println("Data de expedição: ");
        this.setDataDeExpedicao(tec.nextLine());
        System.out.println("CPF: ");
        setCpf(Double.parseDouble(tec.nextLine()));
        System.out.println("Profissão: ");
        this.setProfisao(tec.nextLine());
    } //FIM DO METODO
}
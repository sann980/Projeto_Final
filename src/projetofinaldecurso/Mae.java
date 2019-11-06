//---------- CLASSE PARA CADASTRO MÃE ----------------

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
public class Mae extends Dados implements Funcionalidades{
    
    //METODO CONSTRUTOR
    public Mae() {
         for(int i = 0; i<dad.length; i++){
            dad[i] = new Dados();
            
        }
        this.res = false;
    } //FIM DO METODO
    
    //FUNCIONALIDADES INTERFACE
    @Override //INÍCIO DO METODO CADASTRAR
    public void cadastrar() {
        for (Dados dad1 : dad) {
            if (dad1 != null) {
                res= false;
                System.out.println("Nome da mãe:");
                dad1.setNome(in.nextLine());
                System.out.println("Rua: ");
                dad1.setRua(in.nextLine());
                System.out.println("Número: ");
                dad1.setNumero(Integer.parseInt(in.nextLine()));
                System.out.println("Bairro: ");
                dad1.setBairro(in.nextLine());
                System.out.println("RG: ");
                dad1.setRg(Double.parseDouble(in.nextLine()));
                System.out.println("Orgão expedidor: ");
                dad1.setOrgaoExpedidor(in.nextLine());
                System.out.println("Data de expedição: ");
                dad1.setDataDeExpedicao(in.nextLine());
                System.out.println("CPF: ");
                setCpf(Double.parseDouble(in.nextLine()));
                System.out.println("Profissão: ");
                dad1.setProfisao(in.nextLine());
                this.Quebra_Loop();
                if(res){
                    break;
                }
            }
        }
    } //FIM DO METODO CADASTRAR

    @Override //INICIO DO METODO BUSCAR
    public void buscar() {
        int cont =0;
        System.out.println("Digite o nome a ser perquisado ");
        String resp = in.nextLine();
        for(Dados dad1 : dad){
        if(resp.equals(dad1.getNome()) ){
           System.out.println("Nome: " + dad1.getNome() + "\nRua: " +dad1.getRua() +
                   "    Número R.: " +dad1.getNumero() + "\nBairro: " +dad1.getBairro() +
                   "\nRG: " +dad1.getRg() + "   Orgão Expedidor: " +dad1.getOrgaoExpedidor() +
                   "    Data de Expedição: " +dad1.getDataDeExpedicao() +
                   "\nCPF: " +dad1.getCpf() + "\nProfição: " +dad1.getProfisao());
        cont ++;
        }
        }if(cont == 0){
             System.out.println("o nome não corresponde a nenhum resgistro ");
        }
    } //FIM DO METODO BUSCAR

    @Override //INICIO DO METODO LISTAR
    public void listar() {
        System.out.println("#### LISTA DE TODOS AS MÃES CADASTRADAS ####");
        for (Dados dad1 : dad) {
            if (dad1.getNome() != null) {
                System.out.println("_______________________");
                System.out.println("Nome: " + dad1.getNome() + "\nRua: " +dad1.getRua() +
                   "    Número R.: " +dad1.getNumero() + "\nBairro: " +dad1.getBairro() +
                   "\nRG: " +dad1.getRg() + "   Orgão Expedidor: " +dad1.getOrgaoExpedidor() +
                   "    Data de Expedição: " +dad1.getDataDeExpedicao() +
                   "\nCPF: " +dad1.getCpf() + "\nProfição: " +dad1.getProfisao());
            }
        }
    } //FIM DO METODO LISTAR

    @Override //INICIO DO METODO EXCLUIR
    public void excuir() {
        int cont =0;
        System.out.println("Digite o nome a ser perquisado pra excluir ");
        String resp = in.nextLine();
        for (Dados dad1 : dad) {
            if (resp.equals(dad1.getNome())) {
                dad1.setNome(null);
                dad1.setRg(0);
                dad1.setCpf(0);
                dad1.setProfisao(null);
                System.out.println("Contato excluido com sucesso");
                cont ++;
            }
        }
if(cont == 0){
             System.out.println("o nome não corresponde a nenhum resgistro ");
        }
    } //FIM DO METODO EXCLUIR
}

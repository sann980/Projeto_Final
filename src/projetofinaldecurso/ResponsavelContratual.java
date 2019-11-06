//---------- CLASSE PARA CADASTRO DE RESPONSAVEL POR PAGAMENTO ----------------

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
public class ResponsavelContratual extends Dados implements Funcionalidades{
    
    //METODO CONSTRUTOR
    public ResponsavelContratual(){    
        for(int i = 0; i<dad.length; i++){
            dad[i] = new Dados();
            
        }
        this.res = false;
    }   //FIM DO METODO
    
    //FUNCIONALIDADES INTERFACE
    @Override //INÍCIO DO METODO CADASTRAR
    public void cadastrar() {
        for (Dados dad1 : dad) {
            if (dad1 != null) {
                res= false;
                System.out.println("Nome do responsavel por pagamento: ");
                dad1.setNome(in.nextLine());
                System.out.println("RG: ");
                dad1.setRg(Double.parseDouble(in.nextLine()));
                System.out.println("CPF: ");
                dad1.setCpf(Double.parseDouble(in.nextLine()));
                System.out.println("Profissão: ");
                dad1.setProfisao(in.nextLine());
                this.Quebra_Loop();
                if(res){
                    break;
                }
            }
        }
    } //FIM DO METODO CADASTRAR

    @Override //INÍCIO DO METODO BUSCAR
    public void buscar() {
        int cont =0;
        System.out.println("Digite o nome a ser perquisado ");
        String resp = in.nextLine();
        for(Dados dad1 : dad){
        if(resp.equals(dad1.getNome()) ){
           System.out.println("Nome: " + dad1.getNome() + "\nRG:" 
                   + dad1.getRg() + "\tCPF: " + dad1.getCpf() +"\nProfissão: " 
                   +dad1.getProfisao());
        cont ++;
        }
        }if(cont == 0){
             System.out.println("o nome não corresponde a nenhum resgistro ");
        }
    } //FIM DO METODO BUSCAR

    @Override //INÍCIO DO METODO LISTAR
    public void listar() {
        for (Dados dad1 : dad) {
            if (dad1.getNome() != null) {
                System.out.println("_______________");
            System.out.println("Nome: " + dad1.getNome() + "\nRG:" 
                    + dad1.getRg() + "\tCPF: " + dad1.getCpf() +"\nProfissão: " 
                    +dad1.getProfisao());
            }
        }
    } //FIM DO METODO LISTAR

    @Override //INÍCIO DO METODO EXCLUIR
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

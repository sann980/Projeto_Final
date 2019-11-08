//---------- CLASSE PARA CADASTRO DE ALUNOS ----------------

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
public class Alunos extends Dados{

    public Alunos(String nome, String sexo, String reside, double telefone, 
                    String dataDeNascimento, String naturalidade, String uf, 
                    String certidaoDeNascimento, int folha, int livro, double rg,
                    String orgaoExpedidor, String dataDeExpedicao, double cpf) {
        
        this.setNome(nome);
        this.setSexo(sexo);
        this.setReside(reside);
        this.setTelefone(telefone);
        this.setDataDeNascimento(dataDeNascimento);
        this.setNaturalidade(naturalidade);
        this.setUf(uf);
        this.setCertidaoDeNascimento(certidaoDeNascimento);
        this.setFolha(folha);
        this.setLivro(livro);
        this.setRg(rg);
        this.setOrgaoExpedidor(orgaoExpedidor);
        this.setDataDeExpedicao(dataDeExpedicao);
        this.setCpf(cpf);
    }
    
    //METODO CONSTRUTOR
   /* public Alunos() {
         for(int i = 0; i<dad.length; i++){
            dad[i] = new Dados();     
        }
        this.res = false;
    } //FIM DO METODO*/

    //FUNCIONALIDADES DA INTERFACE
    //@Override INÍCIO DO METODO CADASTRAR ALUNOS
//    public Dados cadastrar(String nome) {
       // for (Dados dad1 : dad) {
            //if (dad1 != null) {
                //res = false;
                //System.out.println("Nome do Aluno: ");
                //this.setNome(in.nextLine());
//                System.out.println("Sexo: ");
//                this.setSexo(in.nextLine());
//                //System.out.println("Reside com: ");
//                this.setReside(in.nextLine());
//                //System.out.println("Telefone: ");
//                this.setTelefone(in.nextDouble());
//                //System.out.println("Data de Nacimento: ");
//                this.setDataDeNascimento(in.nextLine());
//                //System.out.println("Naturalidade: ");
//                this.setNaturalidade(in.nextLine());
//                //System.out.println("UF: ");
//                this.setUf(in.nextLine());
//                //System.out.println("Certidão de Nascimento Nº: ");
//                this.setCertidaoDeNascimento(in.nextLine());
//                //System.out.println("Folha Nº: ");
//                this.setFolha(Integer.parseInt(in.nextLine()));
//                //System.out.println("Livro Nº: ");
//                this.setLivro(in.nextLine());
//                //System.out.println("RG: ");
//                this.setRg(Double.parseDouble(in.nextLine()));
//                //System.out.println("Orgão expedidor: ");
//                this.setOrgaoExpedidor(in.nextLine());
//                //System.out.println("Data de expedição: ");
//                this.setDataDeExpedicao(in.nextLine());
//                //System.out.println("CPF: ");
//                this.setCpf(Double.parseDouble(in.nextLine()));
                /*this.Quebra_Loop();
                if(res){
                    break;
                }
            }
        }*/// Dados d = new Dados();
//        d.setNome(nome);
//        return d;
  //  } //FIM DO METODO CADASTRAR ALUNOS

    //@Override INÍCIO DO METODO BUSCAR ALUNO
//    public void buscar() {
//        int cont =0;
//        System.out.println("Digite o nome a ser perquisado ");
//        String resp = in.nextLine();
//        for(Dados dad1 : dad){
//        if(resp.equals(dad1.getNome()) ){
//           System.out.println("Nome do aluno: " +dad1.getNome() + "     Sexo: " +dad1.getSexo() + 
//                   "\nReside com: " +dad1.getReside() + "   Telefone: " +dad1.getTelefone() +
//                   "\nNascimento em: " +dad1.getDataDeNascimento() + "      Natural de: " +dad1.getNaturalidade() +
//                   "    UF: " +dad1.getUf() + "\nCertidão de nascimento Nº: " +dad1.getCertidaoDeNascimento() +
//                   "    Folha Nº: " +dad1.getFolha() + "    Livro Nº: " +dad1.getLivro() + 
//                   "    RG: " +dad1.getRg() + "    Orgão expedidor: " +dad1.getOrgaoExpedidor() + 
//                   "    Data de expedição: " +dad1.getDataDeExpedicao() + "\nCPF: " +dad1.getCpf());
//        cont ++;
//        }
//        }if(cont == 0){
//             System.out.println("o nome não corresponde a nenhum resgistro ");
//        }
//    } //FIM DO METODO BUSCAR ALUNO

    //@Override INÍCIO DO METODO LISTAR ALUNOS
//    public void listar() {
       /* System.out.println("#### LISTA DE TODOS OS CADASTROS ####");
    for (Dados dad1 : dad) {
            if (dad1.getNome() != null) {
                System.out.println("________________________");
                System.out.println("Nome do aluno: " +dad1.getNome() + "     Sexo: " +dad1.getSexo() + 
                   "\nReside com: " +dad1.getReside() + "   Telefone: " +dad1.getTelefone() +
                   "\nNascimento em: " +dad1.getDataDeNascimento() + "      Natural de: " +dad1.getNaturalidade() +
                   "    UF: " +dad1.getUf() + "\nCertidão de nascimento Nº: " +dad1.getCertidaoDeNascimento() +
                   "    Folha Nº: " +dad1.getFolha() + "    Livro Nº: " +dad1.getLivro() + 
                   "    RG: " +dad1.getRg() + "    Orgão expedidor: " +dad1.getOrgaoExpedidor() + 
                   "    Data de expedição: " +dad1.getDataDeExpedicao() + "\nCPF: " +dad1.getCpf());
            }
        } */   
  //  } //FIM DO METODO LISTAR ALUNOS

    //@Override INÍCIO DO METODO EXCLUIR ALUNOS
//    public void excuir() {
        /*int cont = 0;
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
             System.out.println("O nome não corresponde a nenhum resgistro ");
        }*/
//    } //FIM DO METODO EXCLUIR ALUNO

}

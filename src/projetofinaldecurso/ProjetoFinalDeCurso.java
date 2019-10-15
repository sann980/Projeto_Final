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
public class ProjetoFinalDeCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadastroResponsavel_Pagamento c = new CadastroResponsavel_Pagamento();
        Cadastro_Pai a = new Cadastro_Pai();
        c.cadastroDoResponsavel_Pagamento();
        
        c.Listar_ResPga();
        a.cadastroDoResponsavel_Pai();
        c.PesquisaResponsavel();
        
        c.ApagarDados();
        
        c.Listar_ResPga();
        a.Listar_ResPga();  
    }
}

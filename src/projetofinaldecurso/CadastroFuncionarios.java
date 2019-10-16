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
public class CadastroFuncionarios extends Dados{
    Scanner tec = new Scanner(System.in);
    
    public CadastroFuncionarios(){
        for(int i = 0; i<dad.length; i++){
            dad[i] = new Dados();     
        }
        this.res = false;
    }
}

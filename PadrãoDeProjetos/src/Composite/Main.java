package Composite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Contém teste com as classes Desenvolvedor, Diretoria e Empregado
 * @author samuel1797
 */
public class Main {
    
     public static void main (String[] args){ 
        
        Desenvolvedor dev1 = new Desenvolvedor("Thiago", 1,"Desenvolvedor Back-end"); 
        Desenvolvedor dev2 = new Desenvolvedor("Samuel", 2,"Desenvolvedor Java"); 
        
        Diretoria diretoriaDesenvolvimento = new Diretoria(); 
        
        diretoriaDesenvolvimento.adicionarEmpregado(dev1); 
        diretoriaDesenvolvimento.adicionarEmpregado(dev2); 
          
                
        Diretoria diretoriaGeral = new Diretoria();
        Gerente ger = new Gerente("Lucas", 3, "Comercial");
        
        diretoriaGeral.adicionarEmpregado( ger );
        diretoriaGeral.adicionarEmpregado( diretoriaDesenvolvimento);

        diretoriaGeral.mostraDetalhesEmpregado();
        
    }
}
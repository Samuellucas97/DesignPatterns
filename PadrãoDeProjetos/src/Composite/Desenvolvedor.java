/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;


/**
 * Representa um desenvolvedor 
 * @author samuel1797
 */
public class Desenvolvedor implements Empregado {

    private String nome;
    private int id;
    private String tipo;
    
    /**
     * Construtor padrão
     * @param nome  Nome do desenvolvedor
     * @param id    Númeor de identificação do desenvolvedor
     * @param tipo  Tipo de desenvolvedor
     */
    public Desenvolvedor( String nome, int id, String tipo){
        
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
    }
    
    /**
     * Imprime os dados do desenvolvedor
     */
    @Override
    public void mostraDetalhesEmpregado() {
        System.out.println("Nome: " + this.nome + "/ Id:" + this.id + "/ Tipo:" + this.tipo);
    }
    
}

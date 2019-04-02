/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 * Representa a diretoria de uma empresa
 * @author samuel1797
 */
public class Diretoria implements Empregado{

    private ArrayList<Empregado> listaEmpregados = new ArrayList<Empregado>();
    
    /**
     * Construtor padrão
     */
    public Diretoria(){
        /// VAZIO
    }
    
    /**
     * Imprime os dados dos empregado da diretoria
     */
    @Override
    public void mostraDetalhesEmpregado() {
    
        for(Empregado e: this.listaEmpregados ){
            e.mostraDetalhesEmpregado();
        }
        
    }
    
    /**
     * Adiciona empregado a diretoria
     * @param emp Empregado a ser adicionado a diretoria
     */
    public void adicionarEmpregado(Empregado emp){ 
        listaEmpregados.add(emp); 
    } 
    
    /**
     * Remove empregado da diretoria
     * @param emp Empregado a ser removido da diretoria
     */
    public void removerEmpregado(Empregado emp){ 
        listaEmpregados.remove(emp); 
    } 
    
}

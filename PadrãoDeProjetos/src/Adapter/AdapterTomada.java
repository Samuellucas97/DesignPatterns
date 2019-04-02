/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * Adaptador de tomada 2 pinos para 3 pinos
 * @author  Thiago
 *          Samuel Lucas de Moura Ferino
 */
public class AdapterTomada extends Tomada3Pinos {
    
    private Tomada2Pinos tomada2Pinos;

    /**
     * Construtor parametrizado
     * @param tomada2Pinos Tomada de 2 pinos
     */    
    public AdapterTomada(Tomada2Pinos tomada2Pinos) {
        
        super();
        this.tomada2Pinos = tomada2Pinos;
    }

    /**
     * Coneta a tomada de 3 pinos
     */
    public void conectarTomada3Pinos() {
        tomada2Pinos.conectarTomada2Pinos();
    }
}

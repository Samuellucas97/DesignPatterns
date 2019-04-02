/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * Contém um testes com as classes AdapterTomada, Tomada2Pinos e Tomada3Pinos
 * @author  Thiago
 *          Samuel Lucas de Moura Ferino
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Tomada2Pinos t2p = new Tomada2Pinos();
        AdapterTomada adaptador = new AdapterTomada(t2p);
        
        adaptador.conectarTomada3Pinos();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author fabiani
 */
public class Arista {
    Vertice inicio;
    Vertice fin;
    int peso;

    public Arista(Vertice inicio, Vertice fin, int peso) {
        this.inicio = inicio;
        this.fin = fin;
        this.peso = peso;
    }
    
}

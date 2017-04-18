/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.control;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import domino.model.Torn;
import domino.vista.InterficieGrafica;

/**
 *
 * @author Eric
 */
public class ControlIG {
    private final Joc joc;
    private final InterficieGrafica ig;
    private Torn torn;
    private Jugador jug;
    private Fitxa fitxa;

    public ControlIG() {
        this.joc = new Joc(4, 28, 7);
        this.ig = new InterficieGrafica();
        this.torn = new Torn(joc);
    }
    
    public void inici(){
        torn.inicial();
        joc.setTorn(joc.getTorn());
        joc.actualitzarEstat();
        
    }
    
    
}

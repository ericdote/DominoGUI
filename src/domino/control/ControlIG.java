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
import javax.swing.JOptionPane;

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
        this.torn = new Torn(joc);
        this.ig = new InterficieGrafica(this);
        ig.setVisible(true);
    }

    public void inici() {
        joc.iniciar(new String[]{JOptionPane.showInputDialog("Introdueix el teu nom"), "BOT1", "BOT2", "BOT3"});
        torn.inicial();
        joc.setTorn(joc.getTorn());
        joc.actualitzarEstat();
        do{
           
        }while (!joc.isFinalitzat());
    }

}

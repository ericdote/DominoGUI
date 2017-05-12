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
        this.torn = new Torn(joc);
        this.ig = new InterficieGrafica(this);
        ig.setVisible(true);
    }

    public void inici() {
        ig.setJugNom();
        joc.iniciar(ig.getNomJugs());
        torn.inicial();
        ig.setFitxasTauler(joc.getFitxaInicial());
        joc.setTorn(joc.getTorn());
        joc.actualitzarEstat();
        ig.setImgFitxer();
        System.out.println(joc.getJugadors()[joc.getTorn()].getFitxes());
        System.out.println(joc.getFitxesJugades());        
        turnBot();

    }

    public void turnBot() {
        Fitxa fitxaEsquerra = joc.getFitxesJugades().getFirst();
        Fitxa fitxaDreta = joc.getFitxesJugades().getLast();
        Fitxa fitxa = null;
        boolean passar = false;
        for (int i = 0; i < joc.getJugadors()[joc.getTorn()].getFitxes().size(); i++) {
            fitxa = joc.getJugadors()[joc.getTorn()].getFitxes().get(i);
            System.out.println(fitxa);
            if (fitxa.getValors()[0] == fitxaEsquerra.getValors()[0] || fitxa.getValors()[1] == fitxaEsquerra.getValors()[0]) {
                if (fitxa.getValors()[0] == fitxaEsquerra.getValors()[0]) {
                    torn.colocarUnaFitxa(fitxa, true);
                    passar = true;
                    break;
                } else if (fitxa.getValors()[1] == fitxaEsquerra.getValors()[0]) {
                    torn.colocarUnaFitxa(fitxa, true);
                    passar = true;
                    break;
                }
            } else if (fitxa.getValors()[0] == fitxaDreta.getValors()[1] || fitxa.getValors()[1] == fitxaDreta.getValors()[1]) {
                if (fitxa.getValors()[0] == fitxaDreta.getValors()[1]) {
                    torn.colocarUnaFitxa(fitxa, false);
                    passar = true;
                    break;
                } else if (fitxa.getValors()[1] == fitxaDreta.getValors()[1]) {
                    passar = true;
                    torn.colocarUnaFitxa(fitxa, false);                    
                    break;
                }
            } 
        }
        if(!passar){
            System.out.println("PASAAAAAAAAAAANDO");
            torn.passar();
        } else {
            System.out.println("PONEMOS");
            ig.setFitxasTauler(fitxa);
        }
    }

    public Joc getJoc() {
        return joc;
    }

}

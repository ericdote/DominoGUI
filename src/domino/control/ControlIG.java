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
    /**
     * Constructor que inicialitza el joc.
     */
    public ControlIG() {
        this.joc = new Joc(4, 28, 7);
        this.torn = new Torn(joc);
        this.ig = new InterficieGrafica(this);
        ig.setVisible(true);
    }
    /**
     * Metode que inicia el joc, crea els jugadors, reparteix fitxes i fa que la partida duri fins que un sigui guanyador.
     */
    public void inici() {
        ig.setJugNom();
        joc.iniciar(ig.getNomJugs());
        ig.setImgFitxer();
        torn.inicial();
        ig.setFitxasTauler(joc.getFitxesJugades());
        joc.setTorn(joc.getTorn());
        joc.actualitzarEstat();
        do {
            ig.setFitxasTauler(joc.getFitxesJugades());
            if (joc.getJugadors()[joc.getTorn()].getNom().equals(ig.getNomJugs()[0])) {
                System.out.println("Te toca jug " + joc.getJugadors()[joc.getTorn()]);
                int opcion = ig.tornJugador();
                System.out.println(opcion);
                if (opcion == 1) {
                    tornJugador();
                } else {
                    torn.passar();
                }
                System.out.println("Fuera jug");
            } else {
                System.out.println("Te toca bot " + joc.getJugadors()[joc.getTorn()]);
                turnBot();
                System.out.println("Fuera bot");
            }
            System.out.println("SIGUIENTE");
            joc.actualitzarEstat();
        } while (!joc.isFinalitzat());
        JOptionPane.showMessageDialog(null, "El guanyador es" + joc.getGuanyador());
    }
    /**
     * Metode que gestiona la jugada que fara la maquina.
     */
    public void turnBot() {
        Fitxa fitxa = null;
        boolean passar = false, orientacio = false;
        for (int i = 0; i < joc.getJugadors()[joc.getTorn()].getFitxes().size(); i++) {
            fitxa = joc.getJugadors()[joc.getTorn()].getFitxes().get(i);
            System.out.println(fitxa);
            if (fitxa.getValors()[0] == joc.getFitxesJugades().getFirst().getValors()[0] || fitxa.getValors()[1] == joc.getFitxesJugades().getFirst().getValors()[0]) {
                    torn.colocarUnaFitxa(fitxa, true);
                    passar = true;
                    break;
            } else if (fitxa.getValors()[0] == joc.getFitxesJugades().getLast().getValors()[1] || fitxa.getValors()[1] == joc.getFitxesJugades().getLast().getValors()[1]) {
                    torn.colocarUnaFitxa(fitxa, false);
                    passar = true;
                    break;
            }
        }
    }
    /**
     * Metode que gestiona la jugada del usuari.
     */
    public void tornJugador() {
        Fitxa fitxa = ig.seleccionarFitxaJug();
        int posicio = ig.escogirPosicion();
        boolean ok = false;
        do {
            if (posicio == 0) {
                if (joc.getFitxesJugades().getFirst().getValors()[0] == fitxa.getValors()[1] || joc.getFitxesJugades().getFirst().getValors()[0] == fitxa.getValors()[0]) {
                    ok = torn.colocarUnaFitxa(fitxa, true);
                }
            } else {
                if (joc.getFitxesJugades().getLast().getValors()[1] == fitxa.getValors()[0] || joc.getFitxesJugades().getLast().getValors()[1] == fitxa.getValors()[1]) {
                    ok = torn.colocarUnaFitxa(fitxa, false);
                }
            }
        } while (!ok);

    }
    
    public Joc getJoc() {
        return joc;
    }

}

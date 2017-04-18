package domino;

import domino.vista.InterficieGrafica;
import javax.swing.SwingUtilities;

public class Domino {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterficieGrafica ig = new InterficieGrafica();
                ig.setVisible(true);
            }
        });

    }

}

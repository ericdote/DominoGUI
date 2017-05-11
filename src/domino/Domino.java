package domino;

import domino.control.ControlIG;
import domino.vista.InterficieGrafica;
import javax.swing.SwingUtilities;

public class Domino {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ControlIG control = new ControlIG();
            }
        });

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import domino.control.ControlIG;
import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */
public class InterficieGrafica extends javax.swing.JFrame {

    private final int WIDTH = 1240, HEIGHT = 570;
    private ControlIG control;
    private Jugador jug;
    private Joc joc;
    private String[] nomJugs;
    private Fitxa fitx;
    private ActionListener al;

    /**
     * Creates new form domino
     *
     * @param control
     */
    public InterficieGrafica(ControlIG control) {
        initComponents();
        setBounds(0, 0, WIDTH, HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setResizable(false);
        this.control = control;
        this.joc = control.getJoc();
    }

    /**
     * Metode que coloca el nom a cada jugador.
     */
    public void setJugNom() {
        nomJugs = new String[]{JOptionPane.showInputDialog(null, "Bienvenido! Introduce tu nombre"), "BOT1", "BOT2", "BOT3"};
        tfUser.setText(nomJugs[0]);
    }

    /**
     * Metode que seteja les imatges del jugador.
     */
    public void setImgFitxer() {
        JButton[] posFichas = {fU1, fU2, fU3, fU4, fU5, fU6, fU7};
        for (int i = 0; i < 7; i++) {
            if (joc.getJugadors()[0].getFitxes().get(i).toString().equals("[6,6]")) {
                posFichas[i].setVisible(false);
            } else {
                ImageIcon imagenFicha = new ImageIcon(getClass().getResource("/domino/assets/usuario/" + joc.getJugadors()[0].getFitxes().get(i).toString() + ".png"));
                posFichas[i].setIcon(imagenFicha);
                posFichas[i].setName(joc.getJugadors()[0].getFitxes().get(i).toString());
                posFichas[i].setText(joc.getJugadors()[0].getFitxes().get(i).toString());
            }
        }
    }

    /**
     * Metode per posar imatges de les fitxes al tauler.
     *
     * @param fitxesJugades
     */
    public void setFitxasTauler(ArrayDeque<Fitxa> fitxesJugades) {
        int contador = 0;
        for (Fitxa fitxesJugade : fitxesJugades) {
            contador++;
            JLabel lbl = seleccionaLabel(contador);
            lbl.setIcon(new ImageIcon(getClass().getResource("/domino/assets/tablero/" + fitxesJugade.toString() + ".png")));
        }
    }

    /**
     * Metode per escogir quina opció vol fer l'usuari.
     *
     * @return
     */
    public int tornJugador() {
        String[] options = {"Passar", "Jugar"};
        int opcion = JOptionPane.showOptionDialog(null, "Escoje una Opcion:", "opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return opcion;
    }

    /**
     * Metode per escogir la posició en la que anira la fitxa.
     *
     * @return
     */
    public int escogirPosicion() {
        String[] options = {"Esquerra", "Dreta"};
        int opcion = JOptionPane.showOptionDialog(null, "Escoje una Opcion:", "opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return opcion;
    }

    /**
     * Metode per escogir quina fitxa vol jugar l'usuari.
     *
     * @param fitxasJug
     * @return
     */
    public int escogirFitxa(List<Fitxa> fitxasJug) {
        String[] options = new String[fitxasJug.size()];
        for (int i = 0; i < options.length; i++) {
            options[i] = fitxasJug.get(i).toString();
        }
        int opcion = JOptionPane.showOptionDialog(null, "Escoje una Opcion:", "opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return opcion;
    }

    /**
     * Metode que gestiona quina fitxa s'escogeix, la posa invisible a la taula
     * del usuari per no veure-la i retorna una fitxa al control per jugarla.
     *
     * @return
     */
    public Fitxa seleccionarFitxaJug() {
        int fitxaEscogida = escogirFitxa(joc.getJugadors()[0].getFitxes());
        if(fitxaEscogida == -1){
            return null;
        }
        hideFitxes(fitxaEscogida);
        fitx = joc.getJugadors()[0].getFitxes().get(fitxaEscogida);
        return fitx;
    }

    /**
     * Metode per ocultar la fitxa escogida depenent de quina sigui.
     *
     * @param fitxaPosicio
     */
    public void hideFitxes(int fitxaPosicio) {
        switch (fitxaPosicio) {
            case 0:
                fU1.setVisible(false);
                break;
            case 1:
                fU2.setVisible(false);
                break;
            case 2:
                fU3.setVisible(false);
                break;
            case 3:
                fU4.setVisible(false);
                break;
            case 4:
                fU5.setVisible(false);
                break;
            case 5:
                fU6.setVisible(false);
                break;
            case 6:
                fU7.setVisible(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelbuttons = new javax.swing.JPanel();
        tfUser = new javax.swing.JTextField();
        fU1 = new javax.swing.JButton();
        fU2 = new javax.swing.JButton();
        fU3 = new javax.swing.JButton();
        fU4 = new javax.swing.JButton();
        fU5 = new javax.swing.JButton();
        fU6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fU7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        tfBot1 = new javax.swing.JTextField();
        fU9 = new javax.swing.JButton();
        fU10 = new javax.swing.JButton();
        fU11 = new javax.swing.JButton();
        fU12 = new javax.swing.JButton();
        fU13 = new javax.swing.JButton();
        fU14 = new javax.swing.JButton();
        fU8 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tfBot2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        fU26 = new javax.swing.JButton();
        fU28 = new javax.swing.JButton();
        fU25 = new javax.swing.JButton();
        fU27 = new javax.swing.JButton();
        fU22 = new javax.swing.JButton();
        fU23 = new javax.swing.JButton();
        fU24 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        tfBot3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        fU18 = new javax.swing.JButton();
        fU19 = new javax.swing.JButton();
        fU20 = new javax.swing.JButton();
        fU21 = new javax.swing.JButton();
        fU16 = new javax.swing.JButton();
        fU15 = new javax.swing.JButton();
        fU17 = new javax.swing.JButton();
        panelTauler = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelbuttons.setLayout(null);

        tfUser.setEditable(false);
        tfUser.setText("USER");
        panelbuttons.add(tfUser);
        tfUser.setBounds(10, 10, 50, 20);

        fU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/[0,0].png"))); // NOI18N
        fU1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fU1MousePressed(evt);
            }
        });
        fU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fU1ActionPerformed(evt);
            }
        });
        panelbuttons.add(fU1);
        fU1.setBounds(10, 40, 50, 30);

        fU2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/[0,0].png"))); // NOI18N
        panelbuttons.add(fU2);
        fU2.setBounds(10, 70, 50, 30);

        fU3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/[0,0].png"))); // NOI18N
        panelbuttons.add(fU3);
        fU3.setBounds(10, 100, 50, 30);

        fU4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/[0,0].png"))); // NOI18N
        panelbuttons.add(fU4);
        fU4.setBounds(10, 130, 50, 30);

        fU5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/[0,0].png"))); // NOI18N
        panelbuttons.add(fU5);
        fU5.setBounds(10, 160, 50, 30);

        fU6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/[0,0].png"))); // NOI18N
        panelbuttons.add(fU6);
        fU6.setBounds(10, 190, 50, 30);
        panelbuttons.add(jLabel6);
        jLabel6.setBounds(0, 0, 1940, 1190);

        fU7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/[0,0].png"))); // NOI18N
        panelbuttons.add(fU7);
        fU7.setBounds(10, 220, 50, 30);

        getContentPane().add(panelbuttons);
        panelbuttons.setBounds(0, 0, 150, 270);

        jPanel7.setLayout(null);

        jPanel8.setLayout(null);

        tfBot1.setEditable(false);
        tfBot1.setText("BOT1");
        jPanel8.add(tfBot1);
        tfBot1.setBounds(10, 10, 50, 20);

        fU9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel8.add(fU9);
        fU9.setBounds(10, 40, 50, 30);

        fU10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel8.add(fU10);
        fU10.setBounds(10, 70, 50, 30);

        fU11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel8.add(fU11);
        fU11.setBounds(10, 100, 50, 30);

        fU12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel8.add(fU12);
        fU12.setBounds(10, 130, 50, 30);

        fU13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel8.add(fU13);
        fU13.setBounds(10, 160, 50, 30);

        fU14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel8.add(fU14);
        fU14.setBounds(10, 190, 50, 30);

        fU8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel8.add(fU8);
        fU8.setBounds(10, 220, 50, 30);
        jPanel8.add(jLabel21);
        jLabel21.setBounds(0, 0, 1940, 1190);

        jPanel7.add(jPanel8);
        jPanel8.setBounds(0, 0, 150, 270);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 270, 150, 250);

        jPanel9.setLayout(null);

        tfBot2.setEditable(false);
        tfBot2.setText("BOT2");
        jPanel9.add(tfBot2);
        tfBot2.setBounds(10, 10, 50, 20);
        jPanel9.add(jLabel29);
        jLabel29.setBounds(0, 0, 1940, 1190);

        fU26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel9.add(fU26);
        fU26.setBounds(20, 110, 50, 30);

        fU28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel9.add(fU28);
        fU28.setBounds(20, 50, 50, 30);

        fU25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel9.add(fU25);
        fU25.setBounds(20, 140, 50, 30);

        fU27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel9.add(fU27);
        fU27.setBounds(20, 80, 50, 30);

        fU22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel9.add(fU22);
        fU22.setBounds(20, 230, 50, 30);

        fU23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel9.add(fU23);
        fU23.setBounds(20, 200, 50, 30);

        fU24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel9.add(fU24);
        fU24.setBounds(20, 170, 50, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1090, 0, 150, 250);

        jPanel10.setLayout(null);

        tfBot3.setEditable(false);
        tfBot3.setText("BOT3");
        jPanel10.add(tfBot3);
        tfBot3.setBounds(10, 10, 50, 20);
        jPanel10.add(jLabel37);
        jLabel37.setBounds(0, 0, 1940, 1190);

        fU18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel10.add(fU18);
        fU18.setBounds(20, 130, 50, 30);

        fU19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel10.add(fU19);
        fU19.setBounds(20, 100, 50, 30);

        fU20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel10.add(fU20);
        fU20.setBounds(20, 70, 50, 30);

        fU21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel10.add(fU21);
        fU21.setBounds(20, 40, 50, 30);

        fU16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel10.add(fU16);
        fU16.setBounds(20, 190, 50, 30);

        fU15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel10.add(fU15);
        fU15.setBounds(20, 220, 50, 30);

        fU17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/domino/assets/usuario/trasera.png"))); // NOI18N
        jPanel10.add(fU17);
        fU17.setBounds(20, 160, 50, 30);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1090, 250, 150, 270);

        panelTauler.setBackground(new java.awt.Color(204, 255, 204));
        panelTauler.setLayout(null);
        panelTauler.add(l2);
        l2.setBounds(50, 230, 50, 50);
        panelTauler.add(l1);
        l1.setBounds(0, 230, 50, 50);
        panelTauler.add(l4);
        l4.setBounds(150, 230, 50, 50);
        panelTauler.add(l3);
        l3.setBounds(100, 230, 50, 50);
        panelTauler.add(l8);
        l8.setBounds(350, 230, 50, 50);
        panelTauler.add(l5);
        l5.setBounds(200, 230, 50, 50);
        panelTauler.add(l7);
        l7.setBounds(300, 230, 50, 50);
        panelTauler.add(l6);
        l6.setBounds(250, 230, 50, 50);
        panelTauler.add(l18);
        l18.setBounds(750, 330, 50, 50);
        panelTauler.add(l15);
        l15.setBounds(700, 230, 50, 50);
        panelTauler.add(l14);
        l14.setBounds(650, 230, 50, 50);
        panelTauler.add(l13);
        l13.setBounds(600, 230, 50, 50);
        panelTauler.add(l12);
        l12.setBounds(550, 230, 50, 50);
        panelTauler.add(l10);
        l10.setBounds(450, 230, 50, 50);
        panelTauler.add(l9);
        l9.setBounds(400, 230, 50, 50);
        panelTauler.add(l11);
        l11.setBounds(500, 230, 50, 50);
        panelTauler.add(l16);
        l16.setBounds(750, 230, 50, 50);
        panelTauler.add(l17);
        l17.setBounds(750, 280, 50, 50);
        panelTauler.add(l19);
        l19.setBounds(700, 330, 50, 50);
        panelTauler.add(l20);
        l20.setBounds(650, 330, 50, 50);
        panelTauler.add(l21);
        l21.setBounds(600, 330, 50, 50);
        panelTauler.add(l22);
        l22.setBounds(550, 330, 50, 50);
        panelTauler.add(l23);
        l23.setBounds(500, 330, 50, 50);
        panelTauler.add(l24);
        l24.setBounds(450, 330, 50, 50);
        panelTauler.add(l25);
        l25.setBounds(400, 330, 50, 50);
        panelTauler.add(l26);
        l26.setBounds(350, 330, 50, 50);
        panelTauler.add(l27);
        l27.setBounds(300, 330, 50, 50);
        panelTauler.add(l28);
        l28.setBounds(250, 330, 50, 50);

        getContentPane().add(panelTauler);
        panelTauler.setBounds(150, 0, 940, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fU1ActionPerformed
    }//GEN-LAST:event_fU1ActionPerformed

    private void fU1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fU1MousePressed
    }//GEN-LAST:event_fU1MousePressed
    /**
     * Metode per colocar les fitxes en l'ordre corresponent.
     *
     * @param contador
     * @return
     */
    private JLabel seleccionaLabel(int contador) {
        switch (contador) {
            case 1:
                return l1;
            case 2:
                return l2;
            case 3:
                return l3;
            case 4:
                return l4;
            case 5:
                return l5;
            case 6:
                return l6;
            case 7:
                return l7;
            case 8:
                return l8;
            case 9:
                return l9;
            case 10:
                return l10;
            case 11:
                return l11;
            case 12:
                return l12;
            case 13:
                return l13;
            case 14:
                return l14;
            case 15:
                return l15;
            case 16:
                return l16;
            case 17:
                return l17;
            case 18:
                return l18;
            case 19:
                return l19;
            case 20:
                return l20;
            case 21:
                return l21;
            case 22:
                return l22;
            case 23:
                return l23;
            case 24:
                return l24;
            case 25:
                return l25;
            case 26:
                return l26;
            case 27:
                return l27;
            case 28:
                return l28;
            default:
                return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fU1;
    private javax.swing.JButton fU10;
    private javax.swing.JButton fU11;
    private javax.swing.JButton fU12;
    private javax.swing.JButton fU13;
    private javax.swing.JButton fU14;
    private javax.swing.JButton fU15;
    private javax.swing.JButton fU16;
    private javax.swing.JButton fU17;
    private javax.swing.JButton fU18;
    private javax.swing.JButton fU19;
    private javax.swing.JButton fU2;
    private javax.swing.JButton fU20;
    private javax.swing.JButton fU21;
    private javax.swing.JButton fU22;
    private javax.swing.JButton fU23;
    private javax.swing.JButton fU24;
    private javax.swing.JButton fU25;
    private javax.swing.JButton fU26;
    private javax.swing.JButton fU27;
    private javax.swing.JButton fU28;
    private javax.swing.JButton fU3;
    private javax.swing.JButton fU4;
    private javax.swing.JButton fU5;
    private javax.swing.JButton fU6;
    private javax.swing.JButton fU7;
    private javax.swing.JButton fU8;
    private javax.swing.JButton fU9;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l26;
    private javax.swing.JLabel l27;
    private javax.swing.JLabel l28;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JPanel panelTauler;
    private javax.swing.JPanel panelbuttons;
    private javax.swing.JTextField tfBot1;
    private javax.swing.JTextField tfBot2;
    private javax.swing.JTextField tfBot3;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables

    public String[] getNomJugs() {
        return nomJugs;
    }

    public void setNomJugs(String[] nomJugs) {
        this.nomJugs = nomJugs;
    }

}

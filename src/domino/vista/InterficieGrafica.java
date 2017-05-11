/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import domino.control.ControlIG;
import domino.model.Joc;
import domino.model.Jugador;
import javax.swing.JLabel;

/**
 *
 * @author Eric
 */
public class InterficieGrafica extends javax.swing.JFrame {

    private final int WIDTH = 1240, HEIGHT = 570;
    private ControlIG control;
    private Jugador jug;
    private Joc joc;
    /**
     * Creates new form domino
     */
    public InterficieGrafica(ControlIG control) {
        initComponents();
        this.control = control;
        setBounds(0, 0, WIDTH, HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tfUser = new javax.swing.JTextField();
        fU7 = new javax.swing.JLabel();
        fU1 = new javax.swing.JLabel();
        fU2 = new javax.swing.JLabel();
        fU3 = new javax.swing.JLabel();
        fU4 = new javax.swing.JLabel();
        fU5 = new javax.swing.JLabel();
        fU6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        tfBot1 = new javax.swing.JTextField();
        fB17 = new javax.swing.JLabel();
        fB11 = new javax.swing.JLabel();
        fB12 = new javax.swing.JLabel();
        fB13 = new javax.swing.JLabel();
        fB14 = new javax.swing.JLabel();
        fB15 = new javax.swing.JLabel();
        fB16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tfBot2 = new javax.swing.JTextField();
        fB27 = new javax.swing.JLabel();
        fB21 = new javax.swing.JLabel();
        fB22 = new javax.swing.JLabel();
        fB23 = new javax.swing.JLabel();
        fB24 = new javax.swing.JLabel();
        fB25 = new javax.swing.JLabel();
        fB26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        tfBot3 = new javax.swing.JTextField();
        fB37 = new javax.swing.JLabel();
        fB31 = new javax.swing.JLabel();
        fB32 = new javax.swing.JLabel();
        fB33 = new javax.swing.JLabel();
        fB34 = new javax.swing.JLabel();
        fB35 = new javax.swing.JLabel();
        fB36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        inicioOption = new javax.swing.JMenu();
        confOption = new javax.swing.JMenu();
        numJugOption = new javax.swing.JMenuItem();
        typeOption = new javax.swing.JMenuItem();
        salirOption = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1300, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(1300, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(1300, 700));
        jLabel1.setRequestFocusEnabled(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 0, 940, 520);

        jPanel5.setLayout(null);

        tfUser.setEditable(false);
        tfUser.setText("USER");
        jPanel5.add(tfUser);
        tfUser.setBounds(10, 10, 50, 20);
        jPanel5.add(fU7);
        fU7.setBounds(10, 220, 50, 30);
        jPanel5.add(fU1);
        fU1.setBounds(10, 40, 50, 30);
        jPanel5.add(fU2);
        fU2.setBounds(10, 70, 50, 30);
        jPanel5.add(fU3);
        fU3.setBounds(10, 100, 50, 30);
        jPanel5.add(fU4);
        fU4.setBounds(10, 130, 50, 30);
        jPanel5.add(fU5);
        fU5.setBounds(10, 160, 50, 30);
        jPanel5.add(fU6);
        fU6.setBounds(10, 190, 50, 30);
        jPanel5.add(jLabel6);
        jLabel6.setBounds(0, 0, 1940, 1190);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 150, 270);

        jPanel7.setLayout(null);

        jPanel8.setLayout(null);

        tfBot1.setEditable(false);
        tfBot1.setText("BOT1");
        jPanel8.add(tfBot1);
        tfBot1.setBounds(10, 10, 50, 20);
        jPanel8.add(fB17);
        fB17.setBounds(10, 220, 50, 30);
        jPanel8.add(fB11);
        fB11.setBounds(10, 40, 50, 30);
        jPanel8.add(fB12);
        fB12.setBounds(10, 70, 50, 30);
        jPanel8.add(fB13);
        fB13.setBounds(10, 100, 50, 30);
        jPanel8.add(fB14);
        fB14.setBounds(10, 130, 50, 30);
        jPanel8.add(fB15);
        fB15.setBounds(10, 160, 50, 30);
        jPanel8.add(fB16);
        fB16.setBounds(10, 190, 50, 30);
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
        jPanel9.add(fB27);
        fB27.setBounds(10, 220, 50, 30);
        jPanel9.add(fB21);
        fB21.setBounds(10, 40, 50, 30);
        jPanel9.add(fB22);
        fB22.setBounds(10, 70, 50, 30);
        jPanel9.add(fB23);
        fB23.setBounds(10, 100, 50, 30);
        jPanel9.add(fB24);
        fB24.setBounds(10, 130, 50, 30);
        jPanel9.add(fB25);
        fB25.setBounds(10, 160, 50, 30);
        jPanel9.add(fB26);
        fB26.setBounds(10, 190, 50, 30);
        jPanel9.add(jLabel29);
        jLabel29.setBounds(0, 0, 1940, 1190);

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
        jPanel10.add(fB37);
        fB37.setBounds(10, 220, 50, 30);
        jPanel10.add(fB31);
        fB31.setBounds(10, 40, 50, 30);
        jPanel10.add(fB32);
        fB32.setBounds(10, 70, 50, 30);
        jPanel10.add(fB33);
        fB33.setBounds(10, 100, 50, 30);
        jPanel10.add(fB34);
        fB34.setBounds(10, 130, 50, 30);
        jPanel10.add(fB35);
        fB35.setBounds(10, 160, 50, 30);
        jPanel10.add(fB36);
        fB36.setBounds(10, 190, 50, 30);
        jPanel10.add(jLabel37);
        jLabel37.setBounds(0, 0, 1940, 1190);

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

        inicioOption.setText("Inicio");
        menuBar.add(inicioOption);

        confOption.setText("Configuracion");

        numJugOption.setText("Numero de jugadors");
        confOption.add(numJugOption);

        typeOption.setText("Tipus de partida");
        confOption.add(typeOption);

        menuBar.add(confOption);

        salirOption.setText("Salir");
        menuBar.add(salirOption);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu confOption;
    private javax.swing.JLabel fB11;
    private javax.swing.JLabel fB12;
    private javax.swing.JLabel fB13;
    private javax.swing.JLabel fB14;
    private javax.swing.JLabel fB15;
    private javax.swing.JLabel fB16;
    private javax.swing.JLabel fB17;
    private javax.swing.JLabel fB21;
    private javax.swing.JLabel fB22;
    private javax.swing.JLabel fB23;
    private javax.swing.JLabel fB24;
    private javax.swing.JLabel fB25;
    private javax.swing.JLabel fB26;
    private javax.swing.JLabel fB27;
    private javax.swing.JLabel fB31;
    private javax.swing.JLabel fB32;
    private javax.swing.JLabel fB33;
    private javax.swing.JLabel fB34;
    private javax.swing.JLabel fB35;
    private javax.swing.JLabel fB36;
    private javax.swing.JLabel fB37;
    private javax.swing.JLabel fU1;
    private javax.swing.JLabel fU2;
    private javax.swing.JLabel fU3;
    private javax.swing.JLabel fU4;
    private javax.swing.JLabel fU5;
    private javax.swing.JLabel fU6;
    private javax.swing.JLabel fU7;
    private javax.swing.JMenu inicioOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem numJugOption;
    private javax.swing.JMenu salirOption;
    private javax.swing.JTextField tfBot1;
    private javax.swing.JTextField tfBot2;
    private javax.swing.JTextField tfBot3;
    private javax.swing.JTextField tfUser;
    private javax.swing.JMenuItem typeOption;
    // End of variables declaration//GEN-END:variables

    public JLabel getfB11() {
        return fB11;
    }

    public void setfB11(JLabel fB11) {
        this.fB11 = fB11;
    }

    public JLabel getfB12() {
        return fB12;
    }

    public void setfB12(JLabel fB12) {
        this.fB12 = fB12;
    }

    public JLabel getfB13() {
        return fB13;
    }

    public void setfB13(JLabel fB13) {
        this.fB13 = fB13;
    }

    public JLabel getfB14() {
        return fB14;
    }

    public void setfB14(JLabel fB14) {
        this.fB14 = fB14;
    }

    public JLabel getfB15() {
        return fB15;
    }

    public void setfB15(JLabel fB15) {
        this.fB15 = fB15;
    }

    public JLabel getfB16() {
        return fB16;
    }

    public void setfB16(JLabel fB16) {
        this.fB16 = fB16;
    }

    public JLabel getfB17() {
        return fB17;
    }

    public void setfB17(JLabel fB17) {
        this.fB17 = fB17;
    }

    public JLabel getfB21() {
        return fB21;
    }

    public void setfB21(JLabel fB21) {
        this.fB21 = fB21;
    }

    public JLabel getfB22() {
        return fB22;
    }

    public void setfB22(JLabel fB22) {
        this.fB22 = fB22;
    }

    public JLabel getfB23() {
        return fB23;
    }

    public void setfB23(JLabel fB23) {
        this.fB23 = fB23;
    }

    public JLabel getfB24() {
        return fB24;
    }

    public void setfB24(JLabel fB24) {
        this.fB24 = fB24;
    }

    public JLabel getfB25() {
        return fB25;
    }

    public void setfB25(JLabel fB25) {
        this.fB25 = fB25;
    }

    public JLabel getfB26() {
        return fB26;
    }

    public void setfB26(JLabel fB26) {
        this.fB26 = fB26;
    }

    public JLabel getfB27() {
        return fB27;
    }

    public void setfB27(JLabel fB27) {
        this.fB27 = fB27;
    }

    public JLabel getfB31() {
        return fB31;
    }

    public void setfB31(JLabel fB31) {
        this.fB31 = fB31;
    }

    public JLabel getfB32() {
        return fB32;
    }

    public void setfB32(JLabel fB32) {
        this.fB32 = fB32;
    }

    public JLabel getfB33() {
        return fB33;
    }

    public void setfB33(JLabel fB33) {
        this.fB33 = fB33;
    }

    public JLabel getfB34() {
        return fB34;
    }

    public void setfB34(JLabel fB34) {
        this.fB34 = fB34;
    }

    public JLabel getfB35() {
        return fB35;
    }

    public void setfB35(JLabel fB35) {
        this.fB35 = fB35;
    }

    public JLabel getfB36() {
        return fB36;
    }

    public void setfB36(JLabel fB36) {
        this.fB36 = fB36;
    }

    public JLabel getfB37() {
        return fB37;
    }

    public void setfB37(JLabel fB37) {
        this.fB37 = fB37;
    }

    public JLabel getfU1() {
        return fU1;
    }

    public void setfU1(JLabel fU1) {
        this.fU1 = fU1;
    }

    public JLabel getfU2() {
        return fU2;
    }

    public void setfU2(JLabel fU2) {
        this.fU2 = fU2;
    }

    public JLabel getfU3() {
        return fU3;
    }

    public void setfU3(JLabel fU3) {
        this.fU3 = fU3;
    }

    public JLabel getfU4() {
        return fU4;
    }

    public void setfU4(JLabel fU4) {
        this.fU4 = fU4;
    }

    public JLabel getfU5() {
        return fU5;
    }

    public void setfU5(JLabel fU5) {
        this.fU5 = fU5;
    }

    public JLabel getfU6() {
        return fU6;
    }

    public void setfU6(JLabel fU6) {
        this.fU6 = fU6;
    }

    public JLabel getfU7() {
        return fU7;
    }

    public void setfU7(JLabel fU7) {
        this.fU7 = fU7;
    }

}


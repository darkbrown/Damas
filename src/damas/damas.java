/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damas;

import javax.swing.JButton;

/**
 *
 * @author cris_
 */

public class damas extends javax.swing.JFrame {

    private void iniciarTablero(JButton [][] tablero){
        tablero[0][1] = btn01;
        
        System.out.println(tablero[0][1].getText());
        

}

    
    JButton [][] tablero = new JButton[8][8];
    /**
     * Creates new form Principal2
     */
    
    public damas() {
        initComponents();
        iniciarTablero(tablero);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();
        btn09 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(510, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setLayout(new java.awt.GridLayout(8, 8));

        btn00.setBackground(new java.awt.Color(255, 255, 255));
        btn00.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn00.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn00);

        btn01.setBackground(new java.awt.Color(0, 0, 0));
        btn01.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn01.setForeground(new java.awt.Color(204, 0, 0));
        btn01.setText("*");
        jPanel2.add(btn01);

        btn02.setBackground(new java.awt.Color(255, 255, 255));
        btn02.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn02.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn02);

        btn03.setBackground(new java.awt.Color(0, 0, 0));
        btn03.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn03.setForeground(new java.awt.Color(204, 0, 0));
        btn03.setText("*");
        jPanel2.add(btn03);

        btn04.setBackground(new java.awt.Color(255, 255, 255));
        btn04.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn04.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn04);

        btn05.setBackground(new java.awt.Color(0, 0, 0));
        btn05.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn05.setForeground(new java.awt.Color(204, 0, 0));
        btn05.setText("*");
        jPanel2.add(btn05);

        btn06.setBackground(new java.awt.Color(255, 255, 255));
        btn06.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn06.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn06);

        btn07.setBackground(new java.awt.Color(0, 0, 0));
        btn07.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn07.setForeground(new java.awt.Color(204, 0, 0));
        btn07.setText("*");
        jPanel2.add(btn07);

        btn08.setBackground(new java.awt.Color(0, 0, 0));
        btn08.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn08.setForeground(new java.awt.Color(204, 0, 0));
        btn08.setText("*");
        jPanel2.add(btn08);

        btn09.setBackground(new java.awt.Color(255, 255, 255));
        btn09.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn09.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn09);

        btn10.setBackground(new java.awt.Color(0, 0, 0));
        btn10.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn10.setForeground(new java.awt.Color(204, 0, 0));
        btn10.setText("*");
        jPanel2.add(btn10);

        btn11.setBackground(new java.awt.Color(255, 255, 255));
        btn11.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn11);

        btn12.setBackground(new java.awt.Color(0, 0, 0));
        btn12.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn12.setForeground(new java.awt.Color(204, 0, 0));
        btn12.setText("*");
        jPanel2.add(btn12);

        btn13.setBackground(new java.awt.Color(255, 255, 255));
        btn13.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn13);

        btn14.setBackground(new java.awt.Color(0, 0, 0));
        btn14.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn14.setForeground(new java.awt.Color(204, 0, 0));
        btn14.setText("*");
        jPanel2.add(btn14);

        btn15.setBackground(new java.awt.Color(255, 255, 255));
        btn15.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn15);

        btn16.setBackground(new java.awt.Color(255, 255, 255));
        btn16.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn16);

        btn17.setBackground(new java.awt.Color(0, 0, 0));
        btn17.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn17.setForeground(new java.awt.Color(204, 0, 0));
        btn17.setText("*");
        jPanel2.add(btn17);

        btn18.setBackground(new java.awt.Color(255, 255, 255));
        btn18.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn18);

        btn19.setBackground(new java.awt.Color(0, 0, 0));
        btn19.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn19.setForeground(new java.awt.Color(204, 0, 0));
        btn19.setText("*");
        jPanel2.add(btn19);

        btn20.setBackground(new java.awt.Color(255, 255, 255));
        btn20.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btn20.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(btn20);

        jButton29.setBackground(new java.awt.Color(0, 0, 0));
        jButton29.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(204, 0, 0));
        jButton29.setText("*");
        jPanel2.add(jButton29);

        jButton30.setBackground(new java.awt.Color(255, 255, 255));
        jButton30.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton30);

        jButton31.setBackground(new java.awt.Color(0, 0, 0));
        jButton31.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(204, 0, 0));
        jButton31.setText("*");
        jPanel2.add(jButton31);

        jButton32.setBackground(new java.awt.Color(0, 0, 0));
        jButton32.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton32);

        jButton33.setBackground(new java.awt.Color(255, 255, 255));
        jButton33.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton33);

        jButton34.setBackground(new java.awt.Color(0, 0, 0));
        jButton34.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton34);

        jButton35.setBackground(new java.awt.Color(255, 255, 255));
        jButton35.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton35);

        jButton36.setBackground(new java.awt.Color(0, 0, 0));
        jButton36.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton36);

        jButton37.setBackground(new java.awt.Color(255, 255, 255));
        jButton37.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton37);

        jButton38.setBackground(new java.awt.Color(0, 0, 0));
        jButton38.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton38);

        jButton39.setBackground(new java.awt.Color(255, 255, 255));
        jButton39.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton39);

        jButton40.setBackground(new java.awt.Color(255, 255, 255));
        jButton40.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton40);

        jButton41.setBackground(new java.awt.Color(0, 0, 0));
        jButton41.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton41);

        jButton42.setBackground(new java.awt.Color(255, 255, 255));
        jButton42.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton42);

        jButton43.setBackground(new java.awt.Color(0, 0, 0));
        jButton43.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton43);

        jButton44.setBackground(new java.awt.Color(255, 255, 255));
        jButton44.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton44);

        jButton45.setBackground(new java.awt.Color(0, 0, 0));
        jButton45.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton45);

        jButton46.setBackground(new java.awt.Color(255, 255, 255));
        jButton46.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton46.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton46);

        jButton47.setBackground(new java.awt.Color(0, 0, 0));
        jButton47.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton47);

        jButton48.setBackground(new java.awt.Color(0, 0, 0));
        jButton48.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setText("O");
        jPanel2.add(jButton48);

        jButton49.setBackground(new java.awt.Color(255, 255, 255));
        jButton49.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton49);

        jButton50.setBackground(new java.awt.Color(0, 0, 0));
        jButton50.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton50.setForeground(new java.awt.Color(255, 255, 255));
        jButton50.setText("O");
        jPanel2.add(jButton50);

        jButton51.setBackground(new java.awt.Color(255, 255, 255));
        jButton51.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton51);

        jButton52.setBackground(new java.awt.Color(0, 0, 0));
        jButton52.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setText("O");
        jPanel2.add(jButton52);

        jButton53.setBackground(new java.awt.Color(255, 255, 255));
        jButton53.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton53);

        jButton54.setBackground(new java.awt.Color(0, 0, 0));
        jButton54.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setText("O");
        jPanel2.add(jButton54);

        jButton55.setBackground(new java.awt.Color(255, 255, 255));
        jButton55.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton55.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton55);

        jButton56.setBackground(new java.awt.Color(255, 255, 255));
        jButton56.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton56);

        jButton57.setBackground(new java.awt.Color(0, 0, 0));
        jButton57.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton57.setForeground(new java.awt.Color(255, 255, 255));
        jButton57.setText("O");
        jPanel2.add(jButton57);

        jButton58.setBackground(new java.awt.Color(255, 255, 255));
        jButton58.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton58);

        jButton59.setBackground(new java.awt.Color(0, 0, 0));
        jButton59.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton59.setForeground(new java.awt.Color(255, 255, 255));
        jButton59.setText("O");
        jPanel2.add(jButton59);

        jButton60.setBackground(new java.awt.Color(255, 255, 255));
        jButton60.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton60);

        jButton61.setBackground(new java.awt.Color(0, 0, 0));
        jButton61.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton61.setForeground(new java.awt.Color(255, 255, 255));
        jButton61.setText("O");
        jPanel2.add(jButton61);

        jButton62.setBackground(new java.awt.Color(255, 255, 255));
        jButton62.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton62);

        jButton63.setBackground(new java.awt.Color(0, 0, 0));
        jButton63.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setText("O");
        jPanel2.add(jButton63);

        jButton64.setBackground(new java.awt.Color(0, 0, 0));
        jButton64.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setText("O");
        jPanel2.add(jButton64);

        jButton65.setBackground(new java.awt.Color(255, 255, 255));
        jButton65.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton65);

        jButton66.setBackground(new java.awt.Color(0, 0, 0));
        jButton66.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton66.setForeground(new java.awt.Color(255, 255, 255));
        jButton66.setText("O");
        jPanel2.add(jButton66);

        jButton67.setBackground(new java.awt.Color(255, 255, 255));
        jButton67.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton67);

        jButton68.setBackground(new java.awt.Color(0, 0, 0));
        jButton68.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton68.setForeground(new java.awt.Color(255, 255, 255));
        jButton68.setText("O");
        jPanel2.add(jButton68);

        jButton69.setBackground(new java.awt.Color(255, 255, 255));
        jButton69.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton69);

        jButton70.setBackground(new java.awt.Color(0, 0, 0));
        jButton70.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jButton70.setForeground(new java.awt.Color(255, 255, 255));
        jButton70.setText("O");
        jPanel2.add(jButton70);

        jButton71.setBackground(new java.awt.Color(255, 255, 255));
        jButton71.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPanel2.add(jButton71);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 20, 460, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(damas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(damas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(damas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(damas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new damas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn07;
    private javax.swing.JButton btn08;
    private javax.swing.JButton btn09;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn20;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

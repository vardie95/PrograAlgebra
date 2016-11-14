package Parte2;

import javax.swing.JOptionPane;

public class VectorR2 extends javax.swing.JFrame {

    public VectorR2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        txtV1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtV00 = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtV01 = new javax.swing.JTextField();
        txtV11 = new javax.swing.JTextField();
        txtV10 = new javax.swing.JTextField();
        txtR00 = new javax.swing.JTextField();
        txtR01 = new javax.swing.JTextField();
        txtR11 = new javax.swing.JTextField();
        txtR10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vectores de R2");
        setMinimumSize(new java.awt.Dimension(480, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(",");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 70, 10, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("V2:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 90, 27, 20);

        txtV00.setBackground(new java.awt.Color(153, 153, 153));
        txtV00.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtV00.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtV00);
        txtV00.setBounds(100, 70, 80, 23);

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(340, 300, 90, 40);

        btnCalcular.setBackground(new java.awt.Color(153, 153, 153));
        btnCalcular.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(330, 80, 100, 40);

        jLabel3.setFont(new java.awt.Font("AR JULIAN", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("La Base ortonormal de R2 es:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(27, 183, 350, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("V1:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(16, 233, 27, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("V2:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(16, 264, 27, 20);

        txtV01.setBackground(new java.awt.Color(153, 153, 153));
        txtV01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtV01.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtV01);
        txtV01.setBounds(200, 70, 80, 23);

        txtV11.setBackground(new java.awt.Color(153, 153, 153));
        txtV11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtV11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtV11);
        txtV11.setBounds(200, 110, 80, 23);

        txtV10.setBackground(new java.awt.Color(153, 153, 153));
        txtV10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtV10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtV10);
        txtV10.setBounds(100, 110, 80, 23);

        txtR00.setEditable(false);
        txtR00.setBackground(new java.awt.Color(153, 153, 153));
        txtR00.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtR00.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtR00);
        txtR00.setBounds(94, 233, 150, 23);

        txtR01.setEditable(false);
        txtR01.setBackground(new java.awt.Color(153, 153, 153));
        txtR01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtR01.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtR01);
        txtR01.setBounds(262, 233, 150, 23);

        txtR11.setEditable(false);
        txtR11.setBackground(new java.awt.Color(153, 153, 153));
        txtR11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtR11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtR11);
        txtR11.setBounds(262, 261, 150, 23);

        txtR10.setEditable(false);
        txtR10.setBackground(new java.awt.Color(153, 153, 153));
        txtR10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtR10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtR10);
        txtR10.setBounds(94, 261, 150, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("V1:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 50, 27, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("}");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 70, 27, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("{");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 70, 27, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("{");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 110, 27, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(",");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(190, 110, 10, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("}");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(280, 110, 27, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progra2/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 480, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea regresar?", "Confirmar",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respuesta==JOptionPane.YES_OPTION){
            new menu().setVisible(true);
            dispose();
        }        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try{
            double[][] matriz = new double[2][2];
            double[][] matrizR = new double[3][3];

            matriz[0][0]=Double.parseDouble(txtV00.getText());
            matriz[0][1]=Double.parseDouble(txtV01.getText());

            matriz[1][0]=Double.parseDouble(txtV10.getText());
            matriz[1][1]=Double.parseDouble(txtV11.getText());
            
            Ortonormales obj = new Ortonormales();
            matrizR = obj.ortonormalizacion(matriz);

            if(obj.determinante(matriz)==0.0){
                JOptionPane.showMessageDialog(null, "Los vectores ingresados no son una base de R2. \n Por favor vuelva ingresar los vectores.");
            }
            else{
            txtR00.setText(String.valueOf(matrizR[0][0]));
            txtR01.setText(String.valueOf(matrizR[0][1]));
  
            txtR10.setText(String.valueOf(matrizR[1][0]));
            txtR11.setText(String.valueOf(matrizR[1][1]));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo datos numéricos.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField txtR00;
    private javax.swing.JTextField txtR01;
    private javax.swing.JTextField txtR10;
    private javax.swing.JTextField txtR11;
    private javax.swing.JTextField txtV00;
    private javax.swing.JTextField txtV01;
    private javax.swing.JTextField txtV1;
    private javax.swing.JTextField txtV10;
    private javax.swing.JTextField txtV11;
    // End of variables declaration//GEN-END:variables
}

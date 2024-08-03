package com.mycompany.ejercicio18;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtHorasTrabajadas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRetencion = new javax.swing.JTextField();
        BtnBruto = new javax.swing.JButton();
        BtnNeto = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        txtResults = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código del empleado:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombres:");

        jLabel3.setText("Número de horas trabajadas al día:");

        jLabel4.setText("Valor hora trabajada:");

        jLabel5.setText("Porcentaje de retención de la fuente:");

        BtnBruto.setBackground(new java.awt.Color(204, 204, 255));
        BtnBruto.setText("Obtener salario bruto");
        BtnBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBrutoActionPerformed(evt);
            }
        });

        BtnNeto.setBackground(new java.awt.Color(204, 204, 255));
        BtnNeto.setText("Obtener salario neto");
        BtnNeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNetoActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(204, 204, 255));
        BtnLimpiar.setText("Limpiar campos");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHorasTrabajadas)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorHora)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(txtRetencion)
                    .addComponent(BtnBruto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnNeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(99, 99, 99)
                .addComponent(txtResults, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBruto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnNeto)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpiar))
                    .addComponent(txtResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void calcularYMostrarSalario(boolean esNeto) {
        try {
            String nombre = txtNombre.getText();
            int codigo = Integer.parseInt(txtCodigo.getText());
            int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());
            double valorHora = Double.parseDouble(txtValorHora.getText());
            double retencion = Double.parseDouble(txtRetencion.getText());

            Empleado empleado = new Empleado(codigo, nombre, horasTrabajadas, valorHora, retencion);
            String nombreDeEmpleado = empleado.getNombres();

            String resultado;
            if (esNeto) {
                double salarioNeto = empleado.calcularSalarioNeto();
                resultado = String.format("<html>Código: %d<br>Nombres: %s<br>Salario neto: %.2f</html>",
                        codigo, nombreDeEmpleado, salarioNeto);
            } else {
                double salarioBruto = empleado.calcularSalarioBruto();
                resultado = String.format("<html>Código: %d<br>Nombres: %s<br>Salario bruto: %.2f</html>",
                        codigo, nombreDeEmpleado, salarioBruto);
            }
            txtResults.setText(resultado);
        } catch (NumberFormatException e) {
            txtResults.setText("<html>Error: Por favor, asegúrese de que todos los campos numéricos contienen valores válidos.</html>");
        }
    }

    private void BtnNetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNetoActionPerformed
        calcularYMostrarSalario(true);
    }//GEN-LAST:event_BtnNetoActionPerformed

    private void BtnBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBrutoActionPerformed
        calcularYMostrarSalario(false);
    }//GEN-LAST:event_BtnBrutoActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txtNombre.setText("");
        txtCodigo.setText("");
        txtHorasTrabajadas.setText("");
        txtValorHora.setText("");
        txtRetencion.setText("");
        txtResults.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBruto;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnNeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtHorasTrabajadas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtResults;
    private javax.swing.JTextField txtRetencion;
    private javax.swing.JTextField txtValorHora;
    // End of variables declaration//GEN-END:variables
}

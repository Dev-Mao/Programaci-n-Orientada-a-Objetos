package com.mycompany.figuras;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCRadio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCArea = new javax.swing.JButton();
        btnCPerimetro = new javax.swing.JButton();
        txtAreaCirculo = new javax.swing.JLabel();
        txtPerimetroCirculo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCLado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCuArea = new javax.swing.JButton();
        btnCuPerimetro = new javax.swing.JButton();
        txtAreaCuadrado = new javax.swing.JLabel();
        txtPerimetroCuadrado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtRBase = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnRArea = new javax.swing.JButton();
        btnRPerimetro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRAltura = new javax.swing.JTextField();
        txtAreaRectangulo = new javax.swing.JLabel();
        txtPerimetroRectangulo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTBase = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnTArea = new javax.swing.JButton();
        btnTHipotenusa = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTAltura = new javax.swing.JTextField();
        btnRPerimetro2 = new javax.swing.JButton();
        txtAreaTriangulo = new javax.swing.JLabel();
        txtPerimetroTriangulo = new javax.swing.JLabel();
        txtTipoTriangulo = new javax.swing.JLabel();
        btnTPerimetro = new javax.swing.JButton();
        txtHipotenusa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));

        jLabel1.setText("Radio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Círculo");

        btnCArea.setBackground(new java.awt.Color(204, 204, 255));
        btnCArea.setText("Calcular área");
        btnCArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAreaActionPerformed(evt);
            }
        });

        btnCPerimetro.setBackground(new java.awt.Color(204, 204, 255));
        btnCPerimetro.setText("Calcular perímetro");
        btnCPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPerimetroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCRadio))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCPerimetro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAreaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerimetroCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAreaCirculo)
                        .addGap(18, 18, 18)
                        .addComponent(txtPerimetroCirculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCArea)
                    .addComponent(btnCPerimetro))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));

        jLabel3.setText("Lado");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Cuadrado");

        btnCuArea.setBackground(new java.awt.Color(204, 204, 255));
        btnCuArea.setText("Calcular área");
        btnCuArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuAreaActionPerformed(evt);
            }
        });

        btnCuPerimetro.setBackground(new java.awt.Color(204, 204, 255));
        btnCuPerimetro.setText("Calcular perímetro");
        btnCuPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuPerimetroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCLado))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCuArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCuPerimetro)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAreaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerimetroCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtAreaCuadrado)
                        .addGap(18, 18, 18)
                        .addComponent(txtPerimetroCuadrado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuArea)
                    .addComponent(btnCuPerimetro))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));

        jLabel5.setText("Base");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Rectángulo");

        btnRArea.setBackground(new java.awt.Color(204, 204, 255));
        btnRArea.setText("Calcular área");
        btnRArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRAreaActionPerformed(evt);
            }
        });

        btnRPerimetro.setBackground(new java.awt.Color(204, 204, 255));
        btnRPerimetro.setText("Calcular perímetro");
        btnRPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRPerimetroActionPerformed(evt);
            }
        });

        jLabel7.setText("Altura");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRPerimetro))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRBase, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetroRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtAreaRectangulo)
                        .addGap(18, 18, 18)
                        .addComponent(txtPerimetroRectangulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRArea)
                    .addComponent(btnRPerimetro))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));

        jLabel8.setText("Base");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Triángulo rectángulo");

        btnTArea.setBackground(new java.awt.Color(204, 204, 255));
        btnTArea.setText("Calcular área");
        btnTArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTAreaActionPerformed(evt);
            }
        });

        btnTHipotenusa.setBackground(new java.awt.Color(204, 204, 255));
        btnTHipotenusa.setText("Calcular hipotenusa");
        btnTHipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHipotenusaActionPerformed(evt);
            }
        });

        jLabel10.setText("Altura");

        btnRPerimetro2.setBackground(new java.awt.Color(204, 204, 255));
        btnRPerimetro2.setText("Tipo de triángulo");
        btnRPerimetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRPerimetro2ActionPerformed(evt);
            }
        });

        btnTPerimetro.setBackground(new java.awt.Color(204, 204, 255));
        btnTPerimetro.setText("Calcular perímetro");
        btnTPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTPerimetroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnTArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(165, 165, 165))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtTBase, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(31, 31, 31)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnRPerimetro2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTHipotenusa)))
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHipotenusa)
                            .addComponent(txtTipoTriangulo)
                            .addComponent(txtAreaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetroTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerimetroTriangulo)))
                    .addComponent(txtAreaTriangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipoTriangulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTArea)
                        .addComponent(btnTPerimetro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTHipotenusa)
                    .addComponent(btnRPerimetro2)
                    .addComponent(txtHipotenusa))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAreaActionPerformed
        double radio = Double.parseDouble(txtCRadio.getText());
        Circulo circulo = new Circulo(radio);
        double area = circulo.CalcularArea();
        txtAreaCirculo.setText(String.format("<html>Area: %s</html>",
                area));
    }//GEN-LAST:event_btnCAreaActionPerformed

    private void btnCuAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuAreaActionPerformed
        double lado = Double.parseDouble(txtCLado.getText());
        Cuadrado cuadrado = new Cuadrado(lado);
        double area = cuadrado.CalcularArea();
        txtAreaCuadrado.setText(String.format("<html>Area: %s</html>",
                area));
    }//GEN-LAST:event_btnCuAreaActionPerformed

    private void btnRAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRAreaActionPerformed
        double base = Double.parseDouble(txtRBase.getText());
        double altura = Double.parseDouble(txtRAltura.getText());
        Rectangulo rectangulo = new Rectangulo(base, altura);
        double area = rectangulo.CalcularArea();
        txtAreaRectangulo.setText(String.format("<html>Area: %s</html>",
                area));
    }//GEN-LAST:event_btnRAreaActionPerformed

    private void btnTAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTAreaActionPerformed
        double base = Double.parseDouble(txtTBase.getText());
        double altura = Double.parseDouble(txtTAltura.getText());
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(base, altura);
        double area = trianguloRectangulo.CalcularArea();
        txtAreaTriangulo.setText(String.format("<html>Area: %s</html>",
                area));
    }//GEN-LAST:event_btnTAreaActionPerformed

    private void btnRPerimetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRPerimetro2ActionPerformed
        double base = Double.parseDouble(txtTBase.getText());
        double altura = Double.parseDouble(txtTAltura.getText());
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(base, altura);
        String tipoTriangulo = trianguloRectangulo.DeterminarTipoTriangulo();
        txtTipoTriangulo.setText(String.format("<html>Tipo de triángulo: %s</html>",
                tipoTriangulo));
    }//GEN-LAST:event_btnRPerimetro2ActionPerformed

    private void btnTPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTPerimetroActionPerformed
        double base = Double.parseDouble(txtTBase.getText());
        double altura = Double.parseDouble(txtTAltura.getText());
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(base, altura);
        double perimetro = trianguloRectangulo.CalcularPerimetro();
        txtPerimetroTriangulo.setText(String.format("<html>Perímetro: %s</html>",
                perimetro));
    }//GEN-LAST:event_btnTPerimetroActionPerformed

    private void btnCPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPerimetroActionPerformed
        double radio = Double.parseDouble(txtCRadio.getText());
        Circulo circulo = new Circulo(radio);
        double perimetro = circulo.CalcularPerimetro();
        txtPerimetroCirculo.setText(String.format("<html>Perímetro: %s</html>",
                perimetro));
    }//GEN-LAST:event_btnCPerimetroActionPerformed

    private void btnCuPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuPerimetroActionPerformed
        double lado = Double.parseDouble(txtCLado.getText());
        Cuadrado cuadrado = new Cuadrado(lado);
        double perimetro = cuadrado.CalcularPerimetro();
        txtPerimetroCuadrado.setText(String.format("<html>Perímetro: %s</html>",
                perimetro));
    }//GEN-LAST:event_btnCuPerimetroActionPerformed

    private void btnRPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRPerimetroActionPerformed
        double base = Double.parseDouble(txtRBase.getText());
        double altura = Double.parseDouble(txtRAltura.getText());
        Rectangulo rectangulo = new Rectangulo(base, altura);
        double perimetro = rectangulo.CalcularPerimetro();
        txtPerimetroRectangulo.setText(String.format("<html>Perímetro: %s</html>",
                perimetro));
    }//GEN-LAST:event_btnRPerimetroActionPerformed

    private void btnTHipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHipotenusaActionPerformed
        double base = Double.parseDouble(txtTBase.getText());
        double altura = Double.parseDouble(txtTAltura.getText());
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(base, altura);
        double hipotenusa = trianguloRectangulo.CalcularHipotenusa();
        txtHipotenusa.setText(String.format("<html>Hipotenusa: %s</html>",
                hipotenusa));
    }//GEN-LAST:event_btnTHipotenusaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCArea;
    private javax.swing.JButton btnCPerimetro;
    private javax.swing.JButton btnCuArea;
    private javax.swing.JButton btnCuPerimetro;
    private javax.swing.JButton btnRArea;
    private javax.swing.JButton btnRPerimetro;
    private javax.swing.JButton btnRPerimetro2;
    private javax.swing.JButton btnTArea;
    private javax.swing.JButton btnTHipotenusa;
    private javax.swing.JButton btnTPerimetro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtAreaCirculo;
    private javax.swing.JLabel txtAreaCuadrado;
    private javax.swing.JLabel txtAreaRectangulo;
    private javax.swing.JLabel txtAreaTriangulo;
    private javax.swing.JTextField txtCLado;
    private javax.swing.JTextField txtCRadio;
    private javax.swing.JLabel txtHipotenusa;
    private javax.swing.JLabel txtPerimetroCirculo;
    private javax.swing.JLabel txtPerimetroCuadrado;
    private javax.swing.JLabel txtPerimetroRectangulo;
    private javax.swing.JLabel txtPerimetroTriangulo;
    private javax.swing.JTextField txtRAltura;
    private javax.swing.JTextField txtRBase;
    private javax.swing.JTextField txtTAltura;
    private javax.swing.JTextField txtTBase;
    private javax.swing.JLabel txtTipoTriangulo;
    // End of variables declaration//GEN-END:variables
}

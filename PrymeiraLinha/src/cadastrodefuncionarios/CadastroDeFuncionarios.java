package cadastrodefuncionarios;

;import javax.swing.JTextField;

public class CadastroDeFuncionarios extends javax.swing.JFrame {

    public CadastroDeFuncionarios() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        lblnome = new javax.swing.JLabel();
        lblnacionalidade = new javax.swing.JLabel();
        lblcpfcnpj = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cpfcnpj = new javax.swing.JTextField();
        lblrg = new javax.swing.JLabel();
        lblorgaoexp = new javax.swing.JLabel();
        lblinscest = new javax.swing.JLabel();
        orgaoexp = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        nacionalidade = new javax.swing.JComboBox();
        lblcargo = new javax.swing.JLabel();
        lbldatanasc = new javax.swing.JLabel();
        inscest = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        datanasc = new javax.swing.JTextField();
        lblendereco = new javax.swing.JLabel();
        lblcep = new javax.swing.JLabel();
        lblbairro = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lbluf = new javax.swing.JLabel();
        lblcidade = new javax.swing.JLabel();
        uf = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        lbln = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        lbltelcomercial = new javax.swing.JLabel();
        telcomercial = new javax.swing.JTextField();
        lbltelresidencial = new javax.swing.JLabel();
        telresidencial = new javax.swing.JTextField();
        lblcelular = new javax.swing.JLabel();
        celular = new javax.swing.JTextField();
        btcadastrarfuncionario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Auto Peças - Cadastro de Funcionarios");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblnome.setText("NOME:");

        lblnacionalidade.setText("NACIONALIDADE:");

        lblcpfcnpj.setText("CPF/CNPJ:");

        nome.setToolTipText("");
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        cpfcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfcnpjActionPerformed(evt);
            }
        });

        lblrg.setText("RG:");

        lblorgaoexp.setText("ORGÃO EXP.:");

        lblinscest.setText("INSC. EST:");

        nacionalidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Brasileiro", "Argentino", "Americano", "Canadense" }));
        nacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadeActionPerformed(evt);
            }
        });

        lblcargo.setText("CARGO:");

        lbldatanasc.setText("DATA NASC:");

        inscest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscestActionPerformed(evt);
            }
        });

        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });

        lblendereco.setText("ENDEREÇO:");

        lblcep.setText("CEP:");

        lblbairro.setText("BAIRRO:");

        lblemail.setText("E-MAIL:");

        endereco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        lbluf.setText("UF:");

        lblcidade.setText("CIDADE:");

        lbln.setText("N:");

        lbltelcomercial.setText("TEL. COMERCIAL:");

        telcomercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telcomercialActionPerformed(evt);
            }
        });

        lbltelresidencial.setText("TEL. RESIDENCIAL:");

        telresidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telresidencialActionPerformed(evt);
            }
        });

        lblcelular.setText("CELULAR:");

        btcadastrarfuncionario.setText("CADASTRAR FUNCIONARIO");
        btcadastrarfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarfuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbltelcomercial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telcomercial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltelresidencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telresidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celular))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblemail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblendereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endereco))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblbairro)
                                    .addComponent(lblcidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidade)
                                    .addComponent(bairro)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblnacionalidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nacionalidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblrg))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblinscest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inscest, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblcargo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cargo)
                                    .addComponent(rg, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblorgaoexp, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcpfcnpj))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orgaoexp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblcep)
                                    .addComponent(lbldatanasc))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbln)
                                            .addComponent(lbluf))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(uf, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                            .addComponent(n)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cep))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(datanasc)))))))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btcadastrarfuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome)
                    .addComponent(lblcpfcnpj)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnacionalidade)
                    .addComponent(lblrg)
                    .addComponent(lblorgaoexp)
                    .addComponent(orgaoexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinscest)
                    .addComponent(lblcargo)
                    .addComponent(lbldatanasc)
                    .addComponent(inscest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblendereco)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbln))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluf))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblbairro)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblcidade)
                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblcep)))
                .addGap(11, 11, 11)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telcomercial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelcomercial)
                    .addComponent(lbltelresidencial)
                    .addComponent(telresidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcelular)
                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btcadastrarfuncionario)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfcnpjActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void nacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadeActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void telcomercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telcomercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telcomercialActionPerformed

    private void telresidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telresidencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telresidencialActionPerformed

    private void btcadastrarfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarfuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcadastrarfuncionarioActionPerformed

    private void inscestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscestActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JButton btcadastrarfuncionario;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cpfcnpj;
    private javax.swing.JTextField datanasc;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField inscest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblbairro;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblcep;
    private javax.swing.JLabel lblcidade;
    private javax.swing.JLabel lblcpfcnpj;
    private javax.swing.JLabel lbldatanasc;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblinscest;
    private javax.swing.JLabel lbln;
    private javax.swing.JLabel lblnacionalidade;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblorgaoexp;
    private javax.swing.JLabel lblrg;
    private javax.swing.JLabel lbltelcomercial;
    private javax.swing.JLabel lbltelresidencial;
    private javax.swing.JLabel lbluf;
    private javax.swing.JTextField n;
    private javax.swing.JComboBox nacionalidade;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField orgaoexp;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField telcomercial;
    private javax.swing.JTextField telresidencial;
    private javax.swing.JTextField uf;
    // End of variables declaration//GEN-END:variables
}

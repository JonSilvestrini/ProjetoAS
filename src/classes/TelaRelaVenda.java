/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Jonatas
 */
public class TelaRelaVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaRelaLucro
     */
    public TelaRelaVenda(String user) {
        initComponents();
        tbp_info.setVisible(false);
        lblTitle.setVisible(false);
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
        cmbMes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbAno = new javax.swing.JComboBox<>();
        btnCons = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        tbp_info = new javax.swing.JTabbedPane();
        painel_aba1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblRec = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblGst = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblLcr = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatório de Lucro");

        jLabel1.setText("Mês");

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Fev", "Mar", "Abr", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" }));

        jLabel2.setText("Ano");

        cmbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2012", "2013", "2014", "2015", "2016", "2017" }));

        btnCons.setText("Consultar");
        btnCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("label");

        jLabel3.setText("Total de Vendas");

        lblRec.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRec.setText("jLabel4");

        jLabel5.setText("Produto mais vendido");

        lblGst.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGst.setText("jLabel6");

        jLabel7.setText("Produto menos vendido");

        lblLcr.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLcr.setText("jLabel8");

        javax.swing.GroupLayout painel_aba1Layout = new javax.swing.GroupLayout(painel_aba1);
        painel_aba1.setLayout(painel_aba1Layout);
        painel_aba1Layout.setHorizontalGroup(
            painel_aba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_aba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_aba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addGroup(painel_aba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLcr)
                    .addComponent(lblGst)
                    .addComponent(lblRec))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        painel_aba1Layout.setVerticalGroup(
            painel_aba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_aba1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_aba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRec))
                .addGap(18, 18, 18)
                .addGroup(painel_aba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblGst))
                .addGap(18, 18, 18)
                .addGroup(painel_aba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblLcr))
                .addContainerGap(327, Short.MAX_VALUE))
        );

        tbp_info.addTab("Geral", painel_aba1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Produto", "Porcentagem"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbp_info.addTab("Porcentagem", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbp_info)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCons))
                            .addComponent(lblTitle))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCons))
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbp_info)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsActionPerformed
        // TODO add your handling code here:
        tbp_info.setVisible(true);
        lblTitle.setVisible(true);
        lblTitle.setText("Informações de " + cmbMes.getItemAt(cmbMes.getSelectedIndex()) + "/" + cmbAno.getItemAt(cmbAno.getSelectedIndex()));
        lblRec.setText("R$ Valor");
        lblGst.setText("Produto (R$ Valor)");
        lblLcr.setText("Produto (R$ Valor)");
    }//GEN-LAST:event_btnConsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCons;
    private javax.swing.JComboBox<String> cmbAno;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblGst;
    private javax.swing.JLabel lblLcr;
    private javax.swing.JLabel lblRec;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel painel_aba1;
    private javax.swing.JTabbedPane tbp_info;
    // End of variables declaration//GEN-END:variables
}

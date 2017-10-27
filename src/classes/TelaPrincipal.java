/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author jonatas
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    private String user;
    private int resX, resY;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(String user, int resX, int resY) {
        initComponents();
        this.user = user;
        this.resX = resX;
        this.resY = resY;
        if (!(this.user.equals("admin") || this.user.equals("dono"))){
            if (this.user.equals("atendente")) {
                this.menuRelatorio.setEnabled(false);
                this.itmInadimplencia.setEnabled(false);
                this.itmProdutos.setEnabled(false);
                this.itmFuncionario.setEnabled(false);
                this.itmContas.setEnabled(false);
            } else if (this.user.equals("caixa")) {
                this.menuRelatorio.setEnabled(false);
                this.itmFornecedor.setEnabled(false);
                this.itmProdutos.setEnabled(false);
                this.itmFuncionario.setEnabled(false);
                this.itmContas.setEnabled(false);
            } else {
                this.itmRelatorioContas.setEnabled(false);
                this.itmFluxoDeClientes.setEnabled(false);
                this.itmVendas.setEnabled(false);
                this.itmLucro.setEnabled(false);
                this.itmFornecedor.setEnabled(false);
                this.itmFuncionario.setEnabled(false);
                this.itmInadimplencia.setEnabled(false);
                this.itmContas.setEnabled(false);
                this.itmPedidos.setEnabled(false);
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        barraMenuPrincipal = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        itmUserSwitch = new javax.swing.JMenuItem();
        itmSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        itmFornecedor = new javax.swing.JMenuItem();
        itmInadimplencia = new javax.swing.JMenuItem();
        itmProdutos = new javax.swing.JMenuItem();
        itmFuncionario = new javax.swing.JMenuItem();
        menuControle = new javax.swing.JMenu();
        itmEstoque = new javax.swing.JMenuItem();
        itmContas = new javax.swing.JMenuItem();
        itmPedidos = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        itmLucro = new javax.swing.JMenuItem();
        itmRelatorioContas = new javax.swing.JMenuItem();
        itmVendas = new javax.swing.JMenuItem();
        itmRelatorioEstoque = new javax.swing.JMenuItem();
        itmFluxoDeClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema ERP \"Filho do Patrão\"");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        desktop.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );

        menuSistema.setText("Sistema");

        itmUserSwitch.setText("Trocar de Usuário");
        itmUserSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUserSwitchActionPerformed(evt);
            }
        });
        menuSistema.add(itmUserSwitch);

        itmSair.setText("Sair");
        itmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairActionPerformed(evt);
            }
        });
        menuSistema.add(itmSair);

        barraMenuPrincipal.add(menuSistema);

        menuCadastro.setText("Cadastro");
        menuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        itmFornecedor.setText("Fornecedor");
        itmFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFornecedorActionPerformed(evt);
            }
        });
        menuCadastro.add(itmFornecedor);

        itmInadimplencia.setText("Inadimplência");
        itmInadimplencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmInadimplenciaActionPerformed(evt);
            }
        });
        menuCadastro.add(itmInadimplencia);

        itmProdutos.setText("Produtos");
        itmProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProdutosActionPerformed(evt);
            }
        });
        menuCadastro.add(itmProdutos);

        itmFuncionario.setText("Funcionário");
        itmFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(itmFuncionario);

        barraMenuPrincipal.add(menuCadastro);

        menuControle.setText("Controle");

        itmEstoque.setText("Estoque");
        itmEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEstoqueActionPerformed(evt);
            }
        });
        menuControle.add(itmEstoque);

        itmContas.setText("Contas");
        itmContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmContasActionPerformed(evt);
            }
        });
        menuControle.add(itmContas);

        itmPedidos.setText("Pedidos");
        menuControle.add(itmPedidos);

        barraMenuPrincipal.add(menuControle);

        menuRelatorio.setText("Relatórios");

        itmLucro.setText("Lucro");
        menuRelatorio.add(itmLucro);

        itmRelatorioContas.setText("Contas");
        menuRelatorio.add(itmRelatorioContas);

        itmVendas.setText("Vendas");
        menuRelatorio.add(itmVendas);

        itmRelatorioEstoque.setText("Estoque");
        menuRelatorio.add(itmRelatorioEstoque);

        itmFluxoDeClientes.setText("Fluxo de Clientes");
        menuRelatorio.add(itmFluxoDeClientes);

        barraMenuPrincipal.add(menuRelatorio);

        setJMenuBar(barraMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairActionPerformed
        // TODO add your handling code here:
        Object[] options = { "Confirmar", "Cancelar" };
        int esclh = JOptionPane.showOptionDialog(rootPane, "Deseja realmente sair?", "Sair", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        switch(esclh){
            case 0:
                System.exit(0);
                break;
        }
    }//GEN-LAST:event_itmSairActionPerformed

    private void itmUserSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUserSwitchActionPerformed
        // TODO add your handling code here:
        Object[] options = { "Confirmar", "Cancelar" };
        int esclh = JOptionPane.showOptionDialog(rootPane, "Deseja trocar de usuário?", "Logoff", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        switch(esclh){
            case 0:
                this.dispose();
                TelaLogin tl = new TelaLogin(this.resX, this.resY);
                tl.setBounds((resX / 2 - 125), (resY / 2- 125), 250, 250);
                tl.setVisible(true);
                break;
        }
        
    }//GEN-LAST:event_itmUserSwitchActionPerformed

    private void itmFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFornecedorActionPerformed
        // TODO add your handling code here:
        TelaCadForn tcf = new TelaCadForn(this.user);
        desktop.add(tcf);
        tcf.setVisible(true);
    }//GEN-LAST:event_itmFornecedorActionPerformed

    private void itmInadimplenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmInadimplenciaActionPerformed
        // TODO add your handling code here:
        TelaCadInad tci = new TelaCadInad(this.user);
        desktop.add(tci);
        tci.setVisible(true);
    }//GEN-LAST:event_itmInadimplenciaActionPerformed

    private void itmProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProdutosActionPerformed
        // TODO add your handling code here:
        TelaCadProd tcp = new TelaCadProd(this.user);
        desktop.add(tcp);
        tcp.setVisible(true);
    }//GEN-LAST:event_itmProdutosActionPerformed

    private void itmFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFuncionarioActionPerformed
        // TODO add your handling code here:
        TelaCadFunc tcfunc = new TelaCadFunc(this.user);
        desktop.add(tcfunc);
        tcfunc.setVisible(true);
    }//GEN-LAST:event_itmFuncionarioActionPerformed

    private void itmEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEstoqueActionPerformed
        // TODO add your handling code here:
        TelaConEst tce = new TelaConEst(this.user);
        desktop.add(tce);
        tce.setVisible(true);
    }//GEN-LAST:event_itmEstoqueActionPerformed

    private void itmContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmContasActionPerformed
        // TODO add your handling code here:
        TelaPoop coco = new TelaPoop(this.user);
        desktop.add(coco);
        coco.darDescarga();
    }//GEN-LAST:event_itmContasActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenuPrincipal;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itmContas;
    private javax.swing.JMenuItem itmEstoque;
    private javax.swing.JMenuItem itmFluxoDeClientes;
    private javax.swing.JMenuItem itmFornecedor;
    private javax.swing.JMenuItem itmFuncionario;
    private javax.swing.JMenuItem itmInadimplencia;
    private javax.swing.JMenuItem itmLucro;
    private javax.swing.JMenuItem itmPedidos;
    private javax.swing.JMenuItem itmProdutos;
    private javax.swing.JMenuItem itmRelatorioContas;
    private javax.swing.JMenuItem itmRelatorioEstoque;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmUserSwitch;
    private javax.swing.JMenuItem itmVendas;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuControle;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSistema;
    // End of variables declaration//GEN-END:variables
}

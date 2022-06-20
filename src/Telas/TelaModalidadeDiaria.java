/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Negocio.Aluno;
import Negocio.Matricula;
import Negocio.Modalidade;
import Negocio.ModalidadeDiaria;
import Negocio.ModalidadeLivre;
import Negocio.Pagamento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ANA
 */
public class TelaModalidadeDiaria extends javax.swing.JFrame {

    /**
     * Creates new form TelaAluno
     */

    private ArrayList<Aluno> listaAluno = new ArrayList<>();
    private ArrayList<String> nomeModalidades = new ArrayList<>();
    private ArrayList<Modalidade> listaModalidade = new ArrayList<>();
    private ArrayList<Matricula> listaMatricula = new ArrayList<>();
    
    /*Somatória valor total*/
    private float valorModalidade;

    public float getValorTotal(){
        return valorModalidade;
    }

    public void somaValorModalidade(float valorModalidade) {
        this.valorModalidade =+ valorModalidade;
    }
    /**/

    public TelaModalidadeDiaria(ArrayList<Aluno> lista, ArrayList<Modalidade> modalidade, ArrayList<Matricula> matricula) {
        initComponents();
        this.listaAluno = lista;
        this.listaModalidade = modalidade;
        this.listaMatricula = matricula;
        preencheListaPaciente();
    }
       
    public void preencheListaPaciente(){
        for (int i=0; i< listaAluno.size();i++)
            campoAluno.addItem(listaAluno.get(i).getNome());
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTurno = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        botaoSalvar = new javax.swing.JButton();
        tituloTela3 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        labelNome8 = new javax.swing.JLabel();
        labelNome7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        natacao = new javax.swing.JCheckBox();
        ginastica = new javax.swing.JCheckBox();
        boxe = new javax.swing.JCheckBox();
        turma2_natacao = new javax.swing.JCheckBox();
        turma1_natacao = new javax.swing.JCheckBox();
        tituloTela4 = new javax.swing.JLabel();
        labelEndereco2 = new javax.swing.JLabel();
        campoDataPagamento = new javax.swing.JFormattedTextField();
        campoAluno = new javax.swing.JComboBox<>();
        turma1_boxe = new javax.swing.JCheckBox();
        turma2_ginastica = new javax.swing.JCheckBox();
        turm1_ginastica = new javax.swing.JCheckBox();
        turma2_boxe = new javax.swing.JCheckBox();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Aluno");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        botaoSalvar.setText("Inserir");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        tituloTela3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloTela3.setText("Credenciais de acesso");

        campoLogin.setName("campoLogin"); // NOI18N
        campoLogin.setOpaque(true);

        campoSenha.setText("jPasswordField1");
        campoSenha.setName("campoSenha"); // NOI18N

        labelNome8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome8.setText("Senha");
        labelNome8.setName("senha"); // NOI18N

        labelNome7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome7.setText("Login");
        labelNome7.setName("login"); // NOI18N

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Natação", "R$ 200,00", "Seg e ter 9:00 - 11:00", "Ter 14:00 - 15:00"},
                {"Gisnática", "R$ 250,00", "Quar e quin 9:00 - 11:00", "Quar 14:00 - 15:00"},
                {"Boxe", "R$ 100,00", "Sex e Sab 9:00 - 11:00", "Quin 14:00 - 15:00"}
            },
            new String [] {
                "Nome", "Preço", "Turma 1", "Turma 2"
            }
        ));
        Tabela.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(Tabela);
        Tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        natacao.setText("Natação");
        natacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natacaoActionPerformed(evt);
            }
        });

        ginastica.setText("Ginástica");
        ginastica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ginasticaActionPerformed(evt);
            }
        });

        boxe.setText("Boxe");
        boxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxeActionPerformed(evt);
            }
        });

        turma2_natacao.setText("Turma 2");

        turma1_natacao.setText("Turma 1");

        tituloTela4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloTela4.setText("Modalidade Diária");

        labelEndereco2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEndereco2.setText("Data de pagamento");
        labelEndereco2.setName("dataIngresso"); // NOI18N

        try {
            campoDataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataPagamento.setToolTipText("");
        campoDataPagamento.setName("campoData"); // NOI18N

        turma1_boxe.setText("Turma 1");

        turma2_ginastica.setText("Turma 2");

        turm1_ginastica.setText("Turma 1");

        turma2_boxe.setText("turma 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(tituloTela4)
                .addGap(264, 264, 264))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(natacao)
                        .addGap(18, 18, 18)
                        .addComponent(ginastica))
                    .addComponent(labelEndereco2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(campoAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(tituloTela3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelNome7)
                        .addGap(18, 18, 18)
                        .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNome8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(botaoSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(turma1_natacao)
                                .addGap(18, 18, 18)
                                .addComponent(turm1_ginastica))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(turma2_natacao)
                                .addGap(18, 18, 18)
                                .addComponent(turma2_ginastica)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(turma2_boxe)
                            .addComponent(turma1_boxe)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloTela4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(natacao)
                    .addComponent(ginastica)
                    .addComponent(boxe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turma1_natacao)
                    .addComponent(turma1_boxe)
                    .addComponent(turm1_ginastica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turma2_natacao)
                    .addComponent(turma2_ginastica)
                    .addComponent(turma2_boxe))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEndereco2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(tituloTela3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNome7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNome8)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
       Modalidade modalidade = new Modalidade();
       Date dataHoraAtual = new Date();
       String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
      
       /*Modalidades*/
       ModalidadeDiaria modalidadeDiaria = new ModalidadeDiaria(nomeModalidades,getValorTotal(),data);
       
       /*pagamento*/
       Pagamento pagamento = new Pagamento(campoDataPagamento.getText(),getValorTotal());   
       JOptionPane.showMessageDialog(null, "Incluido com sucesso!");
       Matricula matricula = new Matricula(campoLogin.getText(),campoSenha.getText(), modalidadeDiaria, pagamento);
       listaMatricula.add(matricula);
       limpar();
       
        
    }//GEN-LAST:event_botaoSalvarActionPerformed
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        /*opcaoCurso.removeAllItems();
        for (Curso c:listaCurso){
            opcaoCurso.addItem(c.getNomeCurso());
        }*/ 
    }//GEN-LAST:event_formWindowOpened

    private void natacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natacaoActionPerformed
        // TODO add your handling code here:
        somaValorModalidade(200);
        nomeModalidades.add("natação");
    }//GEN-LAST:event_natacaoActionPerformed

    private void ginasticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ginasticaActionPerformed
        // TODO add your handling code here:
        somaValorModalidade(250);
        nomeModalidades.add("ginastica");

    }//GEN-LAST:event_ginasticaActionPerformed

    private void boxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxeActionPerformed
        // TODO add your handling code here:
        somaValorModalidade(100);
    }//GEN-LAST:event_boxeActionPerformed

   
    public void limpar(){
        campoLogin.setText("");
        campoDataPagamento.setText("");
        natacao.setSelected(false);
        boxe.setSelected(false);
        ginastica.setSelected(false);
        turma1_natacao.setSelected(false);
        turma2_natacao.setSelected(false);
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JCheckBox boxe;
    private javax.swing.JComboBox<String> campoAluno;
    private javax.swing.JFormattedTextField campoDataPagamento;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JCheckBox ginastica;
    private javax.swing.ButtonGroup grupoTurno;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelEndereco2;
    private javax.swing.JLabel labelNome7;
    private javax.swing.JLabel labelNome8;
    private javax.swing.JCheckBox natacao;
    private javax.swing.JLabel tituloTela3;
    private javax.swing.JLabel tituloTela4;
    private javax.swing.JCheckBox turm1_ginastica;
    private javax.swing.JCheckBox turma1_boxe;
    private javax.swing.JCheckBox turma1_natacao;
    private javax.swing.JCheckBox turma2_boxe;
    private javax.swing.JCheckBox turma2_ginastica;
    private javax.swing.JCheckBox turma2_natacao;
    // End of variables declaration//GEN-END:variables
}
import javax.swing.*;
public class Voting extends javax.swing.JFrame {

    public static int PartyA = 0;
    public static int PartyB = 0;
    public static int PartyC = 0;
    public Voting() {
        initComponents();
    }


    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton2.setText("RESEND");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ONLINE VOTING SYSTEM");

        jLabel2.setText("ENTER NAME");

        jLabel3.setText("ENTER PHONE");

        jRadioButton1.setText("PARTY A");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("PARTY B");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("PARTY C");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("CAST YOUR VOTE HERE");

        jButton1.setText("SUBMIT YOUR VOTE");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton4.setText("CHECK RESULTS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });


    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jRadioButton3.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jRadioButton1.isSelected()){
            PartyA++;
        }
        else if(jRadioButton2.isSelected()){
            PartyB++;
        }
        else if(jRadioButton3.isSelected()){
            PartyC++;
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Select a Party");
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(PartyA>PartyB && PartyA>PartyC){
            JOptionPane.showMessageDialog(rootPane, "Party A "+PartyA+"\nParty B "+PartyB+"\nParty C "+PartyC+"\n\nPARTY A has a lead");
        }
        else if(PartyB>PartyA&&PartyB>PartyC){
            JOptionPane.showMessageDialog(rootPane, "Party A "+PartyA+"\nParty B "+PartyB+"\nParty C "+PartyC+"\n\nPARTY B has a lead");
        }
        else if(PartyC>PartyA&&PartyC>PartyB){
            JOptionPane.showMessageDialog(rootPane, "Party A "+PartyA+"\nParty B "+PartyB+"\nParty C "+PartyC+"\n\nPARTY C has a lead");
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration
}
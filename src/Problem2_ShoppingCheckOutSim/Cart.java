/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2_ShoppingCheckOutSim;

import Problem2_ShoppingCheckOutSim.Models.Item;
import Problem2_ShoppingCheckOutSim.Models.Order;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author brad
 */
public class Cart extends javax.swing.JFrame {
    /*item costs:*/
    private final double burgerCost = 1.50;
    private final double chsBurgerCost = 2.50;
    private final double friesCost = 2.00;
    private final double shakeCost = 3.00;
    private final double dblChsCost = 3.50;
    
    private final List<JTextField> inputFields = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    private List<Order> orders = new ArrayList<>(); //list of orders to search thru
    
    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();
        
        /*set costs on the components*/
        this.burgerPrice.setText(Double.toString(this.burgerCost));
        this.chsBurgerPrice.setText(Double.toString(this.chsBurgerCost));
        this.friesPrice.setText(Double.toString(this.friesCost));
        this.shakePrice.setText(Double.toString(this.shakeCost));
        this.dblChsPrice.setText(Double.toString(this.dblChsCost));
        
        /*Make a list of input fieldsfor easy looping*/
        inputFields.add(this.burgerAmount);
        inputFields.add(this.chsBurgerAmount);
        inputFields.add(this.friesAmount);
        inputFields.add(this.shakeAmount);
        inputFields.add(this.dblChsAmount);
        
        items.add(new Item("Burger", burgerCost, 0));
        items.add(new Item("ChsBurger", chsBurgerCost, 0));
        items.add(new Item("Fries", friesCost, 0));
        items.add(new Item("Shake", shakeCost, 0));
        items.add(new Item("dblChsCost", dblChsCost, 0));
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        burgerPrice = new javax.swing.JLabel();
        chsBurgerPrice = new javax.swing.JLabel();
        friesPrice = new javax.swing.JLabel();
        shakePrice = new javax.swing.JLabel();
        dblChsPrice = new javax.swing.JLabel();
        burgerAmount = new javax.swing.JTextField();
        chsBurgerAmount = new javax.swing.JTextField();
        friesAmount = new javax.swing.JTextField();
        shakeAmount = new javax.swing.JTextField();
        dblChsAmount = new javax.swing.JTextField();
        buttonCalculateTotal = new javax.swing.JButton();
        totalAmount = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonCheckout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Item");

        jLabel2.setText("Price");

        jLabel3.setText("Amount");

        jLabel4.setText("Fries");

        jLabel5.setText("Burger");

        jLabel6.setText("Chs-Burger");

        jLabel7.setText("Shake");

        jLabel8.setText("Dbl Chs");

        burgerPrice.setText("0");

        chsBurgerPrice.setText("0");

        friesPrice.setText("0");

        shakePrice.setText("0");

        dblChsPrice.setText("0");

        burgerAmount.setText("0");
        burgerAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerAmountActionPerformed(evt);
            }
        });

        chsBurgerAmount.setText("0");

        friesAmount.setText("0");
        friesAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friesAmountActionPerformed(evt);
            }
        });

        shakeAmount.setText("0");

        dblChsAmount.setText("0");

        buttonCalculateTotal.setText("Calculate Total");
        buttonCalculateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateTotalActionPerformed(evt);
            }
        });

        totalAmount.setText("0");

        buttonCancel.setText("Cancel");

        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonCheckout.setText("Checkout");
        buttonCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheckoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chsBurgerPrice)
                            .addComponent(friesPrice)
                            .addComponent(shakePrice)
                            .addComponent(dblChsPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shakeAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(friesAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chsBurgerAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(dblChsAmount))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(burgerPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(burgerAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCancel)
                        .addGap(47, 47, 47)
                        .addComponent(buttonReset))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCalculateTotal)
                        .addGap(18, 18, 18)
                        .addComponent(totalAmount)))
                .addGap(43, 43, 43)
                .addComponent(buttonCheckout)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(burgerPrice)
                    .addComponent(burgerAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(chsBurgerPrice)
                    .addComponent(chsBurgerAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(friesPrice)
                    .addComponent(friesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(shakePrice)
                    .addComponent(shakeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dblChsPrice)
                    .addComponent(dblChsAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCalculateTotal)
                    .addComponent(totalAmount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonReset)
                    .addComponent(buttonCheckout))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void friesAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friesAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_friesAmountActionPerformed

    private void buttonCalculateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateTotalActionPerformed
        double totalCost = 0;
        /*TODO check what goes to what?*/
//        for (JTextField field : this.inputFields) {
//            if(!field.getText().isEmpty())
//                totalCost += Double.parseDouble(field.getText());
//        }
        totalCost = (
                (Double.parseDouble(this.burgerAmount.getText())* this.burgerCost) +
                (Double.parseDouble(this.chsBurgerAmount.getText()) * this.chsBurgerCost) +
                (Double.parseDouble(this.friesAmount.getText()) * this.friesCost) +
                (Double.parseDouble(this.shakeAmount.getText()) * this.shakeCost) +
                (Double.parseDouble(this.dblChsAmount.getText()) * this.dblChsCost) 
                );

        this.totalAmount.setText(Double.toString(totalCost));
    }//GEN-LAST:event_buttonCalculateTotalActionPerformed

    private void burgerAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgerAmountActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        for (JTextField field : this.inputFields) {
            field.setText("0");
        }
        this.totalAmount.setText("0");
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheckoutActionPerformed
        items.get(0).setAmount(Integer.parseInt(this.burgerAmount.getText()));
        items.get(1).setAmount(Integer.parseInt(this.chsBurgerAmount.getText()));
        items.get(2).setAmount(Integer.parseInt(this.friesAmount.getText()));
        items.get(3).setAmount(Integer.parseInt(this.shakeAmount.getText()));
        items.get(4).setAmount(Integer.parseInt(this.dblChsAmount.getText()));
            
        /*open the modify window with basic params.*/
        Modify myModify = new Modify(this.items);
        myModify.setVisible(true);
    }//GEN-LAST:event_buttonCheckoutActionPerformed

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField burgerAmount;
    private javax.swing.JLabel burgerPrice;
    private javax.swing.JButton buttonCalculateTotal;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCheckout;
    private javax.swing.JButton buttonReset;
    private javax.swing.JTextField chsBurgerAmount;
    private javax.swing.JLabel chsBurgerPrice;
    private javax.swing.JTextField dblChsAmount;
    private javax.swing.JLabel dblChsPrice;
    private javax.swing.JTextField friesAmount;
    private javax.swing.JLabel friesPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField shakeAmount;
    private javax.swing.JLabel shakePrice;
    private javax.swing.JLabel totalAmount;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GuessWordFrame extends javax.swing.JFrame {

    //class variables
    private String mystery="highschool";
    private String guessed="tsnobhm";
    
    public GuessWordFrame() {
        initComponents();
        setLocationRelativeTo(null);
        String show=getShowWord(mystery,guessed);
        System.out.println(show);
    }

    public String getShowWord(String m, String g) {
        //return what the user should see!
        //ex:    h--hs-hoo-
        return("stuff");
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonA = new javax.swing.JButton();
        buttonB = new javax.swing.JButton();
        buttonC = new javax.swing.JButton();
        panelDraw = new javax.swing.JPanel();
        buttonTest = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGame = new javax.swing.JMenu();
        menuStartGame = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonA.setText("a");
        buttonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAActionPerformed(evt);
            }
        });

        buttonB.setText("b");
        buttonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBActionPerformed(evt);
            }
        });

        buttonC.setText("c");
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonA)
                    .addComponent(buttonB)
                    .addComponent(buttonC))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDrawLayout = new javax.swing.GroupLayout(panelDraw);
        panelDraw.setLayout(panelDrawLayout);
        panelDrawLayout.setHorizontalGroup(
            panelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        panelDrawLayout.setVerticalGroup(
            panelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        buttonTest.setText("test");
        buttonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTestActionPerformed(evt);
            }
        });

        menuGame.setText("Game");

        menuStartGame.setText("Start Game");
        menuGame.add(menuStartGame);

        jMenuBar1.add(menuGame);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTest, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonTest)
                        .addGap(0, 214, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAActionPerformed
        String s="abc";
        System.out.println( s.substring(0,-1) );
        handleButton(evt);
    }//GEN-LAST:event_buttonAActionPerformed

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonCActionPerformed

    private void buttonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonBActionPerformed

    private void buttonTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTestActionPerformed
        drawStuff();
    }//GEN-LAST:event_buttonTestActionPerformed

    public void drawStuff() {
        Graphics g =panelDraw.getGraphics();
        g.setColor(Color.BLUE );
        g.fillRect(0,0, panelDraw.getWidth(), panelDraw.getHeight() );
        g.setColor(Color.WHITE);
        g.fillOval(100,100, 30,30);
        g.setFont( new Font("Arial", Font.BOLD, 40));
        g.drawString("Hello", 200,50);
    }
    public void handleButton(java.awt.event.ActionEvent evt){
        javax.swing.JButton butt=(javax.swing.JButton)evt.getSource();
        String text=butt.getText();
        butt.setEnabled(false);
        letterPressed(text);
    }
    
    public void letterPressed(String letter) {
        System.out.println(letter);
        //your code...
    }
    
    
 
    
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
            java.util.logging.Logger.getLogger(GuessWordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessWordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessWordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessWordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessWordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonA;
    private javax.swing.JButton buttonB;
    private javax.swing.JButton buttonC;
    private javax.swing.JButton buttonTest;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuGame;
    private javax.swing.JMenuItem menuStartGame;
    private javax.swing.JPanel panelDraw;
    // End of variables declaration//GEN-END:variables
}

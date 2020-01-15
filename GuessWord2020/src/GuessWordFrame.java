
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GuessWordFrame extends javax.swing.JFrame {

    //class variables
    private String randomWord = "";
    private String guesses = "";
    private String output = "";
    private String lookFor = "";
    
    public GuessWordFrame() {
        initComponents();
        setLocationRelativeTo(null);
        String show=getShowWord(randomWord,guesses);
        System.out.println(show);

    }

    public String getShowWord(String randomWord, String guesses) {
        for(int i = 0;i < guesses.length();i++){
          lookFor = guesses.substring(i,i+1);
          for(int j = 0;j < randomWord.length(); j++){
            String temp =randomWord.substring(j,j+1);    //could be more efficient if using indexOf
            if (temp.equals(lookFor))
              output =output.substring(0, j)+lookFor+output.substring(j + 1); 
          }
        }
        return(output);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonA = new javax.swing.JButton();
        buttonB = new javax.swing.JButton();
        buttonC = new javax.swing.JButton();
        buttonD = new javax.swing.JButton();
        buttonE = new javax.swing.JButton();
        buttonF = new javax.swing.JButton();
        buttonG = new javax.swing.JButton();
        buttonH = new javax.swing.JButton();
        buttonI = new javax.swing.JButton();
        buttonJ = new javax.swing.JButton();
        buttonK = new javax.swing.JButton();
        buttonL = new javax.swing.JButton();
        buttonM = new javax.swing.JButton();
        buttonN = new javax.swing.JButton();
        buttonO = new javax.swing.JButton();
        buttonP = new javax.swing.JButton();
        buttonQ = new javax.swing.JButton();
        buttonR = new javax.swing.JButton();
        buttonS = new javax.swing.JButton();
        buttonT = new javax.swing.JButton();
        buttonU = new javax.swing.JButton();
        buttonV = new javax.swing.JButton();
        buttonW = new javax.swing.JButton();
        buttonX = new javax.swing.JButton();
        buttonY = new javax.swing.JButton();
        buttonZ = new javax.swing.JButton();
        buttonTest = new javax.swing.JButton();
        panelDraw = new javax.swing.JPanel();
        textfieldDisplay = new javax.swing.JTextField();
        textfieldGuessed = new javax.swing.JTextField();
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

        buttonD.setText("d");
        buttonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDActionPerformed(evt);
            }
        });

        buttonE.setText("e");
        buttonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEActionPerformed(evt);
            }
        });

        buttonF.setText("f");
        buttonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFActionPerformed(evt);
            }
        });

        buttonG.setText("g");
        buttonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGActionPerformed(evt);
            }
        });

        buttonH.setText("h");
        buttonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHActionPerformed(evt);
            }
        });

        buttonI.setText("i");
        buttonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIActionPerformed(evt);
            }
        });

        buttonJ.setText("j");
        buttonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJActionPerformed(evt);
            }
        });

        buttonK.setText("k");
        buttonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKActionPerformed(evt);
            }
        });

        buttonL.setText("l");
        buttonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLActionPerformed(evt);
            }
        });

        buttonM.setText("m");
        buttonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMActionPerformed(evt);
            }
        });

        buttonN.setText("n");
        buttonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNActionPerformed(evt);
            }
        });

        buttonO.setText("o");
        buttonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOActionPerformed(evt);
            }
        });

        buttonP.setText("p");
        buttonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPActionPerformed(evt);
            }
        });

        buttonQ.setText("q");
        buttonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQActionPerformed(evt);
            }
        });

        buttonR.setText("r");
        buttonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRActionPerformed(evt);
            }
        });

        buttonS.setText("s");
        buttonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSActionPerformed(evt);
            }
        });

        buttonT.setText("t");
        buttonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTActionPerformed(evt);
            }
        });

        buttonU.setText("u");
        buttonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUActionPerformed(evt);
            }
        });

        buttonV.setText("v");
        buttonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVActionPerformed(evt);
            }
        });

        buttonW.setText("w");
        buttonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWActionPerformed(evt);
            }
        });

        buttonX.setText("x");
        buttonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXActionPerformed(evt);
            }
        });

        buttonY.setText("y");
        buttonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYActionPerformed(evt);
            }
        });

        buttonZ.setText("z");
        buttonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZActionPerformed(evt);
            }
        });

        buttonTest.setText("test");
        buttonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonA, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonE, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonF, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonG, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonI, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonM, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonO, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonR, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonU, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonX, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonY, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(buttonTest, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonA)
                    .addComponent(buttonB)
                    .addComponent(buttonC)
                    .addComponent(buttonD)
                    .addComponent(buttonE)
                    .addComponent(buttonF)
                    .addComponent(buttonG)
                    .addComponent(buttonH)
                    .addComponent(buttonI)
                    .addComponent(buttonJ)
                    .addComponent(buttonK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonL)
                    .addComponent(buttonM)
                    .addComponent(buttonN)
                    .addComponent(buttonO)
                    .addComponent(buttonP)
                    .addComponent(buttonQ)
                    .addComponent(buttonR)
                    .addComponent(buttonS)
                    .addComponent(buttonT)
                    .addComponent(buttonU)
                    .addComponent(buttonV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonW)
                    .addComponent(buttonX)
                    .addComponent(buttonY)
                    .addComponent(buttonZ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(buttonTest))
        );

        javax.swing.GroupLayout panelDrawLayout = new javax.swing.GroupLayout(panelDraw);
        panelDraw.setLayout(panelDrawLayout);
        panelDrawLayout.setHorizontalGroup(
            panelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        panelDrawLayout.setVerticalGroup(
            panelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        textfieldDisplay.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        textfieldDisplay.setText("START A GAME");

        textfieldGuessed.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N

        menuGame.setText("Game");

        menuStartGame.setText("Start Game");
        menuStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStartGameActionPerformed(evt);
            }
        });
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfieldDisplay)
                            .addComponent(textfieldGuessed, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                        .addComponent(textfieldDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textfieldGuessed, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAActionPerformed
        String s="abcdefghijklmnopqrstuvwxyz";
        //System.out.println( s.substring(0,1) );
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

    private void buttonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonDActionPerformed

    private void buttonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonEActionPerformed

    private void buttonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonFActionPerformed

    private void buttonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonGActionPerformed

    private void buttonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonHActionPerformed

    private void buttonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonIActionPerformed

    private void buttonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonJActionPerformed

    private void buttonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonKActionPerformed

    private void buttonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonLActionPerformed

    private void buttonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonMActionPerformed

    private void buttonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonNActionPerformed

    private void buttonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonOActionPerformed

    private void buttonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonPActionPerformed

    private void buttonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonQActionPerformed

    private void buttonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonRActionPerformed

    private void buttonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonSActionPerformed

    private void buttonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonTActionPerformed

    private void buttonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonUActionPerformed

    private void buttonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonVActionPerformed

    private void buttonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonWActionPerformed

    private void buttonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonXActionPerformed

    private void buttonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonYActionPerformed

    private void buttonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZActionPerformed
        handleButton(evt);
    }//GEN-LAST:event_buttonZActionPerformed

    private void menuStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStartGameActionPerformed
        randomWord = getWord();         System.out.println(randomWord);
        for(int k = 0; k < randomWord.length(); k++){
            output = output +"-";   
        }
        textfieldDisplay.setText(output);
    }//GEN-LAST:event_menuStartGameActionPerformed
    
    private String getWord() {
        String url="https://RequiredAccuratePacket.theensphere.repl.co";
        String wordList=WebReader.readWebPage(url,true);
        String cWord = "";
        int randomPosition = (int) (Math.random() * wordList.length() + 0); 
        cWord = wordList.substring(randomPosition+1);
        randomPosition = cWord.indexOf(" ");
        cWord = cWord.substring(randomPosition+1);
        randomPosition = cWord.indexOf(" ");
        cWord = cWord.substring(0,randomPosition);
        return(cWord);
    }
    
    
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
        guesses = guesses + letter;
        String show=getShowWord(randomWord,guesses);
        textfieldDisplay.setText(show);
        textfieldGuessed.setText(guesses);
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
    private javax.swing.JButton buttonD;
    private javax.swing.JButton buttonE;
    private javax.swing.JButton buttonF;
    private javax.swing.JButton buttonG;
    private javax.swing.JButton buttonH;
    private javax.swing.JButton buttonI;
    private javax.swing.JButton buttonJ;
    private javax.swing.JButton buttonK;
    private javax.swing.JButton buttonL;
    private javax.swing.JButton buttonM;
    private javax.swing.JButton buttonN;
    private javax.swing.JButton buttonO;
    private javax.swing.JButton buttonP;
    private javax.swing.JButton buttonQ;
    private javax.swing.JButton buttonR;
    private javax.swing.JButton buttonS;
    private javax.swing.JButton buttonT;
    private javax.swing.JButton buttonTest;
    private javax.swing.JButton buttonU;
    private javax.swing.JButton buttonV;
    private javax.swing.JButton buttonW;
    private javax.swing.JButton buttonX;
    private javax.swing.JButton buttonY;
    private javax.swing.JButton buttonZ;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuGame;
    private javax.swing.JMenuItem menuStartGame;
    private javax.swing.JPanel panelDraw;
    private javax.swing.JTextField textfieldDisplay;
    private javax.swing.JTextField textfieldGuessed;
    // End of variables declaration//GEN-END:variables
}

package evaluativainterfaces;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Calculadora extends javax.swing.JFrame {

    private int yMouse;
    private int xMouse;

    public Calculadora() {
        initComponents();
        hideErrors();
    }

    private void hideErrors() {
        jLabelErrorNumero1.setVisible(false);
        jLabelErrorNumero2.setVisible(false);

    }

    private void ResetFields() {
        Color color = new Color(180, 180, 180);
        
        JTNumero1.setText("Introduce numero 1");
        JTNumero1.setForeground(color);
        JTNumero2.setText("Introduce numero 2");
        JTNumero2.setForeground(color);
        JTextResultado.setText("");
        JTextResultado.setForeground(color);
    }

    private float calculate(float numero1, float numero2, int opcion) {

        switch (opcion) {

            case 1:
                return numero1 + numero2;

            case 2:
                return numero1 - numero2;

            case 3:
                return numero1 * numero2;

            case 4:
                return numero1 / numero2;

        }
        return 0f;
    }

    private float getNumberText1() {
        try {

            return Float.parseFloat(JTNumero1.getText().replace(",", "."));

        } catch (NumberFormatException exception) {
            jLabelErrorNumero1.setVisible(true);
            return 0;
        }
    }

    private float getNumberText2() {

        try {

            return Float.parseFloat(JTNumero2.getText().replace(",", "."));

        } catch (NumberFormatException exception) {
            jLabelErrorNumero2.setVisible(true);
            return 0;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelButonExit = new javax.swing.JLabel();
        jPanelbackground = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        JLabelNumero1 = new javax.swing.JLabel();
        JLabelNumero2 = new javax.swing.JLabel();
        JTNumero1 = new javax.swing.JTextField();
        jSeparatorNumero1 = new javax.swing.JSeparator();
        jSeparatorNumero2 = new javax.swing.JSeparator();
        jPbotonSuma = new javax.swing.JPanel();
        JTextBotonSuma = new java.awt.Label();
        JTNumero2 = new javax.swing.JTextField();
        jPbotonResta = new javax.swing.JPanel();
        JTextBotonResta = new java.awt.Label();
        JLabelResultado = new javax.swing.JLabel();
        JTextResultado = new javax.swing.JTextField();
        jSeparatorResultado = new javax.swing.JSeparator();
        jPbotonClean = new javax.swing.JPanel();
        JTextBotonClean = new java.awt.Label();
        jPbotonDividir = new javax.swing.JPanel();
        JTextBotonDividir = new java.awt.Label();
        jPbotonMultiplicar = new javax.swing.JPanel();
        JTextBotonMulti = new java.awt.Label();
        jLabelErrorNumero1 = new javax.swing.JLabel();
        jLabelErrorNumero2 = new javax.swing.JLabel();
        jPanelBar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelButonExit.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelButonExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelButonExit.setText("x");
        jLabelButonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelButonExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelButonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelButonExitMouseExited(evt);
            }
        });
        getContentPane().add(jLabelButonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanelbackground.setBackground(new java.awt.Color(24, 24, 129));

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setInheritsPopupMenu(true);

        JLabelTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        JLabelTitulo.setForeground(new java.awt.Color(0, 134, 190));
        JLabelTitulo.setText("Calculadora");

        JLabelNumero1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JLabelNumero1.setForeground(new java.awt.Color(0, 134, 190));
        JLabelNumero1.setText("Numero 1");

        JLabelNumero2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JLabelNumero2.setForeground(new java.awt.Color(0, 134, 190));
        JLabelNumero2.setText("Numero 2");

        JTNumero1.setBackground(new java.awt.Color(255, 255, 255));
        JTNumero1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        JTNumero1.setForeground(new java.awt.Color(204, 204, 204));
        JTNumero1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTNumero1.setText("Introduce numero 1");
        JTNumero1.setBorder(null);
        JTNumero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTNumero1MousePressed(evt);
            }
        });
        JTNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNumero1ActionPerformed(evt);
            }
        });

        jSeparatorNumero1.setForeground(new java.awt.Color(0, 134, 190));

        jSeparatorNumero2.setForeground(new java.awt.Color(0, 134, 190));

        JTextBotonSuma.setAlignment(java.awt.Label.CENTER);
        JTextBotonSuma.setBackground(new java.awt.Color(0, 134, 190));
        JTextBotonSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTextBotonSuma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JTextBotonSuma.setForeground(new java.awt.Color(255, 255, 255));
        JTextBotonSuma.setText("SUMA");
        JTextBotonSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextBotonSumaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTextBotonSumaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTextBotonSumaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonSumaLayout = new javax.swing.GroupLayout(jPbotonSuma);
        jPbotonSuma.setLayout(jPbotonSumaLayout);
        jPbotonSumaLayout.setHorizontalGroup(
            jPbotonSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPbotonSumaLayout.setVerticalGroup(
            jPbotonSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JTNumero2.setBackground(new java.awt.Color(255, 255, 255));
        JTNumero2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        JTNumero2.setForeground(new java.awt.Color(204, 204, 204));
        JTNumero2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTNumero2.setText("Introduce numero 2");
        JTNumero2.setBorder(null);
        JTNumero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTNumero2MousePressed(evt);
            }
        });
        JTNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNumero2ActionPerformed(evt);
            }
        });

        JTextBotonResta.setAlignment(java.awt.Label.CENTER);
        JTextBotonResta.setBackground(new java.awt.Color(0, 134, 190));
        JTextBotonResta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTextBotonResta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JTextBotonResta.setForeground(new java.awt.Color(255, 255, 255));
        JTextBotonResta.setText("RESTA");
        JTextBotonResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextBotonRestaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTextBotonRestaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTextBotonRestaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonRestaLayout = new javax.swing.GroupLayout(jPbotonResta);
        jPbotonResta.setLayout(jPbotonRestaLayout);
        jPbotonRestaLayout.setHorizontalGroup(
            jPbotonRestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPbotonRestaLayout.setVerticalGroup(
            jPbotonRestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbotonRestaLayout.createSequentialGroup()
                .addComponent(JTextBotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JLabelResultado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JLabelResultado.setForeground(new java.awt.Color(0, 134, 190));
        JLabelResultado.setText("Resultado");

        JTextResultado.setEditable(false);
        JTextResultado.setBackground(new java.awt.Color(255, 255, 255));
        JTextResultado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        JTextResultado.setForeground(new java.awt.Color(0, 0, 0));
        JTextResultado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTextResultado.setBorder(null);
        JTextResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTextResultadoMousePressed(evt);
            }
        });
        JTextResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextResultadoActionPerformed(evt);
            }
        });

        jSeparatorResultado.setForeground(new java.awt.Color(0, 134, 190));

        JTextBotonClean.setAlignment(java.awt.Label.CENTER);
        JTextBotonClean.setBackground(new java.awt.Color(0, 134, 190));
        JTextBotonClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTextBotonClean.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JTextBotonClean.setForeground(new java.awt.Color(255, 255, 255));
        JTextBotonClean.setText("CLEAN");
        JTextBotonClean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextBotonCleanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTextBotonCleanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTextBotonCleanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonCleanLayout = new javax.swing.GroupLayout(jPbotonClean);
        jPbotonClean.setLayout(jPbotonCleanLayout);
        jPbotonCleanLayout.setHorizontalGroup(
            jPbotonCleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonClean, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPbotonCleanLayout.setVerticalGroup(
            jPbotonCleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonClean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JTextBotonDividir.setAlignment(java.awt.Label.CENTER);
        JTextBotonDividir.setBackground(new java.awt.Color(0, 134, 190));
        JTextBotonDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTextBotonDividir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JTextBotonDividir.setForeground(new java.awt.Color(255, 255, 255));
        JTextBotonDividir.setText("DIV");
        JTextBotonDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextBotonDividirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTextBotonDividirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTextBotonDividirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonDividirLayout = new javax.swing.GroupLayout(jPbotonDividir);
        jPbotonDividir.setLayout(jPbotonDividirLayout);
        jPbotonDividirLayout.setHorizontalGroup(
            jPbotonDividirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonDividir, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPbotonDividirLayout.setVerticalGroup(
            jPbotonDividirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JTextBotonMulti.setAlignment(java.awt.Label.CENTER);
        JTextBotonMulti.setBackground(new java.awt.Color(0, 134, 190));
        JTextBotonMulti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTextBotonMulti.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JTextBotonMulti.setForeground(new java.awt.Color(255, 255, 255));
        JTextBotonMulti.setText("MULTI");
        JTextBotonMulti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextBotonMultiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTextBotonMultiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JTextBotonMultiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonMultiplicarLayout = new javax.swing.GroupLayout(jPbotonMultiplicar);
        jPbotonMultiplicar.setLayout(jPbotonMultiplicarLayout);
        jPbotonMultiplicarLayout.setHorizontalGroup(
            jPbotonMultiplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonMulti, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPbotonMultiplicarLayout.setVerticalGroup(
            jPbotonMultiplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTextBotonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabelErrorNumero1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelErrorNumero1.setForeground(new java.awt.Color(204, 0, 0));
        jLabelErrorNumero1.setText("**Error: Introduce valor numerico**");

        jLabelErrorNumero2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelErrorNumero2.setForeground(new java.awt.Color(204, 0, 0));
        jLabelErrorNumero2.setText("**Error: Introduce valor numerico**");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelTitulo)
                .addGap(174, 174, 174))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPbotonResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPbotonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPbotonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPbotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jPbotonClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparatorResultado)
                        .addComponent(JTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JTNumero1)
                        .addComponent(jSeparatorNumero1)
                        .addComponent(jSeparatorNumero2)
                        .addComponent(JTNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(JLabelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorNumero1))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(JLabelNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorNumero2)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPbotonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPbotonClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPbotonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPbotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPbotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanelbackgroundLayout = new javax.swing.GroupLayout(jPanelbackground);
        jPanelbackground.setLayout(jPanelbackgroundLayout);
        jPanelbackgroundLayout.setHorizontalGroup(
            jPanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbackgroundLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanelbackgroundLayout.setVerticalGroup(
            jPanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbackgroundLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 700));

        jPanelBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarMouseDragged(evt);
            }
        });
        jPanelBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarLayout = new javax.swing.GroupLayout(jPanelBar);
        jPanelBar.setLayout(jPanelBarLayout);
        jPanelBarLayout.setHorizontalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanelBarLayout.setVerticalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelBarMousePressed

    private void jPanelBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMouseDragged
        int xPantalla = evt.getXOnScreen();
        int yPantalla = evt.getYOnScreen();
        this.setLocation(xPantalla - xMouse, yPantalla - yMouse);
    }//GEN-LAST:event_jPanelBarMouseDragged

    private void jLabelButonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButonExitMouseEntered
        jLabelButonExit.setForeground(Color.red);
    }//GEN-LAST:event_jLabelButonExitMouseEntered

    private void jLabelButonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButonExitMouseExited
        jLabelButonExit.setForeground(Color.white);
    }//GEN-LAST:event_jLabelButonExitMouseExited

    private void jLabelButonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelButonExitMouseClicked

    private void JTNumero1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTNumero1MousePressed

        if (JTNumero1.getText().equals("Introduce numero 1")) {
            JTNumero1.setText("");
            JTNumero1.setForeground(Color.black);
        }
        if (JTNumero2.getText().isEmpty()) {
            JTNumero2.setText("Introduce numero 2");
            JTNumero2.setForeground(new Color(180, 180, 180));
        }

        hideErrors();
    }//GEN-LAST:event_JTNumero1MousePressed

    private void JTNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNumero1ActionPerformed

    private void JTextBotonSumaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonSumaMouseEntered
        JTextBotonSuma.setBackground(new Color(26, 94, 176));
        //TextBoton.setForeground(Color.black);
    }//GEN-LAST:event_JTextBotonSumaMouseEntered

    private void JTextBotonSumaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonSumaMouseExited
        JTextBotonSuma.setBackground(new Color(0, 134, 190));
        //JTextBotonSuma.setForeground(Color.white);
    }//GEN-LAST:event_JTextBotonSumaMouseExited

    private void JTextBotonSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonSumaMouseClicked

        JTextResultado.setText(String.valueOf(calculate(getNumberText1(), getNumberText2(), 1)));
        JTextResultado.setForeground(Color.black);
    }//GEN-LAST:event_JTextBotonSumaMouseClicked

    private void JTNumero2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTNumero2MousePressed
        if (JTNumero2.getText().equals("Introduce numero 2")) {
            JTNumero2.setText("");
            JTNumero2.setForeground(Color.black);
        }
        if (JTNumero1.getText().isEmpty()) {
            JTNumero1.setText("Introduce numero 1");
            JTNumero1.setForeground(new Color(180, 180, 180));
        }

        hideErrors();
    }//GEN-LAST:event_JTNumero2MousePressed

    private void JTNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNumero2ActionPerformed

    private void JTextBotonRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonRestaMouseClicked
        JTextResultado.setText(String.valueOf(calculate(getNumberText1(), getNumberText2(), 2)));
        JTextResultado.setForeground(Color.black);
    }//GEN-LAST:event_JTextBotonRestaMouseClicked

    private void JTextBotonRestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonRestaMouseEntered
        JTextBotonResta.setBackground(new Color(26, 94, 176));
    }//GEN-LAST:event_JTextBotonRestaMouseEntered

    private void JTextBotonRestaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonRestaMouseExited
        JTextBotonResta.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_JTextBotonRestaMouseExited

    private void JTextResultadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextResultadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextResultadoMousePressed

    private void JTextResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextResultadoActionPerformed

    private void JTextBotonCleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonCleanMouseClicked
        ResetFields();
    }//GEN-LAST:event_JTextBotonCleanMouseClicked

    private void JTextBotonCleanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonCleanMouseEntered
        JTextBotonClean.setBackground(new Color(26, 94, 176));
    }//GEN-LAST:event_JTextBotonCleanMouseEntered

    private void JTextBotonCleanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonCleanMouseExited
        JTextBotonClean.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_JTextBotonCleanMouseExited

    private void JTextBotonDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonDividirMouseClicked
        JTextResultado.setText(String.valueOf(calculate(getNumberText1(), getNumberText2(), 4)));
        JTextResultado.setForeground(Color.black);
    }//GEN-LAST:event_JTextBotonDividirMouseClicked

    private void JTextBotonDividirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonDividirMouseEntered
        JTextBotonDividir.setBackground(new Color(26, 94, 176));
    }//GEN-LAST:event_JTextBotonDividirMouseEntered

    private void JTextBotonDividirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonDividirMouseExited
        JTextBotonDividir.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_JTextBotonDividirMouseExited

    private void JTextBotonMultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonMultiMouseClicked
        JTextResultado.setText(String.valueOf(calculate(getNumberText1(), getNumberText2(), 3)));
        JTextResultado.setForeground(Color.black);
    }//GEN-LAST:event_JTextBotonMultiMouseClicked

    private void JTextBotonMultiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonMultiMouseEntered
        JTextBotonMulti.setBackground(new Color(26, 94, 176));
    }//GEN-LAST:event_JTextBotonMultiMouseEntered

    private void JTextBotonMultiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextBotonMultiMouseExited
        JTextBotonMulti.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_JTextBotonMultiMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelNumero1;
    private javax.swing.JLabel JLabelNumero2;
    private javax.swing.JLabel JLabelResultado;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JTextField JTNumero1;
    private javax.swing.JTextField JTNumero2;
    private java.awt.Label JTextBotonClean;
    private java.awt.Label JTextBotonDividir;
    private java.awt.Label JTextBotonMulti;
    private java.awt.Label JTextBotonResta;
    private java.awt.Label JTextBotonSuma;
    private javax.swing.JTextField JTextResultado;
    private javax.swing.JLabel jLabelButonExit;
    private javax.swing.JLabel jLabelErrorNumero1;
    private javax.swing.JLabel jLabelErrorNumero2;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelbackground;
    private javax.swing.JPanel jPbotonClean;
    private javax.swing.JPanel jPbotonDividir;
    private javax.swing.JPanel jPbotonMultiplicar;
    private javax.swing.JPanel jPbotonResta;
    private javax.swing.JPanel jPbotonSuma;
    private javax.swing.JSeparator jSeparatorNumero1;
    private javax.swing.JSeparator jSeparatorNumero2;
    private javax.swing.JSeparator jSeparatorResultado;
    // End of variables declaration//GEN-END:variables

}

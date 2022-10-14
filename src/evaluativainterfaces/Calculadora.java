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
        TextBotonSuma = new java.awt.Label();
        JTNumero2 = new javax.swing.JTextField();
        jPbotonResta = new javax.swing.JPanel();
        TextBotonResta = new java.awt.Label();
        JLabelResultado = new javax.swing.JLabel();
        JTResultado = new javax.swing.JTextField();
        jSeparatorResultado = new javax.swing.JSeparator();
        jPbotonSuma1 = new javax.swing.JPanel();
        TextBotonSuma1 = new java.awt.Label();
        jPbotonSuma2 = new javax.swing.JPanel();
        TextBotonSuma2 = new java.awt.Label();
        jPbotonSuma3 = new javax.swing.JPanel();
        TextBotonSuma3 = new java.awt.Label();
        jPbotonSuma4 = new javax.swing.JPanel();
        TextBotonSuma4 = new java.awt.Label();
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

        TextBotonSuma.setAlignment(java.awt.Label.CENTER);
        TextBotonSuma.setBackground(new java.awt.Color(0, 134, 190));
        TextBotonSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextBotonSuma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextBotonSuma.setForeground(new java.awt.Color(255, 255, 255));
        TextBotonSuma.setText("SUMA");
        TextBotonSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBotonSumaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextBotonSumaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextBotonSumaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonSumaLayout = new javax.swing.GroupLayout(jPbotonSuma);
        jPbotonSuma.setLayout(jPbotonSumaLayout);
        jPbotonSumaLayout.setHorizontalGroup(
            jPbotonSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextBotonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPbotonSumaLayout.setVerticalGroup(
            jPbotonSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextBotonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        TextBotonResta.setAlignment(java.awt.Label.CENTER);
        TextBotonResta.setBackground(new java.awt.Color(0, 134, 190));
        TextBotonResta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextBotonResta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextBotonResta.setForeground(new java.awt.Color(255, 255, 255));
        TextBotonResta.setText("RESTA");
        TextBotonResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBotonRestaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextBotonRestaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextBotonRestaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonRestaLayout = new javax.swing.GroupLayout(jPbotonResta);
        jPbotonResta.setLayout(jPbotonRestaLayout);
        jPbotonRestaLayout.setHorizontalGroup(
            jPbotonRestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextBotonResta, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPbotonRestaLayout.setVerticalGroup(
            jPbotonRestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbotonRestaLayout.createSequentialGroup()
                .addComponent(TextBotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JLabelResultado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JLabelResultado.setForeground(new java.awt.Color(0, 134, 190));
        JLabelResultado.setText("Resultado");

        JTResultado.setBackground(new java.awt.Color(255, 255, 255));
        JTResultado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        JTResultado.setForeground(new java.awt.Color(204, 204, 204));
        JTResultado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTResultado.setBorder(null);
        JTResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTResultadoMousePressed(evt);
            }
        });
        JTResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTResultadoActionPerformed(evt);
            }
        });

        jSeparatorResultado.setForeground(new java.awt.Color(0, 134, 190));

        TextBotonSuma1.setAlignment(java.awt.Label.CENTER);
        TextBotonSuma1.setBackground(new java.awt.Color(0, 134, 190));
        TextBotonSuma1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextBotonSuma1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextBotonSuma1.setForeground(new java.awt.Color(255, 255, 255));
        TextBotonSuma1.setText("SUMA");
        TextBotonSuma1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBotonSuma1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextBotonSuma1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextBotonSuma1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonSuma1Layout = new javax.swing.GroupLayout(jPbotonSuma1);
        jPbotonSuma1.setLayout(jPbotonSuma1Layout);
        jPbotonSuma1Layout.setHorizontalGroup(
            jPbotonSuma1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotonSuma1Layout.createSequentialGroup()
                .addComponent(TextBotonSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPbotonSuma1Layout.setVerticalGroup(
            jPbotonSuma1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextBotonSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TextBotonSuma2.setAlignment(java.awt.Label.CENTER);
        TextBotonSuma2.setBackground(new java.awt.Color(0, 134, 190));
        TextBotonSuma2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextBotonSuma2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextBotonSuma2.setForeground(new java.awt.Color(255, 255, 255));
        TextBotonSuma2.setText("SUMA");
        TextBotonSuma2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBotonSuma2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextBotonSuma2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextBotonSuma2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonSuma2Layout = new javax.swing.GroupLayout(jPbotonSuma2);
        jPbotonSuma2.setLayout(jPbotonSuma2Layout);
        jPbotonSuma2Layout.setHorizontalGroup(
            jPbotonSuma2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotonSuma2Layout.createSequentialGroup()
                .addComponent(TextBotonSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPbotonSuma2Layout.setVerticalGroup(
            jPbotonSuma2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextBotonSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TextBotonSuma3.setAlignment(java.awt.Label.CENTER);
        TextBotonSuma3.setBackground(new java.awt.Color(0, 134, 190));
        TextBotonSuma3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextBotonSuma3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextBotonSuma3.setForeground(new java.awt.Color(255, 255, 255));
        TextBotonSuma3.setText("SUMA");
        TextBotonSuma3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBotonSuma3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextBotonSuma3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextBotonSuma3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonSuma3Layout = new javax.swing.GroupLayout(jPbotonSuma3);
        jPbotonSuma3.setLayout(jPbotonSuma3Layout);
        jPbotonSuma3Layout.setHorizontalGroup(
            jPbotonSuma3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotonSuma3Layout.createSequentialGroup()
                .addComponent(TextBotonSuma3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPbotonSuma3Layout.setVerticalGroup(
            jPbotonSuma3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextBotonSuma3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TextBotonSuma4.setAlignment(java.awt.Label.CENTER);
        TextBotonSuma4.setBackground(new java.awt.Color(0, 134, 190));
        TextBotonSuma4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextBotonSuma4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextBotonSuma4.setForeground(new java.awt.Color(255, 255, 255));
        TextBotonSuma4.setText("SUMA");
        TextBotonSuma4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBotonSuma4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextBotonSuma4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextBotonSuma4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonSuma4Layout = new javax.swing.GroupLayout(jPbotonSuma4);
        jPbotonSuma4.setLayout(jPbotonSuma4Layout);
        jPbotonSuma4Layout.setHorizontalGroup(
            jPbotonSuma4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotonSuma4Layout.createSequentialGroup()
                .addComponent(TextBotonSuma4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPbotonSuma4Layout.setVerticalGroup(
            jPbotonSuma4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextBotonSuma4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelTitulo)
                .addGap(174, 174, 174))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPbotonResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPbotonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPbotonSuma3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPbotonSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPbotonSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPbotonSuma4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparatorResultado)
                                .addComponent(JTResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JLabelNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTNumero1)
                                .addComponent(jSeparatorNumero1)
                                .addComponent(jSeparatorNumero2)
                                .addComponent(JLabelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(JLabelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPbotonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPbotonSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPbotonSuma3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPbotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPbotonSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPbotonSuma4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelbackgroundLayout = new javax.swing.GroupLayout(jPanelbackground);
        jPanelbackground.setLayout(jPanelbackgroundLayout);
        jPanelbackgroundLayout.setHorizontalGroup(
            jPanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbackgroundLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelBarMousePressed

    private void jPanelBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMouseDragged
        int xPantalla = evt.getXOnScreen();
        int yPantalla = evt.getYOnScreen();
        this.setLocation(xPantalla - xMouse,yPantalla - yMouse);
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
        
        if(JTNumero1.getText().equals("Introduce numero 1")){
            JTNumero1.setText("");
            JTNumero1.setForeground(Color.black);
        }
        if(JTNumero2.getText().isEmpty()){
            JTNumero2.setText("Introduce numero 2");
            JTNumero2.setForeground(new Color(180,180,180));
        }

    }//GEN-LAST:event_JTNumero1MousePressed

    private void JTNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNumero1ActionPerformed

    private void TextBotonSumaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSumaMouseEntered
        TextBotonSuma.setBackground(new Color(26,94,176));
        //TextBoton.setForeground(Color.black);
    }//GEN-LAST:event_TextBotonSumaMouseEntered

    private void TextBotonSumaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSumaMouseExited
        TextBotonSuma.setBackground(new Color(0,134,190));
        TextBotonSuma.setForeground(Color.white);
    }//GEN-LAST:event_TextBotonSumaMouseExited

    private void TextBotonSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSumaMouseClicked
        //hacer comprobacion de password
        
        jPanelLogin.setVisible(false);
    }//GEN-LAST:event_TextBotonSumaMouseClicked

    private void JTNumero2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTNumero2MousePressed
         if(JTNumero2.getText().equals("Introduce numero 2")){
            JTNumero2.setText("");
            JTNumero2.setForeground(Color.black);
        }
        if(JTNumero1.getText().isEmpty()){
            JTNumero1.setText("Introduce numero 1");
            JTNumero1.setForeground(new Color(180,180,180));
        }
    }//GEN-LAST:event_JTNumero2MousePressed

    private void JTNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNumero2ActionPerformed

    private void TextBotonRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonRestaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonRestaMouseClicked

    private void TextBotonRestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonRestaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonRestaMouseEntered

    private void TextBotonRestaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonRestaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonRestaMouseExited

    private void JTResultadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTResultadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTResultadoMousePressed

    private void JTResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTResultadoActionPerformed

    private void TextBotonSuma1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma1MouseClicked

    private void TextBotonSuma1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma1MouseEntered

    private void TextBotonSuma1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma1MouseExited

    private void TextBotonSuma2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma2MouseClicked

    private void TextBotonSuma2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma2MouseEntered

    private void TextBotonSuma2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma2MouseExited

    private void TextBotonSuma3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma3MouseClicked

    private void TextBotonSuma3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma3MouseEntered

    private void TextBotonSuma3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma3MouseExited

    private void TextBotonSuma4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma4MouseClicked

    private void TextBotonSuma4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma4MouseEntered

    private void TextBotonSuma4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonSuma4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBotonSuma4MouseExited

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
    private javax.swing.JTextField JTResultado;
    private java.awt.Label TextBotonResta;
    private java.awt.Label TextBotonSuma;
    private java.awt.Label TextBotonSuma1;
    private java.awt.Label TextBotonSuma2;
    private java.awt.Label TextBotonSuma3;
    private java.awt.Label TextBotonSuma4;
    private javax.swing.JLabel jLabelButonExit;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelbackground;
    private javax.swing.JPanel jPbotonResta;
    private javax.swing.JPanel jPbotonSuma;
    private javax.swing.JPanel jPbotonSuma1;
    private javax.swing.JPanel jPbotonSuma2;
    private javax.swing.JPanel jPbotonSuma3;
    private javax.swing.JPanel jPbotonSuma4;
    private javax.swing.JSeparator jSeparatorNumero1;
    private javax.swing.JSeparator jSeparatorNumero2;
    private javax.swing.JSeparator jSeparatorResultado;
    // End of variables declaration//GEN-END:variables

    
}

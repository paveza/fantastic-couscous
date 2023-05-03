package shazam;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Graphique extends javax.swing.JFrame {

    private boolean finDePartie = false, finDeManche = false;
    private final ArrayList<Integer> carteEnTout1 = new ArrayList(), carteEnTout2 = new ArrayList();
    private final ArrayList<Integer> cartePossibleR = new ArrayList(), cartePossibleV = new ArrayList();
    private final ArrayList<Integer> cartePartieR = new ArrayList<>(), cartePartieV = new ArrayList<>();
    private final ArrayList<Integer> anciennecarteR = new ArrayList<>(), anciennecarteV = new ArrayList<>();
    private int nombremanche = 1, varR = 0, varV = 0;
    private final Sorcier sor = new Sorcier("rouge"), sor2 = new Sorcier("vert");
    private final Paquet paquet = new Paquet();
    private Sorcier winner = null;
    private final MurDeFeu mdf = new MurDeFeu(9);
    private final Pont pont = new Pont(sor, 6, sor2, 12, mdf);
    private static String CHEMIN;

    public Graphique() {
        initComponents();
        cote_sor1.setVisible(false);
        cote_sor2.setVisible(false);
        pontt.setVisible(true);
        continuer.setEnabled(false);
        continuer.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        folder = new javax.swing.JFileChooser();
        jLabel3 = new javax.swing.JLabel();
        miseSort = new javax.swing.JPanel();
        cote_sor1 = new javax.swing.JPanel();
        manasor1 = new javax.swing.JTextField();
        oksor1 = new javax.swing.JButton();
        carte1r = new javax.swing.JLabel();
        carte2r = new javax.swing.JLabel();
        carte3r = new javax.swing.JLabel();
        carte4r = new javax.swing.JLabel();
        carte5r = new javax.swing.JLabel();
        carte6r = new javax.swing.JLabel();
        carte7r = new javax.swing.JLabel();
        carte8r = new javax.swing.JLabel();
        carte9r = new javax.swing.JLabel();
        carte10r = new javax.swing.JLabel();
        carte11r = new javax.swing.JLabel();
        carte12r = new javax.swing.JLabel();
        carte13r = new javax.swing.JLabel();
        carte14r = new javax.swing.JLabel();
        carte1br = new javax.swing.JCheckBox();
        carte2br = new javax.swing.JCheckBox();
        carte3br = new javax.swing.JCheckBox();
        carte4br = new javax.swing.JCheckBox();
        carte5br = new javax.swing.JCheckBox();
        carte6br = new javax.swing.JCheckBox();
        carte8br = new javax.swing.JCheckBox();
        carte9br = new javax.swing.JCheckBox();
        carte10br = new javax.swing.JCheckBox();
        carte11br = new javax.swing.JCheckBox();
        carte12br = new javax.swing.JCheckBox();
        carte13br = new javax.swing.JCheckBox();
        nomSorR = new javax.swing.JLabel();
        carte14br = new javax.swing.JCheckBox();
        carte7br = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        choixSor1 = new javax.swing.JList<>();
        pontt = new javax.swing.JPanel();
        shazamm = new javax.swing.JLabel();
        gagnant = new javax.swing.JLabel();
        pont1 = new javax.swing.JLabel();
        pont2 = new javax.swing.JLabel();
        pont3 = new javax.swing.JLabel();
        pont4 = new javax.swing.JLabel();
        pont5 = new javax.swing.JLabel();
        pont6 = new javax.swing.JLabel();
        pont7 = new javax.swing.JLabel();
        pont8 = new javax.swing.JLabel();
        pont9 = new javax.swing.JLabel();
        pont10 = new javax.swing.JLabel();
        pont11 = new javax.swing.JLabel();
        pont12 = new javax.swing.JLabel();
        pont13 = new javax.swing.JLabel();
        pont14 = new javax.swing.JLabel();
        pont15 = new javax.swing.JLabel();
        pont16 = new javax.swing.JLabel();
        pont17 = new javax.swing.JLabel();
        pont18 = new javax.swing.JLabel();
        pont19 = new javax.swing.JLabel();
        pont1bis = new javax.swing.JLabel();
        pont2bis = new javax.swing.JLabel();
        pont3bis = new javax.swing.JLabel();
        pont4bis = new javax.swing.JLabel();
        pont5bis = new javax.swing.JLabel();
        pont6bis = new javax.swing.JLabel();
        pont7bis = new javax.swing.JLabel();
        pont8bis = new javax.swing.JLabel();
        pont9bis = new javax.swing.JLabel();
        pont10bis = new javax.swing.JLabel();
        pont11bis = new javax.swing.JLabel();
        pont12bis = new javax.swing.JLabel();
        pont13bis = new javax.swing.JLabel();
        pont14bis = new javax.swing.JLabel();
        pont15bis = new javax.swing.JLabel();
        pont16bis = new javax.swing.JLabel();
        pont17bis = new javax.swing.JLabel();
        pont18bis = new javax.swing.JLabel();
        pont19bis = new javax.swing.JLabel();
        resSor2 = new javax.swing.JLabel();
        resSor1 = new javax.swing.JLabel();
        continuer = new javax.swing.JButton();
        cote_sor2 = new javax.swing.JPanel();
        manasor2 = new javax.swing.JTextField();
        oksor2 = new javax.swing.JButton();
        nomSorV = new javax.swing.JLabel();
        carte1r1 = new javax.swing.JLabel();
        carte2r1 = new javax.swing.JLabel();
        carte3r1 = new javax.swing.JLabel();
        carte4r1 = new javax.swing.JLabel();
        carte5r1 = new javax.swing.JLabel();
        carte6r1 = new javax.swing.JLabel();
        carte7r1 = new javax.swing.JLabel();
        carte8r1 = new javax.swing.JLabel();
        carte9r1 = new javax.swing.JLabel();
        carte10r1 = new javax.swing.JLabel();
        carte11r1 = new javax.swing.JLabel();
        carte12r1 = new javax.swing.JLabel();
        carte13r1 = new javax.swing.JLabel();
        carte14r1 = new javax.swing.JLabel();
        carte1br1 = new javax.swing.JCheckBox();
        carte2br1 = new javax.swing.JCheckBox();
        carte3br1 = new javax.swing.JCheckBox();
        carte4br1 = new javax.swing.JCheckBox();
        carte5br1 = new javax.swing.JCheckBox();
        carte6br1 = new javax.swing.JCheckBox();
        carte8br1 = new javax.swing.JCheckBox();
        carte9br1 = new javax.swing.JCheckBox();
        carte10br1 = new javax.swing.JCheckBox();
        carte11br1 = new javax.swing.JCheckBox();
        carte12br1 = new javax.swing.JCheckBox();
        carte13br1 = new javax.swing.JCheckBox();
        carte14br1 = new javax.swing.JCheckBox();
        carte7br1 = new javax.swing.JCheckBox();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        parcourir = new javax.swing.JMenu();
        jouer = new javax.swing.JMenu();
        edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        miseSort.setBackground(new java.awt.Color(0, 0, 0));

        cote_sor1.setBackground(new java.awt.Color(0, 0, 0));

        oksor1.setBackground(new java.awt.Color(0, 102, 102));
        oksor1.setText("OK");
        oksor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oksor1MouseClicked(evt);
            }
        });

        nomSorR.setBackground(new java.awt.Color(153, 0, 0));
        nomSorR.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        nomSorR.setForeground(new java.awt.Color(153, 0, 0));
        nomSorR.setText("Sorcier ROUGE");

        choixSor1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(choixSor1);

        javax.swing.GroupLayout cote_sor1Layout = new javax.swing.GroupLayout(cote_sor1);
        cote_sor1.setLayout(cote_sor1Layout);
        cote_sor1Layout.setHorizontalGroup(
            cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cote_sor1Layout.createSequentialGroup()
                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cote_sor1Layout.createSequentialGroup()
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cote_sor1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(carte1br))
                            .addComponent(carte10r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carte10br))
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carte11br)
                            .addComponent(carte11r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cote_sor1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(carte2br)))
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carte12r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carte13br))
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cote_sor1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(carte4br)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cote_sor1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carte12br)
                                    .addComponent(carte13r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cote_sor1Layout.createSequentialGroup()
                                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cote_sor1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(carte5br))
                                    .addComponent(carte14r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(carte6br))
                            .addComponent(carte14br)))
                    .addGroup(cote_sor1Layout.createSequentialGroup()
                        .addComponent(carte1r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(carte2r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cote_sor1Layout.createSequentialGroup()
                                .addComponent(carte3r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(carte4r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(carte5r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(carte6r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(carte7r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cote_sor1Layout.createSequentialGroup()
                                .addComponent(carte3br)
                                .addGap(229, 229, 229)))
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cote_sor1Layout.createSequentialGroup()
                                .addComponent(carte8r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(carte9r, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cote_sor1Layout.createSequentialGroup()
                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cote_sor1Layout.createSequentialGroup()
                        .addComponent(nomSorR)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cote_sor1Layout.createSequentialGroup()
                        .addComponent(manasor1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oksor1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carte7br)
                .addGap(9, 9, 9)
                .addComponent(carte8br)
                .addGap(18, 18, 18)
                .addComponent(carte9br)
                .addGap(19, 19, 19))
        );
        cote_sor1Layout.setVerticalGroup(
            cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cote_sor1Layout.createSequentialGroup()
                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cote_sor1Layout.createSequentialGroup()
                        .addComponent(nomSorR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carte9br)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(cote_sor1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carte8br)
                            .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(manasor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(oksor1))
                            .addComponent(carte7br))
                        .addGap(8, 8, 8)))
                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carte1r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte2r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte3r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte4r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte5r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte6r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte7r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte8r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte9r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cote_sor1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carte6br)
                            .addGroup(cote_sor1Layout.createSequentialGroup()
                                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(cote_sor1Layout.createSequentialGroup()
                                        .addComponent(carte5br)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carte14r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(cote_sor1Layout.createSequentialGroup()
                                        .addComponent(carte4br)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carte13r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cote_sor1Layout.createSequentialGroup()
                                        .addComponent(carte3br)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carte12r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carte2br)
                                        .addGroup(cote_sor1Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(carte10r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(carte11r, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(carte1br)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cote_sor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(carte10br)
                                    .addComponent(carte12br)
                                    .addComponent(carte13br)
                                    .addComponent(carte14br)
                                    .addComponent(carte11br)))))
                    .addGroup(cote_sor1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pontt.setBackground(new java.awt.Color(0, 0, 0));

        gagnant.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        gagnant.setForeground(new java.awt.Color(255, 255, 255));

        resSor2.setForeground(new java.awt.Color(255, 255, 255));

        resSor1.setForeground(new java.awt.Color(255, 255, 255));

        continuer.setForeground(new java.awt.Color(0, 0, 0));
        continuer.setText("CONTINUER");
        continuer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ponttLayout = new javax.swing.GroupLayout(pontt);
        pontt.setLayout(ponttLayout);
        ponttLayout.setHorizontalGroup(
            ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponttLayout.createSequentialGroup()
                .addGroup(ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ponttLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shazamm, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ponttLayout.createSequentialGroup()
                                .addGroup(ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ponttLayout.createSequentialGroup()
                                        .addComponent(pont1bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont2bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont3bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont4bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont5bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont6bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont7bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont8bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont9bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont10bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont11bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont12bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont13bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont14bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont15bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ponttLayout.createSequentialGroup()
                                        .addComponent(pont1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ponttLayout.createSequentialGroup()
                                        .addComponent(pont16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ponttLayout.createSequentialGroup()
                                        .addComponent(pont16bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont17bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pont19bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pont18bis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pont19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ponttLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(resSor1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resSor2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gagnant, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ponttLayout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(continuer)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        ponttLayout.setVerticalGroup(
            ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ponttLayout.createSequentialGroup()
                .addComponent(shazamm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(gagnant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resSor1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(resSor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pont1bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont2bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont4bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont5bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont6bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont7bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont8bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont9bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont10bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont11bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont12bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont13bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont14bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont15bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont16bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont17bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont3bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont18bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont19bis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ponttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pont1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont19, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pont18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(continuer)
                .addGap(290, 290, 290))
        );

        cote_sor2.setBackground(new java.awt.Color(0, 0, 0));

        oksor2.setBackground(new java.awt.Color(0, 102, 102));
        oksor2.setText("OK");
        oksor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oksor2MouseClicked(evt);
            }
        });

        nomSorV.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        nomSorV.setForeground(new java.awt.Color(102, 153, 0));
        nomSorV.setText("Sorcier VERT");

        javax.swing.GroupLayout cote_sor2Layout = new javax.swing.GroupLayout(cote_sor2);
        cote_sor2.setLayout(cote_sor2Layout);
        cote_sor2Layout.setHorizontalGroup(
            cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cote_sor2Layout.createSequentialGroup()
                .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manasor2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cote_sor2Layout.createSequentialGroup()
                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cote_sor2Layout.createSequentialGroup()
                                .addComponent(carte1r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(carte2r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carte3r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carte3br1))
                                .addGap(0, 0, 0)
                                .addComponent(carte4r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(carte5r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(carte6r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cote_sor2Layout.createSequentialGroup()
                                .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cote_sor2Layout.createSequentialGroup()
                                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carte10r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carte10br1))
                                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carte11r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carte11br1))
                                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carte12r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carte13br1)))
                                    .addGroup(cote_sor2Layout.createSequentialGroup()
                                        .addComponent(carte1br1)
                                        .addGap(28, 28, 28)
                                        .addComponent(carte2br1)))
                                .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cote_sor2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(carte4br1)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cote_sor2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carte12br1)
                                            .addComponent(carte13r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carte14br1)
                                    .addComponent(carte14r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(cote_sor2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(carte5br1)
                                        .addGap(18, 18, 18)
                                        .addComponent(carte6br1)))))
                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carte7r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carte7br1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carte8r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cote_sor2Layout.createSequentialGroup()
                                .addComponent(carte8br1)
                                .addGap(18, 18, 18)))
                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cote_sor2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(carte9br1))
                            .addComponent(carte9r1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cote_sor2Layout.createSequentialGroup()
                .addComponent(nomSorV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oksor2)
                .addGap(140, 140, 140))
        );
        cote_sor2Layout.setVerticalGroup(
            cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cote_sor2Layout.createSequentialGroup()
                .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomSorV)
                    .addComponent(oksor2))
                .addGap(10, 10, 10)
                .addComponent(manasor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carte1r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte2r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte3r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte4r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte5r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte6r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte7r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte8r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carte9r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carte6br1)
                    .addGroup(cote_sor2Layout.createSequentialGroup()
                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(cote_sor2Layout.createSequentialGroup()
                                    .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carte4br1)
                                        .addComponent(carte3br1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                    .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carte12r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(carte13r1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(cote_sor2Layout.createSequentialGroup()
                                    .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carte2br1)
                                        .addComponent(carte1br1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carte10r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(carte11r1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(carte9br1)
                                .addComponent(carte8br1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cote_sor2Layout.createSequentialGroup()
                                .addComponent(carte5br1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carte14r1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                            .addGroup(cote_sor2Layout.createSequentialGroup()
                                .addComponent(carte7br1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cote_sor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carte10br1)
                            .addComponent(carte12br1)
                            .addComponent(carte13br1)
                            .addComponent(carte14br1)
                            .addComponent(carte11br1))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout miseSortLayout = new javax.swing.GroupLayout(miseSort);
        miseSort.setLayout(miseSortLayout);
        miseSortLayout.setHorizontalGroup(
            miseSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miseSortLayout.createSequentialGroup()
                .addGroup(miseSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cote_sor2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(miseSortLayout.createSequentialGroup()
                        .addComponent(cote_sor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pontt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        miseSortLayout.setVerticalGroup(
            miseSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miseSortLayout.createSequentialGroup()
                .addComponent(cote_sor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cote_sor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pontt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        file.setForeground(new java.awt.Color(0, 0, 0));
        file.setText("File");

        parcourir.setBackground(new java.awt.Color(204, 204, 204));
        parcourir.setForeground(new java.awt.Color(0, 0, 0));
        parcourir.setText("PARCOURIR");
        parcourir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parcourirMouseClicked(evt);
            }
        });
        file.add(parcourir);

        jouer.setBackground(new java.awt.Color(204, 204, 204));
        jouer.setForeground(new java.awt.Color(0, 0, 0));
        jouer.setText("JOUER");
        jouer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jouerMouseClicked(evt);
            }
        });
        file.add(jouer);

        menu.add(file);

        edit.setForeground(new java.awt.Color(0, 0, 0));
        edit.setText("Edit");
        menu.add(edit);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(miseSort, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(miseSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void suppr() {
        ImageIcon emptyIcon = new ImageIcon();
        pont1bis.setIcon(emptyIcon);
        pont2bis.setIcon(emptyIcon);
        pont3bis.setIcon(emptyIcon);
        pont4bis.setIcon(emptyIcon);
        pont5bis.setIcon(emptyIcon);
        pont6bis.setIcon(emptyIcon);
        pont7bis.setIcon(emptyIcon);
        pont8bis.setIcon(emptyIcon);
        pont9bis.setIcon(emptyIcon);
        pont10bis.setIcon(emptyIcon);
        pont11bis.setIcon(emptyIcon);
        pont12bis.setIcon(emptyIcon);
        pont13bis.setIcon(emptyIcon);
        pont14bis.setIcon(emptyIcon);
        pont15bis.setIcon(emptyIcon);
        pont16bis.setIcon(emptyIcon);
        pont17bis.setIcon(emptyIcon);
        pont18bis.setIcon(emptyIcon);
        pont19bis.setIcon(emptyIcon);
    }

    public void choix(ArrayList<Integer> carte, ArrayList<Integer> carteP, JList lis) {
        DefaultListModel<String> model = new DefaultListModel<>();

        for (int p : carte) {
            model.addElement("Java");

        }
    }

    public void ajoutImage(int place, ImageIcon icone) {
        switch (place) {
            case 1 ->
                pont1bis.setIcon(icone);
            case 2 ->
                pont2bis.setIcon(icone);
            case 3 ->
                pont3bis.setIcon(icone);
            case 4 ->
                pont4bis.setIcon(icone);
            case 5 ->
                pont5bis.setIcon(icone);
            case 6 ->
                pont6bis.setIcon(icone);
            case 7 ->
                pont7bis.setIcon(icone);
            case 8 ->
                pont8bis.setIcon(icone);
            case 9 ->
                pont9bis.setIcon(icone);
            case 10 ->
                pont10bis.setIcon(icone);
            case 11 ->
                pont11bis.setIcon(icone);
            case 12 ->
                pont12bis.setIcon(icone);
            case 13 ->
                pont13bis.setIcon(icone);
            case 14 ->
                pont14bis.setIcon(icone);
            case 15 ->
                pont15bis.setIcon(icone);
            case 16 ->
                pont16bis.setIcon(icone);
            case 17 ->
                pont17bis.setIcon(icone);
            case 18 ->
                pont18bis.setIcon(icone);
            case 19 ->
                pont19bis.setIcon(icone);
        }
    }

    public void cartesR() {
        String imageFilename;

        for (int i = varR; i < cartePossibleR.size(); i++) {
            if (cartePossibleR.get(i) < 10) {
                imageFilename = CHEMIN + "\\cartes\\0" + String.valueOf(cartePossibleR.get(i)) + "r.jpg";
            } else {
                imageFilename = CHEMIN + "\\cartes\\" + String.valueOf(cartePossibleR.get(i)) + "r.jpg";

            }
            ImageIcon imageIcon = new ImageIcon(imageFilename);
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(50, 100, java.awt.Image.SCALE_SMOOTH);
            switch (i + 1) {
                case 1 ->
                    carte1r.setIcon(new ImageIcon(newimg));
                case 2 ->
                    carte2r.setIcon(new ImageIcon(newimg));
                case 3 ->
                    carte3r.setIcon(new ImageIcon(newimg));
                case 4 ->
                    carte4r.setIcon(new ImageIcon(newimg));
                case 5 ->
                    carte5r.setIcon(new ImageIcon(newimg));
                case 6 ->
                    carte6r.setIcon(new ImageIcon(newimg));
                case 7 ->
                    carte7r.setIcon(new ImageIcon(newimg));
                case 8 ->
                    carte8r.setIcon(new ImageIcon(newimg));
                case 9 ->
                    carte9r.setIcon(new ImageIcon(newimg));
                case 10 ->
                    carte10r.setIcon(new ImageIcon(newimg));
                case 11 ->
                    carte11r.setIcon(new ImageIcon(newimg));
                case 12 ->
                    carte12r.setIcon(new ImageIcon(newimg));
                case 13 ->
                    carte13r.setIcon(new ImageIcon(newimg));
                case 14 ->
                    carte14r.setIcon(new ImageIcon(newimg));
            }
            varR = i;
        }
    }

    public void cartesV() {
        String imageFilename;

        for (int i = varV; i < cartePossibleV.size(); i++) {
            if (cartePossibleV.get(i) < 10) {
                imageFilename = CHEMIN + "\\cartes\\0" + String.valueOf(cartePossibleV.get(i)) + "v.jpg";
            } else {
                imageFilename = CHEMIN + "\\cartes\\" + String.valueOf(cartePossibleV.get(i)) + "v.jpg";

            }
            ImageIcon imageIcon = new ImageIcon(imageFilename);
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(50, 100, java.awt.Image.SCALE_SMOOTH);

            switch (i + 1) {
                case 1 ->
                    carte1r1.setIcon(new ImageIcon(newimg));
                case 2 ->
                    carte2r1.setIcon(new ImageIcon(newimg));
                case 3 ->
                    carte3r1.setIcon(new ImageIcon(newimg));
                case 4 ->
                    carte4r1.setIcon(new ImageIcon(newimg));
                case 5 ->
                    carte5r1.setIcon(new ImageIcon(newimg));
                case 6 ->
                    carte6r1.setIcon(new ImageIcon(newimg));
                case 7 ->
                    carte7r1.setIcon(new ImageIcon(newimg));
                case 8 ->
                    carte8r1.setIcon(new ImageIcon(newimg));
                case 9 ->
                    carte9r1.setIcon(new ImageIcon(newimg));
                case 10 ->
                    carte10r1.setIcon(new ImageIcon(newimg));
                case 11 ->
                    carte11r1.setIcon(new ImageIcon(newimg));
                case 12 ->
                    carte12r1.setIcon(new ImageIcon(newimg));
                case 13 ->
                    carte13r1.setIcon(new ImageIcon(newimg));
                case 14 ->
                    carte14r1.setIcon(new ImageIcon(newimg));
            }
            varV = i;
        }
    }

    private void updateMDF() {
        int positionMurDeFeu = mdf.getPosition() + 1;
        String imageFilename = CHEMIN + "\\perso\\feu.gif";
        ImageIcon imageIcon = new ImageIcon(imageFilename);
        suppr();
        ajoutImage(positionMurDeFeu, imageIcon);
    }

    private void updateSor() {
        int positionsor = sor.getPosition() + 1;
        int positionsor2 = sor2.getPosition() + 1;
        String imageFilename = CHEMIN + "\\perso\\" + sor.getCouleurS() + ".gif";
        String imageFilename2 = CHEMIN + "\\perso\\" + sor2.getCouleurS() + ".gif";

        ImageIcon imageIcon = new ImageIcon(imageFilename);
        ImageIcon imageIcon2 = new ImageIcon(imageFilename2);

        suppr();
        updateMDF();
        ajoutImage(positionsor, imageIcon);
        ajoutImage(positionsor2, imageIcon2);

    }

    private void finmanche() {
        finDeManche = paquet.jeu(sor, sor2, cartePartieR, cartePartieV, anciennecarteR, anciennecarteV, finDeManche, pont, mdf, winner);
        updateMDF();
        updateSor();
        pontt.setVisible(true);
        oksor1.setEnabled(false);
        oksor2.setEnabled(false);
        continuer.setEnabled(false);

    }

    private void affichePont() {
        for (int i = 1; i <= 9; i++) {
            String p = "pont" + String.valueOf(i);
            String imageFilename2 = CHEMIN + "\\logo_shazamm.gif";
            ImageIcon imageIcon2 = new ImageIcon(imageFilename2);
            String imageFilename = CHEMIN + "\\pont\\pont_0" + String.valueOf(i) + ".gif";
            ImageIcon imageIcon = new ImageIcon(imageFilename);
            shazamm.setIcon(imageIcon2);

            switch (p) {
                case "pont1" ->
                    pont1.setIcon(imageIcon);
                case "pont2" ->
                    pont2.setIcon(imageIcon);
                case "pont3" ->
                    pont3.setIcon(imageIcon);
                case "pont4" ->
                    pont4.setIcon(imageIcon);
                case "pont5" ->
                    pont5.setIcon(imageIcon);
                case "pont6" ->
                    pont6.setIcon(imageIcon);
                case "pont7" ->
                    pont7.setIcon(imageIcon);
                case "pont8" ->
                    pont8.setIcon(imageIcon);
                case "pont9" ->
                    pont9.setIcon(imageIcon);
            }
        }
        for (int i = 10; i <= 19; i++) {
            String p = "pont" + String.valueOf(i);
            String imageFilename = CHEMIN + "\\pont\\pont_" + String.valueOf(i) + ".gif";
            ImageIcon imageIcon = new ImageIcon(imageFilename);
            switch (p) {
                case "pont10" ->
                    pont10.setIcon(imageIcon);
                case "pont11" ->
                    pont11.setIcon(imageIcon);
                case "pont12" ->
                    pont12.setIcon(imageIcon);
                case "pont13" ->
                    pont13.setIcon(imageIcon);
                case "pont14" ->
                    pont14.setIcon(imageIcon);
                case "pont15" ->
                    pont15.setIcon(imageIcon);
                case "pont16" ->
                    pont16.setIcon(imageIcon);
                case "pont17" ->
                    pont17.setIcon(imageIcon);
                case "pont18" ->
                    pont18.setIcon(imageIcon);
                case "pont19" ->
                    pont19.setIcon(imageIcon);
            }
        }

    }

    public void ajouterImageFeu(int position) {
        String imageFilename;

        if (position < 10) {
            imageFilename = CHEMIN + "\\lave\\lave_0" + String.valueOf(position) + ".gif";
        } else {
            imageFilename = CHEMIN + "\\lave\\lave_" + String.valueOf(position) + ".gif";

        }
        ImageIcon imageIcon = new ImageIcon(imageFilename);
        String p = "pont" + String.valueOf(position);
        switch (p) {
            case "pont1" ->
                pont1.setIcon(imageIcon);
            case "pont2" ->
                pont2.setIcon(imageIcon);
            case "pont3" ->
                pont3.setIcon(imageIcon);
            case "pont4" ->
                pont4.setIcon(imageIcon);
            case "pont5" ->
                pont5.setIcon(imageIcon);
            case "pont6" ->
                pont6.setIcon(imageIcon);
            case "pont7" ->
                pont7.setIcon(imageIcon);
            case "pont8" ->
                pont8.setIcon(imageIcon);
            case "pont9" ->
                pont9.setIcon(imageIcon);
            case "pont10" ->
                pont10.setIcon(imageIcon);
            case "pont11" ->
                pont11.setIcon(imageIcon);
            case "pont12" ->
                pont12.setIcon(imageIcon);
            case "pont13" ->
                pont13.setIcon(imageIcon);
            case "pont14" ->
                pont14.setIcon(imageIcon);
            case "pont15" ->
                pont15.setIcon(imageIcon);
            case "pont16" ->
                pont16.setIcon(imageIcon);
            case "pont17" ->
                pont17.setIcon(imageIcon);
            case "pont18" ->
                pont18.setIcon(imageIcon);
            case "pont19" ->
                pont19.setIcon(imageIcon);
        }

    }

    private void oksor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oksor2MouseClicked
        if (oksor2.isEnabled()) {
            int miseResultat = 0;
            String mana2 = manasor2.getText();
            try {
                int manaMise = Integer.parseInt(mana2);
                miseResultat = sor2.miser(manaMise);
                //sor2.demanderSortMana(cartePartieR, cartePossibleR, anciennecarteR, miseResultat);

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Vous devez saisir un nombre");
            }
            winner = paquet.gagnant(sor, sor2);
            if (winner != null) {
                gagnant.setText("Le gagnant est le sorcier: " + winner.toString());
            } else {
                gagnant.setText("il n'y a pas de gagnant");
            }
        }
        finmanche();
        cote_sor1.setVisible(true);
        oksor2.setEnabled(false);
        oksor1.setEnabled(false);
        continuer.setEnabled(true);
        resSor1.setText("<html>" + sor.affichage(cartePartieR) + "<br/>");
        resSor2.setText("<html>" + sor2.affichage(cartePartieV) + "<html/>");
    }//GEN-LAST:event_oksor2MouseClicked

    private void oksor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oksor1MouseClicked
        if (oksor1.isEnabled()) {
            int miseResultat = 0;
            String mana1 = manasor1.getText();
            try {
                int manaMise = Integer.parseInt(mana1);
                miseResultat = sor.miser(manaMise);

                //sor.demanderSortMana(cartePartieR, cartePossibleR, anciennecarteR, miseResultat);
                if (miseResultat != -1) {
                    cote_sor2.setVisible(true);
                    cote_sor1.setVisible(false);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Vous devez saisir un nombre");
            }
        }

        oksor1.setEnabled(false);

    }//GEN-LAST:event_oksor1MouseClicked

    private void continuerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuerMouseClicked
        // TODO add your handling code here:
        if (continuer.isEnabled()) {
            mecaniqueJeu();
            if (finDePartie) {
                continuer.setEnabled(false);
                JOptionPane.showMessageDialog(null, "La partie est finie");
                oksor1.setEnabled(false);
                oksor2.setEnabled(false);
            }
        }
    }//GEN-LAST:event_continuerMouseClicked

    private void parcourirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parcourirMouseClicked
        // TODO add your handling code here:
        boolean b = folder.requestFocusInWindow();
        folder.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = folder.showDialog(parcourir, "Sélectionner");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File f = folder.getSelectedFile();
            CHEMIN = f.getAbsolutePath() + "\\";
        }
    }//GEN-LAST:event_parcourirMouseClicked

    private void jouerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jouerMouseClicked
        // TODO add your handling code here:
        affichePont();
        updateMDF();
        updateSor();
        pontt.setVisible(true);
        paquet.initialiser(nombremanche, sor, carteEnTout1, cartePossibleR);
        paquet.initialiser(nombremanche, sor2, carteEnTout2, cartePossibleV);
        cartesR();
        cartesV();
        cote_sor1.setVisible(true);
        cote_sor2.setVisible(false);
        parcourir.setEnabled(false);
        parcourir.setVisible(false);
        continuer.setVisible(true);

    }//GEN-LAST:event_jouerMouseClicked

    public void mecaniqueJeu() {
        if (!finDePartie) {
            if (!pont.getPerdu()) {
                manasor1.setText("");
                manasor2.setText("");
                oksor1.setEnabled(true);
                oksor2.setEnabled(true);
                cote_sor1.setVisible(true);
                cote_sor2.setVisible(false);
                continuer.setEnabled(false);
                updateSor();
            } else {
                nombremanche++;
                finDePartie = paquet.finDeManche(sor, sor2, cartePartieR, cartePartieV, cartePossibleV, finDeManche, pont, mdf, finDePartie, winner, this);
                manasor1.setText("");
                manasor2.setText("");
                oksor1.setEnabled(true);
                oksor2.setEnabled(true);
                cote_sor1.setVisible(true);
                cote_sor2.setVisible(false);
                pont.setPerdu(false);
                updateSor();
                paquet.initialiser(nombremanche, sor, carteEnTout1, cartePossibleR);
                paquet.initialiser(nombremanche, sor2, carteEnTout2, cartePossibleV);
                cartesR();
                cartesV();

            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Graphique().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox carte10br;
    private javax.swing.JCheckBox carte10br1;
    private javax.swing.JLabel carte10r;
    private javax.swing.JLabel carte10r1;
    private javax.swing.JCheckBox carte11br;
    private javax.swing.JCheckBox carte11br1;
    private javax.swing.JLabel carte11r;
    private javax.swing.JLabel carte11r1;
    private javax.swing.JCheckBox carte12br;
    private javax.swing.JCheckBox carte12br1;
    private javax.swing.JLabel carte12r;
    private javax.swing.JLabel carte12r1;
    private javax.swing.JCheckBox carte13br;
    private javax.swing.JCheckBox carte13br1;
    private javax.swing.JLabel carte13r;
    private javax.swing.JLabel carte13r1;
    private javax.swing.JCheckBox carte14br;
    private javax.swing.JCheckBox carte14br1;
    private javax.swing.JLabel carte14r;
    private javax.swing.JLabel carte14r1;
    private javax.swing.JCheckBox carte1br;
    private javax.swing.JCheckBox carte1br1;
    private javax.swing.JLabel carte1r;
    private javax.swing.JLabel carte1r1;
    private javax.swing.JCheckBox carte2br;
    private javax.swing.JCheckBox carte2br1;
    private javax.swing.JLabel carte2r;
    private javax.swing.JLabel carte2r1;
    private javax.swing.JCheckBox carte3br;
    private javax.swing.JCheckBox carte3br1;
    private javax.swing.JLabel carte3r;
    private javax.swing.JLabel carte3r1;
    private javax.swing.JCheckBox carte4br;
    private javax.swing.JCheckBox carte4br1;
    private javax.swing.JLabel carte4r;
    private javax.swing.JLabel carte4r1;
    private javax.swing.JCheckBox carte5br;
    private javax.swing.JCheckBox carte5br1;
    private javax.swing.JLabel carte5r;
    private javax.swing.JLabel carte5r1;
    private javax.swing.JCheckBox carte6br;
    private javax.swing.JCheckBox carte6br1;
    private javax.swing.JLabel carte6r;
    private javax.swing.JLabel carte6r1;
    private javax.swing.JCheckBox carte7br;
    private javax.swing.JCheckBox carte7br1;
    private javax.swing.JLabel carte7r;
    private javax.swing.JLabel carte7r1;
    private javax.swing.JCheckBox carte8br;
    private javax.swing.JCheckBox carte8br1;
    private javax.swing.JLabel carte8r;
    private javax.swing.JLabel carte8r1;
    private javax.swing.JCheckBox carte9br;
    private javax.swing.JCheckBox carte9br1;
    private javax.swing.JLabel carte9r;
    private javax.swing.JLabel carte9r1;
    private javax.swing.JList<String> choixSor1;
    private javax.swing.JButton continuer;
    private javax.swing.JPanel cote_sor1;
    private javax.swing.JPanel cote_sor2;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JFileChooser folder;
    private javax.swing.JLabel gagnant;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jouer;
    private javax.swing.JTextField manasor1;
    private javax.swing.JTextField manasor2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel miseSort;
    private javax.swing.JLabel nomSorR;
    private javax.swing.JLabel nomSorV;
    private javax.swing.JButton oksor1;
    private javax.swing.JButton oksor2;
    private javax.swing.JMenu parcourir;
    private javax.swing.JLabel pont1;
    private javax.swing.JLabel pont10;
    private javax.swing.JLabel pont10bis;
    private javax.swing.JLabel pont11;
    private javax.swing.JLabel pont11bis;
    private javax.swing.JLabel pont12;
    private javax.swing.JLabel pont12bis;
    private javax.swing.JLabel pont13;
    private javax.swing.JLabel pont13bis;
    private javax.swing.JLabel pont14;
    private javax.swing.JLabel pont14bis;
    private javax.swing.JLabel pont15;
    private javax.swing.JLabel pont15bis;
    private javax.swing.JLabel pont16;
    private javax.swing.JLabel pont16bis;
    private javax.swing.JLabel pont17;
    private javax.swing.JLabel pont17bis;
    private javax.swing.JLabel pont18;
    private javax.swing.JLabel pont18bis;
    private javax.swing.JLabel pont19;
    private javax.swing.JLabel pont19bis;
    private javax.swing.JLabel pont1bis;
    private javax.swing.JLabel pont2;
    private javax.swing.JLabel pont2bis;
    private javax.swing.JLabel pont3;
    private javax.swing.JLabel pont3bis;
    private javax.swing.JLabel pont4;
    private javax.swing.JLabel pont4bis;
    private javax.swing.JLabel pont5;
    private javax.swing.JLabel pont5bis;
    private javax.swing.JLabel pont6;
    private javax.swing.JLabel pont6bis;
    private javax.swing.JLabel pont7;
    private javax.swing.JLabel pont7bis;
    private javax.swing.JLabel pont8;
    private javax.swing.JLabel pont8bis;
    private javax.swing.JLabel pont9;
    private javax.swing.JLabel pont9bis;
    private javax.swing.JPanel pontt;
    private javax.swing.JLabel resSor1;
    private javax.swing.JLabel resSor2;
    private javax.swing.JLabel shazamm;
    // End of variables declaration//GEN-END:variables
}

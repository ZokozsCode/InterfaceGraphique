package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Biblio extends JFrame {

    public Biblio(){
         super("Bibliotheque");
         setSize(800,700);

         JPanel monPanel = new JPanel();
         this.setContentPane(monPanel);
         monPanel.setBackground(Color.LIGHT_GRAY);
         JMenuBar monMenuBarr = new JMenuBar();
         this.setJMenuBar(monMenuBarr);

        GridBagLayout monLayout = new GridBagLayout();
        monPanel.setLayout(monLayout);
        GridBagConstraints gbc = new GridBagConstraints();

         //menu du Panel
         JMenu fileJMenu = new JMenu();
         fileJMenu.setText("Fichier");
         monMenuBarr.add(fileJMenu);
         JMenuItem sous4 = new JMenuItem("Stat");
         sous4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(fileJMenu,"Livres: Harry Potter - La drague pour les nuls");
             }
         });
         fileJMenu.add(sous4);
         JMenuItem sous5 = new JMenuItem("Nouveautés");
         sous5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(fileJMenu, "Harry Potter de J.K Rolling - La Drague Pour les nul de Florence Escaravage - Culture Canabis de Verde Saggezza");
             }
         });
         fileJMenu.add(sous5);

        JMenu EditJMenu = new JMenu();
        EditJMenu.setText("Editer");
        monMenuBarr.add(EditJMenu);

        JMenu AboutJMenu = new JMenu();
        AboutJMenu.setText("A Propos");
        monMenuBarr.add(AboutJMenu);
        JMenuItem sous3 = new JMenuItem("About");
        sous3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AboutJMenu, "Dév: Angel - Alexis - Merwan");
            }
        });
        AboutJMenu.add(sous3);


        //menu deroulant
        JMenuItem sous1 = new JMenuItem("Ouvrir");
        JMenuItem sous2 = new JMenuItem("Quitter");
        fileJMenu.add(sous1);
        fileJMenu.add(sous2);

        //Tableau

        String[] columnames = {"Name", "Auteurs", "Résumé", "Colonne", "Rangée", "Parution"};
        Object[][] data ={
                {"Harry Poter","J.K Rolling", "Sorcier","2","5", "2009"},
                {"Eragon", "C.Paolini", "Monde de Dragon","2","2","2000"},
                {"La drague pour les nuls", "Florence Escaravage", "Tu veux pecho ?","1","4"," 2012"},
                {"Les miserables", "Victor Hugo", "La story de Jean Valjean et Cosette","7","3","1862"},
                {"Culture Canabis ", "Verde saggezza", "Comment avoir la main verte ","5","2","2019"},
                {"XXX", "XXX", "XXX","XXX","XXX","XXX"},



        };
        JTable monTable = new JTable(data,columnames);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        gbc.insets = new Insets(0, 0, 7, 0);

        monPanel.add(monTable.getTableHeader(), gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;

        monPanel.add(monTable, gbc);
       // pack();

        //Formulaire
        JTextField maTxtF = new JTextField();
        maTxtF.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 7;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(maTxtF,gbc);
        JLabel monTitre = new JLabel("Titre : ");
        gbc.gridx= 6;
        gbc.gridy=0;
        monPanel.add(monTitre,gbc);


        JTextField Auteur = new JTextField();
        Auteur.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 7;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Auteur,gbc);
        JLabel monAuteur = new JLabel("Auteur : ");
        gbc.gridx= 6;
        gbc.gridy=1;
        monPanel.add(monAuteur,gbc);

        JTextField Parution = new JTextField();
        Parution.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Parution,gbc);
        JLabel maParution = new JLabel("Parution : ");
        gbc.gridx= 6;
        gbc.gridy= 2;
        monPanel.add(maParution,gbc);


        JTextField Colonne = new JTextField();
        Colonne.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 7;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Colonne,gbc);
        JLabel maColonne = new JLabel("Colonne : ");
        gbc.gridx= 6;
        gbc.gridy= 3;
        monPanel.add(maColonne,gbc);

        JTextField Rangee = new JTextField();
        Rangee.setPreferredSize(new Dimension(100,30));
        gbc.gridx = 7;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Rangee,gbc);
        JLabel maRangee = new JLabel("Rangée  : ");
        gbc.gridx= 6;
        gbc.gridy= 4;
        monPanel.add(maRangee,gbc);

        JTextField Resume = new JTextField();
        Resume.setPreferredSize(new Dimension(100, 120));
        gbc.gridx = 7;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Resume,gbc);
        JLabel monResume = new JLabel("Resumé : ");
        gbc.gridx= 6;
        gbc.gridy= 5;
        monPanel.add(monResume,gbc);

        //Bouton
        JButton myButton = new JButton();
        myButton.setText("Valider");
        gbc.gridx = 7;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(myButton,gbc);


        //Bouton ajouter
        JButton myButton2 = new JButton();
        myButton2.setText("Ajouter");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(myButton2,gbc);


        //mon chooser sur le "ouvrir"
        sous1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser monChooser = new JFileChooser();
                // monChooser.setAcceptAllFileFilterUsed(false);
                int dialog = monChooser.showDialog(monPanel,"Open"); //case a droite pour ouvrir le dossier
                if (dialog == JFileChooser.APPROVE_OPTION) {
                    File file = monChooser.getSelectedFile(); //permet des opérations sur les fichiers et les répertoires du système de fichiers
                    Desktop desktop = Desktop.getDesktop(); // sert pour les utilisateur pour les Sout e endessous
                    if (file.exists()) {
                        try {  //essayé
                            desktop.open(file.getAbsoluteFile());  // le chemin du fichier
                            System.out.println(file.getName() + " a été ouvert");
                            System.out.println("Le chemin du fichier est : " + file.getAbsolutePath()); // SOUT + le fichier
                        } catch (IOException ioException) { // (capture ) génere une exeption
                            ioException.printStackTrace(); //imprime la trace de pile de l'instance
                        }
                    }
                } else {
                    System.out.println("Action Ouvrir Annulé");
                }
            }
        });



        // modifier date de sortie

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monTable.setValueAt(Resume.getText(),0,2);
                monTable.setValueAt(Rangee.getText(),0,4);
                monTable.setValueAt(Colonne.getText(),0,3);
                monTable.setValueAt(Parution.getText(),0,5);
                monTable.setValueAt(Auteur.getText(),0,1);
                monTable.setValueAt(maTxtF.getText(),0,0);
            }
        });

//ajout de livre dans la bibi

        myButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monTable.setValueAt(Resume.getText(),5,2);
                monTable.setValueAt(Rangee.getText(),5,4);
                monTable.setValueAt(Colonne.getText(),5,3);
                monTable.setValueAt(Parution.getText(),5,5);
                monTable.setValueAt(Auteur.getText(),5,1);
                monTable.setValueAt(maTxtF.getText(),5,0);
            }
        });

 //quit la fenetre quand on met quitter 
        sous2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });






        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // ferme le Jframe quand on met la croix rouge
    }


}

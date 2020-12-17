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

        JMenu EditJMenu = new JMenu();
        EditJMenu.setText("Editer");
        monMenuBarr.add(EditJMenu);

        JMenu AboutJMenu = new JMenu();
        AboutJMenu.setText("A Propos");
        monMenuBarr.add(AboutJMenu);

        //menu deroulant
        JMenuItem sous1 = new JMenuItem("Ouvrir");
        JMenuItem sous2 = new JMenuItem("Quitter");
        fileJMenu.add(sous1);
        fileJMenu.add(sous2);

        //Tableau

        String[] columnames = {"Name", "Auteurs", "Résumé", "Colonne", "Rangée", "Parution"};
        Object[][] data ={
                {"Harry Poter","J.K Rolling", "Sorcier","2","5", "2009"},
                {"Eragon", "C.Paolini", "Monde de Dragon","2","2","2000"}
        };
        JTable monTable = new JTable(data,columnames);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        gbc.insets = new Insets(20, 0, 0, 0);

        monPanel.add(monTable.getTableHeader(), gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;

        monPanel.add(monTable, gbc);
       // pack();

        //Formulaire
        JTextField maTxtF = new JTextField();
        maTxtF.setPreferredSize(new Dimension(100,30));
        maTxtF.setText("Titre");
        monPanel.add(maTxtF,gbc);
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        JTextField Auteur = new JTextField();
        Auteur.setPreferredSize(new Dimension(100,30));
        Auteur.setText("Auteur");
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Auteur,gbc);

        JTextField Parution = new JTextField();
        Parution.setPreferredSize(new Dimension(100,30));
        Parution.setText("Parution");
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Parution,gbc);

        JTextField Colonne = new JTextField();
        Colonne.setPreferredSize(new Dimension(100,30));
        Colonne.setText("Colonne");
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Colonne,gbc);

        JTextField Rangee = new JTextField();
        Rangee.setPreferredSize(new Dimension(100,30));
        Rangee.setText("Rangée");
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Rangee,gbc);

        JTextArea Resume = new JTextArea();
        Resume.setPreferredSize(new Dimension(100, 120));
        Resume.setText("Resumé");
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(Resume,gbc);

        //Bouton
        JButton myButton = new JButton();
        myButton.setText("Valider");
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        monPanel.add(myButton,gbc);


        //mon chooser sur le "ouvrir"
        sous1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser monChooser = new JFileChooser();
                monChooser.setAcceptAllFileFilterUsed(false);
                int dialog = monChooser.showDialog(monPanel,"Open"); //case a droite pour ouvrir le dossier
                if (dialog == JFileChooser.APPROVE_OPTION) {
                    File file = monChooser.getSelectedFile(); //permet des opérations sur les fichiers et les répertoires du système de fichiers
                    Desktop desktop = Desktop.getDesktop(); // sert pour les utilisateur pour les Sout e endessous
                    if (file.exists()) {
                        try {  //essayé
                            desktop.open(file.getAbsoluteFile());
                            System.out.println(file.getName() + " a été ouvert");
                        } catch (IOException ioException) {  //capture
                            ioException.printStackTrace();
                        }
                    }
                } else {
                    System.out.println("Annulations");
                }
            }
        });














        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // ferme le Jframe quand on met la croix rouge
    }


}

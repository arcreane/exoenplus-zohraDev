package com.game.projet.company;

import java.util.Scanner;

public class GuessNumber {

        public static void main(String[] args) {

            String choixUtilisateur;

            boolean test =false;
            Scanner Scan;

            System.out.println("Selectionner un choix parmi ceux ci-dessous :..."+"\n"+"\t\t\t"+"Enter E : 10 essaies pour deviner le nombre."+"\n"+"\t\t\t"+"Enter J : Jouer jusqu'à troiver le nombre");

            Scan = new Scanner(System.in);
            choixUtilisateur=Scan.nextLine();// je récupère le choix de l'utilisateur


            int nombreAleatoire = 1+ (int)(Math.random() * ((99) + 1));// generer un nombre aleatoir entre 1 et 100
            //   System.out.println(nombreAleatoire);


            int reponseUtilisateur;

            System.out.println("Entrer un nombre entre 1 et 100: ");
            Scan = new Scanner(System.in);

            if(choixUtilisateur.equals("F") ) {
                    int nombreDepartie=0;
                do {
                    reponseUtilisateur = Scan.nextInt();

                    if (nombreAleatoire == reponseUtilisateur) {
                        System.out.println("Bingo, bonne réponse ");
                        test = true;


                    } else if (nombreAleatoire < reponseUtilisateur) {
                        System.out.println("C'est moins" + "\n" + "Entrer un nombre compris entre 1 et 100");
                        reponseUtilisateur = Scan.nextInt();
                    } else {
                        System.out.println("C'est plus" + "\n" + "Entrer une nombre compris entre 1 et 100");
                        reponseUtilisateur = Scan.nextInt();
                    }

                    nombreDepartie++;
                } while (!((test=false)&&(nombreDepartie<=10)));


            } else

                do {
                    reponseUtilisateur = Scan.nextInt();

                    if (nombreAleatoire == reponseUtilisateur) {
                        System.out.println("Bingo, bonne réponse ");
                        test = true;


                    } else if (nombreAleatoire < reponseUtilisateur) {
                        System.out.println("C'est moins" + "\n" + "Entrer un nombre compris entre 1 et 100");
                        reponseUtilisateur = Scan.nextInt();
                    } else {
                        System.out.println("C'est plus" + "\n" + "Entrer une nombre compris entre 1 et 100");
                        reponseUtilisateur = Scan.nextInt();
                    }


                } while (!(test));






        }}
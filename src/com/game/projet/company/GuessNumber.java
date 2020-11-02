package com.game.projet.company;

import java.util.Scanner;

public class GuessNumber {

        public static void jeuxDevinette() {

            String Rejouer="";

            Scanner Scan= new Scanner(System.in);

            do{

                String choixUtilisateur;
                boolean test = false;
                String chaine = "";
                System.out.print("\t\t\t" + "Enter E : 10 essaies pour deviner le nombre."+ "\n"
                                + "\t\t\t" + "Enter J : Jouer jusqu'à trouver le nombre" +"\n"
                                +"Selectionner un choix parmi ceux ci-dessus :..." );


                choixUtilisateur = Scan.nextLine();// je récupère le choix de l'utilisateur

                int nombreAleatoire = 1 + (int) (Math.random() * ((99) + 1));// generer un nombre aleatoir entre 1 et 100
                    //   System.out.println(nombreAleatoire);
                int reponseUtilisateur;

                Scan = new Scanner(System.in);

                int nombreDepartie = 0;

                do {
                    System.out.println(chaine + "Entrer un nombre entre 1 et 100: ");
                    reponseUtilisateur = Scan.nextInt();

                    if (nombreAleatoire == reponseUtilisateur) {
                            System.out.println("Bingo, bonne réponse 🥳" );
                            test = true;

                    } else if (nombreAleatoire < reponseUtilisateur) {
                            chaine = "C'est moins. ";

                    } else {
                            chaine = "C'est plus. ";

                    }
                    if (choixUtilisateur.equals("E")) {
                            nombreDepartie++;
                    }
                } while ((!test ) && (nombreDepartie <= 10));


                if(test==false){

                    System.out.println("Vous avez perdu😜");
                }

                System.out.print("Voulez refaire une partie   ");

                 Scan= new Scanner(System.in);

                Rejouer=Scan.nextLine();


            }while(Rejouer.equals("oui"));
        }
}
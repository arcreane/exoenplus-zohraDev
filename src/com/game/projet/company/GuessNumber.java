package com.game.projet.company;

import java.util.Scanner;

public class GuessNumber {

        public static void main(String[] args) {

            String choixUtilisateur;

            System.out.println("Selectionner un choix parmi ceux ci-dessous :..."+"\n"+"\t\t\t"+"Enter E : 10 essaies pour deviner le nombre."+"\n"+"\t\t\t"+"Enter J : Jouer jusqu'à troiver le nombre");

            int nombreAleatoire = 1+ (int)(Math.random() * ((99) + 1));// generer un nombre aleatoir entre 1 et 100
            //   System.out.println(nombreAleatoire);


            int reponseUtilisateur;

            System.out.println("Entrer un nombre entre 1 et 100: ");

            Scanner Scan = new Scanner(System.in);
            reponseUtilisateur=Scan.nextInt();

            if (nombreAleatoire==reponseUtilisateur){
                System.out.println("Bingo, bonne réponse ");
            }else if(nombreAleatoire<reponseUtilisateur ) {
                System.out.println("C'est moins" + "\n" + "Entrer un nombre compris entre 1 et 100");
            }else{
                System.out.println("C'est plus"+"\n"+"Entrer une nombre compris entre 1 et 100");
            }






        }}
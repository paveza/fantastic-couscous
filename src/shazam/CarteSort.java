package shazam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CarteSort extends CarteSortilege {//toutes les cartes qui impact a mana du joueur

    public CarteSort(int num, String nom, String descr) {
        super(num, nom, descr);//on fait appel au constructeur de cartes sortilege
    }

    public void effetCarte1(Sorcier joueur1, Sorcier joueur2) {
        if (this.numCarte == 1) {
            joueur1.setMutisme(true);
            joueur2.setMutisme(true);
        }
    }

    public void effetCarte2(Sorcier joueur, Sorcier adversaire, ArrayList cartePartieJoueur, ArrayList cartePartieAdv, ArrayList ancienneCarteAdv, int sort, Sorcier winner, boolean finDeManche, MurDeFeu mdf, Pont pont) {
        int nombre;
        boolean choixvalide = false;
        Paquet appliquerEffet = new Paquet();
        System.out.println(" joueur " + joueur.getCouleurS() + ": effet carte clone en cours pour  .....");
        System.out.println("Choisir une carte parmis celle ci:");
        joueur.cartePossible(ancienneCarteAdv);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez une carte sortilege joueur " + joueur.getCouleurS() + "  ou 0 pour aucune");
            nombre = scanner.nextInt();
            if (ancienneCarteAdv.contains(nombre) || nombre == 0) {
                choixvalide = true;
            } else {
                System.out.println("desole vous ne disposez pas de cette carte reessayer");
            }
        } while (!choixvalide);
        ancienneCarteAdv.remove(Integer.valueOf(nombre));
        sort = nombre;
        appliquerEffet.jeuCarte(joueur, adversaire, cartePartieJoueur, cartePartieAdv, ancienneCarteAdv, sort, winner, finDeManche, mdf, pont);
                }

    public void effetCarte3(Sorcier joueur, Sorcier adversaire, ArrayList<Integer> cartePartieJoueur, ArrayList<Integer> cartePartieAdv, ArrayList<Integer> ancienneCarteAdv, int sort, Sorcier winner, boolean finDeManche, MurDeFeu mdf, Pont pont) {
        int choix;
        Paquet appliquerEffet = new Paquet();
        cartePartieJoueur.remove(0);
        Iterator<Integer> iterator = cartePartieAdv.iterator();
        while (iterator.hasNext()) {
            int carteAdv = (int) iterator.next();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Taper 1 pour jouer la carte " + carteAdv + " ou 0 pour l'annuler");
            choix = scanner.nextInt();
            if (choix == 1) {
                appliquerEffet.jeuCarte(joueur, adversaire, cartePartieJoueur, cartePartieAdv, ancienneCarteAdv, carteAdv, winner, finDeManche, mdf, pont);
                iterator.remove();
            } else if (choix == 0) {
                iterator.remove();
            } else {
                System.out.println("il y a eu une erreur");
            }
        }
    }

}

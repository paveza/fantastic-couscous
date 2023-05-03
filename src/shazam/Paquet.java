package shazam;

import java.util.ArrayList;
import java.util.Collections;

public class Paquet {

    public boolean jeuCarte(Sorcier joueur, Sorcier adversaire, ArrayList cartePartieJoueur, ArrayList cartePartieAdv, ArrayList ancienneCarteAdv, int sort, Sorcier winner, boolean finDeManche, MurDeFeu mdf, Pont pont) {
        CarteSort carte1 = new CarteSort(1, "Mutisme", "Aucun sort n'a plus d'effet pour les deux joueurs, jusqu'à la fin de la manche.");
        CarteSort carte2 = new CarteSort(2, "Clone", "Je pose une des cartes jouees par l'adversaire au tour precedent.");
        CarteSort carte3 = new CarteSort(3, "Larcin", "Tous les sorts joues à ce tour sont sous mon controle. Je peux decider pour chacun de le jouer ou de le deffausser.");
        CartePartie carte4 = new CartePartie(4, "Fin De Manche", "La manche est finie !");
        CarteMur carte5 = new CarteMur(5, "Milieu", "Je replace immediatement le mur de feu au milieu des desux sorciers.");
        CarteMana carte6 = new CarteMana(6, "Recyclage", "Je peux rectifier ma mise, en ajoutant ou retranchant jusqu'à 5 points de mana");
        CarteAttaque carte7 = new CarteAttaque(7, "Boost Attaque", "La puissance de mon attaque augmente de 7 points.");
        CarteAttaque carte8 = new CarteAttaque(8, "Double Dose", "La puissance de mon attaque double !");
        CarteMur carte9 = new CarteMur(9, "Qui perd gagne", "Le mur de feu avance en sens inverse, vers le gagnant.");
        CarteMur carte10 = new CarteMur(10, "Brasier", "Le mur de feu se deplace de deux cases au lieu d'une.");
        CarteMur carte11 = new CarteMur(11, "Resistance", "Si le mur de feu devait avancer vers moi, il ne bouge pas.");
        CarteMana carte12 = new CarteMana(12, "Harpagon", "Si je perds ce tour, je ne perds pas de mana.");
        CarteMana carte13 = new CarteMana(13, "Boost reserve", "+13 de mana.");
        CarteMana carte14 = new CarteMana(14, "Aspiration", "Ma reserve de mana augmente du montent de la mise de l'adversaire.");

        switch (sort) {
            case 0:
                break;
            case 1:
                carte1.effetCarte1(joueur, adversaire);
                break;
            case 2:
                carte2.effetCarte2(joueur, adversaire, cartePartieJoueur, cartePartieAdv, ancienneCarteAdv, sort, winner, finDeManche, mdf, pont);
                break;
            case 3:
                carte3.effetCarte3(joueur, adversaire, cartePartieJoueur, cartePartieAdv, ancienneCarteAdv, sort, winner, finDeManche, mdf, pont);
                break;
            case 4:
                carte4.effetCarte4(pont);
                break;
            case 5:
                if ("rouge".equals(joueur.getCouleurS())) 
                carte5.effetCarte5(mdf, joueur, adversaire, pont);
                else carte5.effetCarte5(mdf, adversaire, joueur, pont);
                break;
            case 6:
                System.out.println("adversaire a mise " + adversaire.getMise());
                carte6.effetCarte13et6et12(joueur, winner);
                break;
            case 7:
                carte7.effetCarte7(joueur);
                break;
            case 8:
                carte8.effetCarte8(joueur);
                break;
            case 9:
                carte9.effetCarte9(joueur, adversaire, winner);
                break;
            case 10:
                carte10.effetCarte10(mdf);
                break;
            case 11:
                carte11.effetCarte11(joueur, winner, mdf);
                break;
            case 12:
                carte12.effetCarte13et6et12(joueur, winner);
                break;
            case 13:
                carte13.effetCarte13et6et12(joueur, winner);
                break;
            case 14:
                carte14.effetCarte14(joueur, adversaire);
                break;
            default:
                System.out.println("Cette carte n'existe pas. Reessayez.");
                break;
        }
        return finDeManche;
    }

    public Sorcier gagnant(Sorcier joueur, Sorcier adversaire) {
        if (joueur.getAttaque() > adversaire.getAttaque()) {
            return joueur;
        } else if (joueur.getAttaque() < adversaire.getAttaque()) {
            return adversaire;
        } else {
            return null;
        }
    }

    public boolean jeu(Sorcier joueur1, Sorcier joueur2, ArrayList<Integer> cartePartieJoueur1, ArrayList<Integer> cartePartieJoueur2, ArrayList ancienneCarteJoueur1, ArrayList ancienneCarteJoueur2, boolean finDeManche, Pont pont, MurDeFeu mdf, Sorcier winner) {
        Collections.sort(cartePartieJoueur1);
        Collections.sort(cartePartieJoueur2);

        joueur1.pertemana();
        joueur2.pertemana();
        for (int i = 1; i <= 14; i++) {
            winner = gagnant(joueur1, joueur2);
            if (cartePartieJoueur1.contains(i) && !joueur1.getMutisme()) {
                if (!cartePartieJoueur2.contains(i)) {
                    finDeManche = jeuCarte(joueur1, joueur2, cartePartieJoueur1, cartePartieJoueur2, ancienneCarteJoueur2, i, winner, finDeManche, mdf, pont);
                }
            }
            if (cartePartieJoueur2.contains(i) && !joueur2.getMutisme()) {
                if (!cartePartieJoueur1.contains(i)) {
                    finDeManche = jeuCarte(joueur2, joueur1, cartePartieJoueur2, cartePartieJoueur1, ancienneCarteJoueur1, i, winner, finDeManche, mdf, pont);
                }
            }

        }
        winner = gagnant(joueur1, joueur2);
        if (!pont.getPerdu()) {
            pont.deplacerMur(joueur1, joueur2, winner, mdf);
            mdf.setDeplacement(1);

        }
        return finDeManche;

    }

    public void initialiser(int nbmanche, Sorcier sor, ArrayList carteEnTout, ArrayList cartePossible) {
        if (nbmanche == 1) {
            sor.donnerManche1(carteEnTout, cartePossible);
        } else if (nbmanche == 2 || nbmanche == 3 || nbmanche == 4) {
            sor.donnerManche234(carteEnTout, cartePossible);
        }
    }

    public boolean finDeManche(Sorcier joueur, Sorcier adversaire, ArrayList<Integer> cartePartieJoueur, ArrayList<Integer> cartePartieAdv, ArrayList ancienneCarteAdv, boolean finDeManche, Pont pont, MurDeFeu mdf, boolean finDePartie, Sorcier winner, Graphique gra) {
        joueur.setMana(50);
        adversaire.setMana(50);
        finDeManche = false;
        joueur.setMutisme(false);
        adversaire.setMutisme(false);
        finDePartie = pont.finDeManche(finDeManche, finDePartie, mdf, joueur, adversaire, winner,gra);
        return finDePartie;
    }

}

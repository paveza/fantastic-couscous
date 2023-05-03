package shazam;

import java.util.Scanner;

public class CarteMana extends CarteSortilege {//toutes les cartes qui impactent la mana du joueur

    public CarteMana(int num, String nom, String descr) {
        super(num, nom, descr);//on fait appel au constructeur de cartes sortilege
    }


    public void effetCarte13et6et12(Sorcier sorcier, Sorcier winner) { 
        switch (this.numCarte) {
            case 13:
                if (sorcier.getMana() + 13 >= 50) {//on verifie que ajouter 13 à la mise ne dépasee pas 50
                    sorcier.setMana(50);
                } else {//on ajoute 13 si ça ne dépasse pas 50
                    sorcier.setMana(sorcier.getMana()+13) ;
                }   break;
            case 6:
                int nombre2;//variable qui contient de combien le joueur veut récitifier sa mise
                do {//tant que en dessous de -5 ou aud dessus de 5 ou que mise-nombre et inférieur à 0
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("combien voulez vous retrancher ou ajouter ?(metrre - devant la valeur pour retrancher et rien pour ajouter)");
                    nombre2 = scanner3.nextInt();
                    //message d'erreur à afficher
                    if (nombre2 < -5 || nombre2 > 5) {
                        System.out.println("doit etre compris entre -5 et 5 ");
                    } else if (sorcier.getMise() + nombre2 < 0) {
                        System.out.println("vous n'avez pas assez de mise");
                    }
                    
                } while (nombre2 < (-5) || nombre2 > 5 || sorcier.getMise() + nombre2 < 0);
                //vu que dans notre code on retranche dans tous les cas d'abord la mise du joueur avant d'appliquer les effets
                //lorsqu'il joue la carte 6 et decide d'enlever de la mana de sa mise ça rajoute ce qu'il a enlever de mana sur sa mise
                //expl: il mise 6 decide d'enlever 3(-3) alors on enleve 6(44) à sa mana puis on lui rajoute après 3 (44-(-3))-->47 de même quand il ajoute
                if (sorcier.getMana() - nombre2 > 50) {
                    sorcier.setMana(50);
                } else {
                    sorcier.setMana(sorcier.getMana()-nombre2);
                    sorcier.setMise(sorcier.getMise()+nombre2);
                    sorcier.setAttaque(sorcier.getAttaque()+nombre2);
                }   break;
            case 12:
                if (winner != sorcier && winner != null) {//on verifie avec winner passé en paramètre
                    if (sorcier.getMana() + sorcier.getMise()>50) {
                        sorcier.setMana(50);
                    }else{
                        sorcier.setMana(sorcier.getMana()+sorcier.getMise());
                    }
                }   break;
            default:
                System.out.println("il y a un petit probleme");//s'il y a un problème entre le this.numCarte et le numCarte passé au code
                break;
        }
    }

    public void effetCarte14(Sorcier moi, Sorcier adversaire) {

        if (this.numCarte == 14 ) {
            if (moi.getMana() + adversaire.getMise() > 50) {//on vérifie que la mana du joueur + la msie de l'adversaire ne dépasse pas 50
                moi.setMana(50);
            } else {
                moi.setMana(moi.getMana()+adversaire.getMise()) ;
            }
        } else {
            System.out.println("il y a un petit probleme");
        }
    }
}

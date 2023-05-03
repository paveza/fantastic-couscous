package shazam;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sorcier extends Obj_mobile {

    private int mana;
    private final String couleurS;
    private int mise;
    private boolean mutisme;
    private int attaque;
    //Getters

    public int getMana() {
        return mana;
    }

    public String getCouleurS() {
        return couleurS;
    }

    public int getMise() {
        return mise;
    }

    public boolean getMutisme() {
        return mutisme;
    }

    public int getAttaque() {
        return attaque;
    }

    //Setter
    public void setMana(int man) {
        this.mana = man;
    }

    public void setMise(int mis) {
        this.mise = mis;
    }

    public void setMutisme(boolean mute) {
        this.mutisme = mute;
    }

    public void setAttaque(int att) {
        this.attaque = att;
    }

    //Constructeur:
    public Sorcier(String couleur) {
        this.couleurS = couleur;
        this.mana = 50;
    }

    public ArrayList demanderSortMana(ArrayList cartePartie, ArrayList possible, ArrayList ancienneCarte, int choix) {
        ancienneCarte.addAll(cartePartie);
        cartePartie.clear();
        int nombre;
        boolean continuer = true;
        cartePossible(possible);
        miser(choix);
        do {
            nombre = sort(possible);
            if (nombre == 0) {
                continuer = false;
            } else {
                cartePartie.add(nombre);
            }
        } while (continuer);
        return cartePartie;
    }

    public int miser(int choix) {

        if (choix <= 0) {
            JOptionPane.showMessageDialog(null, "Vous ne pouvez pas miser 0 ! Reessayez.");
        } else if (choix > mana) {
            JOptionPane.showMessageDialog(null, "Vous n'avez pas assez de mana ! Reessayez.(il vous reste  " + mana + " de mana)");
        } else {
            mise = choix;
            attaque = mise;
            return mise;

        }
        return -1;
    }

    public void pertemana() {
        mana -= mise;
    }

    public int sort(ArrayList possible) {
        int nombre;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Joueur " + this.couleurS + ", entrez le numero de la carte sortilege que vous voulez jouer (sinon mettez 0 pour aucune carte) ");
            nombre = scanner.nextInt();
            if (!possible.contains(nombre) && nombre != 0) {
                System.out.println("Vous ne pouvez pas vous ne disposez pas de cette carte");
            }
            if (possible.isEmpty()) {
                System.out.println("Je suis desole, vous ne disposez plus de cartes. Veuillez entrer 0");
            }
            if (mutisme) {
                System.out.println("Il y avait la carte mutisme, vous avez perdu votre carte :( veuillez continuer");
            }
        } while (!possible.contains(nombre) && nombre != 0);
        possible.remove(Integer.valueOf(nombre));
        return nombre;
    }

    public void donnerManche1(ArrayList carteEnTout, ArrayList possible) {
        for (int i = 1; i < 15; i++) {
            carteEnTout.add(i);
        }
        for (int i = 0; i < 5; i++) {
            int index = (int) (Math.random() * carteEnTout.size());
            int carteChoisie = (int) carteEnTout.get(index);
            possible.add(carteChoisie);
            carteEnTout.remove(index);
        }
    }

    public void donnerManche234(ArrayList carteEnTout, ArrayList possible) {
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * carteEnTout.size());
            int carteChoisie = (int) carteEnTout.get(index);
            possible.add(carteChoisie);
            carteEnTout.remove(index);
        }
    }

    public String affichage(ArrayList<Integer> cartePartie) {
        StringBuilder affiche = new StringBuilder();
        affiche.append("<html>--> Joueur ").append(this.couleurS).append(" a joué carte(s): <br/>");
        for (int element : cartePartie) {
            affiche.append(element).append("<br/>");
        }
        affiche.append("Joueur ").append(this.couleurS).append(":<br/>mise=  ").append(this.mise).append("<br/>");
        affiche.append("attaque= ").append(this.attaque).append("<br/>");
        affiche.append("La mana du sorcier ").append(this.couleurS).append(" est de : ").append(this.mana).append("<br/></html>");
        return affiche.toString();
    }

    public void cartePossible(ArrayList possible) {
        System.out.println("Vous disposez des cartes suivantes :");
        for (int i = 0; i < possible.size(); i++) {
            System.out.print(possible.get(i) + "-");
        }
        System.out.println("");
    }

    

}

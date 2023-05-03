package shazam;

public class Pont {

    Obj_mobile[] pont;
    private boolean perdu = false;
    private int debut = 0, fin;

    //getter
    public boolean getPerdu() {
        return perdu;
    }


    public int getDebut() {
        return debut;
    }

    public int getFin() {
        return fin;
    }

  
    //setter

    public void setPerdu(boolean perd) {
        this.perdu = perd;
    }



    public void setDebut(int deb) {
        this.debut = deb;
    }

    public void setFin(int fino) {
        this.fin = fino;
    }

    public void setPlace(int pos, Obj_mobile obj) {
        this.pont[pos] = obj;
    }

    public Pont(Sorcier sorcier1, int possor1, Sorcier sorcier2, int possor2, MurDeFeu mdf) {
        pont = new Obj_mobile[19];
        pont[mdf.position] = mdf;
        sorcier1.position = possor1;
        pont[possor2] = sorcier2;
        sorcier2.position = possor2;
        pont[possor1] = sorcier1;
        fin = pont.length - 1;
    }

    public boolean deplacerMur(Sorcier sorcier1, Sorcier sorcier2, Sorcier winner, MurDeFeu mdf) {
        int pos = mdf.getPosition(); //trouve la position du mur
        int deplacement;
        if (winner == sorcier1) {
            pont[pos] = null;
            deplacement = mdf.deplacementD();

            if (deplacement >= sorcier2.position) { //verifie si le mur se deplacera sur un des joueurs
                perdu = true; //fin de la manche (quand le mur de feu touche un sorcier)
                mdf.setPosition(sorcier2.position);
                pont[mdf.position] = mdf;

            } else {
                pont[deplacement] = mdf; //DEPLACEMENT mur vers le sorcier2
            }
        } else if (winner == sorcier2) {
            pont[pos] = null;
            deplacement = mdf.deplacementG();
            if (deplacement <= sorcier1.position) {
                perdu = true;
                mdf.setPosition(sorcier1.position);
                pont[mdf.position] = mdf;

            } else {
                pont[deplacement] = mdf; //DEPLACEMENT mur vers le sorcier1
            }
        }
        return perdu;
    }

    public boolean deplacerS(MurDeFeu mdf, Sorcier sor1, Sorcier sor2, boolean finDePartie, Sorcier winner) {
        int mur = mdf.position;
        if (winner == sor1) {
            if (sor2.position + 3 >= fin) {
                finDePartie = true;
            }
        } else if (winner == sor2) {
            if (sor1.position - 3 <= debut) {
                finDePartie = true;
            }
        }

        pont[mur - 3] = sor1;
        pont[sor1.position] = null;
        sor1.position = mur - 3;

        pont[mur + 3] = sor2;
        pont[sor2.position] = null;
        sor2.position = mur + 3;

        pont[mdf.position] = mdf;

        return finDePartie;
    }


  

    public boolean finDeManche(boolean finDeManche, boolean finDePartie, MurDeFeu mdf, Sorcier sor1, Sorcier sor2, Sorcier winner, Graphique gra) {
        MurDeFeu mure = new MurDeFeu(debut);
        MurDeFeu mure2 = new MurDeFeu(fin);
        finDePartie = deplacerS(mdf, sor1, sor2, finDePartie, winner);
        pont[debut] = mure;
        pont[fin] = mure2;
        debut++;
        fin--;
        gra.ajouterImageFeu(debut);
        gra.ajouterImageFeu(fin+2);
        return finDePartie;
    }

  

    
}

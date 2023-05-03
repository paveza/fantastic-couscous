package shazam;

public class MurDeFeu extends Obj_mobile {

    private int dep = 1;

    public MurDeFeu(int pos) {
        this.position = pos;
    }

    public void setDeplacement(int deplacement) {
        this.dep = deplacement;
    }

    public int deplacementG() { //deplacement à gauche
        return position -= dep;
    }

    public int deplacementD() { //deplacement à droite
        return position += dep;
    }

   
}

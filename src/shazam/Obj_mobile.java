package shazam;

public abstract class Obj_mobile {
    protected int position; // case sur laqelle se trouve l'objet
//Getter    
    public int getPosition() {
        return position;
    }
//Setter
    public void setPosition(int pos) {
        this.position = pos;
    }

    public boolean equals(Obj_mobile element) {
        if (element.position==this.position) {
            return true;
        } else return false; 
        
    }
}


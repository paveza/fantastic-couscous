package shazam;

public abstract class CarteSortilege {
    protected int numCarte;
    protected String nomCarte;
    protected String description; //description de la carte à afficher

    public CarteSortilege(int num, String nom, String descr){ //constructeur de carte
        this.numCarte=num;
        this.nomCarte=nom;
        this.description=descr;
    }
    //Getters:
    public int getNumCarte() {
        return numCarte;
    }

    public String getNomCarte() {
        return nomCarte;
    }

    public String getDescription() {
        return description;
    }


    //Setters:
    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }

    public void setNomCarte(String nomCarte) {
        this.nomCarte = nomCarte;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    @Override
    public String toString(){ //affiche les infos des cartes
        return(numCarte+" "+nomCarte+" "+description); //le numero de la carte suivie de son nom et sa description
    }
    

}

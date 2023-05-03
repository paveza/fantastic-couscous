package shazam;

public class CarteAttaque extends CarteSortilege {
    
   
    public CarteAttaque(int num, String nom, String descr) {
        super(num, nom, descr);//on fait appel au constructeur de cartes sortilege
    }

    public void effetCarte8(Sorcier sorcier) {//multiplie par deux l'attaque du joueur
        sorcier.setAttaque(sorcier.getAttaque() * 2)  ;
    }

    public void effetCarte7(Sorcier sorcier) {//ajoute 7 à l'attaque du joueur
        sorcier.setAttaque(sorcier.getAttaque() + 7)  ;
    }
}

package shazam;


public class CartePartie extends CarteSortilege {
   
    public CartePartie(int num, String nom, String descr) {
        super(num, nom, descr);//on fait appel au constructeur de cartes sortilege
    }

     public void effetCarte4(Pont pont) {

        pont.setPerdu(true);

    }
     
}

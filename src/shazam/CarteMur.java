package shazam;

public class CarteMur extends CarteSortilege {

    public CarteMur(int num, String nom, String descr) {
        super(num, nom, descr); //on fait appel au constructeur de carte sortilege
    }

    public void effetCarte5(MurDeFeu mdf, Sorcier sor, Sorcier sor2, Pont pont) {
        //la position du 1er sorcier +3 étant toujours le milieu des 2 joueurs
        pont.setPlace(mdf.getPosition(), null);
        mdf.setPosition(sor.getPosition()+3);
        pont.setPlace(sor.getPosition()+3, mdf);
        sor.setAttaque(0);
        sor2.setAttaque(0);
    }
    
    public void effetCarte9(Sorcier moi, Sorcier adv, Sorcier winner) {
        //si le joueur n'est aps gagnant on inverse l'attaque des deux joueurs 
        //car si winner n'est pas moi alors winner est adversaire ou null et on inversant l'attaque je deviens gagnant
         int att=moi.getAttaque();//variable qui stocke l'attaque du joueur avant de la changer
        if (winner != moi ) {
           moi.setAttaque(adv.getAttaque());
           adv.setAttaque(att);
        } 
    }
    
    public void effetCarte10(MurDeFeu mdf) { //le murdefeu se déplace de deux cases au lieu d'une
        mdf.setDeplacement(2); // Utilisez la méthode setDeplacement pour modifier la valeur de déplacement du MurDeFeu
    }

    public void effetCarte11(Sorcier moi, Sorcier winner, MurDeFeu mdf) {
        if (winner != moi && winner != null) {
            mdf.setDeplacement(0);
        }
    }
}

/**
 * Classe Personne.
 * affiche des personne et leur role dans ensaigant ou eleve.
 * @author : J. BIYAMOU.
 * created on  11/11/2020
 * modified on 18/11/2020
 */

public class Personne {
/**
 * Attributs privés.
 */
//Vous devez déclarer ici les attributs privés de la classe.
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String codePostal;  ;


    //Vous devez coder ici le constructeur de la classe Compte.
    public Personne(String nom, String prenom, String adresse, String ville,String codePostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }


/**
 * Accesseur en lecture.
 * @return : le non de la personne.
 */

//Vous devez coder ici l'accesseur en lecture.

public String get_nom() {
    return nom;
}
/**
 * Accesseur en lecture.
 * @return : le prénom de la personne.
 */

//Vous devez coder ici l'accesseur en lecture
public String get_prenom(){
    return  prenom;
}
    /**
     * Accesseur en lecture.
     * @return : l'adresse de la personne.
     */

//Vous devez coder ici l'accesseur en lecture
    public String get_adresse(){
        return adresse;

}
    /**
     * Accesseur en lecture.
     * @return : la ville de la personne.
     */

//Vous devez coder ici l'accesseur en lecture
    public String get_ville(){
        return ville;

}

    /**
     * Accesseur en lecture.
     * @return : la ville de la personne.
     */

//Vous devez coder ici l'accesseur en lecture
    public String get_codePostal(){
        return codePostal;
    }
    /**
     * Rend le compte sous forme textuelle.
     * @return : l'objet courant Compte au format String.
     */

    //Vous devez coder ici la méthode permettant de rendre l'objet sous forme textuelle.
    public String toString() {
        return "nom : " + this.nom + " prenom : "+ this.prenom +" adresse : " +this.adresse+ "ville: "+this.ville + "codePostal: "+this.codePostal;
    }
}




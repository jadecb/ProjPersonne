
public class Eleve extends Personne {
    /**
     * Attributs privés.
     */
//Vous devez déclarer ici les attributs privés de la classe.
    private String classe ;


    //Vous devez coder ici le constructeur de la classe Compte.
    public Eleve(String classe, String nom, String prenom, String adresse, String ville,String codePostal) {
        super (nom,prenom,adresse, ville, codePostal);
        this.classe = classe;
    }


    /**
     * Accesseur en lecture.
     * @return : le non de la personne.
     */

//Vous devez coder ici l'accesseur en lecture.

    public String get_classe() {
        return classe;
    }

    /**
     * Modificateur en lecture.
     * @modif : la classe de l'élève.
     */

//Vous devez coder ici le setter en lecture.


    public void setClasse(String classe) {
        this.classe = classe;
    }
}

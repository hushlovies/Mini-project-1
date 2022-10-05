package bataille_carte;
import java.util.Random;
import java.util.*;

public class Carte {
	
	//les attributs de la carte en static
	public static List<String> valeurs= List.of("2","3","4","5","6","7","8","9","10","Valet","Reine","Roi","As"); //set up card numbers ace to king, so a total of 13 cards
	public static List<String> couleurs= List.of("Trefle","Pique","Carreau","Coeur");
	public static Random rnd= new Random();
	String valeur;
	String couleur;
	
	
	//getter et setter à utiliser
	
	public String getValeur(){
		return valeur;
	}
	public void setValeur(String val){
		valeur = val;
	}
	public String getCouleur(){
		return couleur;
	}
	public void setCoueur(String val){
		couleur = val;
	}
	
	// constructeur pour créer les attributs de la carte en random
	
	public Carte(){
		valeur = valeurs.get(rnd.nextInt(valeurs.size()));
		couleur = couleurs.get(rnd.nextInt(couleurs.size()));
	}
	
	//override le string par défaut
	
	@Override
	public String toString() {
		return valeur + " de " + couleur;
	}
	
	//méthode pour comparer les cartes
	public int compareCarte(Carte other){ 
		var idxThis = valeurs.indexOf(valeur);
		var idxOther = valeurs.indexOf(other.getValeur());
		if(idxThis > idxOther)
			return 1;
		else if(idxThis < idxOther)
			return -1;
		else return 0;
	}	
	
	
}


package bataille_carte;
import java.util.Stack;
public class Joueurs {
	
	//utilisation de Stack pour pouvoir utiliser pop() et push()
	Stack<Carte> carteDeck;
	int score;
	
	//céation de deck d'un joeur et initialisation de score
	public Joueurs(){
		carteDeck = new Stack<Carte>();
		score = 0;
	}
	
	public int getNombreCarte() {
		return carteDeck.size();
	}
	
	//methode pour tirer une carte au dernier deck
	
	public Carte tirer()
	{
		return carteDeck.pop();
		
	}
	//methode pour ajouter carte au premier deck
	
	public void ajouter(Carte c)
	{
		carteDeck.push(c);
	}
	
	//compteur score
	public void score(int valeur){
		score+=valeur;
	}
	
	//recup score
	public int getScore(){
		return score;
	}
}


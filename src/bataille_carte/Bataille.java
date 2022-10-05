package bataille_carte;
public class Bataille {
	public static void main(String[] args) throws Exception {
		
		//création deux joueurs
		Joueurs joueur1 = new Joueurs();
		Joueurs joueur2 = new Joueurs();
		
		//boucle pour ajouter une carte 10x
		for(int i = 0; i < 10; i++){
			
			joueur1.ajouter(new Carte());
			joueur2.ajouter(new Carte());
		}
		
		//boucle qui s'arrete lorsqu'on a tirer toutes les cartes (10 cartes chaque joueur)
		//On tire d'abord les 2 cartes, on affiche la carte tiré,comparer et obtient un score dependant de la comparaison des cartes
		while(joueur1.getNombreCarte() > 0 || joueur2.getNombreCarte() > 0){
			var carte1 = joueur1.tirer();
			var carte2 = joueur2.tirer();
			System.out.println("Joueur1 joue : " + carte1.toString());
			System.out.println("Joueur2 joue : " + carte2.toString());
			int compare = carte1.compareCarte(carte2);
			joueur1.score(compare);
			joueur2.score(-compare);
			System.in.read(); //appuyer enter pour tirer une autre carte
			
		}
		
		//conditions à afficher fin jeu lorsqu'on compare le score des 2 joueurs
		if(joueur1.getScore() > joueur2.getScore())
			System.out.println("Joueur1 gagne");
		if(joueur1.getScore() < joueur2.getScore())
			System.out.println("Joueur2 gagne");
		else
			System.out.println("egalite!!");
		
	}
	

}

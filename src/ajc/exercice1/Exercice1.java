package ajc.exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		/*
		Exercice : jeu du pendu
		Ecrire le programme du jeu du pendu.
		Le principe est le suivant :
		Un premier joueur choisit un mot de moins de 10 lettres.
		Le programme affiche _ _ _ _ _ _ _ _ _ ( un _ par lettre.)
		Le deuxi�me joueur propose des lettres jusqu'� ce qu'il ait trouv� le mot ou 
		qu'il soit pendu (11 erreurs commises).
		A chaque proposition, le programme r�affiche le mot avec les lettres d�couvertes ainsi 
		que les lettres d�j� annonc�es et le nombre d'erreurs.
		*/
		
		// recup�ration du mot
		Scanner scan = new Scanner(System.in);
		System.out.println("Joueur 1, entrez un mot secret : ");
		String mot = scan.next();
		
		// affichage cach�
		for (int i = 0; i < mot.length(); i++) {
			System.out.print("_ ");
		}
		
		// initialisation des variables utiles
		int nbLettreTrouvee = 0;
		int error = 0;
		List<String> usedLettre = new ArrayList<String>();
		
		// recherche de lettre par joueur 2
		do {
			
			// invitation a saisir une lettre			
			System.out.println("Joueur 2, trouvez une lettre : ");
			String lettre = scan.next();
			
			//v�rification lettre utilis�e ou non
			while (usedLettre.contains(lettre)) {
				System.out.println("lettre deja utilis�e! essayez une autre lettre.");
				lettre = scan.next();
			}
			
			// verification de la lettre
			if (mot.contains(lettre)) {
				System.out.println("Bravo vous avez trouvez une lettre");
				nbLettreTrouvee++;
				usedLettre.add(lettre);
			}else {
				System.out.println("Dommage, try again");
				error++;
				usedLettre.add(lettre);
			}
			
		}while(nbLettreTrouvee < mot.length());
	}

}

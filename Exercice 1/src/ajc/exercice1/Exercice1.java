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
		Le deuxième joueur propose des lettres jusqu'à ce qu'il ait trouvé le mot ou 
		qu'il soit pendu (11 erreurs commises).
		A chaque proposition, le programme réaffiche le mot avec les lettres découvertes ainsi 
		que les lettres déjà annoncées et le nombre d'erreurs.
		*/
		
		// recupération du mot
		Scanner scan = new Scanner(System.in);
		System.out.println("Joueur 1, entrez un mot secret : ");
		String mot = scan.next();
		
		// affichage caché
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
			
			//vérification lettre utilisée ou non
			while (usedLettre.contains(lettre)) {
				System.out.println("lettre deja utilisée! essayez une autre lettre.");
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

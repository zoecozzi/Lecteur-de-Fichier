
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class LecturePalindrome extends FichierTexte {
	
	public LecturePalindrome(String nomFichier) {
		super(nomFichier);
	}

	public String affiche(){
		String tableauTexte = FichierTexte.recupContenu("/Users/zoe/Desktop/fichier.txt");
		String[] tableau = tableauTexte.split("\n");
		String palindromeFinal = "";
		
		for (int i=0; i<=tableau.length-1; i++) {
			StringBuilder caractInvers = new StringBuilder(tableau[i]);
			tableau[i] = caractInvers.reverse().toString();
			palindromeFinal += tableau[i] +"\n";
		}
		return palindromeFinal;
		
	
		
	}
	
}

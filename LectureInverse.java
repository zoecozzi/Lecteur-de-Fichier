
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*; 

public class LectureInverse extends FichierTexte {
	
	public LectureInverse(String nomFichier) {
		super(nomFichier);
	}

	public String affiche(){
		String tableauTexte = FichierTexte.recupContenu("/Users/zoe/Desktop/fichier.txt");
		String[] tableau = tableauTexte.split("\n");
		String inverseFinal = "";
		
		for (int i=tableau.length-1; i>=0; i--) {
			inverseFinal += tableau[i] +"\n";
		}
		
		return inverseFinal;
		
	
		
	}
}
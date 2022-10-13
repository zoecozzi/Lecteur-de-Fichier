import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

abstract class  FichierTexte implements LecteurDeFichier {
	
	protected String leFichier;
	
	public FichierTexte (String nomFichier) {
		this.leFichier = nomFichier;
	}
	
	public static String recupContenu(String nomFichier) {
		String renduFinal = "";
		FileInputStream in = null;
		File texte = new File(nomFichier);
		try {
			in = new FileInputStream(texte);
			FileReader texteLecture = new FileReader(texte);
			
			try (BufferedReader renduTexte = new BufferedReader(texteLecture)) {
				String ligne = renduTexte.readLine();
				while (ligne != null) {
					renduFinal += ligne +"\n";
					ligne = renduTexte.readLine();
				}
			}
        } catch (IOException e) {
            System.err.println("fichier introuvable");
		} finally {
			if (in !=null) {
				try {
					in.close ();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return renduFinal;
	}
	
}

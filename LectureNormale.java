import java.io.*;

public class LectureNormale extends FichierTexte {
	
	public LectureNormale(String nomFichier) {
		super(nomFichier);
	}

	public String affiche(){
		return FichierTexte.recupContenu(leFichier);
	}
	

}

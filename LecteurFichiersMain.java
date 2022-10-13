public class LecteurFichiersMain {

	public static void main(String[] args) {
		
		LectureNormale fichier = new LectureNormale("/Users/zoe/Desktop/fichier.txt");
		fichier.affiche();
		
		LectureInverse fichier2 = new LectureInverse("/Users/zoe/Desktop/fichier.txt");
		System.out.println(fichier2.affiche());
		
		LecturePalindrome fichier3 = new LecturePalindrome("/Users/zoe/Desktop/fichier.txt");
		System.out.println(fichier3.affiche());
		
	}

}

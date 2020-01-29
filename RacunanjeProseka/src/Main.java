import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int srpski;
		int matematika;
		int engleski;
		int likovno;
		int muzicko;
		int istorija;
		int geografija;
		int biologija;
		int tehnicko;
		int fizicko;
		double prosek;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Srpski: ");
		srpski = scanner.nextInt();
		if (srpski > 5 || srpski < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Srpski: " + srpski);
		}
		
		System.out.println("Matematika: ");
		matematika = scanner.nextInt();
		if (matematika > 5 || matematika < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("matematika: " + matematika);
		}
		
		System.out.println("Engleski: ");
		engleski = scanner.nextInt();
		if (engleski > 5 || engleski < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Engleski: " + engleski);
		}
		
		System.out.println("Likovno: ");
		likovno = scanner.nextInt();
		if (likovno > 5 || likovno < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Likovno: " + likovno);
		}
		
		System.out.println("Muzicko: ");
		muzicko = scanner.nextInt();
		if (muzicko > 5 || muzicko < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Muzicko: " + muzicko);
		}
		
		System.out.println("Istorija: ");
		istorija = scanner.nextInt();
		if (istorija > 5 || istorija < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Istorija: " + istorija);
		}
		
		System.out.println("Geografija: ");
		geografija = scanner.nextInt();
		if (geografija > 5 || geografija < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Geografija: " + geografija);
		}
		
		System.out.println("Biologija: ");
		biologija = scanner.nextInt();
		if (biologija > 5 || biologija < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Biologija: " + biologija);
		}
		
		System.out.println("Tehnicko: ");
		tehnicko = scanner.nextInt();
		if (tehnicko > 5 || tehnicko < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Tehnicko: " + tehnicko);
		}
		
		System.out.println("Fizicko: ");
		fizicko = scanner.nextInt();
		if (fizicko > 5 || fizicko < 1) {
			System.out.println("Nedozvoljena ocena!");
		}
		else {
		System.out.println("Fizicko: " + fizicko);
		}
		
		int zbirOcena = srpski + matematika + engleski + likovno + muzicko + istorija + geografija + biologija + tehnicko + fizicko;
		
		prosek = zbirOcena / 10;
		
		System.out.println("Tvoj prosek je: " + prosek);
		
		
	}
	
	

}

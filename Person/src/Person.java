import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Person {	
	LocalDateTime now = LocalDateTime.now();	
	private static Person instance = null;	
	private Person(int y) {berechnung(y);}
	public static Person getPerson(int y) {
		if(instance == null) {instance = new Person(y);}
		return instance;}
	private double berechnung(int y) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy");
		int x = Integer.parseInt( now.format(df));
		int ergebnis = x - y;
		System.out.println("Ergebnis1: " + ergebnis);
		System.out.println("Ergebnis2: "+(y*525600));
		return ergebnis;}}
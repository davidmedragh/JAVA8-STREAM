import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author dmedragh
 *
 */
public class MainStreamClass {

	/**
	 * 
	 */
	public MainStreamClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> maListe = new ArrayList<>();
		
		maListe.add("maxime");
		maListe.add("mdavid");
		maListe.add("theo");
		maListe.add("claude");
		
		//we use a sequential Stream
		System.out.println("Before sorting result====>");
		maListe.stream().forEach(System.out::println);
		System.out.println("\nAfter sorting result====>");
		maListe.stream().sorted().forEach(System.out::println);
		System.out.println("\nAfter mapping to uppercase result====>");
		maListe.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
		System.out.println("\nAfter applyinga filter====>");
		maListe.stream()
				.filter( s -> s.startsWith("m"))
				.map(String::toUpperCase)
				.sorted()
				.forEach(System.out::println);
		
		//Use of intStream clas
		System.err.println("Sample of use of IntStream==>");
		IntStream.range(1, 10)
				 .forEach(System.out::println);
		
		System.err.println("Sample of use of stream==>");
		Stream.of("david", "claude", "maxime")
			  .forEach(System.out::println);
		System.err.println("\n Sample of use of stream.toArray==>");
		Object[] toArray = Stream.of("david", "claude", "maxime").toArray();
		for (Object object : toArray) System.out.println(object);
	}

}

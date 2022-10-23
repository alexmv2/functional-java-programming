package programming;

import java.util.List;
import java.util.Optional;

public class PlayingWithOptional {
	
	public static void main(String[] args) {
		
		//En java 8 se utiliza Arrays.asList
		List<String> fruits = List.of("Apple", "Banana", "Mango", "Berrys");
		
		//Encontrar primera fruta que empiece por 'B'
		
		//Hacemos Optional, ya que pueden existir o no existir
		//frutas que empiecen por 'B'
		Optional<String> optional =
		fruits.stream()
			.filter(fruit -> fruit.startsWith("B"))
			.findFirst();
		
		System.out.println(optional);
		System.out.println(!optional.isPresent());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
	}

}

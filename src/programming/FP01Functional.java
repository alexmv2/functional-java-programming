package programming;

import java.util.List;

public class FP01Functional {
	
	public static void main(String[] args) {
				
	   List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
	   System.out.println("JAVA FUNCIONAL: ");
		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
		printSquareOfEvenNumbersInListFunctional(numbers);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//Enfoque funcional
		
		System.out.println("Todos los n�meros: ");
		//stream -> trata uno a uno cada elemento de la lista
		numbers.stream()
			.forEach(System.out::println); //Method Reference
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		//Imprimir solo n�meros pares
		
		System.out.println("N�meros pares: ");
		numbers.stream()
			.filter(n -> n%2==0) //Lambda expression
			.forEach(System.out::println);
		
	}
	
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
		//Imprimir el cuadrado de los n�meros pares
		
		System.out.println("Cuadrado de n�meros pares: ");
		numbers.stream()
			.filter(n -> n%2==0)
			.map(n -> n*n)
			.forEach(System.out::println);
		
	}
	

}

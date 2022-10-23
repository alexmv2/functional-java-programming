package programming;

import java.util.List;

public class FP01Structure {
	
	public static void main(String[] args) {
		
		   List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
			
		   System.out.println("JAVA ESTRUCTURADO: ");
		   printAllNumbersInListStructured(numbers);
		   printEvenNumbersInListStructured(numbers);

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {	
		//Enfoque tradicional
		//How to loop the numbers?
		System.out.println("Todos los n�meros: ");
		for(Integer num: numbers) {
			System.out.println(num);
		}	
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		//Imprimir solo n�meros pares
		
		System.out.println("N�meros pares: ");
		for(Integer num: numbers) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
		
	}
	
}

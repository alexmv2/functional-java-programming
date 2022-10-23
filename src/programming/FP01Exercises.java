package programming;

import java.util.List;

public class FP01Exercises {
	
	public static void main(String[] args) {
				
	   List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
	   List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		printOddNumbers(numbers);
		printAllCourses(courses);
		printSpringCourses(courses);
		print4LettersCourses(courses);
		printCubeOfOddNumbers(numbers);
		printNumOfCharactersInEachCourse(courses);

	}
	
	private static void printOddNumbers(List<Integer> numbers) {
		//Imprimir solo números pares
		
		System.out.println("Números impares: ");
		numbers.stream()
			.filter(n -> n%2!=0) //Lambda expression
			.forEach(System.out::println);
		
	}
	
	private static void printAllCourses(List<String> courses) {
		System.out.println("Todos los cursos: ");
		
		courses.stream()
			.forEach(System.out::println);
		
	}
	
	private static void printSpringCourses(List<String> courses) {
		System.out.println("Todos los cursos que contengan 'Spring': ");
		
		courses.stream()
			.filter(c -> c.contains("Spring"))
			.forEach(System.out::println);
		
	}
	
	private static void print4LettersCourses(List<String> courses) {
		System.out.println("Todos los cursos que tengan almenos 4 letras ");
		
		courses.stream()
			.filter(c -> c.length() >= 4)
			.forEach(System.out::println);
		
	}
	
	private static void printCubeOfOddNumbers(List<Integer> numbers) {
		//Imprimir el cuadrado de números impares
		
		System.out.println("Cuadrado de números impares: ");
		numbers.stream()
			.filter(n -> n%2!=0)
			.map(n -> (int) Math.pow(n, 3))
			.forEach(System.out::println);
		
	}
	
	private static void printNumOfCharactersInEachCourse(List<String> courses) {
		
		System.out.println("Número de caracteres de cada curso");
		
		courses.stream()
			.map(c -> c + " length is " + c.length())
			.forEach(System.out::println);
		
	}

}

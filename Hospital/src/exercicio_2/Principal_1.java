package exercicio_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal_1 {

	public static void main(String[] args) {
		System.out.println("Exercício 2");
		
		try (Scanner scanner = new Scanner(System.in)) {
			String nome;

			do {

				System.out.println("Nome: ");
				nome = scanner.next();

				if (nome.isBlank()) {
					System.out.println("Frase para correção");
				}

			} while(nome.isBlank());

			String sobrenome;

			do {

				System.out.println("Sobrenome: ");
				sobrenome = scanner.next();

				if (sobrenome.isBlank()) {
					System.out.println("Frase para correção");
				}

			} while(sobrenome.isBlank());

			DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			
			String data;
			
			LocalDate dataDeNascimento = null;
			
			do {
				System.out.println("Data de nascimento(MM/dd/yyyy): ");
				data = scanner.next();
				
				try {
					dataDeNascimento = LocalDate.parse(data, fomatter);
				} catch (DateTimeParseException e) {
					System.out.println("Frase para correção");
				}
				
			} while(dataDeNascimento == null);

			HeartRates person = new  HeartRates("Rafa", "Safadinho", dataDeNascimento);

			System.out.println(person.age());
			System.out.println(person.frequenciaCardiacaMaxima());
			System.out.println(person.frequenciaCardiacaAlvo());
			
			
		}

	}

}

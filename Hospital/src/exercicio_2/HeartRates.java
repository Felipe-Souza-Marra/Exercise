package exercicio_2;

import java.time.ZonedDateTime;
import java.time.LocalDate;
import java.time.Period;


public class HeartRates {

	private String nome;
	private String sobrenome;
	private LocalDate dataDeNascimento;

	HeartRates(String nome, String sobrenome, LocalDate dataDeNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
	}

	public int age() {
		ZonedDateTime zona = ZonedDateTime.now();
		
		LocalDate agora =  LocalDate.of(zona.getYear(), zona.getMonth(), zona.getDayOfMonth());
		
		Period periodo = Period.between(this.dataDeNascimento, agora);
		
		return periodo.getYears();
	}
	
	public int frequenciaCardiacaMaxima() {
		return 220 - this.age();
	}
	
	public double frequenciaCardiacaAlvo() {
		return (this.frequenciaCardiacaMaxima()) * 0.85;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}

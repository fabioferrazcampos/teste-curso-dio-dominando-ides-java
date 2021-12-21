package br.com.dio.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String cor;
	private Integer indade;

	public Gato() {
	}

	public Gato(String nome, String cor, Integer indade) {
		this.nome = nome;
		this.cor = cor;
		this.indade = indade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIndade() {
		return indade;
	}

	public void setIndade(Integer indade) {
		this.indade = indade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, indade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(indade, other.indade)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", indade=" + indade + "]";
	}

	/*
	 * public Gato (String nome, String cor, Integer idade) { this.nome =nome;
	 * this.cor=cor; this.indade =idade; }
	 */

}

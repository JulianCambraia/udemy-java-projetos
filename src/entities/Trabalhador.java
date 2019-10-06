package entities;

import enums.NivelTrabalhoEnum;

public class Trabalhador {

	private String nome;
	private NivelTrabalhoEnum nivelTrabalhoEnum;
	private Double salarioBase;

	public Trabalhador() {
		super();
	}

	public Trabalhador(String nome, NivelTrabalhoEnum nivelTrabalhoEnum, Double salarioBase) {
		super();
		this.nome = nome;
		this.nivelTrabalhoEnum = nivelTrabalhoEnum;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhoEnum getNivelTrabalhoEnum() {
		return nivelTrabalhoEnum;
	}

	public void setNivelTrabalhoEnum(NivelTrabalhoEnum nivelTrabalhoEnum) {
		this.nivelTrabalhoEnum = nivelTrabalhoEnum;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public void adicionarContrato(HoraContrato contrato) {
		
	}
	
	public void removerContrato(HoraContrato contrato) {
		
	}
	
	public Double valorGanho(Integer ano, Integer mes) {
		return null;
	}
	
}

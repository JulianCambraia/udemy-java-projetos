package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalhoEnum;

public class Trabalhador {

	private String nome;
	private NivelTrabalhoEnum nivelTrabalhoEnum;
	private Double salarioBase;

	private Departamento departamento;

	private List<HoraContrato> contratos = new ArrayList<HoraContrato>();

	public Trabalhador() {
		super();
	}

	public Trabalhador(String nome, NivelTrabalhoEnum nivelTrabalhoEnum, Double salarioBase,
			Departamento departamento) {
		super();
		this.nome = nome;
		this.nivelTrabalhoEnum = nivelTrabalhoEnum;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	public void adicionarContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}

	public Double calculaLucroContrato(Integer ano, Integer mes) {
		Double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contratos) {
			cal.setTime(c.getDataInicioContrato());
			int cAno = cal.get(Calendar.YEAR);
			int cMes = 1+cal.get(Calendar.MONTH);
			if (ano == cAno && mes == cMes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}

}

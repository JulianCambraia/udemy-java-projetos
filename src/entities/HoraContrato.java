package entities;

import java.util.Date;

public class HoraContrato {

	private Date dataInicioContrato;
	private Double valorPorHoraTrabalho;
	private Integer horas;

	public HoraContrato() {
		super();
	}

	public HoraContrato(Date dataInicioContrato, Double valorPorHoraTrabalho, Integer horas) {
		super();
		this.dataInicioContrato = dataInicioContrato;
		this.valorPorHoraTrabalho = valorPorHoraTrabalho;
		this.horas = horas;
	}

	public Date getDataInicioContrato() {
		return dataInicioContrato;
	}

	public void setDataInicioContrato(Date dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}

	public Double getValorPorHoraTrabalho() {
		return valorPorHoraTrabalho;
	}

	public void setValorPorHoraTrabalho(Double valorPorHoraTrabalho) {
		this.valorPorHoraTrabalho = valorPorHoraTrabalho;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double valorTotal() {
		return valorPorHoraTrabalho * horas;
	}

}

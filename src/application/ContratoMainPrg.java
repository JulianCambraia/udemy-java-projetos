package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalhoEnum;

public class ContratoMainPrg {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do Departamento: ");
		String departamento = sc.nextLine();

		System.out.print("Entre com o nome do Trabalhador: ");
		String nomeTrabalhador = sc.nextLine();

		System.out.print("Entre com o nível de conhecimento do Trabalhador: ");
		String nivelTrabalhador = sc.nextLine();

		System.out.print("Entre com o salário base do Trabalhador: ");
		Double salarioBaseTrabalhador = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhoEnum.valueOf(nivelTrabalhador),
				salarioBaseTrabalhador, new Departamento(departamento));

		System.out.print("Informe o número de contratos que possui o Trabalhador: ");
		Integer numeroContratos = sc.nextInt();

		for (Integer i = 0; i < numeroContratos; i++) {
			System.out.println("Contrato #" + i + " dados");
			System.out.print("Data (dd/MM/yyyy): ");
			Date dataContrato = sdf.parse(sc.next());
			
			System.out.print("Valor ganho por hora: ");
			Double valorHora = sc.nextDouble();
			
			System.out.print("Duração do Contrato: ");
			Integer horas = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato, valorHora, horas);
			trabalhador.adicionarContrato(contrato);
			
		}
		System.out.println();
		System.out.print("Informe o mês e ano para calcular o salário (MM/YYYY)");
		String mesAno = sc.next();
		Integer mes = Integer.parseInt(mesAno.substring(0,2));
		Integer ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome do Trabalhador: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Ganho Total: " + String.format("%.2f", trabalhador.calculaLucroContrato(ano, mes)));

		sc.close();
	}
}

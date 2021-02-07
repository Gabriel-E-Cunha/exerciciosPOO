package exercicioPOO2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) throws ParseException {
		Date dateNascimento =  new SimpleDateFormat("dd/MM/yyyy").parse("08/02/2003");
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dateNascimento);
		int ano = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH) + 1;
		int dia = calendario.get(Calendar.DATE);
		LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
		LocalDate dataHoje = LocalDate.now();
		Period diferenca = Period.between(dataNascimento, dataHoje);
		System.out.println(diferenca.getYears());

	}

}

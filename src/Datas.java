import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		//	Trabalhando com LocalDate (não tem tempo)
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate java9 = LocalDate.of(2017, Month.JULY, 27);
		
		//	Utilizando Period para verificar a diferença entre as datas
		Period periodo = Period.between(hoje, java9);
		System.out.println(periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
		
		//	Formantando para padrão brasileiro
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterDataEHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		//	Manipulando uma data
		LocalDate proximoLancamento = java9.plusYears(10);
		System.out.println(proximoLancamento.format(formatterData));
		
		
		//	Trabalhando com LocalDateTime
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatterDataEHora));
		
		
		YearMonth anoMes = YearMonth.of(2016, Month.JANUARY);
		System.out.println(anoMes);
		
		LocalTime almoco = LocalTime.of(12, 00);
		System.out.println("Horário de almoço: " + almoco);
		
	}
	
}

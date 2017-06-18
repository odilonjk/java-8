import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExerciciosCap6 {

	public static void main(String[] args) {
		
		//	Imprimir data atual
		System.out.println(LocalDate.now());
		
		//	Criando data 25 de janeiro de 2099
		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
		
		//	Criar periodo entre hoje e data anterior
		Period periodo = Period.between(data, LocalDate.now());
		System.out.println(periodo);
		
		//	Mostrar data atual formatada para padrão brasileiro
		DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(LocalDate.now().format(formatadorData));
	}
	
}

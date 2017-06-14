import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExerciciosCap1 {

	public static void main(String[] args) {

		//	Criar lista de do tipo String
		List<String> bandas = new ArrayList<>();
		bandas.add("Amon Amarth");
		bandas.add("Paradise Lost");
		bandas.add("Eluveitie");
		bandas.add("Claustrofobia");
		
		//	Ordenar a lista por tamanho da String
		Comparator<String> comparador = new ComparadorPorTamanho();
		bandas.sort(comparador);
		
		//	Imprimir usando Consumer
		Consumer imprime = new ImprimeNaLinha();
		bandas.forEach(imprime);
		
	}
	
}

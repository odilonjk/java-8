import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		

		List<String> lista = new ArrayList<>();
		lista.add("Vancouver");
		lista.add("Abbotsford");
		lista.add("Winnipeg");
		lista.add("Toronto");
		
		Comparator<String> comparador = new ComparadorPorTamanho();

		//	Ordenação e iteraçãp antiga
		Collections.sort(lista, comparador);
		for (String palavra : lista) {
			System.out.println(palavra);
		}
		
		//	Com java 8
		//	sort é um método default da interface List
		//	forEach também é default da iterface Iterable
		lista.sort(comparador);
		Consumer<String> consumidor = new ImprimeNaLinha();
		lista.forEach(consumidor);
		
	}
	
}

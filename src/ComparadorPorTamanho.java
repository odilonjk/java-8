import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {
		if(string1.length() < string2.length())
			return -1;
		if(string2.length() > string2.length())
			return 1;
		return 0;
	}

}

import java.util.function.Consumer;

public class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String str) {
		System.out.println(str);
	}

}

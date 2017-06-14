
public class ExerciciosCap2 {

	public static void main(String[] args) {
		
		//	Executando Runnable em uma Thread usando lambda
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
	}

}

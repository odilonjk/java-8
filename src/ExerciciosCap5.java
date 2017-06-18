import java.util.ArrayList;
import java.util.List;

public class ExerciciosCap5 {

	public static void main(String[] args) {
	
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Java 8", 349));
		cursos.add(new Curso("Python", 235));
		cursos.add(new Curso("Django", 140));
		cursos.add(new Curso("Vue.js", 196));
		cursos.add(new Curso("C#", 327));
		cursos.add(new Curso("JavaScript", 468));
		cursos.add(new Curso("CorelDRAW", 107));
		cursos.add(new Curso("Photoshop", 251));

		//	Calcular média de alunos utilizando Stream
		cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average()
			.ifPresent(System.out::println);
	}
	
}


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosCursos {

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
	
		//	Ordenando por numero de alunos
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		//	Filtrando por cursos com mais de 300 alunos
		cursos.stream()
			.filter(c -> c.getAlunos() > 300)
			.forEach(c -> System.out.println(c.getNome()));
		
		//	Soma dos alunos dos cursos com menos de 150 alunos
		int total = cursos.stream()
			.filter(c -> c.getAlunos() < 150)
			.mapToInt(Curso::getAlunos)
			.sum();
		System.out.println("Total de alunos: " + total);
		
		//	Utilizando Optional (ifPresent)
		cursos.stream()
			.filter(c->c.getAlunos() > 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
		
		//	Utilizando collect e map
		cursos.stream()
			.filter(c->c.getAlunos() > 300)
			.collect(Collectors.toMap(
					c -> c.getNome(),
					c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
		
	}
	
}

class Curso {
	
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAlunos() {
		return alunos;
	}
	
}
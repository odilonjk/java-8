import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExerciciosCap3 {

	public static void main(String[] args) {
		
		//	Criar um comparator utilizando critério diferente
		//	do que já foi visto ao longo do capítulo.
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Patrick", 7));
		alunos.add(new Aluno("Bob", 4));
		alunos.add(new Aluno("Jerry", 7));
		alunos.add(new Aluno("Julie", 6));
		alunos.add(new Aluno("Alastor", 8));
		alunos.add(new Aluno("Rovenna", 3));
		
		alunos.sort(Comparator.comparing(aluno -> aluno.getSerie()));
		
		alunos.forEach(System.out::println);
	}
	
}

class Aluno {
	
	private String nome;
	private int serie;
	
	public Aluno(String nome, int serie) {
		this.nome = nome;
		this.serie = serie;
	}
	
	public int getSerie() {
		return serie;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " - Série: " + serie;
	}
}

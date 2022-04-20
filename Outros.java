package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("guilherme", 7.1);
		Aluno a2 = new Aluno("luna", 8.1);
		Aluno a3 = new Aluno("ana", 6.1);
		Aluno a4 = new Aluno("gabi", 10);
		Aluno a5 = new Aluno("pedro", 7.1);
		Aluno a6 = new Aluno("maria", 8.1);
		Aluno a7 = new Aluno("ana", 6.1);
		Aluno a8 = new Aluno("gabi", 10);

		List<Aluno>alunos =
				Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("distinct");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nskip/limit");
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.skip(3)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
	}
}
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Lesson> list = new ArrayList<>();	
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da "+ (i+1) +"a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char conteudo = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.nextLine();
;			String title = sc.nextLine();
			if(conteudo == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.next();
				System.out.print("Duração em segundos: ");
				int sec = sc.nextInt();
				
				list.add(new Video(url, sec));
			}else if(conteudo == 't'){
				System.out.print("Descrição: ");
				String desc = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int quant = sc.nextInt();
				
				list.add(new Task(desc, quant));
			}else {
                System.out.println("Conteudo ou tarefa desconhecida. Tente novamente.");
                i--;
            }
		}
		
		int soma = 0;
		for(Lesson e : list) {
			soma += e.duration();
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + soma);

		sc.close();
	}

}

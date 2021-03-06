package com.sbs.java.crud;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 시스템 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;
		
		List<Article> articles = new ArrayList<>();
		
	while(true) {
		System.out.println("명령어)");
		String command = sc.nextLine().trim();
		
		if(command.equals("system exit")) {
			break;
		}
		if(command.length()==0) {
			continue; 
		}
		if(command.equals("article write")) {
			
			int id = lastArticleId  + 1;
			lastArticleId = id;
			System.out.printf("제목 :");
			String title = sc.nextLine();
			System.out.printf("내용 :");
			String body = sc.nextLine();
			
			Article article = new Article(id, title, body);
			articles.add(article);
			
			
			
			System.out.printf("%d번 글이 생성되었습니다.\n", id);
			
			
		}
		
		else if(command.equals("article list")) {	
			
			for (int i = 0; i < articles.size(); i++) {
				Article article = articles.get(i);
				System.out.println(article.id);
			}
		
			System.out.printf("%게시물이 업습니다.\n");
		}
		else {
			System.out.printf("%s는(은) 존재하지 않는 명령어 입니다.\n",command);
		}
	}
		
		sc.close();
		System.out.println("== 프로그램 끝 ==");
	}
}

class Article {
	int id;
	String title;
	String body;
	
	Article(int id, String title, String body) {
		this.id = id;
		this.body = body;
		this.title = title;
	}

}
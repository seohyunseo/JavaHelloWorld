package com.example.lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!!!\n");
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.print("학교 입력 : ");
		String school = s.next();
		System.out.println("[" + school + "]학생, [" + name + "]님 환영합니다~");

	}

}

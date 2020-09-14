package sist;

import java.util.Scanner;

/*
 * [문제4] 다중 for문 응용문제
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ //25
 * ABCDEFGHIJKLMNOPQRSTUVWXY
 * ABCDEFGHIJKLMNOPQRSTUVWX
 * ABCDEFGHIJKLMNOPQRSTUVW
 * ABCDEFGHIJKLMNOPQRSTUV
 * ABCDEFGHIJKLMNOPQRSTU
 * ABCDEFGHIJKLMNOPQRST
 * ABCDEFGHIJKLMNOPQRS
 * ...
 * ABC
 * AB
 * A
 */

public class Exam_04 {

	public static void main(String[] args) {

		// [방법1] int 자료형을 이용하는 경우
		for(int i=90; i>=65; i--) {
			for(int j=65; j<=i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		System.out.println();
		
		// [방법2] char 자료형을 이용하는 경우
		for(char c='Z'; c>='A'; c--) {
			for(char j='A'; j<=c; j++) {
				System.out.print(j);
			}
			System.out.println();
		}		
	}

}

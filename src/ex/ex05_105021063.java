package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021063 彭明捷
 */
import java.util.Scanner;
public class ex05_105021063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		if(n % 2 == 0){System.out.println("偶數");}
		else{if(n % 2 != 0){System.out.println("奇數");}
		}}}
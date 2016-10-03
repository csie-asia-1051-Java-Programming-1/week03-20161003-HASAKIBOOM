package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021063 彭明捷
 */
import java.util.Scanner;
public class ex03_105021063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入元");
		Scanner scn =new Scanner(System.in);
		char a =scn.next().charAt(0);
		if(a>=60 && a<=85){
			System.out.print((a+32));
		}
		else if(a>=90 && a<=115){
			System.out.print((a-32));
		}
		else{
			System.out.print("NOPE");
		}}}

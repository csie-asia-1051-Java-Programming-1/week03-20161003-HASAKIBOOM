package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021063 彭明捷
 */
import java.util.Scanner;
public class ex02_105021063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char as=scn.next().charAt(0);
		int x=as-'b';
		if(x>=0&&x<26){
			System.out.print("小寫");
		}else{
			x=as-'B';
		if(x>=0&&x<26){
				System.out.print("大寫");
		}
		else{
		System.out.print("其他的字元");
		}}}}

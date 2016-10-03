package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021063 彭明捷
 */
import java.util.Scanner;
public class ex06_105021063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入x值:");
		float x = scn.nextFloat();
		if(x < -1){
			float y = 3*(x*x);
			System.out.println("y:" + y);
		}else{
			if(x >= -1 || x <= 1){
				float y = (x*x*x)+3*x-3;
				System.out.println("y:" + y);
			}else{
				float y = 2*x+3;
				System.out.println("y:" + y);
	}}}}
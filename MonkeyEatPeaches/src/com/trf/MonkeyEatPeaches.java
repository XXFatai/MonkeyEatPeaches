
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName：   MonkeyEatPeaches
 * FileName: MonkeyEatPeaches.java
 * Author:   润发
 * Date:     2013-1-24 下午8:21:17  
 * Version :
 * Description:猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又
 * 多吃了一个 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后
 * 每天早上都吃了前一天剩下 的一半零一个。到第n天早上想再吃时，见
 * 只剩下一个桃子了。求第一天共摘了多少。
 **********************************************************/
package com.trf;
import java.util.Scanner;

public class MonkeyEatPeaches {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		monkey monkey = new monkey();
		
		System.out.print("输入天数：");
		monkey.mep(input.nextInt());
		input.close();
	}
}
class monkey{
	 public void mep(int day){
		int i = 1;
		int num = 1;
		
		for (; day > 1; day--,i++)
			num = (num+1) * 2;
		System.out.println("如果是"+ i +"天共摘了"+ num +"个。");
	}
 }
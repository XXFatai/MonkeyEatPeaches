
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName��   MonkeyEatPeaches
 * FileName: MonkeyEatPeaches.java
 * Author:   ��
 * Date:     2013-1-24 ����8:21:17  
 * Version :
 * Description:���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬��
 * �����һ�� �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�
 * ÿ�����϶�����ǰһ��ʣ�� ��һ����һ��������n���������ٳ�ʱ����
 * ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
 **********************************************************/
package com.trf;
import java.util.Scanner;

public class MonkeyEatPeaches {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		monkey monkey = new monkey();
		
		System.out.print("����������");
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
		System.out.println("�����"+ i +"�칲ժ��"+ num +"����");
	}
 }
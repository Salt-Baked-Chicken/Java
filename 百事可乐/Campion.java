package ���¿���;

import java.util.Scanner;

public class Campion {
	public static void main(String args[]){
		String string = "�Ұ����й�,�Ұ��㳤��,���޽�";
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������Ҫ���ҵ��ַ���");
        String input = scanner.next();
        String[] array = string.split(input);
        System.out.println(input + " �ܹ������ˣ�" + (array.length - 1) + "��");
    }
}

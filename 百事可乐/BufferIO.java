package ���¿���;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.xml.soap.Text;

public class BufferIO {
	public static void main(String args[]) throws IOException {
		Reader KENT = new FileReader("D:/JavaIO/Text.txt");
		//����Reader����
		BufferedReader ss = new BufferedReader(KENT);
		//����BufferReader����
		//BufferR��Reader�����࣬���л�����
		System.out.println(ss.readLine());
		//ʹ��readLine����,�˷���������BufferR
		//�����ǰ��ж�ȡ���˷����������ȡ�ĵ�һ��
		System.out.println(ss.readLine());
		//����ڶ�������
		FileWriter ab = new FileWriter("D:/JavaIO/Text.txt");
		ab.write("fuc u allllllllllllllllll!!!");
		//д��������ݣ���Ḳ��֮ǰ�ļ����е�����
		//BufferedWriter��Writer�����࣬���л�����;
		ab.flush();
		//ˢ�»�����
		ss.close();
		KENT.close();
		//�ر�:)
		//DateOutputStream����FileOutputStream������
		//����������File�����ڣ�ͼƬ���ƣ�file�����ݸ���;
	}
}

package com.panzhanpeng.designpatters.create.singleTon;

/**
 * ����������
 * @author panzhanpeng
 *
 */
public class SingleTest {

	public static void main(String[] args) {
		//��������
		HungrySingleTon hungrySingleTon = HungrySingleTon.getInstance();
		HungrySingleTon hungrySingleTon2 = HungrySingleTon.getInstance();
		System.out.println(hungrySingleTon == hungrySingleTon2);
		
		//����֮˫������鵥��
		DoubleCheckSingleTon doubleCheckSingleTon1 = DoubleCheckSingleTon.getInstance();
		DoubleCheckSingleTon doubleCheckSingleTon2 = DoubleCheckSingleTon.getInstance();
		System.out.println(doubleCheckSingleTon1 == doubleCheckSingleTon2);
		
		//��̬�ڲ��൥��
		StaticInnerSingle staticInnerSingle = StaticInnerSingle.getInstance();
		StaticInnerSingle staticInnerSingle2 = StaticInnerSingle.getInstance();
		System.out.println(staticInnerSingle == staticInnerSingle2);
		
		//��̬�ڲ��൥��
		EnumSingleTon enumSingleTon = EnumSingleTon.getInstance();
		EnumSingleTon enumSingleTon2 = EnumSingleTon.getInstance();
		System.out.println(enumSingleTon == enumSingleTon2);
 	}

}

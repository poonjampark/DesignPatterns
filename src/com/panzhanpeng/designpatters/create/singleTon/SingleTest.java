package com.panzhanpeng.designpatters.create.singleTon;

/**
 * 单例测试类
 * @author panzhanpeng
 *
 */
public class SingleTest {

	public static void main(String[] args) {
		//饿汉单例
		HungrySingleTon hungrySingleTon = HungrySingleTon.getInstance();
		HungrySingleTon hungrySingleTon2 = HungrySingleTon.getInstance();
		System.out.println(hungrySingleTon == hungrySingleTon2);
		
		//懒汉之双重锁检查单例
		DoubleCheckSingleTon doubleCheckSingleTon1 = DoubleCheckSingleTon.getInstance();
		DoubleCheckSingleTon doubleCheckSingleTon2 = DoubleCheckSingleTon.getInstance();
		System.out.println(doubleCheckSingleTon1 == doubleCheckSingleTon2);
		
		//静态内部类单例
		StaticInnerSingle staticInnerSingle = StaticInnerSingle.getInstance();
		StaticInnerSingle staticInnerSingle2 = StaticInnerSingle.getInstance();
		System.out.println(staticInnerSingle == staticInnerSingle2);
		
		//静态内部类单例
		EnumSingleTon enumSingleTon = EnumSingleTon.getInstance();
		EnumSingleTon enumSingleTon2 = EnumSingleTon.getInstance();
		System.out.println(enumSingleTon == enumSingleTon2);
 	}

}

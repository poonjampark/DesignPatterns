package com.panzhanpeng.designpatters.create.singleTon;

/**
 * Ã¶¾ÙÀàµ¥Àý
 * @author panzhanpeng
 * @since 2019-8-31
 */
public enum EnumSingleTon {
		ENUMSINGLETON;
	
	public static EnumSingleTon getInstance() {
		return ENUMSINGLETON;
	}
}

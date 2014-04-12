package com.gmail.dailyefforts.java.base;

final class FinalClass {
	// final 的类不可被继承
}

class NormalClass /* extends FinalClass */{
	/**
	 * final 方法不可被修改
	 */
	final public void finalMethod() {
		System.out.println("NormalClass.finalMethod()");
	}
}

class SubClass extends NormalClass {
//	@Override
//	final public void finalMethod() {
//	}
	
	public SubClass() {
		// 构造方法里最好调用final方法，以防止子类篡改行为
	}
}

public class Final {
	public static void main(String[] args) {
		final int finalVar = 9;
		// final的变量，不可再被赋值
		// finalVar = 10; // Error
	}
}

package test.schedule;

import java.math.BigDecimal;

public class Test1 {

	public static void main(String[] args) {
		String a="0.123456";
		String a2="0.0345";
		Double b =Double.valueOf(a);
			
		
		//用double构建BIGDEcimal对象
		BigDecimal f=new BigDecimal(Double.valueOf(a));
		System.out.println(f);
		
		f=
		new BigDecimal(b).multiply(new BigDecimal(1000));
		System.out.println(f);
		//把bigDecimalz转换成double对象(将原来数据扩大1000000倍)
		Double c =
		new BigDecimal(b).multiply(new BigDecimal(1000000)).doubleValue();
		System.out.println(c);	

		//bigdecimal提供的精确地加减乘除方法（add/subtract/multiply/divide）
		double result=
		new BigDecimal(b).subtract(new BigDecimal(Double.valueOf(a2))).doubleValue();
		System.out.println(result);


		
		 /*其实java的float只能用来进行科学计算或工程计算，在大多数的商业计算中，一般采用java.math.BigDecimal类来进行精确计算。

         在使用BigDecimal类来进行计算的时候，主要分为以下步骤：

             1、用float或者double变量构建BigDecimal对象。

            2、通过调用BigDecimal的加，减，乘，除等相应的方法进行算术运算。

            3、把BigDecimal对象转换成float，double，int等类型。

         一般来说，可以使用BigDecimal的构造方法或者静态方法的valueOf()方法把基本类型的变量构建成BigDecimal对象。*/
		
	}

}

package test.schedule;

import java.math.BigDecimal;

public class Test1 {

	public static void main(String[] args) {
		String a="0.123456";
		String a2="0.0345";
		Double b =Double.valueOf(a);
			
		
		//��double����BIGDEcimal����
		BigDecimal f=new BigDecimal(Double.valueOf(a));
		System.out.println(f);
		
		f=
		new BigDecimal(b).multiply(new BigDecimal(1000));
		System.out.println(f);
		//��bigDecimalzת����double����(��ԭ����������1000000��)
		Double c =
		new BigDecimal(b).multiply(new BigDecimal(1000000)).doubleValue();
		System.out.println(c);	

		//bigdecimal�ṩ�ľ�ȷ�ؼӼ��˳�������add/subtract/multiply/divide��
		double result=
		new BigDecimal(b).subtract(new BigDecimal(Double.valueOf(a2))).doubleValue();
		System.out.println(result);


		
		 /*��ʵjava��floatֻ���������п�ѧ����򹤳̼��㣬�ڴ��������ҵ�����У�һ�����java.math.BigDecimal�������о�ȷ���㡣

         ��ʹ��BigDecimal�������м����ʱ����Ҫ��Ϊ���²��裺

             1����float����double��������BigDecimal����

            2��ͨ������BigDecimal�ļӣ������ˣ�������Ӧ�ķ��������������㡣

            3����BigDecimal����ת����float��double��int�����͡�

         һ����˵������ʹ��BigDecimal�Ĺ��췽�����߾�̬������valueOf()�����ѻ������͵ı���������BigDecimal����*/
		
	}

}

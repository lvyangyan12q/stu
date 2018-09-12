package cn.jt.test;

import org.junit.Test;

public class Test1 {
	  @Test
	    public void test()  {

	       System.out.println(test11());
	    }


	    public  String test11() {
	        try {
	            System.out.println("try block");

	            return test12();
	        } finally {
	            System.out.println("finally block");
	        }
	    }

	    public static String test12() {
	        System.out.println("return statement");

	        return "after return";
	    }
}

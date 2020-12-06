package org.cb.ta.java8;

public class Lambda {
	@FunctionalInterface
	static interface IPrintable {
		void printMe(String name, int age);
		
		default void printMe2() { 
			//implementation
		}
		
		static void printMe3() { 
			//implementation
		}
	}
	
	static class PrintableImpl implements IPrintable {
		@Override
		public void printMe(String name, int age) {System.out.println("accept");}
	}
	
	static class LamdaTest {
		public void print(IPrintable printable) {printable.printMe("TA", 25);}
	}
	
	static class Employee {
		public void printName() {
			System.out.println("Hi, CB");
		}
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.printName();
		
		
		//with lambda:
		/**
		 * functional programming
		 * reduced code size
		 * readability
		 * ease of maintenance
		 * decrease cost of production & maintenance
		 * parallel programming
		 * 
		 * method
		 * acc mod - ret type - name - ( params ) { body }
		 * 
		 * public void printName(String name, int age) {
				System.out.println("Hi, CB");
		   }
		 * 
		 * 
		 * anonymous method
		 * (params) -> { body }
		 * 
		 * (String name, int age)-> { 
		 * 	System.out.println("Hi, CB"); 
		 * }
		 */
		PrintableImpl printableImpl = new PrintableImpl();
		printableImpl.printMe("CB", 15);
		LamdaTest lambdaTest = new LamdaTest();
		lambdaTest.print(printableImpl);
		
		IPrintable printable = (n, i) -> {
			System.out.println(n); 
		};
		lambdaTest.print(printable);
		
		/**
		 * we do not need to write param type
		 * if there is only one param, no need to use parantheses
		 * if there is only one line in method body, no need to use curly brackets
		 */
		
		/**
		 * Functional Interface: Only one abstract method
		 */
		// Runnable, Comparator, Consumer, Callable 
	}
}

package jenkinsDemo;


class Calculator
{	
	int additionResult;
	int subtractionResult;
	int multiplicationResult;
	int divisionResult;
	
	public void add(int a, int b)
	{
		additionResult = a+b;
		System.out.println("Addition : "+(a+b));
	}
	public void sub(int a, int b)
	{	
		subtractionResult = a-b;
		System.out.println("Subtract : "+(a-b));
	}
	public void mul(int a, int b)
	{
		multiplicationResult = a*b;
		System.out.println("Multiply : "+(a * b));
	}

	public void divide(int a, int b){
		divisionResult = a/b;
		System.out.println("Division : " +(a/b));
	}
}
public class CalculatorMain
{
	public static void main(String args[])
	{
		System.out.println("Calculator Operations......");
 
		Calculator c1 = new Calculator();
		c1.add(10, 20);
		c1.sub(10, 20);
		c1.mul(10, 20);
	}
}
/*
set PATH=C:\Users\Wissen\Documents\Maven\apache-maven-3.9.9\bin;%PATH%
cd C:\Users\Wissen\Documents\workspace-spring-tool-suite-4-4.27.0.RELEASE\jenkinsDemo
mvn compile


cd C:\Users\Wissen\Documents\workspace-spring-tool-suite-4-4.27.0.RELEASE\jenkinsDemo
java -cp target/classes jenkinsDemo.CalculatorMain

set PATH=C:\Users\Wissen\Documents\Maven\apache-maven-3.9.9\bin;%PATH%
cd C:\Users\Wissen\Documents\workspace-spring-tool-suite-4-4.27.0.RELEASE\jenkinsDemo
mvn test
 */
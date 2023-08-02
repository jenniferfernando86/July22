package Aug1;

// Javaclass = Name "Calculator
//private fields = num1 num2
//Add method add(), subtract(), multiply(), divide() return num1 num2;
//define a param -- constructor which takes two param num1 num2
//input --> pass double point numbers in param const
//output --> sum, sub, mul, divis
//cal c = new cal (10, 23)
//c.add()

class CalculatorDemo{

    private double num1;
    private double num2;

    public CalculatorDemo(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1 + num2;
    }

    public double sub(){
        return num1 - num2;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double divide(){
        return num1 / num2;
    }


}

public class Calculator {
    public static void main(String[] args) {

        CalculatorDemo calculatorDemo = new CalculatorDemo(5, 2);
        System.out.println("Addition of two numbers : " + calculatorDemo.add());
        System.out.println("Subtraction of two numbers : " + calculatorDemo.sub());
        System.out.println("Multiplication of two numbers : " + calculatorDemo.multiply());
        System.out.println("Division of two numbers : " + calculatorDemo.divide());

    }

}
/*Object Oriented paradigm - OOPs
C and C++ ==> is also object oriented programming
Class and Object

Multiple Inheritance - not possible
1. Inheritance -- > to inherit properties from parent class
Code reusability
Class A { // parent class
//properties

//Father
}
class B {
properties from A

child // base class
}
2. Polymorphism --> many forms
1 thing have multiple forms
method overriding // method overloading
3. Encapsulation -->
// wrapping up of data in single unit ?
capsule form ? //
eg: getter/setter


4. Abstraction
Hiding the details and showing actual functionality

eg: car and --->
abstract classes
interfaces ? through this we can do multiple inheritance

 */

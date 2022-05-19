/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author dell
 */
//public class book {
//<editor-fold defaultstate="collapsed" desc="counter">
    /*
 public static void main(String[] args) {
 int count = 0;
 while (count < 8) {
 //System.out.println("&");// in new line 
 System.out.print("&");// run 8 tmes
 count++;
 }
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="marhash university">
/*
 class Domino {
 //data declarations
 //and
 //method definitions
 //Data declarations take two forms
 //1.Instance Variables
 //class contains its own copy or instance of these variables.
 //Each object may store different values in these variables
 //2. Class Variables (have static modifier)
 //These variables belong to the class itself and are shared
 //by all of the objects fabricated from the class.
 //Methods take three forms
 //1. Instance methods
 //operate directly on the state of an object 
 //Referenced by specifying an object and a method.
 //objectName.methodName(parameters)
 //2. Constructors
 //share their name with the class.
 //Have no specification of return type.
 //Parameters may be provided as initialization information.
 //Automatically invoked when Objects are created using new
 //3. Class Methods (have static modifier)
 //Belong to the class itself and shared all of the objects of the class.
 //Cannot refer directly to instance variables and instance methods
 //Called using the class name.
 // className.methodName(parameters)
 //e.g. Math.sqrt(99.9)
 //Creating Objects
 //class called Domino (a domino factory).
 //1.Variable Declaration

 Domino d, e; // Declares two variables that
 // may refer to Domino objects,
 // but are null initially.
 //Note: Declarations do not create objects (unlike C++).
 //2.Instance Creation
 Domino a = new Domino();
 // new creates a Domino object and
 // automatically calls a constructor for
 // Domino (maybe default constructor).
 // Declaration and Creation Combined
 //Domino d2w = new Domino(51, 82, true);
 public void Domino()
 {

 }
 }
 //Definition of Domino Class

 class Dominos {
 // Instance Variables — usually private

 int spots1;
 int spots2;
 boolean faceUp;
 // Class Variables
 static final int MAXSPOTS = 9; // a constant
 static int numDominoes = 0;
 // Constructors (sometimes include validation)

 Dominos(Integer val1, Integer val2, boolean up) {
 if (0 <= val1 && val1 <= MAXSPOTS) {
 spots1 = val1;
 } else {
 spots1 = 0;
 }
 if (0 <= val2 && val2 <= MAXSPOTS) {
 spots2 = val2;
 } else {
 spots2 = 0;
 }
 faceUp = up;
 numDominoes++;
 }

 Dominos() // overloading
 {
 this(0, 0, false); // Calls constructor with
 } // matching parameters.
 // Instance Methods

 int getHigh() {
 if (spots1 >= spots2) {
 return spots1;
 } else {
 return spots2;
 }
 }

 int getLow() {
 if (spots1 <= spots2) {
 return spots1;
 } else {
 return spots2;
 }
 }

 public String toString() {
 String orientation = faceUp ? "UP" : "DOWN";
 return "<" + getLow() + ", " + getHigh() + "> " + orientation;
 }

 boolean matches(Dominos otherDomino) {
 int a = otherDomino.getHigh();
 int b = otherDomino.getLow();
 int x = getHigh();
 int y = getLow();
 return a == x || a == y || b == x || b == y;
 }
 // Class Methods

 static int getNumber() {
 return numDominoes;
 }
 } // end of Domino class
 //Application Class that Uses Domino

 public class book {

 public static void main(String[] args) {
 Dominos d1, d2, d3, d4;
 d1 = new Dominos(3, 5, true);
 d2 = new Dominos(4, 4, false);
 d3 = new Dominos();
 d4 = new Dominos(8, 5, false);
 System.out.println("Domino 1: " + d1);
 System.out.println("Domino 2: " + d2);
 System.out.println("Domino 3: " + d3);
 System.out.println("Domino 4: " + d4);
 System.out.println("Matches 1 and 2: " + d1.matches(d2));
 System.out.println("Matches 1 and 4: " + d1.matches(d4));
 System.out.println("Number of Dominoes: " + Dominos.getNumber());
 }
 } // end of Dominoes class
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Polymorphism">
  /*
 public class book {
  
 // can override method here
 public void reading() {
 System.out.println("reading make perfect");
 }
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Abstract & Concorete Class">
abstract public class book { // if a class is an abstract class we can't create a with an object with  in other class   
// abstract class is used for polynorphsim and inhertance concept
    // in abstract class there is no object creation seport but in concrete classs can do 
    //e.g

    // book boo = new book;//can not instantiated]
    big bigobject = new big(); // concorete class 
    // and also abstract method is a method that can overriding 

    public abstract void reading(); //impliment or overriding the method 
 
}
//</editor-fold>

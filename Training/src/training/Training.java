package training;
//<editor-fold defaultstate="collapsed" desc="Import">

import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 import java.util.EnumSet;
 import java.math.MathContext;
 import java.util.Scanner;
 import java.util.Random;
 */
//</editor-fold>

public class Training {
//<editor-fold defaultstate="collapsed" desc="hello world">
    /*
     //hello world 
     public static void main(String[] args) {
     System.out.println("hello behabtu");
     } 
     */
 //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="variables">
    /*
     //variables
     public static void main(String[] args) {
     Integer behabtu;
     behabtu = 1;
     System.out.print("i want ");
     System.out.print(behabtu);
     System.out.println(" wife!!!");
     System.out.print("begizew");
     System.out.println(" tutorial 10 i stop");
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="input">
    /*
     //input 
     public static void main(String[] args) {
     Scanner  behabtu =new Scanner(System.in);//input from keyboard
     System.out.println(behabtu.nextLine());  
       
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="calculator">
    /*
     //calculator
     public static void main(String[] arg) {
     double fnum, smun, answer;
     System.out.println("Enter First Num: ");
     fnum = behabtu.nextDouble();
     System.out.println("Enter Second Num: ");
     smun = behabtu.nextDouble();
     answer = fnum + smun;
     System.out.println(answer);

     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="maths operators">
    /*
     //maths operators
     public static void main(String[] arg) {
     int boys, grils, peoples;
     boys = 6;
     grils = 6;
     peoples = boys + grils;
     System.out.println(peoples);
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="increment & dicriment">
    /*
     //increment and dicriment
     public static void main(String arg[]) {
     int apple = 5;
     int orange = 11;
     apple = apple + 5;
     orange += 9;
     // ++apple;
     System.out.println(++apple);//pre incrementing 
     System.out.println(apple++);//post incrementing
     System.out.println(--orange);
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="if statement">
    /*
     // if statement
     public static void main(String arg[]) {
     int test = 5;
     if (test == 10) {
     System.out.println("yes");
     } else {
     System.out.println("it is not true");
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="logical oprator">
    /*
     //logical oprator
     public static void main(String arg[]) {
     int boys = 18;
     int grils = 68;
     if (boys > 10 && grils < 60) {
     // && logical and
     // || logical or
     System.out.println("you can enter");
     } else {
     System.out.println("you too young");
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="switch statement">
    /*
     // switch statement one variable in mutiple choose
     public static void main(String arg[]) {
     int age;
     age=3;
     switch(age){
     case 1:
     System.out.println("new born");
     break;
     case 2:
     System.out.println("talking me");
     break;
     case 3:
     System.out.println("go to school");
     break;
     default :
     System.out.println("diffecalt to know");
     break;
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="while loop">
    /*
     //while loop execute meltiple times
     public static void main(String arg[]) {
     int counter = 0;
     while (counter < 10) {
     System.out.println(counter);
     counter++;
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="mulitiple class">
    /*
     //muliple class 
     public static void main(String[] arg) {
     big bigobject = new big();
     bigobject.simplemessage();
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="method with parameter">
    /*
     //use method with parameter 
     public static void main(String[] arg) {
     Scanner input = new Scanner(System.in);
     big bigobject = new big();
     System.out.println("Enter your name here: ");
     String name = input.nextLine();
     bigobject.simpleMessage(name);

     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="many method and instance">
    /*
     //many methods and instance
     //instance variables
     public static void main(String[] arg){
     Scanner input = new Scanner(System.in);
     big bigobject =  new big();
     System.out.println("Enter name first gf here: ");
     String temp =input.nextLine();
     bigobject.setName(temp);
     bigobject.saying();
     }
     */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="constructor">
    /*
     //constructor
     public static void main(String arg[]){
     big bigobject= new big("fiff");
     bigobject.saying();
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="nested if">
    /*
     //nested if statemnet
     public static void main(String arg[]) {
     int age = 60;
     if (age > 50) {
     System.out.println("you are young");
     } else {
     System.out.println("you are old");
     if(age>75){//in this case one if inside onther if is called nested if statemenet
     System.out.println("you are realy old");
     }else{
     System.out.println("don't worry you are not realy old");
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="else if">
    /*
     //else if statemenet for more than two/many options
     int age = 15;
     if (age >= 16) {
     System.out.println("you are an engineer");
     } else if (age >= 15) {
     System.out.println("you are 4th year student");
     } else {
     System.out.println("you are  social");
     } 
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="conditional operator">
    /*
     public static void main(String[] arg) {
     int age = 20;
     System.out.println(age > 30 ? "you are young" : "you are old");
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="simple average">
    /*
     //Simple average 
     public static void main(String[] arg){
     Scanner input = new Scanner(System.in);
     int total=0;
     int grade;
     int average;
     int counter=0;
     while (counter<10){
     grade = input.nextInt();//a varible integer value from the keyboard stored in grade
     total= total + grade;
     counter++;            
     }
     average =total/10;
     System.out.println("averge is"+ average);
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="for loop">
    /*
     //for loop
     public static void  main(String[] arg) {
     for (int counter = 1; counter <= 10; counter+=3) { //increment by 3
     System.out.println(counter);
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="compund interest">
    /*
     //compound interest
     public static void main(String[] arg){
     // A=p(1+r)^n; interest formula
     double amount;
     double principal =10000;
     double rate= .02;
     for(int day=1;day<=30;day++){
     amount= principal*Math.pow(1+rate, day);
     System.out.println( day + "  " + amount);
     }      
     }  
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="do while loop">
    /*
     //do while loop when the do condition is true excute the while body
     public static void main(String[] arg){
     int counter =0;
     do{
     System.out.println(counter);
     counter++;
     } while(counter<=10);
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="maths class">
    /*
     //math class 
     public static void main(String[] arg){
     System.out.println(Math.abs(-165)); //absolute value
     System.out.println(Math.ceil(7.4));//rounding of number into upper value
     System.out.println(Math.floor(7.8));//rounding of number into down value
     System.out.println(Math.max(40.359,83.4039));// maximum value
     System.out.println(Math.pow(5, 3));// power 
     System.out.println(Math.sqrt(9));//Squre root
     System.out.println(Math.log(100));
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="random number generator">
    /*
     //random number generator
     public static void main(String[] arg) {
     Random rice = new Random();
     int number;
     for (int counter = 1; counter <= 10; counter++) {
     number =1+ rice.nextInt(6);
     System.out.println(number + "");
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Array">
/*    
     public static void main(String[] arg){ 
     int behabtu[] = new int[10];
     int big[]={8748,6400,43,100,20192,563,292}; //array intailizer
     behabtu[0]=6400;
     behabtu[1]=5923;
     behabtu[2]=3000;
     behabtu[3]=2000;
     behabtu[4]=500;
     behabtu[5]=1500;
     behabtu[6]=600;
     System.out.println(behabtu[0]);
     System.out.println(big[0]);
     //creating an array table
     System.out.println("index\tvalue");
     int big[]={874,640,43,100,292,563,292};
     for(int i=0;i<big.length;i++){
     System.out.println(i +"\t" + big[i]);
     }
     }  
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="summing  element array">
    /*
     public static void main(String[] arg) {
     int big[] = {32, 42, 43, 55, 345, 55, 6, 77, 0};
     int sum = 0;
     for (int count = 0; count < big.length; count++) {
     sum+=big[count];
     }
     System.out.println("the sum is " +sum); 
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="array element as counter">
    /*
     public static void main(String[] arg) {
     Random rand = new Random();
     int freq[] = new int[7];// an array 7 element
     for (int roll = 0; roll < 1000; roll++) {
     ++freq[1 + rand.nextInt(6)];//generate a random number 0-5
     }
     System.out.println("Face\tFrequency");//header
     for (int face = 1; face < freq.length; face++) { // basic table and the face is an index
     System.out.println(face + "\t" + freq[face]);
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collaped" desc="enhanced for loop">
/*
     public static void main(String[] arg){
     int big[] ={3,4,5,6,7};  
     int total=0;
     for(int x:big){
     total+=x;
     }
     System.out.println(total); 
     }
     */
 //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="array in method">
    /*
     public static void main(String[] arg) {
     int big[] = {3, 4, 5, 6, 7};
     change(big);
     for(int y:big){
     System.out.println(y);
     }
     }
     public static void change(int x[]) {
     for (int counter = 0; counter < x.length; counter++) {
     x[counter]+=5;
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="mutliDaimational Array">
    /*
     public static void main(String[] arg) {
     int firstarray[][] = {{3, 4, 5, 6, 7}, {11, 22, 33, 44, 55, 66}}; // row and column
     int secondarray[][] = {{33, 34, 35, 36, 37}, {44}, {322, 334, 555}};
     System.out.println("1st array ");
     display(firstarray);
     System.out.println("2nd Array");
     display(secondarray);
     }
     public static void display(int x[][]) {
     for (int row = 0; row < x.length; row++) {
     for (int column = 0; column < x[row].length; column++) {
     System.out.print(x[row][column] + "\t");
     }
     System.out.println();
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Variables Length Arguments">
    /*
     public static void main(String[] args){
     System.out.println(avarage(39,45,66,78,234,667,87,34)); 
     }
     public static int avarage(int...numbers){ //here ... means we do know how many values ve use
     int total=0;
     for(int x:numbers)
     total+=x;   
     return total/numbers.length;
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="mutliDaimational Array">
    /*
     public static void main(String[] args) {
     big bigobject = new big();
     System.out.println(bigobject.tomilitary());
     System.out.println(bigobject.tostring());
     bigobject.settime(14, 35, 6);
     System.out.println(bigobject.tostring());
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Public,private and this variables">
    /*
     public static void main(String[] args) {
     // private means a variable access in the same class
     big bigobject = new big();
     //System.out.println(bigobject.tomilitary());
     //System.out.println(bigobject.tostring());
     bigobject.settime(14, 35, 6);
     System.out.println(bigobject.tostring());
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="mulitple constractor/overloaded constractor">
    /*
     public static void main(String[] args) {
     //constructor is a method with the same name with the class  
       
     big bigobject = new big();
     big bigobject1 = new big(4);
     big bigobject2 = new big(3, 37);
     big bigobject3 = new big(18, 7, 54);
     System.out.printf("%s\n", bigobject.toMilitary());
     System.out.printf("%s\n", bigobject1.toMilitary());
     System.out.printf("%s\n", bigobject2.toMilitary());
     System.out.printf("%s\n", bigobject3.toMilitary());
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="toString method">
    /*
     public static void main(String[] args) {
     behabtu habitishobject = new behabtu(07, 01, 2018);
     big bigobject = new big("habitish", habitishobject);
     System.out.println(bigobject);
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Enumeration">
    /*
     public static void main(String[] args) {
     for (big people : big.values()) //creating an array
     {
     System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
     }
     System.out.println("\nAnd now for the range of constants!!!\n");
     for (big people : EnumSet.range(big.tarik, big.sintu)) {
     System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Static Members">
    /*
     // static variable share among all obeject 
     //it is not change object to obeject
     public static void main(String[] args) {
     big members1 = new big("bekele","kebede");
     big members2 = new big("telecom","kilil");
     big members3 = new big("fikir","mazengiya");
     System.out.println();
     System.out.println(members1.getFirst());
     System.out.println(members1.getlast());
     System.out.println(members1.getMembers());
     System.out.println(big.getMembers()); 
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="final">
//final variable is not changed all over the method
    /*
     public static void main(String[] args) {
     big bigobject = new big(10);
     for (int i = 0; i < 5; i++) {
     bigobject.add();
     System.out.printf("%s", bigobject);
     }
     }
     */
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Array">
//    public static void main(String[] args) {
//        double[] myList = {1.9, 2.9, 3.4, 3.5};
//        int[] arr = {10, 20, 30, 40};
//        System.out.println("Element at 4th place" + arr[2]);
//        // Print all the array elements
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i] + " ");
//        }
//        // Summing all elements
//        double total = 0;
//        for (int i = 0; i < myList.length; i++) {
//            total += myList[i];
//        }
//        System.out.println("Total is " + total);
//        // Finding the largest element
//        double max = myList[0];
//        for (int i = 1; i < myList.length; i++) {
//            if (myList[i] > max) {
//                max = myList[i];
//            }
//        }
//        System.out.println("Max is " + max);
//    }
    /*
     public static void main(String[] args) {
     int arr[] = {10, 20, 30};
     for (int i = 0; i < arr.length; i++) {
     System.out.println(arr[i]);
     //            int[] a = new int;//Invalid`
     int[] a = new int[5];//Valid
     }
     }
     */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="inheritance">
    /*
     public static void main(String[] args) {
     behabtu bg = new behabtu();
     big big = new big();
     bg.eat();
     big.eat();
     }
     */

    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="GUI">
//    public static void main(String[] args) {
//        String fn = JOptionPane.showInputDialog("Inter First Number");
//        String sn = JOptionPane.showInputDialog("Inter second Number");
//        int num1 = Integer.parseInt(fn);
//        int num2 = Integer.parseInt(sn);
//        int sum = num1 + num2;
//        JOptionPane.showMessageDialog(null, "the summ is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
//        System.out.println("sum is " + sum);
//    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="GUI with JFrame">
//
//    public static void main(String[] args) {
//        big begiobject = new big();
//        begiobject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        begiobject.setSize(275, 180);
//        begiobject.setVisible(true);
//        
//    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Event Handling">
    //event handling is user any thing he want to do like nouse moving, click button ,press enter
    /*
     public static void main(String[] args) {
     big behabtu = new big();
     behabtu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     behabtu.setSize(350, 100);
     behabtu.setVisible(true);
     }
     */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Polymorphism">
     /*
     public static void main(String[] args) {  
     // book habtish = new behabtu(); // habtish is  reference variable objects
     //big begizew = new big();
     book baya[] = new book[2];// one use of Polymorphism is to use Polymorphism array
     baya[0] = new behabtu();
     baya[1] = new big();
     for (int x = 0; x < 2; ++x) {
     baya[x].reading();
     }
     */
    /*
     holayBooks objectholay = new holayBooks();
     book bok = new book();
     book bo = new behabtu();
     objectholay.readholay(bok);
     objectholay.readholay(bo);
     }

     }
     */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Class to Hold Objects">
    public static void main(String[] args) {
        /*
         DogLst dlist = new DogLst();
         Dog a = new Dog();
         dlist.add(a);
         */
        // Array Holding many Objects
        /*
         AnimalList animlist = new AnimalList();
         Dog dg = new Dog();
         Fish fs = new Fish();
         animlist.add(dg);
         animlist.add(fs);
         */
        //simple Polymorphism over animal , dog and fish class
        Animal[] animallist = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();
        animallist[0] = d;
        animallist[1] = f;
        for (Animal x : animallist) {
            x.noise();
        }
    }
//</editor-fold>
}

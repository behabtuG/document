/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;
//<editor-fold defualtstate="colaspe" desc="Import">

import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//</editor-fold>
//public class big {
//<editor-fold defaultstate="collapsed" desc="mulitiple class">
//muliple class 
// public void simplemessage(){
// System.out.println("this is mulitple class");
// }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="method with parameter">
/*
 //use method with parameter 
 public void simpleMessage(String name) {
 System.out.println("hello " + name);
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="many methods">
/*
 //many methods and instance
 //instance variables
 private String grilName;

 public void setName(String name) {
 grilName = name;
 }he 
 private String grilName;
 public String getName(String name){
 return grilName;
 }
 public void saying(){
 System.out.printf("your frist gf was %s", getName(grilName));
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="mutliDaimational Array">
/*
 //constrator is cless name is the same at the method name
 private String grilName;
 public  big(String name){
 grilName=name; //constractor object
         
 }
 public String getName() {
 return grilName;
 }

 public void setName(String grilName) {
 this.grilName = grilName;
 }
 public void saying(){
 System.out.printf("your frist gf was %s\n", getName());
 } 
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="time class">
/*
 //military time 
 private int hour;
 private int minute;
 private int second;
 public void settime(int h, int m, int s) {
 hour = ((h > 0 && h < 24) ? h : 0);
 minute = ((m > 0 && m < 60) ? m : 0);
 second = ((s > 0 && s < 60) ? s : 0);
 }
 public String tomilitary() {
 return String.format("%02d:%02d:%02d", hour, minute, second);
 }
 //regular time
 public String tostring() {
 return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "Am" : "PM"));
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="private public and this">
/*
 private int hour = 1;//local varialbe ouside a method
 private int minute = 2;
 private int second = 3;

 public void settime(int hour, int minute, int second) {
 this.hour =4; //local varialbe inside a method
 this.minute=5;
 this.second=6;
 }
 */
//</editor-fold>
/*
 //<editor-fold defaultstate="collapsed" desc="mulitiple constructor/overloaded constructor">
 private int hour;
 private int minute;
 private int second;

 public big() { //constructor non argument
 this(0, 0, 0);
 }

 public big(int h) {//construcor 1 argument
 this(h, 0, 0);
 }

 public big(int h, int m) {//constructor two argument
 this(h, m, 0);
 }

 public big(int h, int m, int s) {//constructor three argument
 setTime(h, m, s);
 }

 public void setTime(int h, int m, int s) {
 setHour(h);
 setMinute(m);
 setSecond(s);
 }

 public int getHour() {
 return hour;
 }

 public void setHour(int h) {
 hour = ((h >= 0 && h < 24) ? h : 0);
 }

 public int getMinute() {
 return minute;
 }

 public void setMinute(int m) {
 minute = ((m >= 0 && m < 60) ? m : 60);
 }

 public int getSecond() {
 return second;
 }

 public void setSecond(int s) {
 second = ((s >= 0 && s < 60) ? s : 0);
 }

 public String toMilitary() {
 return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="composition">//composition is a class references i anthor class instade of object and varialble
/*
 private String name;
 private behabtu brithday; //reference to anthor class 

 public big(String thename, behabtu theday) {
 name = thename;
 brithday = theday;
 }

 public String toString() {
 return String.format("my name is %s, my brithday is %s ", name, brithday);
 }
 */
//}
//*/
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Enumeration">
/*
 public enum big {
 behabtu("handsum", "05"),//obeject
 tarik("minded", "23"),
 etu("muslim", "30"),
 sintu("bigass", "28"),
 selam("emiso", "29");
 private final String desc;
 private final String year;

 big(String descirption, String brithday) { //constractor
 desc = descirption;
 year = brithday;
 }

 public String getDesc() {
 return desc;
 }

 public String getYear() {
 return year;
 }
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="more on static">
/*
 public class big {

 private String first;
 private String last;
 private static int members = 0;

 public big(String fn, String ln) {
 first = fn;
 last = ln;
 members++;
 System.out.printf("constractor for %s %s,member in the club:%d\n ", first, last, members);
 }

 public String getFirst() {
 return first;
 }

 public String getlast() {
 return last;
 }
 public static int getMembers(){
 return members;
 }
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="final">
/*
 public class big {

 private int sum;
 private final int NUMBER;

 public big(int x) {
 NUMBER = x;
 }

 public void add() {
 sum += NUMBER;
 }

 public String toString() {
 return String.format("sum = %d\n", sum);
 }
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="GUI with JFrame">
//public class big extends JFrame {
//
//    private JLabel item1;
//    public big() {
//        super("The Title Bar");
//        setLayout(new FlowLayout());
//
//        item1 = new JLabel("this is sentance");
//        item1.setToolTipText("this is hover");
//        add(item1);
//
//    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Event Handling">
//event handling is user any thing he want to do like nouse moving, click button ,press enter
//inorder to handle event in java was need an event handling class in java
//that class needs the impliments actionListner
/*
 private final JTextField item1;
 private final JTextField item2;
 private JTextField item3;
 private final JPasswordField PasswordField;

 public big() {
 super("The Title");
 setLayout(new FlowLayout());
 item1 = new JTextField(10);
 add(item1);
 item2 = new JTextField("enter text here");
 add(item2);
 item3 = new JTextField("uneditable", 20);
 item3.setEditable(false);
 add(item3);
 PasswordField = new JPasswordField("mypass");
 add(PasswordField);
 thehandler handler = new thehandler();
 item1.addActionListener(handler);
 item2.addActionListener(handler);
 item3.addActionListener(handler);
 PasswordField.addActionListener(handler);

 }
 //a class inside another class is help us to the class inside a class 
 // inherits all the crap that outside the class 
 // build the ActionListener oject
 private class thehandler implements ActionListener {

 public void actionPerformed(ActionEvent event) {//handling the event
 String string = "";
 if (event.getSource() == item1) {
 string = String.format("field 1: %s", event.getActionCommand());
 } else if (event.getSource() == item2) {
 string = String.format("field 2: %s", event.getActionCommand());
 } else if (event.getSource() == item3) {
 string = String.format("field 3: %s", event.getActionCommand());
 } else if (event.getSource() == PasswordField) {
 string = String.format("password field is: %s", event.getActionCommand());
 }
 JOptionPane.showMessageDialog(null, string);
 }
 }
 */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Polymorphism">

public class big extends book {

    public void reading() {
        System.out.println("bg reading make perfect");
    }
//</editor-fold>
}

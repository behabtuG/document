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
//<editor-fold defaultstate="collapsed" desc="Class to Hold Objects">
public class DogLst {

    private Dog[] theList = new Dog[5];
    private int i = 0;

    public void add(Dog d) {
        if (i < theList.length) {
            theList[i] = d;
            System.out.println("Dog added at index " + i);
            i++;
        }
    }
}
//</editor-fold>

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
//<editor-fold defaultstate="collapsed" desc="Array  Holdding Many Objects">
public class AnimalList {

    private Animal[] animlist = new Animal[5];
    private int i = 0;

    public void add(Animal anim) {
        if (i < animlist.length) {
            animlist[i] = anim;
            System.out.println("Animal added at index " + i);
            i++;
        }
    }
}
//</editor-fold>

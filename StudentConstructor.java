/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap9.pkg7;

/**
 *
 * @author Administrator
 */
public class StudentConstructor {
    int id;
    String name;
    void display(){System.out.println(id+" "+name);}
    public static void main(String[] args) {
        StudentConstructor s1=new StudentConstructor();
        StudentConstructor s2=new StudentConstructor();
        s1.display();
    }
}

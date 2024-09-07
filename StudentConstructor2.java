
package baitap9.pkg7;

/**
 *
 * @author Administrator
 */
public class StudentConstructor2 {
    int id;
    String name;
    
    StudentConstructor2(int i,String n){
        id=i;
        name=n;
    }
    void display(){System.out.println(id+" "+name);}
    public static void main(String[] args) {
        StudentConstructor2 s1=new StudentConstructor2(111,"Karan");
        StudentConstructor2 s2=new StudentConstructor2(222,"hahdk");
        s1.display();
        s2.display();
    }
}



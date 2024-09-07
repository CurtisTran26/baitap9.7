
package baitap9.pkg7;

/**
 *
 * @author Administrator
 */
public class StudentConstructor3 {
    int id;
    String name;
    int age;
    StudentConstructor3(int i,String n){
        id=i;
        name=n;
    }
    StudentConstructor3(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}
    public static void main(String[] args) {
        StudentConstructor3 s1=new StudentConstructor3(111,"Karan");
        StudentConstructor3 s2=new StudentConstructor3(222,"hahdk",25);
        s1.display();
        s2.display();
    }
}



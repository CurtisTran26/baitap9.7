
package baitap9.pkg7;

/**
 *
 * @author Administrator
 */
public class caculation6 {
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b methos invoked");}
    public static void main(String[] args) {
        caculation6 obj=new caculation6();
        obj.sum(20, 20);//nơ ambiguity
    }
}


package baitap9.pkg7;

/**
 *
 * @author Administrator
 */
public class caculation5 {
    void sum(int a,long b){System.out.println("int arg methos invoked");}
    void sum(int a,int b,int c){System.out.println("long arg methos invoked");}
    public static void main(String[] args) {
        caculation5 obj=new caculation5();
        obj.sum(20, 20,90);
    }
}

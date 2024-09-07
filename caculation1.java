
package baitap9.pkg7;

/**
 *
 * @author Administrator
 */
public class caculation1 {
    void sum(int a,int b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}
    public static void main(String[] args) {
        caculation1 obj=new caculation1();
        obj.sum(10, 10);
        obj.sum(20, 20, 20);
    }
}

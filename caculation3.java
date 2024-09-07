
package baitap9.pkg7;

public class caculation3 {
    int sum(int a,int b){return a+b;}
    double sum(double a,double b){return a+b;}
    public static void main(String[] args) {
        caculation3 obj=new caculation3();
        int result=obj.sum(20, 20);
        System.out.println("sum="+result);
    }
}

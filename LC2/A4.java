//Design an algorithm which accepts a binary representation of a number and 
//then displays its corresponding decimal equivalent.
import java.util.Scanner;
class a4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        int temp=0;
        //int count=0;
        /*while(a>0){
            temp=a%10;
            count++;
            a=a/10;
        }*/
        double max=0;
       double ad=0;
       // System.out.println(count);
        String str=Integer.toString(t);
        int count=str.length()-1;
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            double v=arr[i]-'0';
            max=v*Math.pow(2,count);
            ad=ad+max;
            count--;
        }
         System.out.println(ad);
    }
}
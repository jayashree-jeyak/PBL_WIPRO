//Activity 1:
 //Design an algorithm to accept a string from the user. Reverse the string and display it.
 import java.util.Scanner;
 class a1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
 }
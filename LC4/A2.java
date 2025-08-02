/* Design an algorithm to accept a string from the user. Replace all vowels (‘a’, ‘e’, ‘i’, ‘o’, ‘u’) with ‘z’.
 If there are no vowels in the string, just print the original word with the message: “No vowels present”.
*/
import java.util.Scanner;
class a2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                ch='z';
            }
            rev=rev+ch;
        }
        System.out.println(rev);
    }
}
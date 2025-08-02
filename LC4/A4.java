/*Activity 4:
 Design an algorithm to accept a string from the user. Count and print the number of times each character occurs in the given string.
 Example:
csharp
CopyEdit
Input string = “malayalam”  
Output must be –  
m – 2  
a – 4  
l – 2  
y – 1
*/
import java.util.Scanner;
class a4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int[] arr=new int[150];
        for(int i=0;i<str.length();i++){
            char c=ch[i];
            arr[c]++;
            
        }
        for(int i=0;i<256;i++){
            if(arr[i]>0){
                System.out.println((char)i+ "---->"+ arr[i]);
            }
        }


    }
}
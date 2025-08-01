/*Activity 5:
 Modify the algorithm written in Activity 4 in order to get the count of students in
  specific ranges of marks as defined below:
Range of marks:
0 to 10%
11% to 20%
...
91% to 100%
*/
import java.util.Scanner;
class a5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[20];
        for (int i = 0; i < 10; i++) {
         int mark=sc.nextInt();
         if(mark<0||mark>100){
            System.out.println("invalid");
            i--;
         }   
         else{
             arr[i]++;
         }
        }
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=90 && arr[i]<=100){
                count1++;
            }
            if(arr[i]>=80 && arr[i]<90){
                count2++;
            }
            if(arr[i]>=70 && arr[i]<80){
                count3++;
            }
        }
        System.out.println(count1);
         System.out.println(count2);
          System.out.println(count3);



    }
}


/*Activity 4:
 Design an algorithm which accepts a set of N (consider N to be 30) student’s 
 examination marks (in the range of 0 to 100). Then make a count of the number of 
 students that obtain each possible mark (i.e.,
 count of how many students scored 0, count of how many students scored 1,
  … till count of how many students scored 100).
  */
 import java.util.Scanner;
 class a4{
    public static void main(String[] args) {
        int[] arr=new int[101];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<30;i++){
           int n=sc.nextInt();
        if(n<0 ||n>100){
            System.out.println("invalid");
            i--;
        }
        else{
            arr[n]++;
        }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(i+"---->"+arr[i]);
            }
        }
    }
 }

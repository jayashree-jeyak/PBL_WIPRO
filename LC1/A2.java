//Given a set of 3 student's examination marks (in the range from 0 to 100), make a count of the number of students
 //that have passed the exam. A pass is awarded if the student’s mark is greater than or equal to 35.
 class a2{
    public static void main(String[] args) {
        int[] arr={45,65,31};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=35){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
    }
 }
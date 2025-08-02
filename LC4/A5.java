/*Activity 5:
 Design an algorithm which accepts 2 strings from the user and performs the following operation:
 Concatenate both strings, but reverse the second string before appending it.
 Example:
makefile
CopyEdit
string1 = “Hello”  
string2 = “World”  
string3 must be “HellodlroW”
*/
class a5{
    public static void main(String[] args) {
        String str1="hello";
        String str2="world";
        String rev="";
        String fin="";
        for(int i=str2.length()-1;i>=0;i--){
            rev=rev+str2.charAt(i);
        }
        fin=str1+rev;
        System.out.println(fin);
    }
}
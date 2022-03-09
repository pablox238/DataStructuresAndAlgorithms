package data_strucutres.arrays;

public class ReverseString{
     
    public static String reverse(String str){
        char[] reverseNameArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            reverseNameArray[i] = str.charAt(str.length()-1-i);
        }
        return String.valueOf(reverseNameArray);
    }
    public static void main(String[] args) {
        System.out.println(reverse("Juan P"));
        
    }
}
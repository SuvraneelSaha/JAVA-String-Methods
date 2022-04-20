package Indexof;
// https://www.w3schools.com/java/java_ref_string.asp
public class Indexof {
    // learning about indexof method in java

        public static void main(String[] args)
        {
            String myStr = "Hello planet earth, you are a great planet.";
            System.out.println(myStr.indexOf("planet"));
            String Str = "Hello planet earth, you are a great planet.";
            System.out.println(Str.indexOf("H"));
            String Str1 = "Hello planet earth, you are a great planet.";
            System.out.println(Str1.indexOf("y"));
            String Str2 = "Hello planet earth, you are a great planet.";
            System.out.println(Str2.indexOf("planet",12));
           
        }



}

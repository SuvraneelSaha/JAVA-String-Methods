package Indexof;

import java.util.Scanner;

// https://leetcode.com/problems/remove-duplicate-letters/

// can't do the leetcode one as it has stack involved
// so did the gfg one and the w3 resource onw was also same
// but in the case of the leetcode one it was a stack problem

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the string");
        String str = in.nextLine();
        System.out.println("original String "+str);
        System.out.println(removeDuplicateLetters(str));


    }
    static String removeDuplicateLetters(String s)
    {
        String str = "";// empty string
        // or we could use
        //String str = new String();
        for (int i = 0; i <s.length() ; i++)
        {
            char c = s.charAt(i);
            if(str.indexOf(c) ==-1)
            {
                str = str + c;

            }
        }


        return str;
    }
    // not needed

    static String reverse(String str)
    {
        char[] ch=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev = rev + ch[i];
        }
        return rev;
    }

}

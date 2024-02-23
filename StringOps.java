public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
     String myWord= "    Hello World";
     System.out.println(capVowelsLowRest(myWord));
     System.out.println(camelCase(myWord));
     System.out.println(lowerCase(myWord));
     System.out.println(checksSpaces(myWord));
     System.out.println(camelCase(myWord));
    }

  
    public static String capVowelsLowRest (String string) 
    {
        String answerFinal =  lowerCase(string); //function i wrote in HW 3 that puts everything in lowercase
        String toBePrinted = "";

        for (int i=0; i < answerFinal.length(); i++) 
        {
            char ch = answerFinal.charAt(i);

            if ((ch == 'i' ) || (ch == 'o' ) || ( ch == 'a' ) || ( ch == 'u' ) || ( ch == 'e' )) 
            {
            toBePrinted = toBePrinted + (char)(answerFinal.charAt(i) - 32);   
            }
            else 
            {
            toBePrinted = toBePrinted + ch;
            }
        }
        return toBePrinted;
    }

    public static String lowerCase(String string) 
    {
        String conversToLowerCase = "";

        for (int i=0; i<string.length(); i++) 
        {
            char isUpperCase = string.charAt(i);
            
            if ((isUpperCase>= 'A') && (isUpperCase<='Z'))         
            {
            conversToLowerCase = conversToLowerCase + (char)(string.charAt(i) + 32); 
            }

            else
            {
                conversToLowerCase = conversToLowerCase + isUpperCase;
            }

        }
        return conversToLowerCase;
    }
//want to write the same function but that will work even if i have spaces at the start of the expression:

    public static int checksSpaces (String string) {
        
        int i = 0;
        while (i < string.length()) //0<15
        {
        char ch = string.charAt(i);//ch = char.At(0)
            if (ch == 32)
            {
            i++;
            }
            else 
            {
            return i;
            }
        }
        return i;
}
   
// public static String camelCase (String string) 
// {
//     String ans = "";
//     String inLowerCase = lowerCase(string);

//     int i = 0;
//     while (i < inLowerCase.length())
//     {
//     char ch = inLowerCase.charAt(i);
//         if (ch == ' ') 
//             {
//             ans = ans + ch + (char) (inLowerCase.charAt(i + 1) - 32);
//             i++;
//             }
//         else 
//             {
//             ans = ans + ch;
//             }
//         i++;
//     }
//     String finalAnswer = "";
//     for (int j=0; j<ans.length(); j++)
//     {  
//         char ch = ans.charAt(j);
//         if (ch != ' ')
//          {
//         finalAnswer = finalAnswer + ch;
//          }

//     }
//     return finalAnswer;
// }





public static String camelCase (String string) 
    {
        String ans = "";
        String inLowerCase = lowerCase(string);
        String withoutSpaces = inLowerCase.substring(checksSpaces(string)); // word without spaces at first
        int i = 0;
        while (i < withoutSpaces.length())
        {
        char ch = withoutSpaces.charAt(i);
            if (ch == ' ') 
                {
                ans = ans + ch + (char) (withoutSpaces.charAt(i + 1) - 32);
                i++;
                }
            else 
                {
                ans = ans + ch;
                }
            i++;
        }
        String finalAnswer = "";
        for (int j=0; j<ans.length(); j++)
        {  
            char ch = ans.charAt(j);
            if (ch != ' ')
             {
            finalAnswer = finalAnswer + ch;
             }

        }
        return finalAnswer;
    }



    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}

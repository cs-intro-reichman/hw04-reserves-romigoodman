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
     String myWord= "Hello World";
     System.out.println(capVowelsLowRest(myWord));
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

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}

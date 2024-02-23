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
     String myWord= "Hello world";
     char myChar = 'l';
     System.out.println(capVowelsLowRest(myWord));
     System.out.println(lowerCase(myWord));
     System.out.println(checksSpacesBegining(myWord));
     System.out.println(camelCase(myWord));
     for (int i=0; i<myWord.length();i++)
     {
       System.out.print(allIndexOf(myWord, myChar)[i] + " "); 
     }

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


public static int checksSpacesBegining (String string) {
        
        int i = 0;
        while (i < string.length()) 
        {
        char ch = string.charAt(i);
            if(ch == 32)
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
   


public static String camelCase (String string) 
    {
        String ans = "";
        String inLowerCase = lowerCase(string); 
        String withoutSpaces = inLowerCase.substring(checksSpacesBegining(string)); //string without space at the beggining: //two   words

        for (int i=0; i <= withoutSpaces.length()-1; i++) 
        {
        char ch = withoutSpaces.charAt(i); 
            if ((ch == ' ') && (withoutSpaces.charAt(i+1) == ' '))
            {
                ans = ans + ch; 
            }
            else if ((ch == ' ') && (withoutSpaces.charAt(i+1) != ' '))
            {
                ans = ans + ch + ((char)((withoutSpaces.charAt(i+1)) - 32)); //how can i make sure that once i gets to that char it wont print it again 
            }
            else if ((i!=0) && ((ch != ' ') && (withoutSpaces.charAt(i-1) == ' ')))
            {
                ans = ans+"";
            }
            else 
            {
            ans = ans + ch; 
            }

        }
        String finalAnswer = "";
        for (int j=0; j<ans.length(); j++)
        {  
            char ch = ans.charAt(j);
            if (ch != 32)
             {
            finalAnswer = finalAnswer + ch;
             }

        }
        return finalAnswer;
    } 


    
    public static int[] allIndexOf (String string, char chr) {
        
        String toCheck= lowerCase(string);
        int counter = 0;
        int j=0;

        if ((chr>= 'A') && (chr<='Z'))         
            {
            chr = (char)(chr + 32); 
            }
        int[] arrayOfIndexes= new int[string.length()];
        for (int i=0; i<toCheck.length(); i++)
            {
                if (toCheck.charAt(i) == chr )
                {
                arrayOfIndexes[j]=i;
                j++;
                }    
            }
        for (int i=0; i<arrayOfIndexes.length; i++)
        {
            if (arrayOfIndexes[i]!=0)
            {
            counter++;
            }
        }
        int [] newArray = new int [counter];
        for (int i=0; i<(counter); i++)
            {
            newArray[i]=arrayOfIndexes[i];

        }
        return newArray;
    }
}

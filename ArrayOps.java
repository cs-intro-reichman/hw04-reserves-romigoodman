public class ArrayOps {
    //This class offers some functions for processing arrays

    public static void main(String[] args) {
    int[] myArray1 = {1, 2, 3};
    int[] myArray2 ={4, 5, 6};
    System.out.println(findMissingInt(myArray1)); 
    System.out.println(secondMaxValue(myArray1));
    System.out.println(containsTheSameElements(myArray1, myArray2));
    System.out.println(isSorted(myArray1));
    }

    public static int findMissingInt (int [] array) 
    {
        int maxValue = array.length; 
        int supposedToBe = (maxValue*(maxValue+1)/2);
        int  currentSum = 0;
             for (int i = array.length-1; i >=0; i--)
            { currentSum = currentSum + array[i]; }
        int missingInt = supposedToBe - currentSum;
            return missingInt;  
    }

       
        public static int countsOccurance (int[] array) 
        {
            int occuranceOfMax = 0; 
            for (int i = 0; i < array.length; i++) {
                if (array[i]==maxValue(array))
                occuranceOfMax++; } 
                return occuranceOfMax; 
        }
                    

        public static int maxValue (int[] array) 
        {
            int maxValue = array[0]; 
		    for (int i = 0; i < array.length; i++) {
		    	if (array[i] > maxValue) 
                {  maxValue = array[i];  } }
            return maxValue;  
        }

        public static int secondMaxValue(int [] array) 
        {
        int maxMax = maxValue(array);
        int occuranceOfMax = countsOccurance(array);
        int secoundMax = 0;
        for (int i = 0; i < array.length; i++) {
        if (occuranceOfMax>1) 
        {
        secoundMax = maxMax;
        }
        else if (array[i] > secoundMax && array[i]!= maxMax) 
                { 
                secoundMax = array[i]; 
                }
         }
         return secoundMax;
        }
               

    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        boolean sameElement=false;

        // Check if all elements of array1 are present in array2
        for (int i = 0; i < array1.length; i++) {
            sameElement = false; // Reset sameElement for each element in array1
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    sameElement = true;
                    break; // Exit loop once the element is found
                }
            }
            if (sameElement==false) {
                return sameElement; // Return false if an element in array1 is not found in array2
            }
        }
    
        // Check if all elements of array2 are present in array1
        for (int i = 0; i < array2.length; i++) {
            sameElement = false; // Reset sameElement for each element in array2
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    sameElement = true;
                    break; // Exit loop once the element is found
                }
            }
            if (sameElement==false) {
                return sameElement; // Return false if an element in array2 is not found in array1
            }
        }
        return sameElement;
    }
    

    public static boolean isSorted(int [] array) 
    { 
        boolean isSorted = false;
        if (array[0]>array[1])
       {
        isSorted = true;
       }

        if (isSorted==true)
        {
            for (int i=0; i < array.length-2; i++)
            {
               if (array[i] > array[i+1])
               {
                isSorted =!isSorted;
               }

               else 
               {
                return false;
               }
            }

            if (array[array.length-2] > array[array.length-1])
            return isSorted=true;

        }
        else 
        {
            for (int j=0; j<array.length-2;j++)
            {
               if (array[j] < array[j+1])
               {
                isSorted =!isSorted;
               }

               else 
               {
                return false;
               }
            }

        if (array[(array.length-2)] < array[(array.length-1)])
            return isSorted=true;
        }  
         return isSorted;
    }
}
    


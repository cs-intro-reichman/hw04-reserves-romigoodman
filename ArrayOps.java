public class ArrayOps {
    //This class offers some functions for processing arrays

    public static void main(String[] args) {
    int[] myArray1 = {-4, 3, 5, 7};
    int[] myArray2 ={1, 2, 2, 1};
    System.out.println(findMissingInt(myArray1)); 
    System.out.println(secondMaxValue(myArray1));
    System.out.println(containsTheSameElements(myArray1, myArray2));
    System.out.println(isSorted(myArray1));
    }

    public static int findMissingInt (int [] array) {
        //main idea: get max value; get length thus knowing how many consecutive numbers there are; calcule sum that's supposed to be with the missing int;calculte current sum;find the difference = missing int
        int maxValue = array.length; 
        int supposedToBe = (maxValue*(maxValue+1)/2);
        int  currentSum = 0;
             for (int i = array.length-1; i >=0; i--)
            { currentSum = currentSum + array[i]; }
        int missingInt = supposedToBe - currentSum;
            return missingInt;  }

       
        public static int countsOccurance (int[] array) {
            int occuranceOfMax = 0; 
            for (int i = 0; i < array.length; i++) {
                if (array[i]==maxValue(array))
                occuranceOfMax++; } 
                return occuranceOfMax; }
                    

        public static int maxValue (int[] array) {
        int maxValue = array[0]; 
		    for (int i = 0; i < array.length; i++) {
		    	if (array[i] > maxValue) 
                {  maxValue = array[i];  } }
            return maxValue;  }

        public static int secondMaxValue(int [] array) {
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
        
        public static int countsOccuranceGeneral (int[] array) {
            int [] occuranceOfNum = new int[array.length]; 
            for (int i = 0; i < array.length; i++) {
                for (int j=1; j<array.length; j++){
                  if (array[i]==array[j]) {
                   occuranceOfNum[i]++; 
                  }  
                }
             } 
                return -1; }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean sameElement = false;
        for (int i = 0; i < array1.length; i++)
         {
			for (int j = 0; j < array2.length; j++)
             {
				if (array1[i] == array2[j]) 
                { sameElement = true; }  
            }
            if (sameElement==false)  
            {
            return false;
            }
           
            else 
            {
             sameElement = false;   
            }
        }
        int j1=0,k=0;

       	for ( j1 = 0; j1 < array2.length; j1++) 
         {
            for ( k = 0; k < array1.length; k++)
             
             {
				if (array1[k] == array2[j1]) 
                { sameElement = true; }  
            }
            if (sameElement==false)  
            {
            return false;
            }
           else if (j1==(array2.length-1)&&(k==array1.length-1))
            {
                
                return true;
            }
            else 
            {
            sameElement = false;   
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
            for (int i=0; i<array.length-2;i++)
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


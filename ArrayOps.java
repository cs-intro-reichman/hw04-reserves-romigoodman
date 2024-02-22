public class ArrayOps {
    //This class offers some functions for processing arrays

    public static void main(String[] args) {
    int[] myArray1 = {1, 2};
    int[] myArray2 ={1, 2, 2, 1};
    System.out.println(findMissingInt(myArray1)); 
    System.out.println(secondMaxValue(myArray1));
    System.out.println(containsTheSameElements(myArray1, myArray2));
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
        for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] == array2[j]) 
                { sameElement = true; }  
            }
            if (sameElement==false)  
            {
            return false;
            }
            else if (i==array1.length-1)
            {
            return sameElement;
            }
            else 
            {
             sameElement = false;   
            }
        }

        return sameElement;
    }
    public static boolean isSorted(int [] array) { 
        return false;
    }

}

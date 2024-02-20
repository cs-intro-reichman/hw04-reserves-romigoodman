public class ArrayOps {
    //This class offers some functions for processing arrays

    public static void main(String[] args) {
    int[] myArray1 = {0,2,3,4,5,6,7,8};
    int[] myArray2={0,1,2,3,4,5,6,7,8};
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

    public static int maxValue (int[] array) {
        int maxValue = array[0]; 
		    for (int i = 0; i < array.length; i++) {
		    	if (array[i] > maxValue) 
                {  maxValue = array[i];  } }
            return maxValue;  }

    public static int secondMaxValue(int [] array) {
    int maxMax = maxValue(array);
    int secoundMax = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] > secoundMax && array[i]< maxMax)
        {  secoundMax = array[i];  }
    } return secoundMax; }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean sameElement = false;
        for (int i = 0; i < array1.length; i++) {//0, 1, 2
			for (int j = 0; j < array1.length; j++) {//0, 2
				if (array1[i] == array2[j]) 
                { sameElement = true; }  
            }

            if (sameElement==false)  {
                return false;
            }
            sameElement = false;
        }

        return sameElement = true;
    }
    public static boolean isSorted(int [] array) {
        // int i = array length, for loop that goes over every int, 
        //and checks if array[i]>array[i-1] and array[i]<array[i+1]
        //else break
        return false;
    }

}

public class ArrayOps {
    //This class offers some functions for processing arrays

    public static void main(String[] args) {
    int[] myArray = {13,12,15,16,17};
    System.out.println(maxValue(myArray));
    System.out.println(findMissingInt(myArray)); 
    }
    
    public static int maxValue (int[] array) {
        int maxValue = array[0]; 
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
            }
    }
    return maxValue;
    }

    public static int findMissingInt (int [] array) {
        // The function returns the missing integer - but what if ints in array are larger then the length itself?
        //main idea: get max value; get length thus knowing how many consecutive numbers there are; calcule sum that's supposed to be with the missing int;calculte current sum;find the difference = missing int
        int maxValue = maxValue(array); //want to use the maximum function - how to do it? 
        int supposedToBe = (maxValue*(maxValue+1)/2);
        int  currentSum = 0;
//looking for a way to take maximum integer, take length steps backwards and then thats my first i. isnt working?
             for (int i = 0; i < array.length; i++)
            { 
                currentSum = currentSum + array[i]; 
            }

        int missingInt = supposedToBe - currentSum;

            return missingInt;
    }

    public static int secondMaxValue(int [] array) {
    int a = maxValue(array);
    return -1;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}

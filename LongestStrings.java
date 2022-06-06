// In a file called LongStrings.java, write a class called LongStrings with a method called longStrings 
// that takes an array of String and an integer n and produces a new array of Strings that are just the 
// strings in the array that have length n or greater (the returned array might be shorter than the input array). 
// Write at least 4 checkExpect tests for it to cover interesting cases. Include a screenshot or copy/paste of the tests in your document.
class LongestStrings {
    
    static void printStrings(String[] input) {
        for(String s : input) {
            System.out.println(s);
        }
    }

    static boolean isGreaterThanN(String s, int n) {
        return s.length() > n;
    }

    static int getResultLength(String[] input, int n) {
        int count = 0; // what are we using this variable for? count how many strings are greater than n in length
        for (int i = 0; i < input.length; i++) {
            if (isGreaterThanN(input[i], n)) {
                count++;
            }
        }
        return count;
    }

    //Description: Finds which inputs have a larger length by going through the array
    //Returns: String array
    static String[] longStrings(String[] input, int n) {
        // count the number of words that are greater than n in length
        int count = getResultLength(input, n);

        // use that count to create a result array to return
        String[] result = new String[count];
        
        //int index = 0;
        // add the actual strings longer than n into this new result array
        for (int i = 0; i < input.length; i++) {
            if (isGreaterThanN(input[i], n)) {
                result[i] = input[i];
                //index++;
            }
        }
        return result;
    }

    public static void main(String [] args) {
        //System.out.println(isGreaterThanN("basket", 4));
        String[] input = {"cat", "dog", "mouse", "house", "basket"};
        printStrings(longStrings(input, 4));
        // result = [ "mouse", "house", "basket" ]
        // result = [ "mouse", "house", "basket" ]
    }
}
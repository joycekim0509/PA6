class AveragePositives {
    public static boolean isPositive(double number) {
        return number > 0;
    }
    // Description: Parses the inputs from strings to doubles
    // Returns: double array
    // "5.0" "4.6" "3.2" "-2.5" <---- input
    // 5.0   4.6    3.2   -2.5  <---- output
    public static double[] parseInput(String [] arguments) {
        // TODO: Complete this method
        double[] newInputs = new double[arguments.length];
        
        // BADCODE: Don't do this, especially in the context of this problem
        //double variable = Double.parseDouble(arguments.length);

        // go through every input in the array
        for (int i = 0; i < newInputs.length; i++) {
            newInputs[i] = Double.parseDouble(arguments[i]);
        } 
        // return the double[] we created
        return newInputs;
    }

    // Description: Eliminates the negative inputs from the array by setting inputs that are less than 0
    // to 0
    // Returns: double array
    // inputs[i] inputs[i] inputs[i] inputs[i]
    // null         null    null        0       inputs
    // 5.0          4.6     3.2         -2.5    inputs
    // 5.0          4.6     3.2           0     noNegs optimal
    // null         null    null          0     noNegs currently
    public static double[] eliminateNegatives(double[] input) {
        // TODO: Complete this method
        double[] noNegs = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                noNegs[i] = 0;
                // 0 ---> noNegs
            }
            else {
                noNegs[i] = input[i];
            }
        }
        return noNegs;
    }

    // Description: If all inputs are not greater than 0 the method produces true otherwise false
    // Returns: boolean
    public static boolean isNeg(double[] input) {
        // TODO: Complete this method
        for (int i = 0; i < input.length; i++) {
            if (isPositive(input[i])) {
                return false;
            }
        }
        return true;
    }


    // Description: Getting the mean of the remaining inputs in the method
    // if all inputs are 0, they just print 0
    // Returns: nothing
    public static void getResult(double[] input, boolean isAllNegative) {
        // TODO: Complete this method
        double sum = 0;
        // check if all numbers are negative
        if (isAllNegative) {
            System.out.println(0);
        }
        else {
            int count = 0;
            for (int i = 0; i < input.length; i++) {
                sum = sum + input[i];
                // if the number is positive, we count it as part of our mean
                if (isPositive(input[i])) {
                    count++;
                }
            }
            // after adding up all the numbers, find the mean
            System.out.println(sum / count);
        }
        
    }

    // this is the code that runs when we compile and call the program "javac Program.java" "java Program"
    public static void main(String [] args) {
        // Convert strings to doubles
        // create a list of doubles to store the doubles we parse
        double[] input = parseInput(args);
                            
        // Eliminate the doubles that are less than or equal to 0
        input = eliminateNegatives(input);

        boolean isAllNegative = isNeg(input);
        // return the result
        getResult(input, isAllNegative);
    }   

}
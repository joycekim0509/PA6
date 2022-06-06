class Pair{
    int a;
    int b;

    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }

    int add () {
        return this.a + this.b;
    }
}

class PairSelect {
    // inputs = { Pair(a1, b1), Pair(a2, b2), Pair(a3, b3), ... }
    // output = { a1, a2, a3, ... }
    //Description: Goes through the array and extracts the As of each pair
    //Returns: int array
    static int[] getAs (Pair[] inputs) {
        int[] aList = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            // int   = int
            aList[i] = inputs[i].a;
        }
        return aList;
    }
    
    public static void main(String [] args) {
        Pair[] input = {new Pair(2, 5), new Pair(3,6), new Pair(2, 10)};
        int[] result = getAs(input);
        for (int i : result) {
            System.out.println(i);
        }
        System.out.println(input[0].b);
    }

}
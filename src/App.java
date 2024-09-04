public class App {
    public static void main (String[] args) throws Exception {
        Duck obj = new Duck(); // Creates the Duck.java stuff into App.java

        // Uses the array getters to put the arrays into an exact copy array
        int[] pizza2 = obj.getNumArray();
        String[] ducks2 = obj.getStringArray();


        int largestNumber = pizza2[0];
        String bestDuck = ducks2[0];
        int i = -1;
       for (int p : pizza2) {
            i += 1;
            if (p > largestNumber) { // Checks if the current pizza value is larger than the highest duck value
                largestNumber = p;
                bestDuck = ducks2[i];
            }
       }
        // Silly print command, ignore the longjevity of this.
        System.out.println("The duck with the largest amount of pizza is: " + bestDuck + " with the amount of " + largestNumber + " pizza slices!");
    }
}

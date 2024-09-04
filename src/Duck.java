public class Duck {
   private final int pizza[] = {32, 23, 54, 42, 69}; // Initializes the pizza array.
   private final String ducks[] = {"Jeff", "Gerald", "John", "Bob", "Azalea"}; // Initializes the ducks array.

    // These are just to get the arrays from this class to the App class.
    // I'm stupid so this was the best I could come up with.
    public int[] getNumArray() {
        return pizza.clone();
    }
    public String[] getStringArray() {
        return ducks.clone();
    }
}

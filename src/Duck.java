public class Duck {
   private final int pizza[] = {32, 24, 54, 42, 69};
   private final String ducks[] = {"Jeff", "Gerald", "John", "Bob", "Azalea"};


    public int[] getNumArray() {
        return pizza.clone();
    }
    public String[] getNumArray2() {
        return ducks.clone();
    }
}

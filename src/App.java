public class App {
    public static void main (String[] args) throws Exception {
        int x = 0;
        int p;
        Duck obj = new Duck();      
        int[] pizza2 = obj.getNumArray();
        String[] ducks2 = obj.getNumArray2();

        int largestnumber;
        largestnumber = pizza2[0];
        String BestDuck;
        BestDuck = ducks2[0];

        largestnumber = pizza2[0];
        p = -1;
       for (int i : pizza2) {
            p = p + 1;
            x = i;
            if (x > largestnumber) {
                largestnumber = x;
                BestDuck = ducks2[p];
            }
       }
        System.out.println("The person with the largest amount of pizza is: " + BestDuck + " with the amount of " + largestnumber + " pizza slices!");
    }
}

package Chapter7;

public class randPerm {
    public static void main(String[] args) {

        int[] oneToTen = new int[10];
        for(int i = 0; i < oneToTen.length; i++) {
            oneToTen[i] = i+1;
        }

        int[] randomArray = new int[10];
        for(int k = 0; k < randomArray.length; ) {
            // Generates a random # between 1 and 10, both included
            int x = (int)(Math.random() * 10 + 1);

            // If that slot is not -1 (see line 21)
            if (oneToTen[x-1]>0) {
                randomArray[k] = oneToTen[x-1];
                // Makes it so this array value is now unusable (assigns that slot to -1, which is < 0)
                oneToTen[x-1] = -1;
                k++;
            }
        }
        for(int k = 0; k < randomArray.length; k++) {
            System.out.println(randomArray[k]);
        }
    }
}

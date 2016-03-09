import java.util.Random;


public class ArrayRandomize {
    
    public static int [] getRandomArray() {
        Random random= new Random();
        int randArr[] = new int[30];

        for (int i = 0; i < randArr.length; i++) {
            int number = random.nextInt(100);
            randArr[i] = number;
        }
        
        return randArr;
    }
}

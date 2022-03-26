import java.util.Random;

public class MinAndMax {
    public static void main(String[] args) {
        int largest = 1, smallest = 100;
        int numbers[] = new int[10];

        Random rnd = new Random();

        for (int i=1; i< numbers.length;i++){
            int arr =  Math.round((rnd.nextInt(100)+1));
            numbers[i] = arr;
            System.out.print(arr + " , ");

            if(numbers[i] > largest) {
                largest = numbers[i];
            }
            if(numbers[i]< smallest){
                smallest = numbers[i];
            }

        }
        System.out.println("\nLargest number is: "+ largest);
        System.out.println("Smallest number is: "+ smallest);
    }
}


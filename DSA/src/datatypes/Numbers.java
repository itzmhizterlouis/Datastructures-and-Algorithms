package datatypes;


import java.util.Arrays;

public class Numbers {

    private int[] numbers;

    public Numbers(int numbers[]){
        this.numbers = numbers;
    }

    public int search(int number){

        Arrays.sort(numbers);

        int start = 0, stop = numbers.length;
        int counter = 0;

        while (true){

            if (number < numbers[(stop + start)/2]){
                stop = (start + stop)/ 2;
                counter += 1;
            }
            else if (number > numbers[(stop + start)/2]){
                start = (start + stop)/ 2;
                counter += 1;
            }
            else{
                System.out.println("Ran " + counter + " times.");
                return (stop + start)/2;
            }
        }
    }

    public int normalSearch(int number){
        for (int i = 0;i< numbers.length;i++){
            if (number == numbers[i]) {
                System.out.println("Ran " + i + " times.");
                return i;
            }
        }
        return -1;
    }
}

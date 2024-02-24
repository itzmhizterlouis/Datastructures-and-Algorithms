import datatypes.Numbers;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[10000000];

        for (int i = 0;i< 10000000;i++){
            list[i] = i + 1;
        }
        Numbers numbers = new Numbers(list);
        System.out.println(numbers.search(10000000));
        System.out.println(numbers.normalSearch(10000000));
    }
}
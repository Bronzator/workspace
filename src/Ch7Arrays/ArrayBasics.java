package Ch7Arrays;


public class ArrayBasics {
    public static void main(String[] args) {
        //task1 initialize an array
        int [] array = new int[10];
        //populate it with random numbers 1-10
        for (int i =0; i <= array.length-1;i++){
            array[i] = (int) (Math.random() * 10 + 1);
        }
        for(int number : array){
            System.out.println(number + " ");
        }
        //print the contents of the array using a for loop
        for (int i =0; i<= array.length-1;i++){
            System.out.println(array[i]);
        }
    }
}

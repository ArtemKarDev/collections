
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        MyList myList = new MyList(6);
        System.out.println(myList);


        System.out.println();
        int[] intArr = {3,5,2,7,4,1,6};
        bubbleSort2(intArr);
        for (int item: intArr){
            System.out.println(item);
        }
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        reverse(integerArrayList);
        for (int item: integerArrayList){
            System.out.print(item);
        }

    }
    public static void reverse(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
    }

//    public static void bubbleSort(ArrayList intList) {
//        for (int i = 0; i < intList.size() - 1; i++) {
//            for (int j = 0; j < intList.size() - i - 1; j++) {
//                if (intList.get(j) > intList.get(j + 1)) {
//                    int temp = intList.get(j);
//                    intList.set(j, intList.get(j + 1));
//                    intList.set(j + 1, temp);
//                }
//            }
//        }
//    }

    public static void bubbleSort2(int[] intArray) {
        // Реализовать сортировку для массива
        for (int i=0; i < intArray.length-1; i++){
            for(int j=0; j< intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
    }






}
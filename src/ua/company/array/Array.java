package ua.company.array;

public class Array {

    public static void main(String[] args) {

        int dimension = 10 ;
        int[] array = createArray(dimension);

        printArrayDesc(array);

        System.out.println("The maximum value of element equal " + maxElement(array));

        System.out.println("Average equal " + avgValue(array));

        int searchValue = 5;
        int index = searchIndex(searchValue, array);
        if(index >= 0 ) {
            System.out.println("The value " + searchValue + ". The index of element equal " + index );
        } else {
            System.out.println("Index not found.");
        };

        if(!findEven(array)) System.out.println("The array doesn't contain even numbers.");
    }

    private static int[] createArray(int dimension) {
        int[] temp = new int[dimension];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 1;
        }
        return temp;
    }
    
    private static void printArrayDesc(int[] array) {
        System.out.print("[");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]" );
    }

    private static void printArrayAsc(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]" );
    }

    private static int maxElement(int[] array) {
        int maxElement = array[0];
        for (int a: array) {
            if( a > maxElement ) maxElement = a;
        }
        return maxElement;
    }

    private static double avgValue(int[] array){
        int sumOfElement = 0;
        for (int a: array ) {
            sumOfElement += a;
        }
        return (double) sumOfElement/array.length;
    }

    private static int searchIndex(int searchValue, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == searchValue) {
                index = i;
                break;
            };
        }
        return index;
    }

    private static boolean findEven(int[] array) {
        boolean result = false;
        int evenAmount = 0;
        for (int a : array)
            if (a % 2 == 0) evenAmount++;

        if (evenAmount > 0) {
            result = true;
            int[] temp = new int[evenAmount];
            int i = 0;
            for (int a : array) {
                if (a % 2 == 0) temp[i++] = a;
            }
            printArrayAsc(temp);
        }
        return result;
    }
}

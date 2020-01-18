package ua.company.array;

public class Array {

    public static void main(String[] args) {

        int dimension = 10;
        int[] array = create(dimension);

        displayDesc(array);

        System.out.println("The maximum value of element equal " + max(array));

        System.out.println("Average equal " + avg(array));

        int searchValue = 5;
        int index = searchIndex(searchValue, array);
        if(index >= 0 ) {
            System.out.println("The value " + searchValue + ". The index of element equal " + index );
        } else {
            System.out.println("Index not found.");
        }

        if(!findEven(array)) System.out.println("The array doesn't contains even numbers.");
    }

    private static int[] create(int dimension) {
        int[] temp = new int[dimension];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 1;
        }
        return temp;
    }
    
    private static void displayDesc(int[] array) {
        System.out.print("[");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]" );
    }

    private static void displayAsc(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]" );
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int a: array) {
            if( a > max ) max = a;
        }
        return max;
    }

    private static double avg(int[] array){
        int sum = 0;
        for (int a: array ) {
            sum += a;
        }
        return (double) sum/array.length;
    }

    private static int searchIndex(int searchValue, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == searchValue) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static boolean findEven(int[] array) {
        boolean result = false;
        int evenAmount = 0;
        for (int a : array) {
            if (a % 2 == 0) evenAmount++;
        }

        if (evenAmount > 0) {
            result = true;
            int[] temp = new int[evenAmount];
            int i = 0;
            for (int a : array) {
                if (a % 2 == 0) temp[i++] = a;
            }
            displayAsc(temp);
        }
        return result;
    }
}

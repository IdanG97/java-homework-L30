public class Homework {
    public static void main(String[] args) {
        System.out.println("for loop example:");
        for (int i = 0; i <= 30; i += 2) {
            if (i == 30){
                System.out.print(i + ".");
                break;
            }
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("while loop example:");
        int i = 0;
        while (i <= 30){
            if (i == 30){
                System.out.print(i + ".");
                break;
            }
            System.out.print(i + ", ");
            i += 2;
        }
        System.out.println();

        int[][] multidimensionalArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };

        System.out.println("print the inside elements with for loop:");
        for (i = 0; i < multidimensionalArray.length; i++) {
            for (int j = 0; j < multidimensionalArray[i].length; j++) {
                System.out.print(multidimensionalArray[i][j] + " ");
            }
        }
        System.out.println();

        System.out.println("print the inside elements with for-each loop:");
        for (int[] numberArr : multidimensionalArray) {
            for (int number : numberArr){
                System.out.print(number + " ");
            }
        }
    }
}

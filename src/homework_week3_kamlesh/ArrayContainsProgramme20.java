package homework_week3_kamlesh;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class ArrayContainsProgramme20 {
    public static void main(String[] args) {
        ArrayContainsProgramme20 arrayContains20 = new ArrayContainsProgramme20();
        arrayContains20.isContains();
    }

    private void isContains() {
        int[] numericArray = {1, 2, 3, 4, 5};
        for (int temp : numericArray) {
            if(temp == 3){
                System.out.println("3 is available in array");
            }
        }
    }
}

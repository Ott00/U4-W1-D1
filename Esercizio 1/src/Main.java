import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("1) " +  Multiply(5,6));
        System.out.println("2) " +  Concatenate("Hello","World"));

        String[] array = AddInArray(new String[]{"A","B","C","E","F"}, "D");
        System.out.println("Array modificato" + Arrays.toString(array));
    }
    public static int Multiply(int a, int b){
        return a*b;
    }
    public static String Concatenate(String a, String b){
        return a+" "+b;
    }

    public static String[] AddInArray(String[] stringArray, String stringToAdd){
        System.out.println("Array premodifiche" + Arrays.toString(stringArray));
        String[] newArray = new String[6];
        newArray[0] = stringArray[0];
        newArray[1] = stringArray[1];
        newArray[2] = stringArray[2];
        newArray[3] = stringToAdd;
        newArray[4] = stringArray[3];
        newArray[5] = stringArray[4];
        return newArray;
    }
}
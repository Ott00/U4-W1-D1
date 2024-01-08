public class Main {

    public static void main(String[] args) {
        System.out.println("1) " +  Multiply(5,6));
        System.out.println("2) " +  Concatenate("Hello","World"));
    }
    public static int Multiply(int a, int b){
        return a*b;
    }
    public static String Concatenate(String a, String b){
        return a+" "+b;
    }

}
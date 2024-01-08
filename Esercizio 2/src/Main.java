import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getWords();
    }
    public static void getWords(){
        System.out.print("Inserisci la prima stringa: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String word2 = scanner.nextLine();
        System.out.print("Inserisci la terza stringa: ");
        String word3 = scanner.nextLine();
        String concatenateWord = Concatenate(word, word2, word3);
        System.out.println(concatenateWord);
        String concatenateWordReverse = Concatenate(word3, word2, word);
        System.out.println(concatenateWordReverse);
    }
    public static String Concatenate(String a, String b, String c){
        return a+" "+b+" "+c;
    }

}
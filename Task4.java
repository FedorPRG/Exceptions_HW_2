import java.util.Scanner;

public class Task4 {
    /*
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит
     * пустую строку. Пользователю должно показаться сообщение, что пустые строки
     * вводить нельзя.
     */
    public static void main(String[] args) {
        Input();
    }

    public static void Input() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите всё, что угодно, кроме пустой строки");
        String a = iScanner.nextLine();
        iScanner.close();
        if (a.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }else{
            System.out.println(a+" -  не пустая строка");
        }       
    }    
}

import java.util.Scanner;

public class ConvertAmount {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки

        Scanner input = new Scanner(System.in);

        // Получить сумму денег в американских долларах
        System.out.println("Введите сумму денег в американских долларах");
        double dollars = input.nextDouble();

        // Конвертировать сумму денег в российские рубли
        double roubles = ROUBLES_PER_DOLLAR * dollars;

        //Отобразить сумму денег в российских рублях в пользу покупателя
        System.out.println(Math.round(roubles));
    }
}
import java.util.Scanner;
public class Main
{
	public static void game()
	{
		Scanner sc = new Scanner(System.in);
		int attempt = 1;
		System.out.println("Нужно угадать случайное загаданное число от 1 до 100\n"
				+ "Вводите числа пока не угадаете!\n" + "Введите число!");
		int number = 1 + (int)(100* Math.random());
		int i = 0;
		int hiddenNumber;
		while (sc.hasNextInt()) {
			attempt++;

			hiddenNumber = sc.nextInt();


			if (number == hiddenNumber) {
				System.out.println(
						"Поздравляю! " + "Ты угадал число." + " Количество попыток - " + attempt );
				break;
			}
			else if (number > hiddenNumber
					&& i != attempt - 1) {
				System.out.println(
						"Я сам в шоке, но загаданное число больше, брат.");
			}
			else if (number < hiddenNumber && i != attempt - 1) {
				System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат.");
			}
		}


	}
	public static void main(String arg[]){
		game();
	}
}

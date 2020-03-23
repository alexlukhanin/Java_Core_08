/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 09 - Exceptions, Java code convention
 * part 01 - based on lesson 08's homework
 * *
 */

package hw08;

/**
 * *
 * Console application with exception
 * @author alexl
 * 
 * @version 1.0
 *
 */

import java.util.Scanner;


public class App {

	public static void main(String[] args) {

		/* arrays for Months and Seasons enums for for-loops iterations */
		Months[] monMas = Months.values();
		Seasons[] seasMas = Seasons.values();

		Scanner sc;
		String menuSting;
		Menu menu = new Menu();
		Menu2 menu2 = new Menu2();

		while (true) {
			System.out.println("Введіть місяць, будь-ласка: ");
			sc = new Scanner(System.in);
			String month;

			/* checking of string 'month' from user */
			InputMonthString inputMonthString = new InputMonthString(sc.next().toUpperCase());
			month = inputMonthString.getString();

			if (inputMonthString.flag) {

				Months m = Months.valueOf(month);
				String season = m.getSeasons().name().toString(); // name of the relative season
				int days = m.getDays();

				menu.printMenu();
				menu2.printMenu();

				while (true) {

					/* checking of menuString from the user */
					InputMenuString inputMenuString = new InputMenuString(sc.next().toLowerCase());

					menuSting = inputMenuString.getString();

					if (inputMenuString.flag) {
						switch (menuSting) {
						case "1": {

							System.out.println("Всі місяці з такою ж порою року: ");
							for (Months mon : monMas) {
								if (mon.getSeasons().name().equals(season)) {
									printMonthName(mon);
								}

							}

							break;

						}

						case "2": {

							System.out.println("Всі місяці, які мають таку саму кількість днів: ");
							for (Months mon : monMas) {
								if (mon.getDays() == days) {
									printMonthName(mon);
								}

							}
							break;

						}

						case "3": {
							System.out.println("Всі місяці, які мають меншу кількість днів: ");
							for (Months mon : monMas) {

								if (mon.getDays() < days) {
									printMonthName(mon);

								}

							}

							if (days == 28) {
								System.out.println("немає таких місяців");
							}
							break;

						}

						case "4": {

							System.out.println("Всі місяці, які мають більшу кількість днів: ");
							for (Months mon : monMas) {

								if (mon.getDays() > days) {
									printMonthName(mon);

								}

							}

							if (days == 31) {
								System.out.println("немає таких місяців");
							}
							break;

						}

						case "5": {
							String nextSeason;
							int ordinal = m.getSeasons().ordinal();
							if (ordinal == (seasMas.length - 1)) {
								ordinal = 0;
								nextSeason = seasMas[ordinal].toString();
							}

							else {
								nextSeason = seasMas[ordinal + 1].toString();
							}

							System.out.println("Наступна пора року " + nextSeason);

							break;

						}

						case "6": {
							String beforeSeason;
							int ordinal = m.getSeasons().ordinal();
							if (ordinal == 0) {
								ordinal = (seasMas.length - 1);
								beforeSeason = seasMas[ordinal].toString();
							}

							else {
								beforeSeason = seasMas[ordinal - 1].toString();
							}

							System.out.println("Попередня пора року " + beforeSeason);
							break;

						}

						case "7": {

							System.out.println("Всі місяці, які мають парну кількість днів: ");
							for (Months mon : monMas) {
								if ((mon.getDays() % 2) == 0) {
									printMonthName(mon);
								}

							}

							break;

						}

						case "8": {
							System.out.println("Всі місяці, які мають непарну кількість днів: ");
							for (Months mon : monMas) {
								if ((mon.getDays() % 2) == 1) {
									printMonthName(mon);
								}

							}

							break;

						}

						case "9": {
							if ((days % 2) == 0) {
								System.out.print("Місяць " + month + " має парну кількість днів");
							} else {
								System.out.print("Місяць " + month + " має непарну кількість днів");
							}
							System.out.println(", а саме " + days);
							break;

						}

						case "menu": {

							menu.printMenu();
							break;
						}

						case "month": {

							System.out.println("Було введений такий місяць: " + month);
							break;
						}

						case "q": {

							System.out.println("Exit application... Good buy!");
							System.exit(0);
							sc.close();
						}

						}
						menu2.printMenu();
					}
				}

			}

		}

	}

	/* Method that prints month name in simple way */
	private static void printMonthName(Months month) {
		System.out.println(month.name().toString());
	}

}

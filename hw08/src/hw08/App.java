package hw08;

import java.util.Scanner;
//first release
public class App {

	public static void main(String[] args) {

		Months[] monMas = Months.values();
		Seasons[] seasMas = Seasons.values();
		Scanner sc;

		while (true) {
			System.out.println("Введіть місяць, будь-ласка: ");
			sc = new Scanner(System.in);
			String month = sc.next().toUpperCase();

			boolean flag = isMonthExcist(monMas, month);

			if (flag) {

				Months m = Months.valueOf(month);
				String season = m.getSeasons().name().toString(); // name of the relative season
				int days = m.getDays();

				menu();

				switch (sc.next()) {
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
				
				case "q": {
					
					System.out.println("Exit application... Good buy!");
					System.exit(0);
					sc.close();
				}

				default:
					System.out.println("Не вірний пункт меню");
//					break;
				}

			} else {
				System.out.println("Такого місяця не існує, спробуйте ще: ");
//				sc = new Scanner(System.in);

			}

		}

	}

	static void menu() {
		System.out.println(
				"| --------------------------------МЕНЮ ВИБОРУ----------------------------------------------|");
		System.out.println(
				"|__________________________________________________________________________________________|");
		System.out.println(
				"| Натисніть 1, щоб вивести всі місяці з такою ж порою року                                 |");
		System.out.println(
				"| Натисніть 2, щоб вивести всі місяці які мають таку саму кількість днів                   |");
		System.out.println(
				"| Натисніть 3, щоб вивести на екран всі місяці які мають меншу кількість днів              |");
		System.out.println(
				"| Натисніть 4, щоб вивести на екран всі місяці які мають більшу кількість днів             |");
		System.out.println(
				"| Натисніть 5, щоб вивести на екран наступну пору року                                     |");
		System.out.println(
				"| Натисніть 6, щоб вивести на екран попередню пору року                                    |");
		System.out.println(
				"| Натисніть 7, щоб вивести на екран всі місяці які мають парну кількість днів              |");
		System.out.println(
				"| Натисніть 8, щоб вивести на екран всі місяці які мають непарну кількість днів            |");
		System.out.println(
				"| Натисніть 9, щоб вивести на екран чи введений з консолі місяць має парну кількість днів  |");
		System.out.println(
				"| Натисніть q, щоб вийти                                                                   |");
		System.out.println(
				"|__________________________________________________________________________________________|");

	}

	private static boolean isMonthExcist(Months[] monMas, String month) {
		boolean flag = false;

		for (Months m : monMas) {
			if (m.name().equals(month)) {
				System.out.println("Введений місяць " + month + " існує");
				flag = true;
			}
		}
		return flag;
	}

	private static void printMonthName(Months month) {
		System.out.println(month.name().toString());
	}

}

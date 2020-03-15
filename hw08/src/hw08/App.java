package hw08;

import java.util.Scanner;
//first release
public class App {

	public static void main(String[] args) {

		Months[] monMas = Months.values();
		Seasons[] seasMas = Seasons.values();
		Scanner sc;

		while (true) {
			System.out.println("������ �����, ����-�����: ");
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

					System.out.println("�� ����� � ����� � ����� ����: ");
					for (Months mon : monMas) {
						if (mon.getSeasons().name().equals(season)) {
							printMonthName(mon);
						}

					}

					break;

				}

				case "2": {

					System.out.println("�� �����, �� ����� ���� ���� ������� ���: ");
					for (Months mon : monMas) {
						if (mon.getDays() == days) {
							printMonthName(mon);
						}

					}
					break;

				}

				case "3": {
					System.out.println("�� �����, �� ����� ����� ������� ���: ");
					for (Months mon : monMas) {

						if (mon.getDays() < days) {
							printMonthName(mon);

						}

					}

					if (days == 28) {
						System.out.println("���� ����� ������");
					}
					break;

				}

				case "4": {

					System.out.println("�� �����, �� ����� ����� ������� ���: ");
					for (Months mon : monMas) {

						if (mon.getDays() > days) {
							printMonthName(mon);

						}

					}

					if (days == 31) {
						System.out.println("���� ����� ������");
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

					System.out.println("�������� ���� ���� " + nextSeason);

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

					System.out.println("��������� ���� ���� " + beforeSeason);
					break;

				}

				case "7": {

					System.out.println("�� �����, �� ����� ����� ������� ���: ");
					for (Months mon : monMas) {
						if ((mon.getDays() % 2) == 0) {
							printMonthName(mon);
						}

					}

					break;

				}

				case "8": {
					System.out.println("�� �����, �� ����� ������� ������� ���: ");
					for (Months mon : monMas) {
						if ((mon.getDays() % 2) == 1) {
							printMonthName(mon);
						}

					}

					break;

				}

				case "9": {
					if ((days % 2) == 0) {
						System.out.print("̳���� " + month + " �� ����� ������� ���");
					} else {
						System.out.print("̳���� " + month + " �� ������� ������� ���");
					}
					System.out.println(", � ���� " + days);
					break;

				}
				
				case "q": {
					
					System.out.println("Exit application... Good buy!");
					System.exit(0);
					sc.close();
				}

				default:
					System.out.println("�� ����� ����� ����");
//					break;
				}

			} else {
				System.out.println("������ ����� �� ����, ��������� ��: ");
//				sc = new Scanner(System.in);

			}

		}

	}

	static void menu() {
		System.out.println(
				"| --------------------------------���� ������----------------------------------------------|");
		System.out.println(
				"|__________________________________________________________________________________________|");
		System.out.println(
				"| �������� 1, ��� ������� �� ����� � ����� � ����� ����                                 |");
		System.out.println(
				"| �������� 2, ��� ������� �� ����� �� ����� ���� ���� ������� ���                   |");
		System.out.println(
				"| �������� 3, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���              |");
		System.out.println(
				"| �������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���             |");
		System.out.println(
				"| �������� 5, ��� ������� �� ����� �������� ���� ����                                     |");
		System.out.println(
				"| �������� 6, ��� ������� �� ����� ��������� ���� ����                                    |");
		System.out.println(
				"| �������� 7, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���              |");
		System.out.println(
				"| �������� 8, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���            |");
		System.out.println(
				"| �������� 9, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���  |");
		System.out.println(
				"| �������� q, ��� �����                                                                   |");
		System.out.println(
				"|__________________________________________________________________________________________|");

	}

	private static boolean isMonthExcist(Months[] monMas, String month) {
		boolean flag = false;

		for (Months m : monMas) {
			if (m.name().equals(month)) {
				System.out.println("�������� ����� " + month + " ����");
				flag = true;
			}
		}
		return flag;
	}

	private static void printMonthName(Months month) {
		System.out.println(month.name().toString());
	}

}

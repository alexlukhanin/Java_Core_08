/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 09 - Exceptions, Java code convention
 * part 01 - based on lesson 08's homework
 * *
 */

package hw08;

/**
 * * Console application with exception
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class Menu {
	/* This class prints menu of the application to console */

	public Menu() {
		super();

	}

	public void printMenu() {
		System.out.println(
				"| --------------------------------МЕНЮ ВИБОРУ----------------------------------------------|");
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

	}

}

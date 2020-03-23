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

public class InputMonthString {
	/*
	 * This class checks month input from the user and assigns value of string, when
	 * it's correct
	 */

	Months[] monMas = Months.values();
	private String string;
	boolean flag = false;

	public InputMonthString(String string) {
		super();
		// boolean flag = false;
		for (Months m : monMas) {
			if (m.name().equals(string)) {
				System.out.println("¬ведений м≥с€ць " + string + " ≥снуЇ");
				flag = true;
			}
		}

		if (flag) {
			this.string = string;
		} else {
			try {
				throw new WrongInputConsoleParametersException("“акого м≥с€ц€ не ≥снуЇ, спробуйте ще:");
			} catch (WrongInputConsoleParametersException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public String getString() {
		return string;
	}

}

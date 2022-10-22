import java.util.Scanner;

public class HelloWorld {

	public static String pickerContract(int args) {
		switch (args) {
			case 1:
				return "Umowa o pracę";
			case 2:
				return "Umowa o zlecenie";
			case 3:
				return "Umowa o dzieło";
		}
		return "Wybrano zły typ umowy";
	}

	public static void main(String[] args) {
		double totalWorkingHours = 0;
		int hourlyRate = 0;
		int bonus = 0;

		int pickedContract = 0;
		String contract = "";
		int workingDaysInMonth = 0;
		double workedHoursInWeekend = 0;
		double vacationHours = 0;
		int workingSickDays = 0;
		int freeSickDays = 0;

		System.out.println("Wprowadz łączną liczbę przepracowanych godzin");
		Scanner Scanning = new Scanner(System.in);
		totalWorkingHours = Scanning.nextDouble();
		System.out.println("Wprowadz stawkę godzinową");
		hourlyRate = Scanning.nextInt();
		System.out.println("Wprowadz kwotę dodatku (premia)");
		bonus = Scanning.nextInt();
		System.out.println("Wybierz typ umowy");
		System.out.println("1 - O pracę");
		System.out.println("2 - O zlecenie");
		System.out.println("3 - O dzieło");
		pickedContract = Scanning.nextInt();
		contract = pickerContract(pickedContract);
		System.out.println("Wprowadz liczbę roboczych dni w miesiącu");
		workingDaysInMonth = Scanning.nextInt();
		System.out.println("Wprowadz liczbę godzin przepracowanych w weekend");
		workedHoursInWeekend = Scanning.nextDouble();
		System.out.println("Wprowadz liczbę dni urlopowych");
		vacationHours = Scanning.nextDouble();
		System.out.println("Wprowadz liczbę dni powszednich przebytych na zwolnieniu lekarskim");
		workingSickDays = Scanning.nextInt();
		System.out.println("Wprowadz liczbę dni wolnych od pracy a przebytych na zwolnieniu lekarskim");
		freeSickDays = Scanning.nextInt();
		Scanning.close();

		System.out.println("Wynagrodzenie: " + ((totalWorkingHours * hourlyRate) + bonus));
		System.out.println("Dodatkowe informacje");
		System.out.println("Typ umowy: " + contract);
		System.out.println("Liczba roboczych dni w miesiącu: " + workingDaysInMonth);
		System.out.println("Liczba godzin przepracowanych w weekend: " + workedHoursInWeekend);
		System.out.println("Liczba dni przebytych na urlopie: " + vacationHours);
		System.out.println("Liczba dni powszednich przebytych na zwolnieniu lekarskim: " + workingSickDays);
		System.out.println("Liczba dni wolnych od pracy a przebytych na zwolnieniu lekarskim: " + freeSickDays);

	}
}
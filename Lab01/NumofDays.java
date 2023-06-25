import java.util.Scanner;

public class NumofDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month: ");
        String monthInput = input.next();
        int month = 0;
        do {
            switch (monthInput.toLowerCase()) {
                case "january":
                case "jan":
                case "jan.":
                case "1":
                    month = 1;
                    break;
                case "february":
                case "feb":
                case "feb.":
                case "2":
                    month = 2;
                    break;
                case "march":
                case "mar":
                case "mar.":
                case "3":
                    month = 3;
                    break;
                case "april":
                case "apr":
                case "apr.":
                case "4":
                    month = 4;
                    break;
                case "may":
                case "5":
                    month = 5;
                    break;
                case "june":
                case "jun":
                case "6":
                    month = 6;
                    break;
                case "july":
                case "jul":
                case "7":
                    month = 7;
                    break;
                case "august":
                case "aug":
                case "aug.":
                case "8":
                    month = 8;
                    break; 
                case "september":
                case "sep":
                case "sep.":
                case "9":
                    month = 9;
                    break;   
                case "october":
                case "oct":
                case "oct.":
                case "10":
                    month = 10;
                    break;
                case "november":
                case "nov":
                case "nov.":
                case "11":
                    month = 11;
                    break;
                case "december":
                case "dec":
                case "dec.":
                case "12":
                    month = 12;
                    break;
                default:
                    month = -1;
                    System.out.print("Invalid month input. Please enter a valid month name, abbreviation, or number: ");
                    monthInput = input.next();
            }
        } while (month == -1);
        
        int year = 0;
        while (year < 1) {
            System.out.print("Enter the year (>= 1): ");
            year = input.nextInt();
            if (year < 1) {
                System.out.println("Invalid year. Please enter a value greater than or equal to 1.");
            }
        }

        int dayCount = 0;
        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
                    dayCount = 29;
                } else {
                    dayCount = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayCount = 31;
                break;
            default:
                dayCount = 30;
                break;
        }

        System.out.println("There are " + dayCount + " days in month " + month + ", year " + year + ".");

        input.close();
    }
}

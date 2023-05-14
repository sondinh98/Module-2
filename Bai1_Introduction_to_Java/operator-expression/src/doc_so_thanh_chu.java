import java.util.Scanner;

public class doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can doc (toi da co 3 so): ");
        int number = sc.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String tensString = "";
            String onesString = "";
            switch (tens) {
                case 2:
                    tensString = "twenty";
                    break;
                case 3:
                    tensString = "thirty";
                    break;
                case 4:
                    tensString = "forty";
                    break;
                case 5:
                    tensString = "fifty";
                    break;
                case 6:
                    tensString = "sixty";
                    break;
                case 7:
                    tensString = "seventy";
                    break;
                case 8:
                    tensString = "eighty";
                    break;
                case 9:
                    tensString = "ninety";
                    break;
            }
            switch (ones) {
                case 0:
                    onesString = "";
                    break;
                case 1:
                    onesString = "one";
                    break;
                case 2:
                    onesString = "two";
                    break;
                case 3:
                    onesString = "three";
                    break;
                case 4:
                    onesString = "four";
                    break;
                case 5:
                    onesString = "five";
                    break;
                case 6:
                    onesString = "six";
                    break;
                case 7:
                    onesString = "seven";
                    break;
                case 8:
                    onesString = "eight";
                    break;
                case 9:
                    onesString = "nine";
                    break;
            }
            if (onesString.equals("")) {
                System.out.println(tensString);
            } else {
                System.out.println(tensString + " " + onesString);
            }
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int tens = number % 100;
            String hundredsString = "";
            String tensString = "";
            String onesString = "";
            switch (hundreds) {
                case 1:
                    hundredsString = "one hundred";
                    break;
                case 2:
                    hundredsString = "two hundred";
                    break;
                case 3:
                    hundredsString = "three hundred";
                    break;
                case 4:
                    hundredsString = "four hundred";
                    break;
                case 5:
                    hundredsString = "five hundred";
                    break;
                case 6:
                    hundredsString = "six hundred";
                    break;
                case 7:
                    hundredsString = "seven hundred";
                    break;
                case 8:
                    hundredsString = "eight hundred";
                    break;
                case 9:
                    hundredsString = "nine hundred";
                    break;
            }
            if (tens >= 10 && tens < 20) {
                int ones = tens % 10;
                switch (ones) {
                    case 0:
                        onesString = "ten";
                        break;
                    case 1:
                        onesString = "eleven";
                        break;
                    case 2:
                        onesString = "tweleve";
                        break;
                    case 3:
                        onesString = "thirteen";
                        break;
                    case 4:
                        onesString = "fourteen";
                        break;
                    case 5:
                        onesString = "fifteen";
                        break;
                    case 6:
                        onesString = "sixteen";
                        break;
                    case 7:
                        onesString = "seventeen";
                        break;
                    case 8:
                        onesString = "eightteen";
                        break;
                    case 9:
                        onesString = "nineteen";
                        break;
                }
                System.out.println(hundredsString + " and " + onesString);

            }else if (tens >= 20) {
                int tensValue = tens / 10;
                int ones = tens % 10;
                switch (tensValue) {
                    case 2:
                        tensString = "twenty";
                        break;
                    case 3:
                        tensString = "thirty";
                        break;
                    case 4:
                        tensString = "forty";
                        break;
                    case 5:
                        tensString = "fifty";
                        break;
                    case 6:
                        tensString = "sixty";
                        break;
                    case 7:
                        tensString = "seventy";
                        break;
                    case 8:
                        tensString = "eighty";
                        break;
                    case 9:
                        tensString = "ninety";
                        break;
                }
                switch (ones) {
                    case 0:
                        onesString = "";
                        break;
                    case 1:
                        onesString = "one";
                        break;
                    case 2:
                        onesString = "two";
                        break;
                    case 3:
                        onesString = "three";
                        break;
                    case 4:
                        onesString = "four";
                        break;
                    case 5:
                        onesString = "five";
                        break;
                    case 6:
                        onesString = "six";
                        break;
                    case 7:
                        onesString = "seven";
                        break;
                    case 8:
                        onesString = "eight";
                        break;
                    case 9:
                        onesString = "nine";
                        break;
                }
                if (onesString.equals("")) {
                    System.out.println(hundredsString + " and " + tensString);
                } else {
                    System.out.println(hundredsString + " and " + tensString + " and " + onesString);
                }
            }
                else if (tens == 0) {
                    System.out.println(hundredsString);
                } else {
                    switch (tens) {
                        case 1:
                            onesString = "one";
                            break;
                        case 2:
                            onesString = "two";
                            break;
                        case 3:
                            onesString = "three";
                            break;
                        case 4:
                            onesString = "four";
                            break;
                        case 5:
                            onesString = "five";
                            break;
                        case 6:
                            onesString = "six";
                            break;
                        case 7:
                            onesString = "seven";
                            break;
                        case 8:
                            onesString = "eight";
                            break;
                        case 9:
                            onesString = "nine";
                            break;
                    }
                    System.out.println(hundredsString + " and " + onesString);
                }
            } else {
                System.out.println("Out of ability");
            }
        }
    }


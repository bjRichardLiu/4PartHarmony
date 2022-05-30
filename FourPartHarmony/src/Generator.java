import java.util.Scanner;

public class Generator {
    //8 measure voice leading

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        String scaleName;

        do {
            check  = false;

            System.out.println("Please enter the key signature: ");
            scaleName = scanner.nextLine();

            if (scaleName.length() == 1) {
                scaleName.toUpperCase();
            } else if (scaleName.length() == 2) {
                String sc1 = scaleName.substring(0, 1);
                String sc2 = scaleName.substring(1, 2);

                String sc11 = sc1.toUpperCase();
                String sc21 = sc2.toLowerCase();

                scaleName = sc11 + sc21;

            } else {
                System.out.println("Please enter a valid key signature");
                break;
            }
            if ((scaleName.contains("C") || scaleName.contains("D") || scaleName.contains("E") ||
                    scaleName.contains("F") || scaleName.contains("G") || scaleName.contains("A") ||
                    scaleName.contains("B"))) {
                check = true;

            } else {
                System.out.println("Please enter a valid key signature");
            }

        } while (check = false);

        int majorOrMinor;

        boolean major = true;

        do {
            System.out.println("Major or minor?\n" +
                    "1. Major\n" +
                    "2. Minor");
            majorOrMinor = scanner.nextInt();
            scanner.nextLine();

            if (majorOrMinor == 1) {
                major = true;
            } else if (majorOrMinor == 2) {
                major = false;
                majorOrMinor = 1;
            } else {
                System.out.println("Please enter a valid number!");
            }
        } while (majorOrMinor != 1);

        Scale scale = new Scale(scaleName, major);

        do {
            check = false;

            System.out.println("Please enter a comma seperated 8 measure chord progression: ");
            String progressionInput = scanner.nextLine();
            if (progressionInput.length() == 15) {
                check = true;
                System.out.println("Generating in process...\n");
            } else {
                System.out.println("Please check the chord progression you entered!");
            }
        } while (check = false);

        





    }
}

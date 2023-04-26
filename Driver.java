import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    // dog array reference list
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();

    // monkey array reference list
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    // Instance variables (if needed)

    public static void main(String[] args) {

        // create scanner obj
        Scanner scanner = new Scanner(System.in);

        initializeDogList();
        initializeMonkeyList();

        // loop variables for menu
        char userMenuChoice = ' ';
        boolean menuLoop = true;

        // menu loop with input validation and a catch all try/catch
        while (menuLoop) {
            try {
                displayMenu();
                userMenuChoice = scanner.nextLine().charAt(0);

                if (userMenuChoice == '1') {
                    System.out.println("[1] Intake a new dog");
                    intakeNewDog(scanner);

                } else if (userMenuChoice == '2') {
                    System.out.println("[2] Intake a new monkey");
                    intakeNewMonkey(scanner);

                } else if (userMenuChoice == '3') {
                    System.out.println("[3] Reserve an animal");
                    reserveAnimal(scanner);

                } else if (userMenuChoice == '4') {
                    System.out.println("[4] Print a list of all dogs");
                    printAnimals(4);

                } else if (userMenuChoice == '5') {
                    System.out.println("[5] Print a list of all monkeys");
                    printAnimals(5);

                } else if (userMenuChoice == '6') {
                    System.out.println("[6] Print a list of all animals that are not reserved");
                    printAnimals(6);

                } else if (userMenuChoice == 'q') {
                    System.out.println("[q] Quit application");
                    menuLoop = false;
                } else {
                    System.out.println("Please enter a valid character: ex.. 1, 2, 3, 4, 5, 6, or q to quit.");
                }
            } catch (Exception excpt) {
                System.out.println("Please enter a valid character: ex.. 1, 2, 3, 4, 5, 6, or q to quit.");
            }
        }

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
                false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "in service", false,
                "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
                "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Initialize monkey list with test monkeys
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("George", "Capuchin", "3f", "4f", "1f", "male", "2", "13.5", "05/31/22", "Mexico",
                "intake", false, "China");
        Monkey monkey2 = new Monkey("Tim", "Guenon", "4f", "6f", "2f", "female", "4", "15.5", "03/11/20", "Japan",
                "in service", false, "Spain");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
    }

    // Intake new dog method
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        boolean reserved = false;

        System.out.println("What is the dog's in service country?");
        String inServiceCountry = scanner.nextLine();

        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
                reserved, inServiceCountry);

        dogList.add(dog);
        System.out.println("Added " + dog);

    }

    // intake new monkey with input validation to make sure monkey is not already in
    // the system
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;
            }
        }
        System.out.println("What is the monkey's species?");
        System.out
                .println("Available species include: Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin...");
        String species = scanner.nextLine();

        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();

        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();

        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();

        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();

        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();

        boolean reserved = false;

        System.out.println("What is the monkey's in service country?");
        String inServiceCountry = scanner.nextLine();

        Monkey monkey = new Monkey(name, species, tailLength, height, bodyLength, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        // add new monkey to monkeyList array
        monkeyList.add(monkey);
        System.out.println("Added " + monkey.toString());

    }

    public static void reserveAnimal(Scanner scanner) {

        System.out.println("What type of animal would you like to reserve?: Dog or Monkey? ");
        String animalToReserve = scanner.nextLine();

        if (animalToReserve.equalsIgnoreCase("Dog")) {
            try {
                for (Dog dog : dogList) {
                    System.out.println(
                            "What is the acquisition country?... please type full names, ex.. United States not (US)");
                    String countryOfAnimal = scanner.nextLine();
                    if (dog.getAcquisitionLocation().equalsIgnoreCase(countryOfAnimal) && dog.getReserved() == false) {
                        dog.setReserved(true);
                        System.out.println("You have reserved: " + dog.getName());
                        return;
                    } else {
                        System.out.println("No match found, please choose another");
                        return;
                    }
                }
            } catch (Exception excpt) {
                System.out.println("Animal not found. Please input another.");

            }
        } else if (animalToReserve.equalsIgnoreCase("Monkey")) {
            try {
                for (Monkey monkey : monkeyList) {
                    System.out.println(
                            "What is the acquisition country?... please type full names, ex.. United States not (US)");
                    String countryOfAnimal = scanner.nextLine();
                    if (monkey.getAcquisitionLocation().equalsIgnoreCase(countryOfAnimal)
                            && monkey.getReserved() == false) {
                        monkey.setReserved(true);
                        System.out.println("You have reserved: " + monkey.getName());
                        return;
                    } else {
                        System.out.println("No match found, please choose another");
                        return;
                    }
                }
            } catch (Exception excpt) {
                System.out.println("Animal not found. Please input another.");
            }
        } else {
            return;
        }
    }

    public static void printAnimals(int userInput) {

        if (userInput == 4) {
            for (Dog dog : dogList) {
                System.out.println("Name: " + dog.getName() + ", Training status: " + dog.getTrainingStatus()
                        + ", Acquisition country: " + dog.getAcquisitionLocation() + ", Reserved: "
                        + dog.getReserved());
            }
        }
        if (userInput == 5) {
            for (Monkey monkey : monkeyList) {
                System.out.println("Name: " + monkey.getName() + ", Training status: " + monkey.getTrainingStatus()
                        + ", Acquisition country: " + monkey.getAcquisitionLocation() + ", Reserved: "
                        + monkey.getReserved());
            }
        }
        if (userInput == 6) {
            for (Dog dog : dogList) {
                if ((dog.getReserved() == false) && (dog.getTrainingStatus().equalsIgnoreCase("in service"))) {
                    System.out.println("Dog(s) available: " + dog.getName());
                }
            }
        }
        if (userInput == 6) {
            for (Monkey monkey : monkeyList) {
                if ((monkey.getReserved() == false) &&
                        (monkey.getTrainingStatus().equalsIgnoreCase("in service"))) {
                    System.out.println("Monkey(s) available: " + monkey.getName());
                }
            }
        }
    }
}

package virtual_plant_care;

import java.util.Scanner;

public class View {
    private service assistant;
    private Scanner scanner;

    public View() {
        this.assistant = new service();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the plant care assistant");
            System.out.println("-------------------------------------");
            System.out.println("|1. Add new plant                   |");
            System.out.println("|2. Water plant                     |");
            System.out.println("|3. Provide sunlight                |");
            System.out.println("|4. Display status of all plants    |");
            System.out.println("|5. Exit                            |");
            System.out.println("-------------------------------------");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter plant name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter plant type:");
                    String type = scanner.nextLine();
                    this.assistant.addNewPlant(name, type, type);
                    System.out.println("Plant added successfully");
                    break;
                }
                case 2: {
                    System.out.println("Enter the name of the plant you wish to water: ");
                    String name = scanner.nextLine();
                    this.assistant.waterASpesificPLant(name);
                    System.out.println("Plant watered successfully");
                    break;
                }
                case 3: {
                    System.out.println("Enter the name of the plant you wish to provide sunlight to: ");
                    String name = scanner.nextLine();
                    this.assistant.provideSunlightToCertainPlant(name);
                    System.out.println("Sunlight provided successfully");
                    break;
                }
                case 4: {
                    assistant.displayStatusOfAllPLants();
                    break;
                }
                default: {
                    System.out.println("Exiting...");
                    running = false;
                    break;
                }
            }
        }
    }

}

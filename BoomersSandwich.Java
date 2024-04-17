import java.util.Scanner;

public class BoomersSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to Boomers Sandwich!");

        
        System.out.println("What type of bread do you want?");
        System.out.println("1. Tomato bread");
        System.out.println("2. Naan bread");
        System.out.println("3. Ciabatta");
        System.out.println("4. Croissant");
        System.out.println("5. Brioche");
        System.out.print("Enter your choice: ");
        int breadChoice = scanner.nextInt();
        scanner.nextLine(); 

        String bread = getBreadOption(breadChoice);

        
        System.out.println("Choose up to 5 toppings (enter numbers separated by space):");
        System.out.println("1. Cheddar");
        System.out.println("2. Mozzarella");
        System.out.println("3. Pepper Jack");
        System.out.println("4. Chicken");
        System.out.println("5. Turkey");
        System.out.println("6. Tuna");
        System.out.println("7. Hummus");
        System.out.println("8. Chicken salad");
        System.out.print("Enter your choices: ");
        String toppingsInput = scanner.nextLine();
        String[] toppings = getToppingsOptions(toppingsInput);

        
        System.out.println("Toasted(1) or Pressed(2)?");
        System.out.print("Enter your choice: ");
        int toastChoice = scanner.nextInt();
        String toast = (toastChoice == 1) ? "Toasted" : "Pressed";

        
        System.out.println("Your sandwich: " + bread + " with " + String.join(", ", toppings) + ", " + toast);

        
        System.out.println("Choose up to 5 condiments (enter numbers separated by space):");
        System.out.println("1. Tomatoes");
        System.out.println("2. Lettuce");
        System.out.println("3. Romaine lettuce");
        System.out.println("4. Basil");
        System.out.println("5. Guacamole");
        System.out.println("6. Banana Peppers");
        System.out.println("7. Jalapeno");
        System.out.println("8. Cucumber");
        System.out.println("9. Pickles");
        System.out.print("Enter your choices: ");
        String condimentsInput = scanner.next();
        String[] condiments = getCondimentsOptions(condimentsInput);

        
        System.out.println("Choose a drink:");
        System.out.println("1. Iced tea");
        System.out.println("2. Pepsi diet");
        System.out.println("3. Pepsi");
        System.out.println("4. Cherry Pepsi");
        System.out.println("5. Starry soda");
        System.out.print("Enter your choice: ");
        int drinkChoice = scanner.nextInt();
        String drink = getDrinkOption(drinkChoice);

        System.out.print("Do you want chips? (yes/no): ");
        String chipsChoice = scanner.next();

        System.out.println("How would you like to pay?");
        System.out.println("1. Mealswipe");
        System.out.println("2. Boomer/flex bucks");
        System.out.println("3. Credit card");
        System.out.print("Enter your choice: ");
        int paymentChoice = scanner.nextInt();
        double totalPrice = getPaymentAmount(paymentChoice);

        // Display order summary
        System.out.println("\nOrder Summary:");
        System.out.println("Sandwich: " + bread + " with " + String.join(", ", toppings) + ", " + toast);
        System.out.println("Condiments: " + String.join(", ", condiments));
        System.out.println("Drink: " + drink);
        System.out.println("Chips: " + chipsChoice);
        System.out.println("Total Price: $" + totalPrice);

        System.out.println("\nThank you for ordering at Boomers Sandwich!");
    }

    private static String getBreadOption(int choice) {
        switch (choice) {
            case 1:
                return "Tomato bread";
            case 2:
                return "Naan bread";
            case 3:
                return "Ciabatta";
            case 4:
                return "Croissant";
            case 5:
                return "Brioche";
            default:
                return "Invalid entry";
        }
    }

    private static String[] getToppingsOptions(String input) {
        String[] choices = input.split(" ");
        String[] toppings = new String[choices.length];
        for (int i = 0; i < choices.length; i++) {
            switch (choices[i]) {
                case "1":
                    toppings[i] = "Cheddar";
                    break;
                case "2":
                    toppings[i] = "Mozzarella";
                    break;
                case "3":
                    toppings[i] = "Pepper Jack";
                    break;
                case "4":
                    toppings[i] = "Chicken";
                    break;
                case "5":
                    toppings[i] = "Turkey";
                    break;
                case "6":
                    toppings[i] = "Tuna";
                    break;
                case "7":
                    toppings[i] = "Hummus";
                    break;
                case "8":
                    toppings[i] = "Chicken salad";
                    break;
                default:
                    toppings[i] = "Invalid entry";
            }
        }
        return toppings;
    }

    private static String[] getCondimentsOptions(String input) {
        String[] choices = input.split(" ");
        String[] condiments = new String[choices.length];
        for (int i = 0; i < choices.length; i++) {
            switch (choices[i]) {
                case "1":
                    condiments[i] = "Tomatoes";
                    break;
                case "2":
                    condiments[i] = "Lettuce";
                    break;
                case "3":
                    condiments[i] = "Romaine lettuce";
                    break;
                case "4":
                    condiments[i] = "Basil";
                    break;
                case "5":
                    condiments[i] = "Guacamole";
                    break;
                case "6":
                    condiments[i] = "Banana Peppers";
                    break;
                case "7":
                    condiments[i] = "Jalapeno";
                    break;
                case "8":
                    condiments[i] = "Cucumber";
                    break;
                case "9":
                    condiments[i] = "Pickles";
                    break;
                default:
                    condiments[i] = "Invalid entry";
            }
        }
        return condiments;
    }

    private static String getDrinkOption(int choice) {
        switch (choice) {
            case 1:
                return "Iced tea";
            case 2:
                return "Pepsi diet";
            case 3:
                return "Pepsi";
            case 4:
                return "Cherry Pepsi";
            case 5:
                return "Starry soda";
            default:
                return "Invalid entry";
        }
    }

    private static double getPaymentAmount(int choice) {
        switch (choice) {
            case 1:
                return

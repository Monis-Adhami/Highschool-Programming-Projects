import java.util.*;
import java.lang.Math;
/**
 * This is a program simulation of a McDonalds Kiosk, where the user can essentially order 
 * anything on the menu given. The user is able to order a meal multiple times.
 * He will then be given the total of his purchase and even
 * be asked for a payment method.
 * @author Monis Adhami - 680676
 * @version 11/11/2021
 */
public class McDonaldsKiosk {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Mcdonalds, I am an automated chat bot that will be helping you through your selection process. Please select one of the following meals for your order...");
        double sandwich;
        double combo;
        double nuggets;
        double happymeal;
        nuggets = 3.99;
        happymeal = 2.99;
        sandwich = 4.99;
        combo = 12.0;
        double total;
        total = 0;
        boolean finished;
        finished = false;
        while (finished == false) {
            System.out.println("Please order one of the following");
            System.out.println("1. Combo");
            System.out.println("2. Sandwich");
            System.out.println("3. Nuggets");
            System.out.println("4. Happymeal");
            String meal;
            meal = input.nextLine();
            if (meal.equals("1")) {
                System.out.println("Loading...");
                total = total + combo;
                System.out.println("A Combo meal will be $10. Please select a drink [pepsi/fanta]");
                String drinkFlavor;
                drinkFlavor = input.nextLine();
                if (drinkFlavor.equals("fanta")) {
                    System.out.println("Fanta has been added into your order");
                } else {
                    System.out.println("Pepsi has been added into your order");
                }
                System.out.println("Please select a drink size [large/medium/small]");
                String drinkSize;
                drinkSize = input.nextLine();
                if (drinkSize.equals("large")) {
                    System.out.println("One Large Beverage has been placed into your order");
                } else {
                    if (drinkSize.equals("small")) {
                        System.out.println("One Small Beverage has been placed into your order");
                    } else {
                        System.out.println("One Medium beverage has been placed into your order");
                    }
                }
                System.out.println("Would you like to order something else? [yes/no]");
                String reorder;
                reorder = input.nextLine();
                if (reorder.equals("no")) {
                    finished = true;
                } else {
                    finished = false;
                }
                } else {
                System.out.println("Loading...");
                if (meal.equals("2")) {
                    total = total + sandwich;
                    System.out.println("A sandwich will be $2.99");
                    System.out.println("Would you like to order again? [yes/no]");
                    String reorder;
                    reorder = input.nextLine();
                    if (reorder.equals("no")) {
                        finished = true;
                    } else {
                        finished = false;
                    }
                } else {
                    if (meal.equals("3")) {
                        total = total + nuggets;
                        System.out.println("The chicken nuggets have been added to your order, would you like the sauce with them? [yes/no]");
                        String sauce;
                        sauce = input.nextLine();
                        if (sauce.equals("yes")) {
                            System.out.println("The sauce has been added into your order");
                        } else {
                            System.out.println("The sauce has been removed from your order");
                        }
                        System.out.println("Would you like to order again? [yes/no]");
                        String reorder;
                        reorder = input.nextLine();
                        if (reorder.equals("no")) {
                            finished = true;
                        } else {
                            finished = false;
                        }
                    } else {
                        if (meal.equals("4")) {
                            total = total + happymeal;
                            System.out.println("The Happy Meal has been added into your order, Would you like the toy with it? [yes/no]");
                            String kidsToy;
                            kidsToy = input.nextLine();
                            if (kidsToy.equals("yes")) {
                                System.out.println("The toy has been added into your order");
                            } else {
                                System.out.println("The toy has been removed from your order");
                            }
                        } else {
                            System.out.println("Invalid Input..... Please select yes on the next question");
                        }
                        System.out.println("Would you like to order again? [yes/no]");
                        String reorder;
                        reorder = input.nextLine();
                        if (reorder.equals("no")) {
                            finished = true;
                        } else {
                            finished = false;
                        }
                    }
                }
            }
        }
        System.out.println("Do you want to purchase dessert? [yes/no]");
        String dessert;
        dessert = input.nextLine();
        if (dessert.equals("yes")) {
            System.out.println("Dessert will cost $1.39 and you can purchase a mcflurry or sundae. What would you like? [mcflurry/sundae]");
            double dessertCost;
            dessertCost = 1.39;
            String dessertType;
            dessertType = input.nextLine();
            if (dessertType.equals("mcflurry")) {
                System.out.println("What mcflurry would you like? [oreo/smarties]");
                String mcflurryFlavor;
                mcflurryFlavor = input.nextLine();
                if (mcflurryFlavor.equals("oreo")) {
                    System.out.println("One Oreo Mcflurry has been added into your order!");
                } else {
                    System.out.println("One Oreo Mcflurry has been added into your order");
                }
            } else {
                System.out.println("What flavor sundae would you like? [fudge/sundae]");
                String sundaeFlavor;
                sundaeFlavor = input.nextLine();
                if (sundaeFlavor.equals("fudge")) {
                    System.out.println("One Fudge Sundae has been added into your order");
                } else {
                    System.out.print("One Caramel Sundae has been added into your order");
                }
            }
            total = dessertCost + total;
        } else {
            System.out.println("Transferring to order page...");
        }
        System.out.println("Would you like to complete your order? [yes/no]");
        String payment;
        payment = input.nextLine();
        if (payment.equals("yes")) {
            System.out.println("Loading Payment Menu...");
        } else {
            System.out.println("Cancelling Order...");
            System.exit(0);
        }
        double tax;
        tax = total * 0.13;
        System.out.println("your tax comes to: " + "$" + tax);
        double mealTotal;
        mealTotal = total + tax;
        System.out.println("Your total plus tax comes to: " + "$" + mealTotal);
        System.out.println("Please select a payment method... [cash/debit/credit]");
        String paymentMethod;
        paymentMethod = input.nextLine();
        if (paymentMethod.equals("debit")) {
            System.out.println("Initiating Debit Procedure...");
            System.out.println("Please insert your card below");
        } else {
            if (paymentMethod.equals("credit")) {
                System.out.println("Initiating Credit Procedure...");
                System.out.println("Please insert your card below");
            } else {
                System.out.println("Please insert your cash into the slot below");
            }
        }
        System.out.println("Thank you for purchasing food at McDonalds, have a wonderful day!");
    }
}
/*
import javax.jws.soap.SOAPBinding;
import javax.swing.JOptionPane;


public class Main{

    public static void main(String[] args) {

        String Operator = JOptionPane.showInputDialog("What Operator would you like to use?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square Root");
        if (Operator.equals("5") || Operator.equalsIgnoreCase("Square Root")) {
            String Number_1 = JOptionPane.showInputDialog("Please enter your number:\n");
            double Number_Total_1 = Double.parseDouble(Number_1);
            JOptionPane.showMessageDialog(null, Math.sqrt(Number_Total_1));
        }
        if (!Operator.equals("5")) {
            String Number_1 = JOptionPane.showInputDialog("Please enter your first number:\n");
            String Number_2 = JOptionPane.showInputDialog("Please enter your second number:\n");

            if (Operator.equals("1") || Operator.equalsIgnoreCase("Addition")) {
                double Number_Total_1 = Double.parseDouble(Number_1);
                double Number_Total_2 = Double.parseDouble(Number_2);
                double Number_Total = Number_Total_1 + Number_Total_2;
                if (Number_Total < 0) {
                    JOptionPane.showMessageDialog(null, "-"+Math.abs(Number_Total));
                }
                else {
                    JOptionPane.showMessageDialog(null, Math.abs(Number_Total));
                }
            } else if (Operator.equals("2") || Operator.equalsIgnoreCase("Subtraction")) {
                double Number_Total_1 = Double.parseDouble(Number_1);
                double Number_Total_2 = Double.parseDouble(Number_2);
                double Number_Total = Number_Total_1 - Number_Total_2;
                if (Number_Total < 0) {
                JOptionPane.showMessageDialog(null, "-"+Math.abs(Number_Total));
                }
                else {
                    JOptionPane.showMessageDialog(null, Math.abs(Number_Total));
                }
            } else if (Operator.equals("3") || Operator.equalsIgnoreCase("Multiplication")) {
                double Number_Total_1 = Double.parseDouble(Number_1);
                double Number_Total_2 = Double.parseDouble(Number_2);
                double Number_Total = Number_Total_1 * Number_Total_2;
                if (Number_Total < 0) {
                    JOptionPane.showMessageDialog(null, "-"+Math.abs(Number_Total));
                }
                else {
                    JOptionPane.showMessageDialog(null, Math.abs(Number_Total));
                }
            } else if (Operator.equals("4") || Operator.equalsIgnoreCase("Division")) {
                double Number_Total_1 = Double.parseDouble(Number_1);
                double Number_Total_2 = Double.parseDouble(Number_2);
                try {
                    double Number_Total = Number_Total_1 / Number_Total_2;
                    JOptionPane.showMessageDialog(null, Number_Total);
                } catch (ArithmeticException e) {
                    double Number_Total = 0.0;
                    JOptionPane.showMessageDialog(null, Number_Total);
                }
            }
        }
    }
}

import java.util.Scanner;
public class Main{
        static double add(double Number_1, double Number_2){
            return Number_1 + Number_2;}
        static double square_root(double Number_1) {
            return Math.sqrt(Number_1);}
        static double subtract(double Number_1, double Number_2) {
            return Number_1 - Number_2;}
        static double multiply(double Number_1, double Number_2) {
            return Number_1 * Number_2;}
        static double divide(double Number_1, double Number_2) {
            return Number_1 / Number_2;}
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("What Operator would you like to use?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square Root");
        String Operator_Choice = UserInput.nextLine();
        if (Operator_Choice.equals("5") || Operator_Choice.equalsIgnoreCase("Square Root")) {
            System.out.print("Please enter your number:\n");
            double Number_1 = UserInput.nextInt();
            System.out.println(square_root(Number_1));}
        if (!Operator_Choice.equals("5")) {
            System.out.print("Please enter your first number:\n");
            double Number_1 = UserInput.nextInt();
            System.out.print("Please enter your second number:\n");
            double Number_2 = UserInput.nextInt();
            if (Operator_Choice.equals("1") || Operator_Choice.equalsIgnoreCase("Addition")) {
                System.out.println(add(Number_1, Number_2));}
            else if (Operator_Choice.equals("2") || Operator_Choice.equalsIgnoreCase("Subtraction")) {
                System.out.println(subtract(Number_1, Number_2));}
            else if (Operator_Choice.equals("3") || Operator_Choice.equalsIgnoreCase("Multiplication")) {
                System.out.println(multiply(Number_1, Number_2));}
            else if (Operator_Choice.equals("4") || Operator_Choice.equalsIgnoreCase("Division")) {
                if (Number_2 == 0) {
                    System.out.println(0.0);}
                else {
                    System.out.println(divide(Number_1,Number_2));}}}}}



import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int Strength = 10;
        int Agility = 10;
        int Dexterity = 10;
        int Health = 100;
        int Remaining_Points = 10000;

        String Stats_Menu = JOptionPane.showInputDialog("These are your stats:\n1. " + Strength + "\n2. " + Agility + "\n3. " + Dexterity + "\n4. " + Health + "\n5. " + Remaining_Points + "\n\nWould you like to upgrade any?\n(if not type 9)\n(Please enter its corresponding number apart from Remaining Points)\n");
        while (true) {
            if (Stats_Menu.equals("9") || Remaining_Points == 0) {
                break;
            }
            String Upgrade = JOptionPane.showInputDialog("Enter the amount you would like to add into the stat\n");
            if (Integer.parseInt(Upgrade) > Remaining_Points) {
                JOptionPane.showMessageDialog(null, "Goodbye :)");
                break;
            }
            if (Integer.parseInt(Upgrade) <= 0) {
                JOptionPane.showMessageDialog(null, "Goodbye :)");
                break;
            }
            else {
                if (Stats_Menu.equals("1")) {
                    if (Integer.parseInt(Upgrade) > Remaining_Points) {
                        JOptionPane.showMessageDialog(null, "You entered an invalid amount please try again.\n");
                    } else {
                        Strength = Strength + Integer.parseInt(Upgrade);
                        Remaining_Points = Remaining_Points - Integer.parseInt(Upgrade);
                        int Stats_Update = JOptionPane.showConfirmDialog(null, "You have updated your stats would you like to see your new stats?");
                        if (Stats_Update == 0) {
                            JOptionPane.showMessageDialog(null, "These are your stats:\n1. " + Strength + "\n2. " + Agility + "\n3. " + Dexterity + "\n4. " + Health + "\n5. " + Remaining_Points);
                        } else {
                            JOptionPane.showMessageDialog(null, "Goodbye :)");
                        }
                    }
                }
                if (Stats_Menu.equals("2")) {
                    if (Integer.parseInt(Upgrade) > Remaining_Points) {
                        JOptionPane.showMessageDialog(null, "You entered an invalid amount please try again.\n");
                    } else {
                        Agility = Agility + Integer.parseInt(Upgrade);
                        Remaining_Points = Remaining_Points - Integer.parseInt(Upgrade);
                        int Stats_Update = JOptionPane.showConfirmDialog(null, "You have updated your stats would you like to see your new stats?");
                        if (Stats_Update == 0) {
                            JOptionPane.showMessageDialog(null, "These are your stats:\n1. " + Strength + "\n2. " + Agility + "\n3. " + Dexterity + "\n4. " + Health + "\n5. " + Remaining_Points);
                        } else {
                            JOptionPane.showMessageDialog(null, "Goodbye :)");
                        }
                    }
                }
                if (Stats_Menu.equals("3")) {
                    if (Integer.parseInt(Upgrade) > Remaining_Points) {
                        JOptionPane.showMessageDialog(null, "You entered an invalid amount please try again.\n");
                    } else {
                        Dexterity = Dexterity + Integer.parseInt(Upgrade);
                        Remaining_Points = Remaining_Points - Integer.parseInt(Upgrade);
                        int Stats_Update = JOptionPane.showConfirmDialog(null, "You have updated your stats would you like to see your new stats?");
                        if (Stats_Update == 0) {
                            JOptionPane.showMessageDialog(null, "These are your stats:\n1. " + Strength + "\n2. " + Agility + "\n3. " + Dexterity + "\n4. " + Health + "\n5. " + Remaining_Points);
                        } else {
                            JOptionPane.showMessageDialog(null, "Goodbye :)");
                        }
                    }
                }
                if (Stats_Menu.equals("4")) {
                    if (Integer.parseInt(Upgrade) > Remaining_Points) {
                        JOptionPane.showMessageDialog(null, "You entered an invalid amount please try again.\n");
                    } else {
                        Health = Health + Integer.parseInt(Upgrade);
                        Remaining_Points = Remaining_Points - Integer.parseInt(Upgrade);
                        int Stats_Update = JOptionPane.showConfirmDialog(null, "You have updated your stats would you like to see your new stats?");
                        if (Stats_Update == 0) {
                            JOptionPane.showMessageDialog(null, "These are your stats:\n1. " + Strength + "\n2. " + Agility + "\n3. " + Dexterity + "\n4. " + Health + "\n5. " + Remaining_Points);
                        } else {
                            JOptionPane.showMessageDialog(null, "Goodbye :)");
                        }
                    }
                }
                if (Stats_Menu.equals("5")) {
                    JOptionPane.showMessageDialog(null, "Goodbye :)");
                }
            }
        }
    }
}*/

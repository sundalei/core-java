package sample.chapter23.exercise;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        System.out.print(prompt);
        String line = scanner.nextLine();

        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException ex) {
            System.err.println(line + " is not a vaild number.");
            throw ex;
        }
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        
        String line = null;
        while (true) {
            System.out.println(prompt + min + " and " + max);
            line = scanner.nextLine();

            try {
                int number = Integer.parseInt(line);
                if (number > min && number < max) {
                    return number;
                }
                System.out.println(number + "is not between " + min + " and " + max);

            } catch (NumberFormatException ex) {
                System.err.println(line + " is not a valid number.");
            } 
        }
    }

    @Override
    public double readDouble(String prompt) {
        System.out.print(prompt);
        String line = scanner.nextLine();

        try {
            return Double.parseDouble(line);
        } catch (NumberFormatException ex) {
            System.err.println(line + " is not a vaild number.");
            throw ex;
        }
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        String line = null;
        while (true) {
            System.out.println(prompt + min + " and " + max);
            line = scanner.nextLine();

            try {
                double number = Double.parseDouble(line);
                if (number > min && number < max) {
                    return number;
                }
                System.out.println(number + "is not between " + min + " and " + max);

            } catch (NumberFormatException ex) {
                System.err.println(line + " is not a valid number.");
            } 
        }
    }

    @Override
    public float readFloat(String prompt) {
        System.out.print(prompt);
        String line = scanner.nextLine();

        try {
            return Float.parseFloat(line);
        } catch (NumberFormatException ex) {
            System.err.println(line + " is not a vaild number.");
            throw ex;
        }
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        String line = null;
        while (true) {
            System.out.println(prompt + min + " and " + max);
            line = scanner.nextLine();

            try {
                Float number = Float.parseFloat(line);
                if (number > min && number < max) {
                    return number;
                }
                System.out.println(number + "is not between " + min + " and " + max);

            } catch (NumberFormatException ex) {
                System.err.println(line + " is not a valid number.");
            } 
        }
    }

    @Override
    public long readLong(String prompt) {
        System.out.print(prompt);
        String line = scanner.nextLine();

        try {
            return Long.parseLong(line);
        } catch (NumberFormatException ex) {
            System.err.println(line + " is not a vaild number.");
            throw ex;
        }
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        String line = null;
        while (true) {
            System.out.println(prompt + min + " and " + max);
            line = scanner.nextLine();

            try {
                Long number = Long.parseLong(line);
                if (number > min && number < max) {
                    return number;
                }
                System.out.println(number + "is not between " + min + " and " + max);

            } catch (NumberFormatException ex) {
                System.err.println(line + " is not a valid number.");
            } 
        }
    }
}
package sample.chapter23.exercise;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    private Scanner scanner =  new Scanner(System.in);

    @Override
    public void print(String message) {

    }

    @Override
    public String readString(String prompt) {
        return null;
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
        return 0;
    }

    @Override
    public double readDouble(String prompt) {
        return 0;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        return 0;
    }

    @Override
    public float readFloat(String prompt) {
        return 0;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        return 0;
    }

    @Override
    public long readLong(String prompt) {
        return 0;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        return 0;
    }
}
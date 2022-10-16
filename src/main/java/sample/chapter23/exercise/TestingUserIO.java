package sample.chapter23.exercise;

public class TestingUserIO {

    public static void main(String[] args){

        UserIO userIO = new UserIOImpl();
        int smallNum = userIO.readInt("Give me a small number: ");
        int bigNum = userIO.readInt("Now give me a much bigger number: ");
    }
}
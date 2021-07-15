package edu.pdx.cs410J.dylaneric;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

    private static StringBuffer[] output;

    static String[][] digitItems = {{" _  ", "| | ", "|_| "},
                                    {"    ", " |  ", " |  "},
                                    {" _  ", " _| ", "|_  "},
                                    {" _  ", " _| ", " _| "},
                                    {"    ", "|_| ", "  | "},
                                    {" _  ", "|_  ", " _| "},
                                    {" _  ", "|_  ", "|_| "},
                                    {"_   ", " |  ", " |  "},
                                    {" _  ", "|_| ", "|_| "},
                                    {" _  ", "|_| ", " _| "}};


    public static void main(String[] args) {
        if(args == null || args.length == 0) {
            args = new String[1];
            args[0] = "0123456789";
        }
        int[] input = getIntegerArray(args[0]);
        output = new StringBuffer[3];
        for(int i = 0; i < output.length; ++i) {
            output[i] = new StringBuffer();
        }
        for(int current : input) {
            add(current);
        }

        print();

        System.exit(1);
    }


    public static void add(int input) {
        for(int i = 0; i < 3; ++i) {
            output[i].append(digitItems[input][i]);
        }
    }

    public static void print() {
        for(int i = 0; i < 3; ++i) {
            System.out.println(output[i]);
        }
    }

    private static int[] getIntegerArray(String input) {
        int[] toReturn = new int[input.length()];
        for(int i = 0; i < input.length(); ++i) {
            toReturn[i] = input.charAt(i) - 48;
        }
        return toReturn;
    }

}
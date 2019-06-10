package hackerrank.timeconversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static final int AM_PM_DIFFERENCE = 12;

    static String timeConversion(String s) {
        String AMPM = s.substring(8,10);
        String result = s.substring(0,8);

        if(AMPM.equalsIgnoreCase("PM") && !result.substring(0,2).equals("12")) {
            result = Integer.parseInt(s.substring(0,2)) + AM_PM_DIFFERENCE + result.substring(2);
        }

        if(AMPM.equalsIgnoreCase("AM") && result.substring(0,2).equals("12")) {
            result = result.replaceFirst("12", "00");
        }

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

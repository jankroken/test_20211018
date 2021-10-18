package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private void runLoop() throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            while(processInput(in)) {}
        }
    }

    public static void main(String[] args) {

    }

    private boolean processInput(BufferedReader in) throws IOException {
        System.out.println("> ");
        String line = in.readLine();
        // parse line, calculate it and write the result to std out
        return true; // return false to exit
    }

}

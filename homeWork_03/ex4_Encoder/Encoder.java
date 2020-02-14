package lesson3_Encoder;

public class Encoder {


    public void encode(char symbol) {
        System.out.println("'" + symbol + "' => " + (short) symbol);
    }

    public void decode(short code) {
        System.out.println(code + " => '" + (char) code + "'");

    }
}
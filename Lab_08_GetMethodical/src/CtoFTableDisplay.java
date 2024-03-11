public class CtoFTableDisplay {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // set variables
        double prettyNumberF = 0;
        int lengthOfNumC = 0;
        int lengthOfNumF = 0;
        int positionC = 0;
        int positionF = 0;
        boolean isEvenLengthC = false; // set boolean to false
        boolean isEvenLengthF = false; // set boolean to false
        int valSpacesAfter = 0;

        System.out.println(" _____________________________________________");
        System.out.println("|       Celsius        |      Fahrenheit      |"); // top of table
        System.out.println("|---------------------------------------------|");
        for (int celsius = -100; celsius < 101; celsius++) { // table is from -100 to 100 celcius
            prettyNumberF = Math.round(CtoF(celsius) * 100.0)/100.0; // fahrenheit
            lengthOfNumC = String.valueOf(celsius).length();
            lengthOfNumF = String.valueOf(prettyNumberF).length();
            isEvenLengthC = (lengthOfNumC % 2 == 0); // aligning
            isEvenLengthF = (lengthOfNumF % 2 == 0); // aligning
            positionC = 21 - lengthOfNumC;
            positionF = 22 - lengthOfNumF; // far right line

            if (lengthOfNumC % 2 == 0) {
                System.out.print("|"); // print lines
                for (int k = 0; k < positionC / 2; k++) { // aligning
                    System.out.print(" "); // print spaces
                }
                System.out.print(" " + celsius + " "); // print spaces around celsius
                if (isEvenLengthC) {
                    valSpacesAfter = positionC / 2;
                } else {
                    valSpacesAfter = positionC / 2 + 1;
                }
                for (int l = 0; l < valSpacesAfter; l++) {
                    System.out.print(" "); // print spaces
                }
                System.out.print("|"); // print line
            } else {
                System.out.print("|");
                for (int k = 0; k < positionC / 2; k++) {
                    System.out.print(" "); // print spaces
                }
                System.out.print(celsius);
                if (isEvenLengthC) {
                    valSpacesAfter = positionC / 2;
                } else {
                    valSpacesAfter = positionC / 2 + 1;
                }
                for (int l = 0; l < valSpacesAfter; l++) {
                    System.out.print(" ");
                }
                System.out.print("|"); // for printing top to bottom
            }

            for (int k = 0; k < positionF / 2; k++) {
                System.out.print(" "); // print spaces
            }
            System.out.print(prettyNumberF); // print fahrenheit
            if (isEvenLengthF) {
                valSpacesAfter = positionF / 2;
            } else {
                valSpacesAfter = positionF / 2 + 1; // aligning
            }
            for (int l = 0; l < valSpacesAfter; l++) { // aligning
                System.out.print(" "); // print spaces
            }
            System.out.println("|"); // for printing top to bottom
        }
        System.out.println(" --------------------------------------------- "); // bottom line
    }

    public static double CtoF (double celsius) { // fahrenheit is a double
        return ((celsius * 9)/5) + 32; // convert celsius to Fahrenheit
    }
}
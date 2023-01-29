package UltimateJava2.PaymentsRevisited;

public class Console {
    private static final int MIN = 9_999;
    private static final int MAX = 100_001;
    private static final byte TERM_MIN = 4;
    private static final byte TERM_MAX = 16;
    private static final float MIN_INT = 2;
    private static final float MAX_INT = 6;
    static int _principal;
    static float _annual_Interest;
    static byte _term;





    static void readInterestRate(float interest) {

        do {
            if (interest >= MIN_INT && interest <= MAX_INT){
                _annual_Interest = interest;
                break;}
            else
                System.out.printf("Enter a value between %,1.2f and %,1.2f \n"
                        , MIN_INT
                        , MAX_INT);

        } while (true);


    }// end of readInterestRate()

    static void readTerm(double term) {

        do {
            if (term >= TERM_MIN && term <= TERM_MAX){
                _term = (byte) term;
                break;}
            else
                System.out.print("Enter a value between " + TERM_MIN + "and" + TERM_MAX + "years");

        } while (true);


    } // end of readTerm()

    static void  readPrincipal(int principal) {

        do {
            if (principal >= MIN && principal <= MAX){
            _principal = principal;
                break;}
            else
                System.out.printf("Enter a value between $%,1.2d and $%,1.2d \n", MIN
                        , MAX);

        } while (true);


    }// end of readPrincipal()
}// end of Console Class

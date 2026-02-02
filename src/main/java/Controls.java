public class Controls {

    public static void main(String[] args) {

        int i = 10;
        {
            int k = 15;
            System.out.println("I = " + i );
            System.out.println("K = " + k );
        }

        int testScore = 95;

        if (testScore >= 90) {
            System.out.println("Excellent");
        } else if (testScore >= 60) {
            System.out.println("Good");
        } else if (testScore >= 30) {
            System.out.println("Fail");
        }

        System.out.println("Test score: " + testScore);
    }
}




public class Merry {
    public static void main(String[] args) {

        int size = 13;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if ((j == size / 2) || ((i > 1 && i < size - 2)
                        && ((i == j) || (i == size - j - 1))))
                    System.out.print("\u2591\u2746");
                else
                    System.out.print("\u2591\u2591");
            }  System.out.println();
            }
        System.out.println("!!! MERRY CHRISTMAS AND HAPPY NEW YEAR");
        }
    }


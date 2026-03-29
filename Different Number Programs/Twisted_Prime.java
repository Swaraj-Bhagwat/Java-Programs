class Twisted_Prime {
    public static void main(String[] args) {

        int num = 13;
        int temp = num;
        int den = 2;
        int rev = 0;

        // Check prime
        while (den <= num / 2) {
            if (num % den == 0) {
                break;
            }
            den++;
        }

        if (den > num / 2) {

            // Reverse number
            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            // Check reversed prime
            int d = 2;
            while (d <= rev / 2) {
                if (rev % d == 0) {
                    break;
                }
                d++;
            }

            if (d > rev / 2) {
                System.out.println("Twisted Prime");
            } else {
                System.out.println("Not Twisted Prime");
            }

        } else {
            System.out.println("Not Twisted Prime");
        }
    }
}
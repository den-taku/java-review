class Control {
    public static void main(String[] args) {
        int a = 3;
        if (a == 3) {
            System.out.println("a is 3.");
        } else {
            System.out.println("a is not 3.");
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        int i = 10;
        while (i < 20) {
            System.out.println(i);
            ++i;
        }

        do {
            System.out.println(i);
        } while (i < 20);

        int n = 3;
        switch (n) {
            case 0:
                System.out.println("n is zero.");
                break;
            case 1:
                System.out.println("n is one.");
                break;
            case 2:
                System.out.println("n is two.");
                break;
            case 3:
                System.out.println("n is three.");
                break;
            default:
                System.out.println("unknown");
                break;
        }

        loop1: for (int j = 0; j < 10; ++j) {
            for (int k = 0; k < 10; ++k) {
                if ((j == 1) && (k == 5)) {
                    break loop1;
                } else {
                    System.out.println("j = " + j + " , k = " + k);
                }
            }
        }

        for(int j = 0; j < 5; ++j) {
            if (j == 3) {
                continue;
            } else {
                System.out.println(j);
            }
        }
    }
}
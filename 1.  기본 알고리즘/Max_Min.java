public class Max_Min {
    public static void main(String[] args) {
        System.out.println(max4(1,2,3,4));
        System.out.println(min3(1,2,3));
    }

    public static int max4(int a, int b, int c, int d) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }
        return max;
    }

    public static int min3(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }
}

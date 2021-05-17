public class Q16 {
    public static void main(String[] args) {
        spira(7);
    }

    static void spira(int n) {
        for (int i = 1; i <= n; i+=2) {
            for(int j =1; j<= (n-i)/2; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

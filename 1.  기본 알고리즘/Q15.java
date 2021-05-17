public class Q15 {
    public static void main(String[] args){
        triangleLB(5);
        triangleLU(5);
        triangleRU(5);
        triangleRB(5);
    }
    public static void triangleLB(int n){
        //왼쪽 아래가 직각인 이등변 삼각형을 출력
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleLU(int n){
        //왼쪽 위가 직각인 이등변 삼각형을 출력
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleRU(int n){
        //오른쪽 위가 직각인 이등변 삼각형을 출력
        for(int i=n;i>0;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleRB(int n){
        //오른쪽 아래가 직각인 이등변 삼각형을 출력
        for(int i=n;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=n-i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

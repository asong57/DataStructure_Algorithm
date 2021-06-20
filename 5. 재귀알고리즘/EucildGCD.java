public class EucildGCD {
    //유클리드 호제법으로 최대공약수 구하기
    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }else{
            return gcd(y, x % y);
        }
    }
}

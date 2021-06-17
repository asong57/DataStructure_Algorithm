import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
    //자연 정렬로 정렬되지 않은 배열에서 검색하기
    //각 배열의 요소가 어떤 순서로 줄지어 있는지 알려주어야 한다.
    //Comparator와 compare 이용
    
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //Comparator 인터페이스
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        //compare 메소드를 구현하는 클래스
        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int height = stdIn.nextInt();
        PhyscData[] x = {
                new PhyscData("김송아", 165, 0.3),
                new PhyscData("김건아", 165, 0.4)
        };
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
    }
}

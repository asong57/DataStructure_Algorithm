import java.util.Arrays;

public class BinSearch {
    //이진 검색
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] > key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        //Arrays.binarySearch(배열, 원하는 key) 이용하기
        int idx = Arrays.binarySearch(a, key);

        return -1;
    }
}

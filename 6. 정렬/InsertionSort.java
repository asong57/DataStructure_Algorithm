public class InsertionSort {
    //단순 삽입 정렬은 선택한 요소를 그보다 더 앞쪽의 알맞은 위치에 삽입하는 작업을 반복하여 정렬하는 알고리즘이다.
    //단순 선택 정렬과 다른 점은 값이 가장 작은 요소를 선택해 알맞은 위치로 옮긴다는 점이다.
    
    static void insertionSort(int[] a, int n){
        for(int i=1;i<n;i++){
            int j;
            int tmp = a[i];
            for(j = i;j>0 && a[j-1] > tmp;j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }
}

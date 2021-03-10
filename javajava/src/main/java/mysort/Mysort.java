package mysort;

public class Mysort {
    public static void main(String[] args) {
    int[] arr = {5,4,1,2,9,7,77};
   mergerSort(arr);
        for (int e:arr
             ) {
            System.out.println(e);
        }
    }

    public static void quickSort(int[] arr){
        quickSort(arr,0, arr.length-1);
    }
    private static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int startIndex = left;
        int endIndex = right;
        int pviot = arr[left];
        int tmp = 0;
        while (left<right){
            while (arr[right]>=pviot&&right>left){
                right--;
            }
            while (arr[left]<=pviot&&left<right){
                left++;
            }
            if(left>=right) {
                break;
            }
            tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        tmp = arr[left];
        arr[left] = arr[startIndex];
        arr[startIndex] = tmp;
        quickSort(arr,startIndex,left-1);
        quickSort(arr, left+1, endIndex);
    }

    public static void mergerSort(int arr[]){
        mergerSort(arr,0,arr.length-1);
    }
    private  static  void mergerSort(int[] arr,int left,int right){
        if(left>=right) {
            return;
        }
        int mid = (left+right)/2;
        mergerSort(arr, left, mid);
        mergerSort(arr, mid+1,right);
        merger(arr,left,mid,right);
    }
    private static void merger(int[] arr,int left,int mid ,int right){
        int i = left;
        int m = mid+1;
        int k = 0;
        int[] tmp = new int[right-left+1];
        while (true){
            if(i>mid||m>right) {
                break;
            }
            if(arr[i]<arr[m]){
                tmp[k] = arr[i];
                i++;
                k++;
            }else{
                tmp[k] = arr[m];
                m++;
                k++;
            }
        }
        if(i<=mid){
            System.arraycopy(arr,i,tmp,k,mid-i+1);
        }
        if(m<=right){
            System.arraycopy(arr,m,tmp,k,right-m+1);
        }
        System.arraycopy(tmp,0,arr,left,tmp.length);
    }

}

import ccyy.myTools;
public class mysort {
    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12};
        System.out.println( myTools.toString(arr));
        mergesort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void mergesort(int [] arr) {
        int low =0 ;
        int hight = arr.length-1;
        int[] tmp = new int[arr.length];
        mergesort(arr, low, hight, tmp);
    }
    public static void mergesort(int [] arr,int low,int hight,int[] tmp) {
        if(low<hight){
            int mid = (hight+low)/2;
            mergesort(arr, low, mid, tmp);
            mergesort(arr, mid+1, hight, tmp);
            merge(arr, low, mid, hight, tmp);
        }

    }
    public static void merge(int[] arr,int low,int mid ,int hight,int[] tmp) {
        int i=0;
        int j=low;
        int k = mid+1;
        while(true){
            if(j>mid||k>hight) break;
            if(arr[j]<arr[k]){
                tmp[i] = arr[j];
                i++;
                j++;
            }else{
                tmp[i] = arr[k];
                i++;
                k++;
            }
        }
        while(true){
            if(j>mid) break;
            tmp[i] = arr[j];
            i++;
            j++;
        }
        while(true){
            if(k>hight) break;
            tmp[i] = arr[k];
            i++;
            k++;
        }
        for(int t =0;t<i;t++){
            arr[low+t] = tmp[t];
        }
    }
}

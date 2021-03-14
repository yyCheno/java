package ccyy.set;


import java.util.LinkedList;

public class set {
    public static void main(String[] args){

        int[] testArr = {1,1};
        int[] ans = set(testArr);
        for (int e:ans
             ) {

            System.out.print(e+"");
        }

    }

    /**去重数组
     *
     * @param arr
     */
    public static int[] set(int[] arr){
        if(arr==null||arr.length==1){
            return arr;
        }
        LinkedList<Integer> ansList = new LinkedList<Integer>();

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                ansList.add(arr[i]);

            }else{

                //代表最后一个元素
                if(i== arr.length-1){
                    ansList.add(arr[i]);
                }
            }
        }

        //最后一个元素要加入
        ansList.add(arr[arr.length-1]);
        int[] ansArr = new int[ansList.size()];
        for (int j=0;j< ansArr.length;j++){
            ansArr[j] = ansList.get(j);
        }

      return ansArr;
    }
}

package DesignPattern;
interface Sort{
    public abstract int[] sort(int arr[]);
}
class BubbleSort implements Sort{
    public int[] sort(int arr[]){
       int len=arr.length;
       for(int i=0;i<len;i++){
           for(int j=i+1;j<len;j++){
              int temp;
              if(arr[i]>arr[j]){
                  temp=arr[j];
                  arr[j]=arr[i];
                  arr[i]=temp;
              }             
           }
        }
        System.out.println("Bubble Sort");
        return arr;
    }
}
class InsertionSort implements Sort {
    public int[] sort(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];

                } else
                    break;
            }
            arr[j] = temp;
        }
        System.out.println("Insert Sort");
        return arr;
    }
}
class SelectionSort implements Sort {
    public int[] sort(int arr[]) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++) {
            temp = arr[i];
            int j;
            int samllestLocation = i;
            for (j = i + 1; j < len; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    samllestLocation = j;
                }
            }
            arr[samllestLocation] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Select Sort");
        return arr;
    }
}
class ArrayHandler
{
    private Sort sortObj;
    
    public int[] sort(int arr[])
    {
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj; 
    }
}
public class StrategyDemo {
	public static void main(String args[])
    {
       int arr[]={1,4,6,2,5,3,7,10,9};
       int result[];
       ArrayHandler ah=new ArrayHandler();
       
       Sort sort = new SelectionSort();    //使用选择排序
       
       ah.setSortObj(sort); //设置具体策略
       result=ah.sort(arr);
       
       for(int i=0;i<result.length;i++)
       {
               System.out.print(result[i] + ",");
       }
    }
}

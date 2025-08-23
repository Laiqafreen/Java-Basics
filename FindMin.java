public class FindMin {
   static int minNumber(int[] arr){
        int min=arr[0];
         if(arr.length==0){
             return -1;
        }
        for(int index=0;index<arr.length;index++){
             if(arr[index]<min){                 min=arr[index];
            }
         }
         return min;
     }
    public static void main(String[] args) {
       int[] arr={123,56,677,88,65,43,30};
        System.out.println(minNumber(arr));     }

     }




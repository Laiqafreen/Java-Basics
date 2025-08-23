public class CeilingNumber {
    public static void main(String[] args) {
        //int [] arr= {2,3,5,9,14,16,18};
       // int target = 10;
       // int ans = searchCeilingN(arr,target);
       int [] arr={1,2,3,1};
       int ans= peakElement(arr);
        System.out.println(ans);

    }
   // static int searchCeilingN(int [] arr,int target){
   static int peakElement(int arr[]){
        int left=0;
        int right=arr.length-1;
       // if(target>arr[right]) return -1;
        while(left<right){
            int mid=left+(right-left)/2;
        //    // if(arr[mid]==target){
        //         return arr[mid];
        //     }
            if(arr[mid]>arr[mid+1]){
                right = mid;
            }
            else{
                left=mid+1;

            }
        }
        //when return floor value of target
        //return arr[right];
        return arr[left];


    }
    
    
}


public class SumArr {
    public static void main(String args[]){
        float []sum = new float [5];
        float sumArr = 0.0f;

        //Sum elements of array.
        sum[0]=25.9f;
        sum[1]=27.8f;
        sum[2]=28.9f;
        sum[3]=29.89f;
        sum[4]=20.11f;
        for(float number : sum){
            sumArr= sumArr + number;
        }
         System.out.println(sumArr);
    }
    
}

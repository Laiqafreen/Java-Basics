public class ArrMarks {
    public static void main(String args[]){
        int []pMarks = {56,78,89,74,67};
        int sum = 0;
        double average = 0.0;
        for(int i : pMarks){
            sum = sum+i;
            average = (double)sum /5;

        }
        System.out.println("Average marks of student in physics: "+ average);

    }
    
}

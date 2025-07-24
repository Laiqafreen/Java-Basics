public class Array {
    public static void main(String []args){
        int []marks = new int[5];
        marks[0]=56;
        marks[1]=96;
        marks[2]=86;
        marks[3]=76;
        marks[4]=66;
        //System.out.println(marks[0]);
        for(int i =0 ;i<marks.length ;i++){
            System.out.println(marks[i]);
        }
        System.out.println(" ");  
        for(int i = 4 ;i>=0;i--){
            System.out.println(marks[i]);
        }
        
    }
    
}

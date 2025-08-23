public class SubSequence {
    static void subSeq(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        subSeq(str.substring(1) , result+str.charAt(0));
        subSeq(str.substring(1),result);

    }
    public static void main(String[] args) {
        subSeq("amit", "");
        
    }
    
}

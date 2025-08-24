public class Count {
    public static void main(String[] args) {
        String str = "he&llo 12  3!";
        count(str);
        
    }
    static void count(String str){
        int cntLetters=0;
        int cntNumbers=0;
        int cntSpaces=0;
        int cntSpecial =0;
        char[] ch=str.toCharArray();

        for(char i : ch){
            if(Character.isLetter(i)){
                cntLetters++;
            }else if(Character.isDigit(i)){
                cntNumbers++;

            }else if(Character.isWhitespace(i)){
                cntSpaces++;
            }else{
                cntSpecial++;
            }
            
        }
        System.out.println(cntLetters);
        System.out.println(cntNumbers);
        System.out.println(cntSpaces);
        System.out.println(cntSpecial);

    }
    
}

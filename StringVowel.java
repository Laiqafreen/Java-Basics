public class StringVowel {
    public static void main(String[] args) {
        String str="hello";
        countVowelConsonent(str);
    }
    static void countVowelConsonent(String str){
        char[] st=str.toCharArray();
        int cntVowels =0;
        int cntConsonents =0;
        for(int i=0;i<=st.length-1;i++){
            if(st[i] == 'a' || st[i] == 'e' || st[i]== 'i' || st[i]== 'o' || st[i]== 'u' || st[i] == 'A' || st[i] == 'E' || st[i]== 'I' || st[i] == 'O' || st[i] == 'U'){
                cntVowels++;
            }else{
                cntConsonents++;
            }
        }
        System.out.println(cntVowels);
        System.out.println(cntConsonents);


    }
    
}

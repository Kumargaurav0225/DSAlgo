package prac.recursion;

public class BinaryPermuation {

    public static void main(String[] args) {
        generateBinary(" ",0);
    }

    public static void generateBinary(String str,int idx){
        if(3 == idx){
            System.out.println(str);
            return;
        }
        str.replace(str.charAt(idx),'0');
        generateBinary(str+"0",idx+1);
        str.replace(str.charAt(idx),'1');
        generateBinary(str+"1",idx+1);
    }

}

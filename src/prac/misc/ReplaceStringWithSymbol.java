package prac.misc;

public class ReplaceStringWithSymbol {
    public static void main(String[] args) {
        String s= "plusminusplus";
        String res= s.replaceAll("plus","+");
        String finalRes = res.replaceAll("minus","-");
        System.out.println(finalRes);
    }
}

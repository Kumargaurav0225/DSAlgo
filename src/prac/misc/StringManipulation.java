package prac.misc;

public class StringManipulation {
    public static void main(String[] args) {
        String input = "my name is zain";
        System.out.println(manipulate(input));

        String str = "Hi";
        System.out.println("length :: "+str.length());
        System.out.println("Index :: "+str.indexOf('i'));
    }

    private static String manipulate(String input) {
        if (input.isEmpty()) {
            return "Not Allowed";
        }
        StringBuilder res = new StringBuilder();
        String[] words = input.split(" ");
        for (String s : words) {
            res.append(s.substring(0, 1).toUpperCase())
                    .append(s.substring(1, s.length()))
                    .append(" ");
        }
        return res.toString();
    }
}

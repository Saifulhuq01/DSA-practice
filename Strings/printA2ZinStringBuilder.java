package DSA.algos.Strings;

public class printA2ZinStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch= (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}

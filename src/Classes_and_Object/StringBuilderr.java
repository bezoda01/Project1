package Classes_and_Object;

import java.util.StringTokenizer;

public class StringBuilderr {
    public static void main(String[] args) {
        String[] mass = new String[]{"And ", "he ", "was ", "be ", "a ", "hero."};
        String name = "Zhenya";

        StringBuilder builder = new StringBuilder(name);
        builder.append(" is alive");
        builder.append(", and his ");
        builder.append(21);
        builder.append(" years old.");
        System.out.println(builder);
        String timeng = builder.toString();

        adTo(timeng);

        System.out.println(append(timeng,mass));

        System.out.println(revers(builder));
    }
    public static StringBuilder revers(StringBuilder builder){
        StringBuilder build = new StringBuilder(builder);
        build.reverse();
        return build;
    }

    public static StringBuilder append(String timeng, String[] str){
        StringBuilder builder = new StringBuilder(timeng);
        for(int i = 0;i < str.length;i++){
            builder.append(str[i]);
        }
        return builder;
    }

    public static void adTo(String timeng){
        StringTokenizer token = new StringTokenizer(timeng, " ");
        while(token.hasMoreTokens()){
            String tokenz = token.nextToken();
            System.out.println(tokenz);
        }
    }
}

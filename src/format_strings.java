import Classes_and_Object.MySymmary;

public class format_strings extends MySymmary {
    public static void main(String[] args) {
        tellAboutYou();
    }
    public static void tellAboutYou(){
        String str = String.format("He is a %s, His name: %s, Years: %d, He lives in %s", gender, name, age, live);
        System.out.println(str);
    }
}

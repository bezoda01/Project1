public class StringMethods {
    public static void main(String[] args) {
        String string = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
        System.out.println(getString(indexFromFirstWord,indexFromLastWord,string));
    }

    public static int getIndexFromFirstWord(String string, String word) {
        int a = string.indexOf(word);//строка.indexOf(то что мы хотим найти в строке)
        return a;//- мы находим номер буквы(из общей длинны строки) с которой начинается то слово которое хотим найти
    }

    public static int getIndexFromLastWord(String string, String word) {
        int a = string.lastIndexOf(word);//строка.lastIndexOf(то что хотим найти в строке) - поиск начинается с конца строки
        return a;//- мы находим номер буквы(из общей длинны строки) на которую заканчивается то слово которое хотим найти
    }

    public static String getString(int indexFromFirstWord, int indexFromLastWord,String string){
        String newString = string.substring(indexFromFirstWord,indexFromLastWord);
        return newString;
        //строка.substring(первый номер из длины строки, второй номер )
        //вырезаем из строки часть используя индексы которые ранее нашли
    }
}


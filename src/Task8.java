public class Task8 {
    public static void main(String[] args) {
        System.out.println(ninthDegree(5));
    }
    public static long cube(long count){
        return count * count * count;
    }

    public static long ninthDegree(long count){
        return cube(cube(count));
    }
}

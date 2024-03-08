public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<Integer,String>(10, "Hello");
        pair.getFirst();
        pair.getSecond();
        pair.setFirst(20);
        pair.setSecond("World");
    }
    
}



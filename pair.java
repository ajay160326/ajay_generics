public class pair<T, U> {
    private T first;
    private U second;

    public pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public pair<U, T> reverse() {
        return new pair<>(second, first);
    }

    @Override
    public String toString() {
        return "pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        pair<String, Integer> pair = new pair<>("Hello", 123);
        System.out.println("Original pair: " + pair);

        pair<Integer, String> reversedPair = pair.reverse();
        System.out.println("Reversed Pair: " + reversedPair);
    }
}

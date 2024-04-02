public class EliudsEggs {
    public int eggCount(int number) {
        return (int) Integer.toBinaryString(number).chars().filter(n -> n != '0').count();
    }
}

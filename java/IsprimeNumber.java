public class IsprimeNumber {

    public Boolean isPrimeMember(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsprimeNumber isprimeNumber = new IsprimeNumber();
        boolean abc = isprimeNumber.isPrimeMember(11);
        System.out.println("final value" + abc);
    }

}

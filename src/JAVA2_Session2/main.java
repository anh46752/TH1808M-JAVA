package JAVA2_Session2;

public class main {
    public static void main(String[] args) {
        plus(5,7);
        plus(3.134, 2.33455);
        plus("aaa", "bbb");
    }
public static <E> void plus(E a, E b){
        if (a instanceof  Integer){
            Integer E = (Integer)a+ (Integer) b;
            System.out.println(E);
        }else if (a instanceof  Double){
            Double E = (Double)a + (Double)b;
            System.out.println(E);
        }else {
            System.out.println("ko tinh toan duoc");
        }
}

}

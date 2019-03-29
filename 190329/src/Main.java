public class Main {
    public static void main(String[]args) {
        matice m1 = new matice(4, 4);
        // System.out.println(m1);

        m1.nastavHodnotu(1, 2, 10);
        m1.nastavHodnotu(2, 2, 5);
        m1.nastavHodnotu(1, 4, 1);
        m1.nastavHodnotu(4, 3, -1);
        //  System.out.println(m1);

      /*  double h=m1.ziskejHodnotu(4,1);
        System.out.println(h);*/
        matice m2 = m1.soucinSkalar(5);
        System.out.println(m1);
        System.out.println();
        System.out.println(m2);
    }
}

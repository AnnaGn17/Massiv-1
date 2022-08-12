

public class Main  {
    public static void main(String[] args) {
        //   task 1
        int weight [] = new int[3];
        weight [0]=1;
        weight [1]=2;
        weight [2]=3;
        double drob [] = {1.57, 7.654, 9.986};
        char arch [] = {65, 66, 67};
//   task 2
        int s = weight.length - 1;
        for (int i = 0; i <= s; i ++) {
            if (i == s)
                System.out.println(weight[i]);
            else System.out.print(weight[i] + ",");

        }

        int z = drob.length - 1;
        for (int k = 0; k <= z; k++) {
            if (k == z)
                System.out.println(drob[k]);
            else System.out.print(drob[k] + ",");

        }

        int x = arch.length - 1;
        for (int l = 0; l <= x; l++) {
            if (l == x)
                System.out.println(arch[l]);
            else System.out.print(arch[l] + ",");

        }
//   task 3
        int h = weight.length - 1;
        for (int q = h; q >= 0; q--) {
            if (q == 0) System.out.println(weight[q]);
            else System.out.print(weight[q] + ",");}

        int j = drob.length - 1;
        for (int w = j; w >= 0; w--) {
            if (w == 0) System.out.println(drob[w]);
            else System.out.print(drob[w] + ",");}

        int k = arch.length - 1;
        for (int e = k; e >= 0; e--) {
            if (e == 0) System.out.println(arch[e]);
            else System.out.print(arch[e] + ",");}

//   task 4
        for (int n = 0; n < weight.length; n++) {
            if (weight[n] % 2 == 1) {
                weight[n]++;
                if (n < 2)
                    System.out.print(weight[n] + ",");
                else System.out.println(weight[n]);
            }


        }
    }
}
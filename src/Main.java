import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //   task 1
        int weight [] = new int[3];
        weight [0]=1;
        weight [1]=2;
        weight [2]=3;
        double drob [] = {1.57, 7.654, 9.986};
        char arch [] = {65, 66, 67};
//   task 2
        for (int i = 0; i <= 2; i ++){
            if (i < 2) System.out.print(weight[i] + ",");
            else System.out.println(weight[i]);}

        for (int k = 0; k <= 2; k++) {
            if (k < 2) System.out.print(drob[k] + ",");
            else System.out.println(drob[k]);}

        for (int l = 0; l <= 2; l++) {
            if (l < 2) System.out.print(arch[l] + ",");
            else System.out.println(arch[l]);}
//   task 3
        for (int q = 2; q >= 0; q--) {
            if (q > 0) System.out.print(weight[q] + ",");
            else System.out.println(weight[q]);}

        for (int w = 2; w >= 0; w--) {
            if (w > 0) System.out.print(drob[w] + ",");
            else System.out.println(drob[w]);}

        for (int e = 2; e >= 0; e--) {
            if (e > 0) System.out.print(arch[e] + ",");
            else System.out.println(arch[e]);}

//   task 4
        for (int n = 0; n <= 2; n++) {
            if (weight[n] % 2 == 1) {
                weight[n]++;
                if (n < 2)
                    System.out.print(weight[n] + ",");
                else System.out.println(weight[n]);
            }


        }
    }
}
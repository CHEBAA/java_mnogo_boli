import java.util.Scanner;

public class zad_1_g {
    public static void main(String[] args){
        System.out.println("введите длину массива");
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int massive[] = new int[n];
        for (int i=0;i<n;i++){
            massive[i] = Integer.parseInt(in.nextLine());

        }
        in.close();
        for (int i=0;i<n;i++){
            System.out.print(massive[i]+" ");
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if (Math.abs(massive[i]-5)>6){
                count++;
            }
        }
        System.out.println("\nколичество "+ count);
    }
}

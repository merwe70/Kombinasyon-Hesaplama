import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,r,c;
        int totalN=1, totalR=1, total=1,a=1;

        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz");
        n=inp.nextInt();

        System.out.println("R sayısını giriniz");
        r =inp.nextInt();

        if((r>n) || (r<0)){
            System.out.println("Geçersiz veri girdiniz");
        }
        else {
            for (int i=1; i<=n; i++){
              totalN*=i;
            }
            for (int i=1; i<=r; i++){
                totalR*=i;
            }
            for (int i = 1; i<=a; i++) {
                total = total * i;
            }

            c = totalN / (totalR * total);
            System.out.print("n ve r değerinin kombinasyonu : " + c);
        }

    }
}
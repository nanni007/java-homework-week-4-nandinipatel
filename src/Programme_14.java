public class Programme_14 {
    public static void main(String[] args) {
        int n = 7;
        int i = 1;
        while (i<=n){
            int j = 1;
            while (j<=n-1){
                System.out.print("  ");
                j++;
            }
            j=1;
            while (j<=2*i-1){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        i=n-1;
        while (i >= 1) {
            int j =1;
            while (j<=n-1){
                System.out.print("  ");
                j++;
            }
            j=1;
            while (j<=2*i-1){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        double num = 0;
        while(num<=3){
            System.out.printf("%.1f, ", num);
            num=num+0.1;
        }
        System.out.printf("%.1f", num);

        System.out.println();
        num = 0;
        do{
            System.out.printf("%.1f, ", num);
            num=num+0.1;
        } while(num<=3);
        System.out.printf("%.1f", num);
    }
}

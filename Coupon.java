import java.util.Scanner;

class Coupon {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
      
            Shop s1 = new Shop();
            s1.input(sc);
            System.out.println(s1.process());
        

        sc.close();
    }
}

class Shop {
    int n, c, d;
    int[] p;

void input(Scanner sc) {
 System.out.println("ENTER ITEMS");       
n = sc.nextInt();
 System.out.println("COUPON PRICE"); 
        c = sc.nextInt();
 System.out.println("DISCOUNT AMOUNT"); 
        d = sc.nextInt();
        p = new int[n];
        for (int i = 0; i < n; i++) {
 System.out.println("ENTER EACH ITEM PRICE"); 
            p[i] = sc.nextInt();
        }
    }

    String process() {
        int s = 0, res = 0;
        for (int i : p) {
            s += i;
            if(i>d)
		res += (i - d);
        }


        if (s > (res + c))
            return "COUPON";
        else
            return "NO COUPON";
    }
}

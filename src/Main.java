import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a;
        char x,y;
        a=in.nextLine();
        x=in.next().charAt(0);
        y=in.next().charAt(0);
        System.out.println(a.replace(x,y));
    }
}
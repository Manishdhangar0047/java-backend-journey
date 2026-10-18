public class If_else_if {

    public static void main(String[] args){
        int a=90;
        int b=80;
        int c=70;

        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

    }
}

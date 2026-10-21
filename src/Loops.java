public class Loops {
    public static void main(String args[]){
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);

        for(int i=1;i<=20;i++){

            if(i%2==0){
                System.out.println(i);
            }
        }
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        int n=8;
        int count=1;
        while(count<=10){

            System.out.println(n+"X"+count+"="+(n*count));
            count++;
        }
        int fact=1;
        for(int j=5;j>=1;j--){
            fact=fact*j;
        }
        System.out.println(fact);

    }

}

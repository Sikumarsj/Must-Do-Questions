public class AddNum {
    public static void main(String[] args) {
        
       int num = 9995;
       int n =Add(num);
    //    System.out.println(n);
    // System.out.println(Num(n));

    //    while(n>9){
    //     n = Num(n);
    //    }

    //    System.out.println(n);

    System.out.println(Num(Add(num)));

    }

    public static int Add(int n ){
        if(n==1)return 1;
        int sum = n + Add(n-1);
        return sum;
    }

    public static int Num(int n ){
        
        int temp = n;

        int sum = 0;

        while(temp>0 ){
            sum+=temp%10;
            temp/=10;
        }
      

        if(sum<10)return sum;
        return Num(sum);
    }


}

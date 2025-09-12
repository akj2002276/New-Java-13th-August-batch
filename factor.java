

class Main {
    public static void main(String[] args) {
        int n = 100; //1 2 5 10
        System.out.print(1 + " ");
        for(int i = 2; i<=n/2; i=i+1){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
        
    }
}

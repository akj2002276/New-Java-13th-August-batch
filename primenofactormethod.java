// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("No is prime");
        }
        else{
            System.out.print("Not prime");
        }
    }
}

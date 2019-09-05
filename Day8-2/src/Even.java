public class Even {
        public static void main(String[] args){
            int num1 = 7;
            int num2 = 5;
            int sum = num1 + num2;
//            System.out.println(sum);
            for (int i = 0; i<5; i++){
                if( i % 3 == 0){
                    System.out.println("Fizz 3");
                } else if(i % 5 == 0) {
                    System.out.println("Buzz 5");
                } else{
                    System.out.println("Fiz Buz");
                }
            }
        }
}

package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num = 20;
        try {
            int result = num /0;
            System.out.println(result);

        }catch (Exception ex){
            System.out.println("you can not divide a number by zero");
        }
    }
}

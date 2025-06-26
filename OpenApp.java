import java.io.IOException;

public class open {
    public static void main(String[] args){
        try{
            Process p = new  ProcessBuilder("").start(); //path of the .exe file
            Thread.sleep(10000); // this will close your app in 10sec
            p.destroy();
            System.out.println("Application is closing now! :)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        catch (InterruptedException e) { // Corrected exception type
            System.out.println("Sleep was interrupted!");
        }
   
    }

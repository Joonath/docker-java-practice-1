package id.web.jonathan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        for(int i = 0; i < 100; i++){
            System.out.println("Ping! " + String.valueOf(i));
            Thread.sleep(1000);
        }
    }
}

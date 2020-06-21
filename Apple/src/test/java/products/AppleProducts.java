package products;
import base.CommonAPI;
import org.testng.annotations.Test;
public class AppleProducts extends CommonAPI
{
    @Test
    public void products()
    {
        System.out.println("Apple products.");
    }
    @Test
    public void getTitle()
    {
        System.out.println( driver.getTitle());
    }
}

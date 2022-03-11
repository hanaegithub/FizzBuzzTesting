import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {


    @Test
    public void shouldReturnFizzWhen3(){
        String result=FizzBuzzConvertor.convert(3);
        Assert.assertEquals("Fizz",result);
    }
    @Test
    public void shouldReturnBuzzWhen5(){
        String result=FizzBuzzConvertor.convert(5);
        Assert.assertEquals("Buzz",result);
    }
    @Test
    public void shouldReturnFizzBuzzWhen15(){
        String result=FizzBuzzConvertor.convert(15);
        Assert.assertEquals("FizzBuzz",result);
    }
    @Test
    public void shouldReturnNumWhen1(){
        String result=FizzBuzzConvertor.convert(1);
        Assert.assertEquals("1",result);
    }
}

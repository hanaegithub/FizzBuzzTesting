import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void shouldReturnList1When1(){
        List<String> result=FizzBuzzList.toList(1);
        List<String> l=new ArrayList<>();
        l.add("1");
        Assert.assertEquals(l,result);
    }

    @Test
    public void shouldReturnList12When2(){
        List<String> result=FizzBuzzList.toList(2);
        List<String> l=Arrays.asList(new String[] {"1","2"});
        Assert.assertEquals(l,result);
    }

    @Test
    public void shouldReturnList12FizzWhen3(){
        List<String> result=FizzBuzzList.toList(3);
        List<String> l=Arrays.asList(new String[] {"1","2","Fizz"});
        Assert.assertEquals(l,result);
    }

    @Test
    public void shouldReturnList12Fizz4BuzzWhen5(){
        List<String> result=FizzBuzzList.toList(5);
        List<String> l=Arrays.asList(new String[] {"1","2","Fizz","4","Buzz"});
        Assert.assertEquals(l,result);
    }

    @Test
    public void shouldReturnList12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzWhen15(){
        List<String> result=FizzBuzzList.toList(15);
        List<String> list = Arrays.asList(new String[]{"1","2","Fizz",
                "4","Buzz","Fizz",
                "7","8","Fizz",
                "Buzz","11","Fizz",
                "13","14","FizzBuzz"});
        Assert.assertEquals(list,result);
    }
}

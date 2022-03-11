import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzClass {
    public static List<String> fizzBuzz(int num){
        List<String> list=new ArrayList<>();
        for(int i=1;i<=num;i++){
            list.add(""+FizzBuzzConvertor.convert(i));
        }
        return list;
    }
}

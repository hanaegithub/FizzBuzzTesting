import java.util.ArrayList;
import java.util.List;

public class FizzBuzzList {

    public static List<String> toList(int num){
        List <String> l=new ArrayList<String>();
        for(int i=1;i<=num;i++) {
            l.add("" + FizzBuzzConvertor.convert(i));
        }
        return l;
    }
}

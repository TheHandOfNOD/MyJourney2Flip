package advanced;

import java.util.Arrays;
import java.util.List;

public class ListReversionInJava {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (int i = myList.size()-1; i>=0; i--)
            System.out.print(myList.get(i) + ", ");
    }
}

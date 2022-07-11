import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
*
* @author authorname
*/
public class GenericMethods {

static Character [] charArray = {'h', 'e', '1', '1', 'o'};
static Integer [] intArray = {1, 2, 3, 4, 5};
static Boolean [] boolArray = {true, false, true };


public static<T> List<T> arrayToList(T[] array, List<T> list) {
for (T object : array) {
list.add(object);
}
return list;
}

public static void main(String[] args) {
    List<Character> charList = arrayToList (charArray, new ArrayList<> ());
    List<Boolean> boolList=arrayToList(boolArray, new ArrayList<>());
    List<Integer>intList = arrayToList(intArray, new ArrayList<>());
    //Iterating using the Iterator java
    Iterator itr =intList.iterator();
    
    while(itr.hasNext())
    {
        //Passing values from the Iterator
    Object element = itr.next();
    System.out.println(element+" ");
    }
    
    }
}
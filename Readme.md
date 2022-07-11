
### Example for array of characters,booleans,Integers for generics

##### using Genereic 

```
package generic_methods;
/**
import java.util.ArrayList;
import java.util.List;
*
* @author authorname
public class GenericMethods {
}
static Character [] charArray = {'h', 'e', '1', '1', 'o'};
static Integer [] intArray = {1, 2, 3, 4, 5};
static Boolean [] boolArray = {true, false, true };
}

public static List arrayToList (Object[] array, List<object> list) {
for (Object object : array) {
list.add(object);
}
return list;
}
public static void main(String[] args) {
List<Character> charList = arrayToList (charArray, new Arr
ayList<> ());
List<Boolean> boolList=arrayToList(boolarray, new ArrayList<>());
List<Integer>intList = arrayToList(intArray, new ArrayList<> ());

}
```

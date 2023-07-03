import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
  public static void main(String[] args) {
    /* Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.
 */
    task3();

  }

  static void task3() {
    List list = new ArrayList<>();
    list.add("list");
    list.add (77);
    list.add (88);
    list.add ("hallo");
    list.add(10);
    
    
    Iterator iterator = list.iterator();
    while (iterator.hasNext())   {
      Object o = iterator.next();
      if (o instanceof Integer) {
        iterator.remove();
      }
    }
    System.out.println(list);
  }
}

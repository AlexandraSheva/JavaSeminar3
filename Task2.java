import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2 {
  public static void main(String[] args) {
    /*Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.
 */
    task2(createList(10, 0, 10));

  }

  static void task2(List <Integer> list) {
    Collections.sort(list, Comparator.reverseOrder());
    System.out.println(list);
  }

  static List<Integer> createList(int size, int min, int max) {
    List <Integer> list = new ArrayList<> (size);
    for (int i = 0; i < size; i++) {
      list.add((int)(Math.random()*(max-min+1) + min));
    }
    return list;
  }
}

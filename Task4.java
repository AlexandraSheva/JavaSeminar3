import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    /*Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
    что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
     Напишите метод для заполнения данной структуры.
 */
      task4();
    
  }

  public static void task4() {
    List<ArrayList<String>> catalog = new ArrayList<>();
    addBook("Фантастика","Трудно быть богом", catalog);
    addBook("Фантастика","Марсианин", catalog);
    addBook("Детектив","Шерлок Холмс", catalog);
    /*Scanner scanner = new Scanner(System.in);
    System.out.println("Введите жанр: название ");
    String input = "";
    while(!input.equals(input));*/
    System.out.println(catalog);
  }

  public static void addBook(String type, String name, List<ArrayList<String>> catalog) {
    boolean hasType = false;
    for (int i = 0; i < catalog.size(); i++) {
      if(catalog.get(i).get(0).equals(type)) {
        catalog.get(i).add(name);
        return;
      }     
    }
    ArrayList<String> t = new ArrayList<>();
    t.add(type);
    t.add (name);
    catalog.add(t);
  }
}

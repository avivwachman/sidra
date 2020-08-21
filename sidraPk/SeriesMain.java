package sidraPk;

import java.util.*;

public class SeriesMain {
  static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println(
        "Enter: first Num, difference, length"); // נבקש את האיבר הראשון, ההפרש ואורך הסדרה
    double firstN = reader.nextDouble();
    double difference = reader.nextDouble();
    int number = reader.nextInt();
    Series s1 = new Series(firstN, difference, number);
    double lastVal = s1.value(number);
    System.out.println("Last Value =  " + lastVal); //
    s1.setNumber(s1.getNumber() + 1);
    System.out.println("New last value = " + s1.value(s1.getNumber())); //
  }
        }

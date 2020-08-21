package sidraPk;

import java.util.*;

public class Series {
  private double firstN; // איבר ראשון בסדרה
  private double difference; // הפרש הסדרה
  private int number; // מספר האיברים בסדרה

  public Series(double firstN, double difference, int number) // פעולה בונה שם פעולה בונה=שם המחלקה
      {
    this.firstN = firstN; // איבר ראשון בסדרה
    this.difference = difference; // הפרש הסדרה
    this.number = number; // מספר האיברים בסדרה
  }

  public void setNumber(int number) {
    this.number = number; // מעדכן את מספר האיברים בסדרה
  }

  public int getNumber() {
    return this.number; // מחזיר מספר איברים בסדרה
  }

  public double value(int i) {
    return (this.firstN
        + (i - 1) * difference); // מחזיר את הערך למקום המבוקש לפי נוסחאת סדרה חשבונית
  }

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



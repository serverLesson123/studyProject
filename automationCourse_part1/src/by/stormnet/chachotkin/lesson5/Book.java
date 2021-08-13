package by.stormnet.chachotkin.lesson5;

public class Book {
    private int id;
    private static int counter = 1;

    public void display(){
        System.out.printf("Id: %d \n", id);
    }

    private String author;
    private int year;
    private String name;

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
        id = counter++;
    }
}

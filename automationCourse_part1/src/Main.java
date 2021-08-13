import by.stormnet.chachotkin.lesson5.Book;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Autor", "Title", 1994);
        Book book2 = new Book("Autor2", "TitleAnother", 1944);

        book1.display();

        book2.display();
        System.out.println();
    }
}

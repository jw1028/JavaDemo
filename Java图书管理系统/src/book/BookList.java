package book;


public class BookList {
    private Book[] books;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BookList() {
        this.books = new Book[100];
        books[0]=new Book("三国演义","罗贯中",12,"小说");
        books[1] = new Book("西游记","吴承恩",32,"小说");
        books[2] = new Book("水浒传","施耐庵",52,"小说");
        this.size=3;
    }

    //尾插法
    public void setBooks(int pos,Book book){
        this.books[pos]=book;

    }
    public Book getBook(int pos){
        return this.books[pos];
    }

}

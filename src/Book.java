public class Book extends Document {
    private String author;
    private int numerPage;
    public Book(String id, String name, String number, String author, int numerPage){
        super(id,name,number);
        this.author = author;
        this.numerPage = numerPage;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setNumerPage(int numerPage) {
        this.numerPage = numerPage;
    }

    public int getNumerPage() {
        return numerPage;
    }

    @Override
    public String toString(){
        return "Book{" +
                "Author='" + author + '\'' +
                ", numerPage=" + numerPage +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number='" + numbers + '\'' +
                '}';
    }
}

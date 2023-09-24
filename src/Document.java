public class Document {
    protected String id;
    protected String name;
    protected String numbers;

    public Document(String id, String name, String number){
        this.id = id;
        this.name = name;
        this.numbers = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getNumbers() {
        return numbers;
    }
}

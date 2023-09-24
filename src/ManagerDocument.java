import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
    List<Document> manager;
    public ManagerDocument(){
        this.manager = new ArrayList<>();
    }
    public void addDocument(Document document){
        manager.add(document);
    }
    public boolean deleteDocument(String id){
        Document doc = this.manager.stream().filter(document -> document.getId().equals(id)).findFirst().orElse(null);
        if (doc == null) return false;
        this.manager.remove(doc);
        return true;
    }
    public void showInfor(){
        this.manager.forEach(document -> System.out.println(document));
    }
    public void searchByBook() {
        this.manager.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        this.manager.stream().filter(doc -> doc instanceof Paper).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByJournal() {
        this.manager.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
    }

}

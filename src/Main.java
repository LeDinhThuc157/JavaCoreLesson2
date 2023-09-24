import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true){
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To search document by category: ");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch (line){
                case "1" : {
                    System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Paper");
                    System.out.println("Enter c: to insert Journal");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a":{
                            System.out.println("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.println("Enter Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter Number: ");
                            String number = scanner.nextLine();
                            System.out.println("Enter Author: ");
                            String author = scanner.nextLine();
                            System.out.println("Enter Page Number: ");
                            int pageNumber = scanner.nextInt();
                            Document book = new Book(id,name,number,author,pageNumber);
                            managerDocument.addDocument(book);
                            System.out.println(book);
                            scanner.nextLine();
                            break;
                        }
                        case "b":{
                            System.out.println("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.println("Enter Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter Number: ");
                            String number = scanner.nextLine();
                            System.out.println("Enter Day Issue: ");
                            int dayIssue = scanner.nextInt();

                            Document papar = new Paper(id,name,number,dayIssue);
                            managerDocument.addDocument(papar);
                            System.out.println(papar);
                            scanner.nextLine();
                            break;
                        }
                        case "c":{
                            System.out.println("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.println("Enter Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter Number: ");
                            String number = scanner.nextLine();
                            System.out.print("Enter issue number : ");
                            int issueNumber = scanner.nextInt();
                            System.out.print("Enter issue month : ");
                            int issueMonth = scanner.nextInt();

                            Document journal = new Journal(id,name,number,issueNumber,issueMonth);
                            managerDocument.addDocument(journal);
                            System.out.println(journal);
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                }
                case "2" : {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search journal");
                    String choise = scanner.nextLine();
                    switch (choise){
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.searchByNewspaper();
                            break;
                        }
                        case "c":
                            managerDocument.searchByJournal();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                }
                case "3" : {
                    managerDocument.showInfor();
                    break;
                }
                case "4": {
                    System.out.print("Enter id to remove: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
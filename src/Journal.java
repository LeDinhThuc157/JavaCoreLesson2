public class Journal extends Document {
    private int issueNumber;
    private int monthIssue;
    public Journal(String id, String name, String number, int issueNumber, int monthIssue) {
        super(id, name, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    @Override
    public String toString(){
        return "Journal{" +
                "issueNumber='" + issueNumber + '\'' +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number='" + numbers + '\'' +
                '}';
    }
}

public class Paper extends Document {
    private int dayIssue;
    public Paper(String id, String name, String number, int dayIssue) {
        super(id, name, number);
        this.dayIssue = dayIssue;
    }


    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString(){
        return "Paper{" +
                "dayIssue='" + dayIssue + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number='" + numbers + '\'' +
                '}';
    }
}

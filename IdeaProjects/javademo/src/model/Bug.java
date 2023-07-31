package model;

public class Bug {
    private String bugDesc;
    private String email;
    private int bugPriority;
    private boolean bugStatus;
    private String reporter;
    private int lastUpdate;
    private boolean solved;


    public Bug(String bugDesc, String email, int bugPriority, boolean bugStatus, String reporter, int lastUpdate, boolean solved){
        this.bugDesc = bugDesc;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
        this.reporter = reporter;
        this.lastUpdate = lastUpdate;
        this.solved = solved;
    }

    public String getBugDesc(){
        return bugDesc;
    }

    public void setBugDesc(String bugDesc){
        if (bugDesc.length() < 10) {
            System.out.println("Incorrect bug description");
        } else {
            this.bugDesc = bugDesc;
        }
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")){
            System.out.println("Incorrect email format");
        } else {
            this.email = email;
        }
    }

    public int getBugPriority(){
        return bugPriority;
    }

    public void setBugPriority(int bugPriority){
        switch (bugPriority){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default:
                System.out.println("Incorrect bug priority range");
        }
    }

    public void setReporter(String reporter){
        switch (reporter){
            case "Steve":
                this.reporter = "Steve";
                break;
            case "John":
                this.reporter = "John";
                break;
            case "Emily":
                this.reporter = "Emily";
                break;
            default:
                System.out.println("Specified person isn't part of our team");
        }
    }

    public void showAllBugInfo(){
        System.out.println("model.Bug description: " + bugDesc + " email: " + email + " model.Bug priority: " + bugPriority + " bug Status: " + bugStatus + " Reporter: " + reporter + " last update: " + lastUpdate + " Solved: " + solved);
    }

}

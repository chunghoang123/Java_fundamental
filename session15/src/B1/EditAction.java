package B1;

public class EditAction {
    private String decription;
    private String time;


    public EditAction(String decription, String time) {
        this.decription = decription;
        this.time = time;
    }


    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public  String toString(){
        return "EditAction{" + "description="+ decription + '\'' + ", time='" +time +'\'' + '}';

    }

}

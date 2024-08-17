package singliLinkedList;

public class Home {
    String name;
    int count;
    Home next;

    public Home(String name, int count, Home next){
        this.name = name;
        this.count = count;
        this.next = next;
    }

}
class SurveyClient {
    public static void main(String[] args) {

        Home sll = new Home("jayesh",7,null);
        Home sujit = new Home("Sujit",4,null);
        Home rajesh = new Home("Rajesh",10,null);
        Home sagar = new Home("Sagar",8,null);

        sll.next = sujit;
        sll.next = rajesh;
        sll.next = sagar;
    }
}

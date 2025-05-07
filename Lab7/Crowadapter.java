public class Crowadapter implements Swan{
    private Crow crow;
    public Crowadapter(Crow crow) {
        this.crow = crow;
    }
    public void swim() {
        crow.fly(); 
    }
    public void eat() {
        crow.eat(); 
    }
    public void sing() {
        crow.cry(); 
    }
    
}

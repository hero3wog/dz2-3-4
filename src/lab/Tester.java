package lab;
import java.util.ArrayList;

public class Tester {
    private ArrayList<Circle> pitomnik = new ArrayList<>();
    public void add(Circle a){
        pitomnik.add(a);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "pitomnik=" + pitomnik +
                '}';
    }
}

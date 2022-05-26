import java.util.ArrayList;
import java.util.List;

public class MarketWeb {

    private String name;
    private int age;
    private String address;

    List<String> listProduct = new ArrayList<>();

    public MarketWeb(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean permission(int age) {
        if (age > 17) {
            return true;
        } else {
            return false;
        }
    }

    public void basket(String nameProduct) {
        listProduct.add(nameProduct);
    }


}

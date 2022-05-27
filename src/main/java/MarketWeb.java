import java.util.ArrayList;
import java.util.List;

public class MarketWeb extends Market implements CreditCard {
    // Open closed principle
    // Liskov substitution principle

    private String name;
    private int age;
    private String email;

    List<String> listProduct = new ArrayList<>();

    public MarketWeb(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String address) {
        this.email = address;
    }

    public void basket(String nameProduct) {
        listProduct.add(nameProduct);
    }

    @Override
    public int payCash(int itog, int cash) {
        int result;
        if ((cash - itog) >= 0) {
            result = cash - itog;
            return result;
        } else {
            System.out.println("Не достаточно средств");
            return -1;
        }

    }
    @Override
    public void payCreditCard(int itog, int cardNumber) {
        System.out.println("Оплата картой произведена успешно");
    }
}

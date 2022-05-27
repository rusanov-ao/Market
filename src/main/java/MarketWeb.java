import java.util.ArrayList;
import java.util.List;

public class MarketWeb implements Cash, CreditCard {

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

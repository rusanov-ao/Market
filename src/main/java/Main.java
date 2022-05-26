import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> listProduct = new ArrayList<>();
        listProduct.add("Хлеб");
        listProduct.add("Минеральная вода");
        listProduct.add("Соль");
        listProduct.add("Сахар");
        listProduct.add("Молоко");
        listProduct.add("Стиральный порошок");
        listProduct.add("Табак");
        listProduct.add("Сок");

        List<String> productForBasket = new ArrayList<>();

        MarketWeb customer1 = new MarketWeb("Alexander", 27, "Moscow, Kutuzovskii");

        System.out.println("Выберите товар");
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(i + 1 + ". " + listProduct.get(i));
        }

        while (true) {
            int x = scanner.nextInt();
            if (x == 0)  {
                System.out.println("В корзину добавлены следующие товары:");
                for(String nameProduct : productForBasket) {
                    System.out.println(nameProduct);
                }
                break;
            }
            productForBasket.add(listProduct.get(x - 1));
        }





    }


}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;


        List<String> listProduct = new ArrayList<>();
        listProduct.add("Хлеб");
        listProduct.add("Минеральная вода");
        listProduct.add("Соль");
        listProduct.add("Сахар");
        listProduct.add("Молоко");
        listProduct.add("Стиральный порошок");
        listProduct.add("Табак");
        listProduct.add("Сок");

        List<Integer> priceProduct = new ArrayList<>();
        priceProduct.add(20);
        priceProduct.add(10);
        priceProduct.add(5);
        priceProduct.add(15);
        priceProduct.add(50);
        priceProduct.add(80);
        priceProduct.add(200);
        priceProduct.add(70);

        List<String> productForBasket = new ArrayList<>();
        List<String> pay = new ArrayList<>();
        pay.add("Наличными курьеру");
        pay.add("Картой онлайн");

        MarketWeb customer1 = new MarketWeb("Alexander", 27, "alex@support.ru");
        SendAdvertising sendCustomer1 = new SendAdvertising();

        System.out.println("Выберите товар");
        System.out.println("Для выбора способа оплаты нажмите 0");
        printProduct(listProduct);


        while (true) {
            int x = scanner.nextInt();

            if (x == 0)  {
                System.out.println("В корзину добавлены следующие товары:");
                printProduct(productForBasket);
                System.out.println();
                System.out.println("Выберите способ оплаты:\nДля выхода наберите 99!");
                printProduct(pay);
                x = scanner.nextInt();
                if (x == 1) {
                    System.out.println("С какой суммы вам дать сдачу?");
                    int cashCustomer = scanner.nextInt();
                    System.out.println("Сдача составит " + customer1.payCash(count, cashCustomer) + " рублей.");
                    System.out.println("Благодарим за покупку!");
                    sendCustomer1.electronicCheck(count, productForBasket, customer1.getEmail());
                    break;
                } else if (x == 2) {
                    System.out.println("Введите номер карты");
                    int cardNumber = scanner.nextInt();
                    customer1.payCreditCard(count, cardNumber);
                    System.out.println("Благодарим за покупку!");
                    sendCustomer1.electronicCheck(count, productForBasket, customer1.getEmail());
                    break;               }

                continue;
            } else if (x == 99) {
                break;
            }
            productForBasket.add(listProduct.get(x - 1));
            count = count + priceProduct.get(x - 1);
        }

        ;

    }
    public static void printProduct(List<String> listProduct) { // Правило DRY!
        for (int i = 0; i < listProduct.size(); i++) {  // Нет магических чисел
            System.out.println(i + 1 + ". " + listProduct.get(i));
        }
    }


}

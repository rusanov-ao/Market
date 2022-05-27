import java.util.List;

public class SendAdvertising { // single responsibility principle

    public void electronicCheck(int sum, List<String> listProduct, String email) {
        System.out.println("\nЭлектронный чек сумму " + sum + " отправлен на электронную почту " + email);
        System.out.print("Список купленных товаров: ");
        for(String product : listProduct) {
            System.out.print(product + ", ");
        }
    }
}

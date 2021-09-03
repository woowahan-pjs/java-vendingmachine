package vendingmachine.view;

import vendingmachine.domain.coin.Coin;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Console {
    public static int askVendingMachineAmount() {
        System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
        return new Scanner(System.in).nextInt();
    }

    public static String askProducts() {
        System.out.println("\n상품명과 수량, 금액을 입력해 주세요.");
        // Scanners.nextLine();
        return new Scanner(System.in).next();
    }

    public static int askAmount() {
        System.out.println("\n투입 금액을 입력해 주세요.");
        return new Scanner(System.in).nextInt();
    }

    public static String askProduct() {
        System.out.println("구매할 상품명을 입력해 주세요.");
        return new Scanner(System.in).next();
    }

    public static void printBalance(final int balance) {
        System.out.println(String.format("\n남은 금액: %d원", balance));
    }

    public static void printChanges(final Map<Coin, Integer> changes) {
        System.out.println("잔돈");
        final String result = changes.entrySet().stream()
            .map(it -> String.format("%d원 - %d개", it.getKey().getAmount(), it.getValue()))
            .collect(Collectors.joining("\n"));
        System.out.println(result);
    }
}

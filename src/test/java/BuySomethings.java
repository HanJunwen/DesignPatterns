import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuySomethings {
    public static void main(String[] args) {
        //输入预算
        System.out.println("请输入预算金额：");
        Scanner budgetSca = new Scanner(System.in);

        //输出需要购买物品价格列表
        Scanner costSca = new Scanner(System.in);

        //接收输入预算的值
        String budgetStr = budgetSca.nextLine();
        //接收需要购买物品价格列表
        System.out.println("请输入需要购买物品的价格列表，以空格隔开：");
        String costStr = costSca.nextLine();

        //购买物品价格列表
        List<Integer> prices = new ArrayList<Integer>();

        //根据条件拆分出价格列表
        String[] cost = costStr.split("\\s+");
        if (cost.length > 0) {
            for (String c : cost) {
                try {
                    Integer price = Integer.parseInt(c);
                    if (price != null && price < 10000 && price > 0) {
                        prices.add(price);
                    } else {
                        System.out.println("输入价格列表不符合规范！");
                    }
                } catch (Exception e) {
                    System.out.println("价格列表输入不合法！");
                }
            }
        } else {
            System.out.println("请输入需要购买商品的价格！");
        }
        //排序
        Collections.sort(prices);

        try {
            Integer budge = Integer.parseInt(budgetStr);
            Integer totalPrice = 0;
            List<Integer> canBuyList = new ArrayList<Integer>();
            for (int i = 0; i < prices.size(); i++) {
                if (budge >= prices.get(i)) {
                    budge = budge - prices.get(i);
                    totalPrice += prices.get(i);
                    canBuyList.add(prices.get(i));
                } else {
                    break;
                }
            }
            System.out.println("能购买的商品总价为：" + totalPrice + "，详细价格列表为：" + canBuyList.toString());
        } catch (Exception e) {
            System.out.println("输入的预算值不合法！");
        }

    }
}


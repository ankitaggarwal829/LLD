import splitwise.models.Expense;
import splitwise.models.Group;
import splitwise.models.User;
import splitwise.reqres.ExpenseRequest;
import splitwise.util.Constants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("SplitWise System");

        //Add 2 groups;
        Group g1 = new Group("Office");
        Group g2 = new Group("Flat");
        g1.addUser("Ankit");
        g1.addUser("Shivam");
        g1.addUser("Nikhil");

        g2.addUser("Ankit");
        g2.addUser("Rahul");
        g2.addUser("Jatin");

        Map<String,Float> u1 = new HashMap<>();
        u1.put("Ankit",-500f);
        u1.put("Shivam",800f);
        u1.put("Nikhil",-300f);

        ExpenseRequest req1 = new ExpenseRequest(800f, Constants.SPLIT_EQUAL,u1,"Team Party","Shivam");
        g1.addExpense(req1);

        u1.clear();
        u1.put("Ankit",400f);
        u1.put("Shivam",-400f);
        ExpenseRequest req2 = new ExpenseRequest(400f, Constants.SPLIT_AMOUNT,u1,"random","Ankit");
        g1.addExpense(req2);

        u1.clear();
        u1.put("Ankit",0f);
        u1.put("Rahul",0f);
        u1.put("Jatin",800f);
        ExpenseRequest req3 = new ExpenseRequest(800f, Constants.SPLIT_EQUAL,u1,"grocery","Jatin");
        g2.addExpense(req3);

        u1.clear();
        u1.put("Ankit",30f);
        u1.put("Rahul",70f);
        ExpenseRequest req4 = new ExpenseRequest(300f, Constants.SPLIT_PERCENTAGE,u1,"beer","Ankit");
        g2.addExpense(req4);

        System.out.println("Group " + g1.name + " Details: ");
        for(Expense exp : g1.expenseHistory){
            System.out.println(exp);
        }

        System.out.println("Group " + g2.name + " Details: ");
        for(Expense exp : g2.expenseHistory){
            System.out.println(exp);
        }
    }
}
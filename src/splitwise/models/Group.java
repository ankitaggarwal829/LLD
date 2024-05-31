package splitwise.models;

import splitwise.reqres.ExpenseRequest;
import splitwise.util.Constants;
import splitwise.util.UtilFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    public Map<String, Float> userMap;
    public List<Expense> expenseHistory;

    public String name;

    public Group(String name){
        this.name = name;
        this.userMap = new HashMap<>();
        this.expenseHistory = new ArrayList<>();
    }

    public String addExpense(ExpenseRequest req){
        Map<String,Float>  userAmountMap = UtilFunctions.castExpense(req);
        Expense exp = new Expense(userAmountMap,req.totalAmt,req.description,req.paidBy);
        this.expenseHistory.add(exp);
        return Constants.SUCCESS;
    }

    public  String addUser(String Name){
        User user = new User(Name, this);
        this.userMap.put(Name, 0f);
        return Constants.SUCCESS;
    }
}

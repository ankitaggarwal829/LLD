package splitwise.models;

import java.util.Map;

public class Expense {
    Map<String,Float> userMap;
    Float totalAmount;
    String Description;

    public String paidBy;

    public Expense(Map<String, Float> userMap, Float totalAmount, String description, String paidBy) {
        this.userMap = userMap;
        this.totalAmount = totalAmount;
        Description = description;
        this.paidBy = paidBy;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "userMap=" + userMap +
                ", totalAmount=" + totalAmount +
                ", Description='" + Description + '\'' +
                ", paidBy='" + paidBy + '\'' +
                '}';
    }
}

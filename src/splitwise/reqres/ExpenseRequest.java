package splitwise.reqres;

import java.util.Map;

public class ExpenseRequest {
    public Float totalAmt;
    String splitType;
    Map<String, Float> usersMap;

    public  String description;

    public String paidBy;

    public ExpenseRequest(Float totalAmt, String splitType, Map<String, Float> usersMap, String description, String paidBy) {
        this.totalAmt = totalAmt;
        this.splitType = splitType;
        this.usersMap = usersMap;
        this.description = description;
        this.paidBy = paidBy;
    }

    public Map<String, Float> getUsersMap() {
        return usersMap;
    }

    public String getSplitType() {
        return splitType;
    }

    public void setUsersMap(Map<String, Float> usersMap) {
        this.usersMap = usersMap;
    }

    public void setSplitType(String splitType) {
        this.splitType = splitType;
    }
}

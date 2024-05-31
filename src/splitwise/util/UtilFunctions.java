package splitwise.util;

import splitwise.models.User;
import splitwise.reqres.ExpenseRequest;

import java.util.HashMap;
import java.util.Map;

public class UtilFunctions {


    public static Map<String,Float> castExpense(ExpenseRequest req){
        Map<String,Float> reqMap = req.getUsersMap();
        Map<String,Float> resMap = new HashMap<>();
        String type = req.getSplitType();
        Float amt = req.totalAmt;
        switch (type){
            case Constants.SPLIT_AMOUNT -> {
                for(Map.Entry<String,Float> mp : reqMap.entrySet()){
                    resMap.put(mp.getKey(),mp.getValue());
                }
            }
            case Constants.SPLIT_PERCENTAGE -> {
                for(Map.Entry<String,Float> mp : reqMap.entrySet()){
                    resMap.put(mp.getKey(),(amt/100)*mp.getValue());
                }
            }
            default -> {
                int numberOfUserInExpense = reqMap.size();
                for(Map.Entry<String,Float> mp : reqMap.entrySet()){
                    resMap.put(mp.getKey(),amt/numberOfUserInExpense);
                }
            }
        }
        return resMap;
    }
}

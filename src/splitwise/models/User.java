package splitwise.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    int uid;
    public String name;
    List<Group> grpList;

    public User(String name, Group group) {
        this.name = name;
        this.grpList = new ArrayList<>();
        this.grpList.add(group);
    }
}

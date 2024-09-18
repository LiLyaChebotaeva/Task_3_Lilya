import java.util.ArrayList;

public class UniqueID {
    int id;
    static ArrayList<Integer> ids = new ArrayList<Integer>();
    public UniqueID() {
        this.id = CreateID();
        ids.add(id);
    }
    private static int CreateID() {
        if (ids.isEmpty()) {
            return 1;
        }
        else {
            return ids.getLast() + 1;
        }
    }
}

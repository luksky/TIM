package tim.l1.avg;

import java.util.ArrayList;

public class RandObj {
    public int getCount() {
        return count;
    }

    private final int count;

    public ArrayList getList() {
        return list;
    }

    private final ArrayList list;
    public RandObj (int count, ArrayList list){
        this.count=count;
        this.list=list;
    }
}

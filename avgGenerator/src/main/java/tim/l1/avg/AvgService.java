package tim.l1.avg;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class AvgService {

    public double avgCount(ArrayList<Integer> list){
        double sum=0;
        for(int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        double avg=(sum/(list.size()));
        return avg;
    }
}

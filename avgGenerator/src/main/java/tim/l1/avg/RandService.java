package tim.l1.avg;

        import org.springframework.stereotype.Service;

        import java.util.ArrayList;
        import java.util.Random;
@Service
public class RandService {

    public ArrayList randomList(int count){
        Random random = new Random();
        ArrayList list= new ArrayList();
        for(int i = 0; i < count; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }
}

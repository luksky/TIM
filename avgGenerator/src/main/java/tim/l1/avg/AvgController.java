package tim.l1.avg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AvgController {
    @RequestMapping(value="/AVG", method=RequestMethod.GET)
    @ResponseBody
    public AvgObj Avg(@RequestParam(value="list", defaultValue = "0") ArrayList<Integer> list) {
//        ArrayList<Integer> listInt = null;
//
//        System.out.println(list);
//        for(int i=0;i<list.size();i++)
//            listInt.add(Integer.valueOf(list.get(i)));
        System.out.println(list.getClass());
        AvgService avgService = new AvgService();
        System.out.println(list);
        return new AvgObj(avgService.avgCount(list) );
        }

}

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

        AvgService avgService = new AvgService();

        return new AvgObj(avgService.avgCount(list) );
        }

}

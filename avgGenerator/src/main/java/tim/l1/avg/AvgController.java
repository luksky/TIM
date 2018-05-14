package tim.l1.avg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AvgController {
    @RequestMapping(value="/AVG", method=RequestMethod.GET)
    @ResponseBody
    public double Avg(@RequestParam(value="list", defaultValue = "0") ArrayList<Integer> list) {

        AvgService avgService = new AvgService();

        return avgService.avgCount(list);
        }

}

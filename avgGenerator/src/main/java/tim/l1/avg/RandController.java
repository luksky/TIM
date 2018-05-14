package tim.l1.avg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class RandController {
    @RequestMapping(value="/Random", method=RequestMethod.GET)
    @ResponseBody
    public ArrayList Random(@RequestParam(value="count", defaultValue = "0") int count) {
        ArrayList arrayList= new ArrayList();
        RandService randService = new RandService();
        arrayList=randService.randomList(count);
        return arrayList;
        }

}

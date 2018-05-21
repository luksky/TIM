package tim.l1.avg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RandController {
    @RequestMapping(value="/Random", method=RequestMethod.GET)
    @ResponseBody
    public RandObj Random(@RequestParam(value="count", defaultValue = "0") int count) {
        ArrayList arrayList= new ArrayList();
        RandService randService = new RandService();
        arrayList=randService.randomList(count);
        return new RandObj(count,arrayList);
        }

}

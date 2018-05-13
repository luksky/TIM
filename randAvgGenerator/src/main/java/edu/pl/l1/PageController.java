package edu.pl.l1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



@Controller
public class PageController {


    @RequestMapping("/generateRand")
    @ResponseBody
    public ArrayList generateRand(){
        ArrayList randNumbers = new ArrayList();
        Random rand = new Random();
        for (int i=0;i<=10;i++) randNumbers.add(rand.nextInt(50));
        return randNumbers;
    }

}

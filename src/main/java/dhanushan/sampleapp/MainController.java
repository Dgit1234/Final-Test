package dhanushan.sampleapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Malinda_07654 on 2/9/2016.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> inbound(HttpServletRequest request) {


        return new ResponseEntity<String>("Done:testing1", HttpStatus.OK);

    }



}
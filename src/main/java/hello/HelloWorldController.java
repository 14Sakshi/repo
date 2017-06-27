package hello;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj) throws JsonParseException, JsonMappingException, IOException{

        System.out.println(obj);
        ObjectMapper o=new ObjectMapper();
        byte[] mapData = obj.getBytes();
        
    	Map<String,String> myMap = new HashMap<String, String>();
        myMap=o.readValue(mapData,HashMap.class);
        String key =myMap.keySet().toArray()[0].toString();
        String val=myMap.get("result");
        return new WebhookResponse("Hello! "+val, "Text " + obj);
    }//webhook
}

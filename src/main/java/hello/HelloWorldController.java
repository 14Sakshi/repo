package hello;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj) throws JsonParseException, JsonMappingException, IOException{
        
    	Map<String,String> myMap = new HashMap<String, String>();
        System.out.println(obj);
        ObjectMapper o=new ObjectMapper();
        byte[] mapData = obj.getBytes();
        myMap = o.readValue(mapData, HashMap.class);
        TreeMap<String,String> treeMap=new TreeMap<String,String>();
        treeMap.putAll(myMap);
        
        Map<String,String> my=new HashMap<String,String>();
        String res=treeMap.values().toArray()[2].toString();
        byte[] mapData1 = res.getBytes();
        my = o.readValue(mapData1, HashMap.class);
        TreeMap<String,String> treeMap1=new TreeMap<String,String>();
        treeMap1.putAll(my);
        
        return new WebhookResponse("Hello! "+treeMap1 , "Text " + obj);
    }//webhook
}

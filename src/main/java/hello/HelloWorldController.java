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
        JsonNode rootNode = o.readTree(mapData);
        JsonNode resultNode = rootNode.path("result");
        String res=resultNode.toString();
        
        
        ObjectMapper o1=new ObjectMapper();
        byte[] mapData1 = res.getBytes();
        JsonNode rootNode1 = o1.readTree(mapData1);
        JsonNode resultNode1 = rootNode1.path("parameters");
        String res1=resultNode1.toString();
        
        ObjectMapper o2=new ObjectMapper();
        byte[] mapData2 = res1.getBytes();
        JsonNode rootNode2 = o2.readTree(mapData2);
        JsonNode resultNode2 = rootNode2.path("geo-city");
        String res2=resultNode2.toString();
        
        //myMap = o.readValue(mapData, HashMap.class);
        //TreeMap<String,String> treeMap=new TreeMap<String,String>();
        //treeMap.putAll(myMap);
        //String[] res=treeMap.values().toArray()[2].toString().split(",");
        //Parameter on 5th position
       /* String[] res1=res[5].split("=");
        Map<String,String> param=new HashMap<String,String>();
        for(int i=1;i<res1.length;i=i+2){
        	param.put(res1[i],res1[i+1]);
        }//for*/
         
        return new WebhookResponse("Hello! "+resultNode2, "Text " + obj);
    }//webhook
}

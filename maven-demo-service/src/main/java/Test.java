import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;


public class Test {

	public static void main(String[] args){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userCode","a");
        map.put("userName","a");
        List<String> categoryIds = new ArrayList<String>();
        categoryIds.add("222");
        categoryIds.add("111");
        map.put("categoryIds", categoryIds);
        System.out.print(JSON.toJSON(map));
    }
}

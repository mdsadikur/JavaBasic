package Assignment7;
import java.util.HashMap;
import java.util.Map;
public class mapHashmap {
        public static void main(String[] args) {

            Map<String, Object> data = new HashMap<String, Object>();

            data.put("name", "John");
            data.put("age", 22);

            Map<String, Object> learning = new HashMap<String, Object>();
            learning.put("java", true);
            learning.put("selenium", false);
            learning.put("appium", "yes");

            data.put("learning", learning);

            String[] sqaClasses = {"Class", "Interface", "Abstract Class"};

            data.put("sqaClass", sqaClasses);

            System.out.println(data);
        }
    }



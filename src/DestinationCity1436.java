import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity1436 {
    public String destCity(List<List<String>> paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (List<String> path : paths) {
            String src = path.get(0);
            String dst = path.get(1);
            if (!map.containsKey(src)) {
                List<String> dsts = new ArrayList<>();
                dsts.add(dst);
                map.put(src, dsts);
            } else {
                List<String> dsts = map.get(src);
                dsts.add(dst);
                map.put(src, dsts);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String dst : entry.getValue()) {
                if (!map.containsKey(dst)) {
                    return dst;
                }
            }
        }
        return "";
    }
}

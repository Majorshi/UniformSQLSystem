package cn.edu.bit.linc.zql.network.client;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by wyq on 2015/8/23.
 */
public class RowData {

    private Map<String, RowDataEntry> fields;

    public RowData(){
        fields = new LinkedHashMap<String, RowDataEntry>();
    }

    public void add(String fieldName, Object value){
        if(fieldName == null || "".equals(fieldName))
            return ;

        RowDataEntry entry = new RowDataEntry();
        entry.value = value;
        entry.type = "java.lang.String";
        fields.put(fieldName, entry);
    }

    public String[] fieldNames(){
        if(fields == null || fields.size() == 0)
            return new String[]{};

        List<String> names = new ArrayList<String>(fields.size());
        for(Entry<String, RowDataEntry> entry : fields.entrySet()){
            names.add(entry.getKey());
        }
        return names.toArray(new String[names.size()]);
    }

    public Object getValueByFieldName(String name){
        return fields.get(name).value;
    }

    public int size(){
        return fields.size();
    }
}

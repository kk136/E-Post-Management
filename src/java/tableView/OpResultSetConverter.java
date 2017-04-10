package tableView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.sql.ResultSet;

public class OpResultSetConverter {

    public JsonObject RsetToJson(ResultSet rSet) {
        JsonObject jsonResponse = new JsonObject();
        try {

            JsonArray data = new JsonArray();
            

            while (rSet.next()) {
                
                JsonArray row = new JsonArray();
                row.add(new JsonPrimitive(rSet.getString("OPNAME")));
                row.add(new JsonPrimitive(rSet.getString("OPDESC")));
                data.add(row);
            }

            jsonResponse.add("ResponseData", data);

            return (jsonResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (jsonResponse);
    }
}

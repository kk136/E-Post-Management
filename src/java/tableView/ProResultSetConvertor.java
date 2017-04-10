/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.sql.ResultSet;

/**
 *
 * @author kk
 */
public class ProResultSetConvertor {

    public JsonObject RsetToJson(ResultSet rSet) {
        JsonObject jsonResponse = new JsonObject();
        try {

            JsonArray data = new JsonArray();

            while (rSet.next()) {

                JsonArray row = new JsonArray();
                row.add(new JsonPrimitive(rSet.getString("NAME")));
                row.add(new JsonPrimitive(rSet.getString("DESCRIPTION")));
                row.add(new JsonPrimitive(rSet.getInt("PRICE")));

                data.add(row);
            }

            jsonResponse.add("ResponseData", data);

            return (jsonResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (jsonResponse);
    }

    public JsonObject RsetToJsonAdmin(ResultSet rSet) {
        JsonObject jsonResponse = new JsonObject();
        try {

            JsonArray data = new JsonArray();

            while (rSet.next()) {

                JsonArray row = new JsonArray();
                row.add(new JsonPrimitive(rSet.getString("NAME")));
                row.add(new JsonPrimitive(rSet.getString("DESCRIPTION")));
                row.add(new JsonPrimitive(rSet.getInt("PRICE")));
                row.add(new JsonPrimitive(rSet.getString("USERNAME")));

                data.add(row);
            }

            jsonResponse.add("ResponseData", data);

            return (jsonResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (jsonResponse);
    }

    public JsonObject OpRsetToJson(ResultSet rSet) {
        JsonObject jsonResponse = new JsonObject();
        try {

            JsonArray data = new JsonArray();

            while (rSet.next()) {

                JsonArray row = new JsonArray();
                row.add(new JsonPrimitive(rSet.getString("OPNAME")));
                row.add(new JsonPrimitive(rSet.getString("MOBNO")));
                row.add(new JsonPrimitive(rSet.getInt("AMOUNT")));

                data.add(row);
            }

            jsonResponse.add("ResponseData", data);

            return (jsonResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (jsonResponse);
    }
    
        public JsonObject OpRsetToJsonAdmin(ResultSet rSet) {
        JsonObject jsonResponse = new JsonObject();
        try {

            JsonArray data = new JsonArray();

            while (rSet.next()) {

                JsonArray row = new JsonArray();
                row.add(new JsonPrimitive(rSet.getString("OPNAME")));
                row.add(new JsonPrimitive(rSet.getString("MOBNO")));
                row.add(new JsonPrimitive(rSet.getInt("AMOUNT")));
                row.add(new JsonPrimitive(rSet.getString("USERNAME")));

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

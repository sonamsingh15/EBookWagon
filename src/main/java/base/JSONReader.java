package base;

import com.google.gson.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class JSONReader {
    public static Object[][] getdata(String JSON_path, String typeData, int totalDataRow, int totalColumnEntry) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObj = jsonParser.parse(new FileReader(JSON_path)).getAsJsonObject();
        JsonArray array = (JsonArray) jsonObj.get(typeData);
        return searchJsonElemnet(array, totalDataRow, totalColumnEntry);
    }

    public static Object[][] searchJsonElemnet(JsonArray jsonArray, int totalDataRow, int totalColumnEntry) throws NullPointerException {
        Object[][] matrix = new Object[totalDataRow][totalColumnEntry];
        int i = 0;
        int j = 0;
        for (JsonElement jsonElement : jsonArray) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                matrix[i][j] = entry.getValue().toString().replace("\"", "");
                j++;
            }
            i++;
            j = 0;
        }
        return matrix;
    }


}




package paises;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class PaisService {

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url("https://gist.githubusercontent.com/leandersonandre/1f4675844efa5082eb97ccf241adf95b/raw/37cc5779e6ee9f459d1e4f767c115eb28acdc88c/hello.json")
            .build();
    try {
        Response response = client.newCall(request).execute();
        String result = response.body().string();
        JSONObject object = new JSONObject(result);

        JSONArray array = root .getJSONArray("paises");

        for(int i = 0; i < array.length(); i++){
            Pais p  = new Pais();
            JSONObject o = array.getJSONObject(i);

            p.setId(o.getInt("id"));
            p.setNome(o.getString("nome"));
            p.setPresidente(o.getString("presidente"));
            p.setCapital(o.getString("capital"));
            p.setContinente(o.getString("continente"));

            list.add(p);
        }

    }catch (Exception e){
        e.printStackTrace();
    }

}

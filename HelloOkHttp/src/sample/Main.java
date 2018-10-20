package sample;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import paises.PaisService;

public class Main {



    public static void main(String args[]){
        PaisService pais = PaisService();


        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://gist.githubusercontent.com/leandersonandre/1f4675844efa5082eb97ccf241adf95b/raw/37cc5779e6ee9f459d1e4f767c115eb28acdc88c/hello.json")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String result = response.body().string();
            JSONObject object = new JSONObject(result);
            if(object.has("chave")){
                System.out.println(object.get("chave"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

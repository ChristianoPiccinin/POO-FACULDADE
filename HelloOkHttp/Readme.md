# Hello OkHttp


OKHttp é um cliente HTTP para softwares em Java/Kotlin e Android. 



Exemplo de utilização da Biblioteca
```Java
OkHttpClient client = new OkHttpClient();

Request request = new Request.Builder()
        .url(<SUA URL>)
        .build();
try {
    Response response = client.newCall(request).execute();
    String result = response.body().string();
    System.out.println(result);
}catch (Exception e){
    e.printStackTrace();
}
```

Biblioteca OkHttp
```
http://square.github.io/okhttp/
```

Lista de APIs públicas para testes

```
https://github.com/toddmotto/public-apis
```


Protocolo Json
```
http://www.json.org/
```

Validador e formatador de Json
```
https://jsonformatter.curiousconcept.com/
```
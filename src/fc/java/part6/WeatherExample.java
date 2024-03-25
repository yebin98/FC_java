package fc.java.part6;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "1";
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            int responseCode = connection.getResponseCode(); //200
            System.out.println("Response Code: " + responseCode);
            if(responseCode == 200){
                //스트림(Stream = 입력, 출력)의 연결
                //getInputStream : 연결정보를 활용하여 데이터 읽음
                //InputStreamReader : 문자단위로 데이터 읽을 수 있음(한글 인코딩)
                //BufferedReader : 데이터를 모야서 처리
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                System.out.println("content.toString() = " + content.toString());
                // Gson 라이브러리를 사용하여 온도를 추출
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();
                // 서울의 온도 출력
                System.out.println("Seoul's temperature: " + temp + "℃");
                connection.disconnect();
            }else {
                //오류
            }
        } catch (IOException e) {
            e.printStackTrace(); //에러메세지 출력
        }
    }
}

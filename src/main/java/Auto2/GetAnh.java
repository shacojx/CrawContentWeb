/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author ShacoJX
 */
public class GetAnh {
    public String GetImg(String url) throws IOException{
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .addHeader("Host", "movieweb.com")
                .addHeader("Sec-Ch-Ua", "\"Chromium\";v=\"91\", \" Not;A Brand\";v=\"99\"")
                .addHeader("Sec-Ch-Ua-Mobile", "?0")
                .addHeader("Upgrade-Insecure-Requests", "1")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Sec-Fetch-Site", "same-origin")
                .addHeader("Sec-Fetch-Mode", "navigate")
                .addHeader("Sec-Fetch-User", "?1")
                .addHeader("Sec-Fetch-Dest", "document")
                .addHeader("Referer", "https://movieweb.com/")
                .addHeader("Accept-Encoding", "utf-8, text")
                .addHeader("Accept-Language", "en-US,en;q=0.9")
                .addHeader("Connection", "close")
                .build();
        Response response = client.newCall(request).execute();
        String html_resp = response.body().string();
        String[] List_1 = html_resp.split("<body>");
        String tmp1 = List_1[0];
        String[] List_2 = tmp1.split("\"@type\": \"ImageObject\",");
        String tmp2 = List_2[1];
        String[] List_3 = tmp2.split("\"width\"");
        String tmp3 = List_3[0];
        String[] List_4 = tmp3.split("\"url\":");
        String tmp4 = List_4[1];
        tmp4 = tmp4.replaceAll("\"", "");
        tmp4 = tmp4.replaceAll(",", "");
        return tmp4.trim();
    }
    
//        public static void main(String[] args) throws IOException {
//        GetAnh g = new GetAnh();
//        System.out.println(g.GetImg("https://movieweb.com/pirates-of-the-caribbean-6-johnny-depp-greg-ellis/"));
//    }
    
}

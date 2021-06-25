/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author ShacoJX
 */
public class Getcontent {

    public String getnoidung(String url) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .addHeader("Host", "collider.com")
                .addHeader("Cache-Control", "max-age=0")
                .addHeader("Sec-Ch-Ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"90\"")
                .addHeader("Sec-Ch-Ua-Mobile", "?0")
                .addHeader("Upgrade-Insecure-Requests", "1")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Sec-Fetch-Site", "same-origin")
                .addHeader("Sec-Fetch-Mode", "navigate")
                .addHeader("Sec-Fetch-User", "?1")
                .addHeader("Sec-Fetch-Dest", "document")
                .addHeader("Referer", "https://collider.com/")
                .addHeader("Accept-Encoding", "utf-8, text")
                .addHeader("Accept-Language", "en-US,en;q=0.9")
                .addHeader("Connection", "close")
                .build();
        Response response = client.newCall(request).execute();
        String html_content = response.body().string();

        String[] list_string = html_content.split("class=\"article-body\" itemprop=\"articleBody\">");
        String xmen1 = list_string[1];
        String[] list_string_2 = xmen1.split("<button class=\"sharing-btn btn-more\"");
        String xmen2 = list_string_2[0];
        xmen2 = xmen2.replaceAll("<p>", " ");
        xmen2 = xmen2.replaceAll("</p>", " ");
        xmen2 = xmen2.replaceAll("<em>", " ");
        xmen2 = xmen2.replaceAll("</em>", " ");
        xmen2 = xmen2.replaceAll("<strong>", " ");
        xmen2 = xmen2.replaceAll("</strong>", " ");
        xmen2 = xmen2.replaceAll("<div>", " ");
        xmen2 = xmen2.replaceAll("</div>", " ");
        xmen2 = xmen2.replaceAll("<span>", " ");
        xmen2 = xmen2.replaceAll("</span>", " ");

        String[] list_string_3 = xmen2.split("\n");
        String xmen3 = "";
        for (String k : list_string_3) {
            if (k.trim().length() != 0 && k.trim().contains("<!--") == false && k.trim().contains("-->") == false
                    && k.trim().contains("RELATED:") == false && k.trim().contains("KEEP READING:") == false
                    && k.trim().contains("Image via") == false) {
                if (k.trim().contains("<img") == true) {
                    xmen3 = xmen3 + k.trim() + "\n";
                } else if (demkytu(k, '<') != 1 && demkytu(k, '>') != 1) {
                    xmen3 = xmen3 + k.trim() + "\n";
                }

            }
        }

        String[] list_String_4 = xmen3.split("\n");
        String xmen4 = "";
        for (String q : list_String_4) {
            if (q.contains("<img") == true) {
                xmen4 = xmen4 + "shacojx" + "\n";
            } else {
                xmen4 = xmen4 + q + "\n";
            }

        }

        return xmen4.trim();

    }

    public int demkytu(String string, char kytu) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == kytu) {
                count++;
            }
        }
        return count;
    }

//    public static void main(String[] args) throws IOException {
//        Getcontent g = new Getcontent();
//        String x = g.getnoidung("https://collider.com/tom-and-jerry-in-new-york-series-release-date-hbo-max/");
//        System.out.println(x);
//
//    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author ShacoJX
 */
public class GetImg {

    public ArrayList<String> GetImage(String url) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
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

        String[] list_string = html_content.split("<section class=\"article-body\" itemprop=\"articleBody\">");
        String xmen1 = list_string[1];
        String[] list_string_2 = xmen1.split("<button class=\"sharing-btn btn-more\"");
        String xmen2 = list_string_2[0];
        String[] list_string_3 = xmen2.split("\n");
        String xmen3 = "";
        for (String k : list_string_3) {
            if (k.trim().contains("data-srcset")) {

                xmen3 = xmen3 + k.trim() + "\n";

            }
        }
        xmen3 = xmen3.replaceAll("/>", "");
        xmen3 = xmen3.replaceAll("\"", "");

        String[] list_string_4 = xmen3.split("\n");
        String xmen4 = "";
        for (String j : list_string_4) {
            String[] List_string_tmp = j.split("data-srcset=");
            xmen4 = xmen4 + List_string_tmp[1] + "\n";
        }
        String[] list_string_5 = xmen4.split("\n");
        String xmen5 = "";
        ArrayList<String> list_img = new ArrayList<>();
        for (String po : list_string_5) {
            String[] list_string_tmp_2 = po.split("\\?");
            list_img.add(list_string_tmp_2[0]);
        }
        RemoveDuplicate rem = new RemoveDuplicate();
        ArrayList<String> list_img_new = rem.removeDuplicates(list_img);
//        for(String pu : list_img_new){
//            xmen5 = xmen5 +pu +"\n";
//        }
//        System.out.println(xmen5.trim());
        return list_img_new;

    }

//    public static void main(String[] args) throws IOException {
//        GetImg g = new GetImg();
//        g.GetImage("https://collider.com/jurassic-world-3-preview-plot-colin-trevorrow-interview/");
//
//    }

}

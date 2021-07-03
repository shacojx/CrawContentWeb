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
public class Getnd {

    public String getnoidung(String url) throws IOException {
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
        String[] List_1 = html_resp.split("class=\"article-body\"");
        String xmen1 = List_1[1];
        String[] List_2 = xmen1.split("Topics:");
        String xmen2 = List_2[0];
        xmen2 = xmen2.trim();
        xmen2 = xmen2.replaceAll("<p>", "");
        xmen2 = xmen2.replaceAll("</p>", "");
        xmen2 = xmen2.replaceAll("<em>", "");
        xmen2 = xmen2.replaceAll("</em>", "");
        xmen2 = xmen2.replaceAll("<strong>", "");
        xmen2 = xmen2.replaceAll("</strong>", "");
        xmen2 = xmen2.replaceAll("<span>", "");
        xmen2 = xmen2.replaceAll("</span>", "");

        
        String xmen3 = "";
        String[] List_3 = xmen2.split("\n");
        for(String k : List_3){
            if(demkytu(k, '<') == 1 && demkytu(k, '>') == 1){
                xmen3 = xmen3+"\n";
            }else if(demkytu(k, '<') == 1){
                xmen3 = xmen3+"\n";
            }else if(demkytu(k, '>') == 1){
                xmen3 = xmen3+"\n";
            }else if(k.contains("RELATED:")){
                xmen3 = xmen3+"\n";
            }else{
                xmen3 = xmen3 + k +"\n";
            }
        }
        
        xmen3 = xmen3.replaceAll("</a>", "");
        xmen3 = xmen3.replaceAll("<a>", "");
        String xmen4 = "";
        String[] List_4 = xmen3.split("\n");
        for(String q : List_4){
            if(q.trim().length() != 0){
                xmen4 = xmen4 +q+"\n";
            }
        }
        
        String xmen5 = "";
        String[] List_5 = xmen4.split("\n");
        for(String j : List_5){
            if(j.contains("<a") && j.contains(">")){
                String[] tmp1 = j.split("<a");
                String ndx = tmp1[0];
                String ndy = tmp1[1];
                String[] tmp2 = ndy.split(">");
                String ndz = tmp2[1];
                xmen5 = xmen5 + ndx +" "+ndz+"\n";
            }else{
                xmen5 = xmen5+j+"\n";
            }
        }
        
        return xmen5.trim();

        
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
//        getnoidung("https://movieweb.com/the-forever-purge-review/");
//    }

}

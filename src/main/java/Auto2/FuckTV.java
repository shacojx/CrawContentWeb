/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto2;

import Auto.GenID;
import Auto.New;
import Auto.NewDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author ShacoJX
 */
public class FuckTV {
    public void FuckTV1() throws IOException, SQLException, InterruptedException{
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url("https://movieweb.com/tv-news/")
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
        String[] List_1 = html_resp.split("<article");
        String tmp1 = List_1[1];
        String[] List_2 = tmp1.split("\n");
        String link = List_2[1];
        link = link.replaceAll("<a href=\"", "");
        link = link.replaceAll("\">", "");
        String link_final = "https://movieweb.com"+link;
        NewDAO nedao = new NewDAO();
        GetTD gTieuDe = new GetTD();
        String tieude = gTieuDe.GetTieuDe(link_final);
        New ne = nedao.getNewByTitle(tieude);
        if (ne != null) {
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            System.out.println("[" + startDate + "][movieweb.com][TV 1] Don't have last news");
        } else {
            Thread.sleep(1000);
            GetAnh getanh = new GetAnh();
            Getnd getnd = new Getnd();
            java.util.Date date11 = new java.util.Date();
            SimpleDateFormat sdf11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate11 = sdf11.format(date11);
            System.out.println("["+startDate11+"][movieweb.com][TV 1] Get Last News");
            String cover = getanh.GetImg(link_final);
            String noidung = getnd.getnoidung(link_final);
            String noidung_final = "";
            String[] List_nd = noidung.split("\n");
            for(String xxx : List_nd){
                noidung_final = noidung_final+"<p>"+xxx+"</p>"+"\n";
            }
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            GenID gen = new GenID();
            New nx = new New();
            String id = "";
            do {
                id = gen.genStr();
                nx = nedao.getNewById(id);

            } while (nx != null);
            New news = new New(id, tieude, "...", noidung_final, startDate, "TV News", cover);
            nedao.insertNews(news);
            System.out.println("["+startDate+"][movieweb.com][TV 1] Inert db done");
            
        }
        
    }
    
    
    public void FuckTV2() throws IOException, SQLException, InterruptedException{
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url("https://movieweb.com/tv-news/")
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
        String[] List_1 = html_resp.split("<article");
        String tmp1 = List_1[2];
        String[] List_2 = tmp1.split("\n");
        String link = List_2[1];
        link = link.replaceAll("<a href=\"", "");
        link = link.replaceAll("\">", "");
        String link_final = "https://movieweb.com"+link;
        NewDAO nedao = new NewDAO();
        GetTD gTieuDe = new GetTD();
        String tieude = gTieuDe.GetTieuDe(link_final);
        New ne = nedao.getNewByTitle(tieude);
        if (ne != null) {
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            System.out.println("[" + startDate + "][movieweb.com][TV 2] Don't have last news");
        } else {
            Thread.sleep(1000);
            GetAnh getanh = new GetAnh();
            Getnd getnd = new Getnd();
            java.util.Date date11 = new java.util.Date();
            SimpleDateFormat sdf11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate11 = sdf11.format(date11);
            System.out.println("["+startDate11+"][movieweb.com][TV 2] Get Last News");
            String cover = getanh.GetImg(link_final);
            String noidung = getnd.getnoidung(link_final);
            String noidung_final = "";
            String[] List_nd = noidung.split("\n");
            for(String xxx : List_nd){
                noidung_final = noidung_final+"<p>"+xxx+"</p>"+"\n";
            }
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            GenID gen = new GenID();
            New nx = new New();
            String id = "";
            do {
                id = gen.genStr();
                nx = nedao.getNewById(id);

            } while (nx != null);
            New news = new New(id, tieude, "...", noidung_final, startDate, "TV News", cover);
            nedao.insertNews(news);
            System.out.println("["+startDate+"][movieweb.com][TV 2] Inert db done");
            
        }
        
    }
    
    public void FuckTV3() throws IOException, SQLException, InterruptedException{
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url("https://movieweb.com/tv-news/")
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
        String[] List_1 = html_resp.split("<article");
        String tmp1 = List_1[3];
        String[] List_2 = tmp1.split("\n");
        String link = List_2[1];
        link = link.replaceAll("<a href=\"", "");
        link = link.replaceAll("\">", "");
        String link_final = "https://movieweb.com"+link;
        NewDAO nedao = new NewDAO();
        GetTD gTieuDe = new GetTD();
        String tieude = gTieuDe.GetTieuDe(link_final);
        New ne = nedao.getNewByTitle(tieude);
        if (ne != null) {
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            System.out.println("[" + startDate + "][movieweb.com][TV 3] Don't have last news");
        } else {
            Thread.sleep(1000);
            GetAnh getanh = new GetAnh();
            Getnd getnd = new Getnd();
            java.util.Date date11 = new java.util.Date();
            SimpleDateFormat sdf11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate11 = sdf11.format(date11);
            System.out.println("["+startDate11+"][movieweb.com][TV 3] Get Last News");
            String cover = getanh.GetImg(link_final);
            String noidung = getnd.getnoidung(link_final);
            String noidung_final = "";
            String[] List_nd = noidung.split("\n");
            for(String xxx : List_nd){
                noidung_final = noidung_final+"<p>"+xxx+"</p>"+"\n";
            }
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            GenID gen = new GenID();
            New nx = new New();
            String id = "";
            do {
                id = gen.genStr();
                nx = nedao.getNewById(id);

            } while (nx != null);
            New news = new New(id, tieude, "...", noidung_final, startDate, "TV News", cover);
            nedao.insertNews(news);
            System.out.println("["+startDate+"][movieweb.com][TV 3] Inert db done");
            
        }
        
    }
    
    public void FuckTV4() throws IOException, SQLException, InterruptedException{
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url("https://movieweb.com/tv-news/")
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
        String[] List_1 = html_resp.split("<article");
        String tmp1 = List_1[4];
        String[] List_2 = tmp1.split("\n");
        String link = List_2[1];
        link = link.replaceAll("<a href=\"", "");
        link = link.replaceAll("\">", "");
        String link_final = "https://movieweb.com"+link;
        NewDAO nedao = new NewDAO();
        GetTD gTieuDe = new GetTD();
        String tieude = gTieuDe.GetTieuDe(link_final);
        New ne = nedao.getNewByTitle(tieude);
        if (ne != null) {
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            System.out.println("[" + startDate + "][movieweb.com][TV 4] Don't have last news");
        } else {
            Thread.sleep(1000);
            GetAnh getanh = new GetAnh();
            Getnd getnd = new Getnd();
            java.util.Date date11 = new java.util.Date();
            SimpleDateFormat sdf11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate11 = sdf11.format(date11);
            System.out.println("["+startDate11+"][movieweb.com][TV 4] Get Last News");
            String cover = getanh.GetImg(link_final);
            String noidung = getnd.getnoidung(link_final);
            String noidung_final = "";
            String[] List_nd = noidung.split("\n");
            for(String xxx : List_nd){
                noidung_final = noidung_final+"<p>"+xxx+"</p>"+"\n";
            }
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            GenID gen = new GenID();
            New nx = new New();
            String id = "";
            do {
                id = gen.genStr();
                nx = nedao.getNewById(id);

            } while (nx != null);
            New news = new New(id, tieude, "...", noidung_final, startDate, "TV News", cover);
            nedao.insertNews(news);
            System.out.println("["+startDate+"][movieweb.com][TV 4] Inert db done");
            
        }
        
    }
    
    public void FuckTV5() throws IOException, SQLException, InterruptedException{
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url("https://movieweb.com/tv-news/")
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
        String[] List_1 = html_resp.split("<article");
        String tmp1 = List_1[5];
        String[] List_2 = tmp1.split("\n");
        String link = List_2[1];
        link = link.replaceAll("<a href=\"", "");
        link = link.replaceAll("\">", "");
        String link_final = "https://movieweb.com"+link;
        NewDAO nedao = new NewDAO();
        GetTD gTieuDe = new GetTD();
        String tieude = gTieuDe.GetTieuDe(link_final);
        New ne = nedao.getNewByTitle(tieude);
        if (ne != null) {
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            System.out.println("[" + startDate + "][movieweb.com][TV 5] Don't have last news");
        } else {
            Thread.sleep(1000);
            GetAnh getanh = new GetAnh();
            Getnd getnd = new Getnd();
            java.util.Date date11 = new java.util.Date();
            SimpleDateFormat sdf11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate11 = sdf11.format(date11);
            System.out.println("["+startDate11+"][movieweb.com][TV 5] Get Last News");
            String cover = getanh.GetImg(link_final);
            String noidung = getnd.getnoidung(link_final);
            String noidung_final = "";
            String[] List_nd = noidung.split("\n");
            for(String xxx : List_nd){
                noidung_final = noidung_final+"<p>"+xxx+"</p>"+"\n";
            }
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            GenID gen = new GenID();
            New nx = new New();
            String id = "";
            do {
                id = gen.genStr();
                nx = nedao.getNewById(id);

            } while (nx != null);
            New news = new New(id, tieude, "...", noidung_final, startDate, "TV News", cover);
            nedao.insertNews(news);
            System.out.println("["+startDate+"][movieweb.com][TV 5] Inert db done");
            
        }
        
    }
    
    
}

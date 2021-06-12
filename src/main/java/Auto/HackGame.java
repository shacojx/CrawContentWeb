/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author ShacoJX
 */
public class HackGame {
    public void spiderGame1() throws IOException, InterruptedException, SQLException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://collider.com/video-games/")
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
        String[] list_s = html_content.split("<h3 class=\"bc-title\">");
        String[] list_a = list_s[1].split("</h3>");
        String xx = list_a[0].replaceAll("</a>", "");
        String x = xx.trim();
        String[] list_b = x.split(">");
        String title = list_b[1];

        String[] list_c = list_b[0].split("/");
        String url = list_c[1];
        String link = "https://collider.com/" + url;

        NewDAO nedao = new NewDAO();
        New ne = nedao.getNewByTitle(title);
        if (ne != null) {
            System.out.println("[Game 1] Chua co bai moi");
        } else {
            Thread.sleep(1000);
            Getcontent getnd = new Getcontent();
            ArrayList<String> list_img_all = new ArrayList<>();
            ArrayList<String> list_nd_all = new ArrayList<>();
            String noidung_all = "";
            getnd.getnoidung(link);
            WebCrawlerWithDepth wc = new WebCrawlerWithDepth();
            String cover = wc.requestCover(link);
            System.out.println("[Game 1] Get Bai Moi");
            GetImg getimg = new GetImg();
            String noidung_final = getnd.getnoidung(link);
            ArrayList<String> list_anh = getimg.GetImage(link);
            for (String xk : list_anh) {
                String xxk = "<img src=\"" + xk.trim() + "\" class=\"img-fluid\" alt=\"Responsive image\">";
                list_img_all.add(xxk);
            }
            String[] xxxk = noidung_final.split("\n");
            for (String y : xxxk) {
                list_nd_all.add(y);
            }

            for (int i = 0; i < list_nd_all.size() - 1; i++) {
                if (list_nd_all.get(i).contains("shacojx")) {
                    list_nd_all.set(i, list_img_all.get(0));
                    list_img_all.remove(0);
                } else {
                    list_nd_all.set(i, "<p>" + list_nd_all.get(i) + "</p>");
                }
            }

            for (String k : list_nd_all) {
                noidung_all = noidung_all + k + "\n";
            }

//        System.out.println(noidung_all);
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            String id = startDate.replaceAll(" ", "");
            New news = new New(id, title, "...", noidung_all, startDate, "Video Games", cover);
            nedao.insertNews(news);
            System.out.println("[Game 1] Inert db done");
        }

    }
    
    public void spiderGame2() throws IOException, InterruptedException, SQLException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://collider.com/video-games/")
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
        String[] list_s = html_content.split("<h3 class=\"bc-title\">");
        String[] list_a = list_s[2].split("</h3>");
        String xx = list_a[0].replaceAll("</a>", "");
        String x = xx.trim();
        String[] list_b = x.split(">");
        String title = list_b[1];

        String[] list_c = list_b[0].split("/");
        String url = list_c[1];
        String link = "https://collider.com/" + url;

        NewDAO nedao = new NewDAO();
        New ne = nedao.getNewByTitle(title);
        if (ne != null) {
            System.out.println("[Game 2] Chua co bai moi");
        } else {
            Thread.sleep(1000);
            Getcontent getnd = new Getcontent();
            ArrayList<String> list_img_all = new ArrayList<>();
            ArrayList<String> list_nd_all = new ArrayList<>();
            String noidung_all = "";
            getnd.getnoidung(link);
            WebCrawlerWithDepth wc = new WebCrawlerWithDepth();
            String cover = wc.requestCover(link);
            System.out.println("[Game 2] Get Bai Moi");
            GetImg getimg = new GetImg();
            String noidung_final = getnd.getnoidung(link);
            ArrayList<String> list_anh = getimg.GetImage(link);
            for (String xk : list_anh) {
                String xxk = "<img src=\"" + xk.trim() + "\" class=\"img-fluid\" alt=\"Responsive image\">";
                list_img_all.add(xxk);
            }
            String[] xxxk = noidung_final.split("\n");
            for (String y : xxxk) {
                list_nd_all.add(y);
            }

            for (int i = 0; i < list_nd_all.size() - 1; i++) {
                if (list_nd_all.get(i).contains("shacojx")) {
                    list_nd_all.set(i, list_img_all.get(0));
                    list_img_all.remove(0);
                } else {
                    list_nd_all.set(i, "<p>" + list_nd_all.get(i) + "</p>");
                }
            }

            for (String k : list_nd_all) {
                noidung_all = noidung_all + k + "\n";
            }

//        System.out.println(noidung_all);
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            String id = startDate.replaceAll(" ", "");
            New news = new New(id, title, "...", noidung_all, startDate, "Video Games", cover);
            nedao.insertNews(news);
            System.out.println("[Game 2] Inert db done");
        }

    }
    
    
    public void spiderGame3() throws IOException, InterruptedException, SQLException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://collider.com/video-games/")
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
        String[] list_s = html_content.split("<h3 class=\"bc-title\">");
        String[] list_a = list_s[3].split("</h3>");
        String xx = list_a[0].replaceAll("</a>", "");
        String x = xx.trim();
        String[] list_b = x.split(">");
        String title = list_b[1];

        String[] list_c = list_b[0].split("/");
        String url = list_c[1];
        String link = "https://collider.com/" + url;

        NewDAO nedao = new NewDAO();
        New ne = nedao.getNewByTitle(title);
        if (ne != null) {
            System.out.println("[Game 3] Chua co bai moi");
        } else {
            Thread.sleep(1000);
            Getcontent getnd = new Getcontent();
            ArrayList<String> list_img_all = new ArrayList<>();
            ArrayList<String> list_nd_all = new ArrayList<>();
            String noidung_all = "";
            getnd.getnoidung(link);
            WebCrawlerWithDepth wc = new WebCrawlerWithDepth();
            String cover = wc.requestCover(link);
            System.out.println("[Game 3] Get Bai Moi");
            GetImg getimg = new GetImg();
            String noidung_final = getnd.getnoidung(link);
            ArrayList<String> list_anh = getimg.GetImage(link);
            for (String xk : list_anh) {
                String xxk = "<img src=\"" + xk.trim() + "\" class=\"img-fluid\" alt=\"Responsive image\">";
                list_img_all.add(xxk);
            }
            String[] xxxk = noidung_final.split("\n");
            for (String y : xxxk) {
                list_nd_all.add(y);
            }

            for (int i = 0; i < list_nd_all.size() - 1; i++) {
                if (list_nd_all.get(i).contains("shacojx")) {
                    list_nd_all.set(i, list_img_all.get(0));
                    list_img_all.remove(0);
                } else {
                    list_nd_all.set(i, "<p>" + list_nd_all.get(i) + "</p>");
                }
            }

            for (String k : list_nd_all) {
                noidung_all = noidung_all + k + "\n";
            }

//        System.out.println(noidung_all);
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            String id = startDate.replaceAll(" ", "");
            New news = new New(id, title, "...", noidung_all, startDate, "Video Games", cover);
            nedao.insertNews(news);
            System.out.println("[Game 3] Inert db done");
        }

    }
    
    
    public void spiderGame4() throws IOException, InterruptedException, SQLException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://collider.com/video-games/")
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
        String[] list_s = html_content.split("<h3 class=\"bc-title\">");
        String[] list_a = list_s[4].split("</h3>");
        String xx = list_a[0].replaceAll("</a>", "");
        String x = xx.trim();
        String[] list_b = x.split(">");
        String title = list_b[1];

        String[] list_c = list_b[0].split("/");
        String url = list_c[1];
        String link = "https://collider.com/" + url;

        NewDAO nedao = new NewDAO();
        New ne = nedao.getNewByTitle(title);
        if (ne != null) {
            System.out.println("[Game 4] Chua co bai moi");
        } else {
            Thread.sleep(1000);
            Getcontent getnd = new Getcontent();
            ArrayList<String> list_img_all = new ArrayList<>();
            ArrayList<String> list_nd_all = new ArrayList<>();
            String noidung_all = "";
            getnd.getnoidung(link);
            WebCrawlerWithDepth wc = new WebCrawlerWithDepth();
            String cover = wc.requestCover(link);
            System.out.println("[Game 4] Get Bai Moi");
            GetImg getimg = new GetImg();
            String noidung_final = getnd.getnoidung(link);
            ArrayList<String> list_anh = getimg.GetImage(link);
            for (String xk : list_anh) {
                String xxk = "<img src=\"" + xk.trim() + "\" class=\"img-fluid\" alt=\"Responsive image\">";
                list_img_all.add(xxk);
            }
            String[] xxxk = noidung_final.split("\n");
            for (String y : xxxk) {
                list_nd_all.add(y);
            }

            for (int i = 0; i < list_nd_all.size() - 1; i++) {
                if (list_nd_all.get(i).contains("shacojx")) {
                    list_nd_all.set(i, list_img_all.get(0));
                    list_img_all.remove(0);
                } else {
                    list_nd_all.set(i, "<p>" + list_nd_all.get(i) + "</p>");
                }
            }

            for (String k : list_nd_all) {
                noidung_all = noidung_all + k + "\n";
            }

//        System.out.println(noidung_all);
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            String id = startDate.replaceAll(" ", "");
            New news = new New(id, title, "...", noidung_all, startDate, "Video Games", cover);
            nedao.insertNews(news);
            System.out.println("[Game 4] Inert db done");
        }

    }
    
    
    public void spiderGame5() throws IOException, InterruptedException, SQLException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://collider.com/video-games/")
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
        String[] list_s = html_content.split("<h3 class=\"bc-title\">");
        String[] list_a = list_s[5].split("</h3>");
        String xx = list_a[0].replaceAll("</a>", "");
        String x = xx.trim();
        String[] list_b = x.split(">");
        String title = list_b[1];

        String[] list_c = list_b[0].split("/");
        String url = list_c[1];
        String link = "https://collider.com/" + url;

        NewDAO nedao = new NewDAO();
        New ne = nedao.getNewByTitle(title);
        if (ne != null) {
            System.out.println("[Game 5] Chua co bai moi");
        } else {
            Thread.sleep(1000);
            Getcontent getnd = new Getcontent();
            ArrayList<String> list_img_all = new ArrayList<>();
            ArrayList<String> list_nd_all = new ArrayList<>();
            String noidung_all = "";
            getnd.getnoidung(link);
            WebCrawlerWithDepth wc = new WebCrawlerWithDepth();
            String cover = wc.requestCover(link);
            System.out.println("[Game 5] Get Bai Moi");
            GetImg getimg = new GetImg();
            String noidung_final = getnd.getnoidung(link);
            ArrayList<String> list_anh = getimg.GetImage(link);
            for (String xk : list_anh) {
                String xxk = "<img src=\"" + xk.trim() + "\" class=\"img-fluid\" alt=\"Responsive image\">";
                list_img_all.add(xxk);
            }
            String[] xxxk = noidung_final.split("\n");
            for (String y : xxxk) {
                list_nd_all.add(y);
            }

            for (int i = 0; i < list_nd_all.size() - 1; i++) {
                if (list_nd_all.get(i).contains("shacojx")) {
                    list_nd_all.set(i, list_img_all.get(0));
                    list_img_all.remove(0);
                } else {
                    list_nd_all.set(i, "<p>" + list_nd_all.get(i) + "</p>");
                }
            }

            for (String k : list_nd_all) {
                noidung_all = noidung_all + k + "\n";
            }

//        System.out.println(noidung_all);
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            String id = startDate.replaceAll(" ", "");
            New news = new New(id, title, "...", noidung_all, startDate, "Video Games", cover);
            nedao.insertNews(news);
            System.out.println("[Game 5] Inert db done");
        }

    }
    
    
}
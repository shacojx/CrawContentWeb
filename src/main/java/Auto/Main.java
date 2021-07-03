/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import Auto2.FuckMovie;
import Auto2.FuckReviews;
import Auto2.FuckTV;
import Auto2.FuckTrailer;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author ShacoJX
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, SQLException {

        System.out.println("========================================");
        System.out.println("=         Coppy & paste content        =");
        System.out.println("=         Service code by EOG          =");
        System.out.println("========================================");

        while (true) {
            HackTV tv = new HackTV();
            HackMovie movie = new HackMovie();
            HackTrailers trai = new HackTrailers();
            HackNetflix net = new HackNetflix();
            HackGame game = new HackGame();
            HackReviews rev = new HackReviews();
            HackInterviews inter = new HackInterviews();
            //======================
            FuckMovie fmovie = new FuckMovie();
            FuckTV ftv = new FuckTV();
            FuckTrailer ftrai = new FuckTrailer();
            FuckReviews frew = new FuckReviews();
            System.out.println("-----> Start Craw collider.com <------");
            //================

            try {
                tv.spiderTV1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("[" + startDate + "][collider.com][*] Load News");
            }
            try {
                movie.spiderMovie1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("[" + startDate + "][collider.com][*] Load News");
            }
            try {
                trai.spiderTrailer1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                net.spiderNet1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                game.spiderGame1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                rev.spiderReview1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                inter.spiderInterview1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            System.out.println("----->[collider.com] End turn 1  <------");

            try {
                tv.spiderTV2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                movie.spiderMovie2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                trai.spiderTrailer2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                net.spiderNet2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                game.spiderGame2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                rev.spiderReview2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                inter.spiderInterview2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            System.out.println("----->[collider.com] End turn 2  <------");

            try {
                tv.spiderTV3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                movie.spiderMovie3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                trai.spiderTrailer3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                net.spiderNet3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                game.spiderGame3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                rev.spiderReview3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                inter.spiderInterview3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            System.out.println("----->[collider.com] End turn 3  <------");

            try {
                tv.spiderTV4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                movie.spiderMovie4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                trai.spiderTrailer4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                net.spiderNet4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                game.spiderGame4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                rev.spiderReview4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                inter.spiderInterview4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            System.out.println("----->[collider.com] End turn 4  <------");

            try {
                tv.spiderTV5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                movie.spiderMovie5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                trai.spiderTrailer5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                net.spiderNet5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                game.spiderGame5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                rev.spiderReview5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            try {
                inter.spiderInterview5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][collider.com][*] Load News");
            }
            System.out.println("----->[collider.com] End turn 5  <------");
            System.out.println("-----> Start Craw movieweb.com <------");
            try {
                fmovie.FuckMovie1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftv.FuckTV1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftrai.FuckT1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                frew.FuckR1();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            System.out.println("----->[movieweb.com] End turn 1  <------");
            try {
                fmovie.FuckMovie2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftv.FuckTV2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftrai.FuckT2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                frew.FuckR2();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            System.out.println("----->[movieweb.com] End turn 2  <------");
            try {
                fmovie.FuckMovie3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftv.FuckTV3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftrai.FuckT3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                frew.FuckR3();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            System.out.println("----->[movieweb.com] End turn 3  <------");
            try {
                fmovie.FuckMovie4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftv.FuckTV4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftrai.FuckT4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                frew.FuckR4();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            System.out.println("----->[movieweb.com] End turn 4  <------");
            try {
                fmovie.FuckMovie5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftv.FuckTV5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                ftrai.FuckT5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            try {
                frew.FuckR5();
            } catch (Exception e) {
                java.util.Date date1 = new java.util.Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startDate = sdf1.format(date1);
                System.out.println("["+startDate+"][movieweb.com][*] Load News");
            }
            System.out.println("----->[movieweb.com] End turn 5  <------");
            System.out.println("========= Waiting 30 phut ==========");
            Thread.sleep(1800000);

        }

    }
}

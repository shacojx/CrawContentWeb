/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author ShacoJX
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, SQLException {

        System.out.println("========================================");
        System.out.println("=  Coppy & paste content collider.com  =");
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
            System.out.println("-----> Start Craw <------");
            //================

            try {
                tv.spiderTV1();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                movie.spiderMovie1();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                trai.spiderTrailer1();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                net.spiderNet1();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                game.spiderGame1();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                rev.spiderReview1();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                inter.spiderInterview1();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            System.out.println("-----> End turn 1  <------");

            try {
                tv.spiderTV2();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                movie.spiderMovie2();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                trai.spiderTrailer2();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                net.spiderNet2();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                game.spiderGame2();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                rev.spiderReview2();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                inter.spiderInterview2();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            System.out.println("-----> End turn 2  <------");

            try {
                tv.spiderTV3();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                movie.spiderMovie3();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                trai.spiderTrailer3();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                net.spiderNet3();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                game.spiderGame3();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                rev.spiderReview3();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                inter.spiderInterview3();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            System.out.println("-----> End turn 3  <------");

            try {
                tv.spiderTV4();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                movie.spiderMovie4();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                trai.spiderTrailer4();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                net.spiderNet4();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                game.spiderGame4();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                rev.spiderReview4();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                inter.spiderInterview4();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            System.out.println("-----> End turn 4  <------");

            try {
                tv.spiderTV5();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                movie.spiderMovie5();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                trai.spiderTrailer5();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                net.spiderNet5();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                game.spiderGame5();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                rev.spiderReview5();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            try {
                inter.spiderInterview5();
            } catch (Exception e) {
                System.out.println("[*] Load bai moi");
            }
            System.out.println("-----> End turn 5  <------");
            System.out.println("========= Waiting 30 phut ==========");
            Thread.sleep(1800000);

        }

    }
}

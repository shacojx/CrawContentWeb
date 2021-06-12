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
            tv.spiderTV1();
            movie.spiderMovie1();
            trai.spiderTrailer1();
            net.spiderNet1();
            game.spiderGame1();
            rev.spiderReview1();
            inter.spiderInterview1();
            System.out.println("-----> End turn 1  <------");
            //==============
            tv.spiderTV2();
            movie.spiderMovie2();
            trai.spiderTrailer2();
            net.spiderNet2();
            game.spiderGame2();
            rev.spiderReview2();
            inter.spiderInterview2();
            System.out.println("-----> End turn 2  <------");
            //===============
            tv.spiderTV3();
            movie.spiderMovie3();
            trai.spiderTrailer3();
            net.spiderNet3();
            game.spiderGame3();
            rev.spiderReview3();
            inter.spiderInterview3();
            System.out.println("-----> End turn 3  <------");
            //==================
            tv.spiderTV4();
            movie.spiderMovie4();
            trai.spiderTrailer4();
            net.spiderNet4();
            game.spiderGame4();
            rev.spiderReview4();
            inter.spiderInterview4();
            System.out.println("-----> End turn 4  <------");
            //====================
            tv.spiderTV5();
            movie.spiderMovie5();
            trai.spiderTrailer5();
            net.spiderNet5();
            game.spiderGame5();
            rev.spiderReview5();
            inter.spiderInterview5();
            System.out.println("-----> End turn 5  <------");
            //===================
            System.out.println("========= Waiting 30 phut ==========");
            Thread.sleep(600000);
        }

    }
}

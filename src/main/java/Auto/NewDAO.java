/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShacoJX
 */
public class NewDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void insertNews(New ne) throws SQLException {
        try {
            String query = "INSERT INTO `blogauto`.`news` "
                    + "(`id`, `title`, `shortdes`, `context`, `date`,"
                    + "`type`,`cover`) "
                    + "VALUES (?,?,?,?,?,?,?)";
            conn = new DBContent().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ne.getId());
            ps.setString(2, ne.getTitle());
            ps.setString(3, ne.getShortDes());
            ps.setString(4, ne.getContent());
            ps.setString(5, ne.getDate());
            ps.setString(6, ne.getType_new());
            ps.setString(7, ne.getCover());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
        } catch (Exception ex) {
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            System.out.println("[" + startDate + "][*] Insert Done");
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }

    public New getNewByTitle(String title) throws SQLException {
        try {
            String query = "SELECT * FROM `blogauto`.`news` WHERE `title` = ? ORDER BY  date desc;";
            conn = new DBContent().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, title);
            rs = ps.executeQuery();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7));
                return ne;
            }
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }

    public New getNewById(String id) throws SQLException {
        try {
            String query = "SELECT * FROM `blogauto`.`news` WHERE `id` = ?";
            conn = new DBContent().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7));
                return ne;
            }
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }

    public void Update(New a, String id) throws SQLException {

        try {
            String query = "UPDATE `blogauto`.`news` SET `id` = ? WHERE `id`=?;";
            conn = new DBContent().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, id);
            ps.setString(2, a.getId());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            rs.close();
            ps.close();
            conn.close();
        }

    }

    public void Updatend(String id, String nd) throws SQLException {

        try {
            String query = "UPDATE `blogauto`.`news` SET `context` = ? WHERE `id`=?;";
            conn = new DBContent().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, nd);
            ps.setString(2, id);

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            rs.close();
            ps.close();
            conn.close();
        }

    }

    public ArrayList<New> getAll() throws SQLException {
        try {
            String query = "SELECT * FROM  `blogauto`.`news`;";
            conn = new DBContent().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<New> list_new = new ArrayList<>();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list_new.add(ne);
            }
            return list_new;
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }

}

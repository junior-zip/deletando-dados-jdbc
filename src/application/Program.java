package application;

import db.DB;
import db.DbIntegretyException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

            Connection conn = null;
            PreparedStatement st = null;


            try{
                conn = DB.getConnection();
                st = conn.prepareStatement(
                        "DELETE FROM department"
                        + "WHERE"
                        + "Id = ?");

                st.setInt(1, 4);

                int rows = st.executeUpdate();

                System.out.println("Done! Rows affected " + rows);
            }catch (SQLException e){
                throw new DbIntegretyException(e.getMessage());

            }
            finally {
                DB.closeStatement(st);
                DB.closeConnection();
            }
    }
}

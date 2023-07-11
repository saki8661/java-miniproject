import db.DBConnection;
import model.stadium.Stadium;
import model.stadium.StadiumDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BaseBallApp {
    public static void main(String[] args) {
        Connection connection = DBConnection.getInstance();
        // DI
        StadiumDao stadiumDao = new StadiumDao(connection);

        try {
            List<Stadium> stadiums = stadiumDao.getAllStadiums();
            if (!stadiums.isEmpty()) {
                for (Stadium stadium : stadiums) {
                    System.out.println("경기장이름: " + stadium.getName());
                    System.out.println("개장: " + stadium.getCreatedAt());
                    System.out.println();
                }
            } else {
                System.out.println("못찾겠다.");
            }
        } catch (SQLException e) {
            System.out.println("오류가 있습니다: " + e.getMessage());
        }

    }
}

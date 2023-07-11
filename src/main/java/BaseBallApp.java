import db.DBConnection;
import model.stadium.Stadium;
import model.stadium.StadiumDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BaseBallApp {
    public static void main(String[] args) {
        // DB 연결 (baseballdb)
        Connection connection = DBConnection.getInstance();
        // DI (의존성 주입)
        StadiumDao stadiumDao = new StadiumDao(connection);

        System.out.println("원하시는 서비스 번호와 엔터를 눌러주세요.");
        System.out.println("1 : 야구장 전체출력");
        Scanner sc = new Scanner(System.in);    // 스캐너 sc
        String keyboard = sc.nextLine();        // 키보드 입력을 받는다.

        /* 서비스 메뉴 입력  */
        // 현재 while문 없이 1회 시도 후 종료
        // 모든 서비스 구현 완료시 while문을 넣고 반복실행


        // 키보드 입력이 n이 들어오면, n번 서비스 실행
        if (keyboard.equals("1")) {
            System.out.println("1번이 입력 되었습니다.");
            // 1. 야구장 전체출력
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


        } else if (keyboard.equals("2")) {
            System.out.println("2번이 입력 되었습니다.");
            // 2번_서비스();
        }
//        else if (keyboard.equals("3")) {
//            System.out.println("3번이 입력 되었습니다.");
//            // 3번_서비스();
//        }
//        else if (keyboard.equals("4")) {
//            System.out.println("2번이 입력 되었습니다.");
//            // 4번_서비스();
//        }

        else {
            System.out.println("Input 오류 : 숫자 입력후 엔터를 눌러주세요!");
        }
    }
}

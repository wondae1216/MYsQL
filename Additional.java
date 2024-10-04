package com.ohgiraffers.section;

import com.google.protobuf.ProtocolStringList;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Additional {

    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

            try {
                prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));

                String query = prop.getProperty("Glt_Menu");


                Scanner sc = new Scanner((System.in));
                System.out.println("젤라또 코드를 만들어주세요 : ");
                String GltCode = sc.nextLine();
                System.out.println("만들고 싶은 젤라또를 입력하세요 : ");
                String GltName = sc.nextLine();
                System.out.println("젤라도 가격을 정해주세요 : ");
                String GltPrice = sc.nextLine();
                System.out.println("생산하고 싶은 갯수를 알려주세요 : ");
                String ProductNumber = sc.nextLine();
                System.out.println("만드신 젤라또 판마하실건가요? (Y/N) : ");
                String orderableStatus = sc.nextLine().toUpperCase();

                pstmt = con.prepareStatement(query);
                pstmt.setString(1,GltCode);
                pstmt.setString(2, GltName);
                pstmt.setString(3, GltPrice);
                pstmt.setString(4, ProductNumber);
                pstmt.setString(5, orderableStatus);

                result = pstmt.executeUpdate();

            }catch (IOException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                close(con);
                close(pstmt);
            }

            if (result > 0 ) {
                System.out.println("젤라또 만들기 성공! ");
            } else {
                System.out.println("젤라또 만들기 실패..");
            }

        }
    }


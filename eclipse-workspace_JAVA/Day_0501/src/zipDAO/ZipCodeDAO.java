package zipDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class ZipCodeDAO {

	PreparedStatement pstmt = null;
	Connection conn = null;
	ResultSet rs = null;

	public List<ZipCodeVO> zipCodeList(String dong) {
		ZipCodeVO zipcodevo = null;
		DBManager manager = new DBManager();
		List<ZipCodeVO> list = new ArrayList<ZipCodeVO>();
		String sql = "select * from zipcode where dong like '%" + dong + "%'";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				zipcodevo = new ZipCodeVO();
				zipcodevo.setNo(rs.getString("no"));
				zipcodevo.setSido(rs.getString("sido"));
				zipcodevo.setGugun(rs.getString("gugun"));
				zipcodevo.setDong(rs.getString("dong"));
				zipcodevo.setBunji(rs.getString("bunji"));
				list.add(zipcodevo);
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

		return list;
	}
}

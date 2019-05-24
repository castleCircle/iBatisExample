package iBatistest;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import iBatisSetting.SqlMapConfig;

public class Dao {
	SqlMapClient smc = SqlMapConfig.getSqlMapInstance();
	List<DTO> list;

	@SuppressWarnings("unchecked")
	public List<DTO> selectEMP() throws SQLException {
		list = smc.queryForList("Emp.selectEmp");
		return list;
	}

	public int insertdata(DTO dto) {
		int result = 0;

		try {
			smc.insert("Emp.insertEmp", dto);

			System.out.println("�Է�");

		} catch (Exception e) {

			result = 1;
			System.out.println("����");
			e.printStackTrace();

		}

		return result;
	}
	
}

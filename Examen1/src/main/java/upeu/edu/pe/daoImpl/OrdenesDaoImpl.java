package upeu.edu.pe.daoImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.dao.*;
import upeu.edu.pe.entity.Ordenes;


@Component
public class OrdenesDaoImpl implements Operaciones<Ordenes> {
	
	@Autowired
	private JdbcTemplate orden;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL="select te.TerritoryDescription as Territorio, count(*) as cantidad from orders o\r\n"
				+ "join employees e on e.EmployeeID=o.EmployeeID\r\n"
				+ "join employeeterritories tr on tr.EmployeeID=e.EmployeeID\r\n"
				+ "join territories te on te.TerritoryID=tr.TerritoryID\r\n"
				+ "group by te.TerritoryDescription\r\n"
				+ "order by TerritoryDescription;";
		return orden.queryForList(SQL);
	}
	
	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}

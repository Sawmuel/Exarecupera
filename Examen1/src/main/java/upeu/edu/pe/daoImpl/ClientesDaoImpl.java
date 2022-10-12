package upeu.edu.pe.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.dao.Operaciones;
import upeu.edu.pe.entity.Clientes;

@Component
public class ClientesDaoImpl implements Operaciones<Clientes> {

	@Autowired
	private JdbcTemplate client;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL="select r.RegionDescription as Region, count(*) as cantidad from customers as c \r\n"
				+ "join orders as o on o.CustomerID=c.CustomerID\r\n"
				+ "join employees as e on e.EmployeeID=o.EmployeeID\r\n"
				+ "join employeeterritories as tr on tr.EmployeeID=e.EmployeeID\r\n"
				+ "join territories as te on te.TerritoryID=tr.TerritoryID\r\n"
				+ "join region as r on r.RegionID=te.RegionID\r\n"
				+ "group by r.RegionDescription\r\n"
				+ "order by RegionDescription;";
		return client.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}

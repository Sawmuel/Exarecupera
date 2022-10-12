package upeu.edu.pe.dao;

import java.util.List;
import java.util.Map;

public interface Operaciones<T> {
	List<Map<String,Object>> readAll();
	List<Map<String,Object>> readAll2();
	List<Map<String,Object>> readAll3();

}

package upeu.edu.pe.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.dao.Operaciones;
import upeu.edu.pe.daoImpl.ClientesDaoImpl;
import upeu.edu.pe.entity.Clientes;

@Service
public class ClientesService implements Operaciones<Clientes> {

	@Autowired
	private ClientesDaoImpl daoImpl;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}

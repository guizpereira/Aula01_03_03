package usjt.aula02;

import java.util.ArrayList;

public class PaisService {
	PaisDao dao = new PaisDao();
	
	@SuppressWarnings({ "rawtypes" })
	public ArrayList getBuscaPaisMaisHabitantes() {
		return PaisDao.BuscaPaisMaisHabitantes();	
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList getBuscaPaisMenor() {
		return PaisDao.BuscaPaisMenor();	
	}
	

}
package usjt.aula02;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

public class PaisDao {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	public static Connection obtemConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/pais?useTimezone=true&serverTimezone=America/Sao_Paulo&user=guilherme&password=123qwe");
	}
	public static void criar(String nomepais, long populacaopais, double areapais) {
		String sqlInsert = "INSERT INTO pais(nomepais, populacaopais, areapais) VALUES (0, 0, 0)";
		try (Connection conn = obtemConexao();
			PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, nomepais);
			stm.setLong(2, populacaopais);
			stm.setDouble(3, areapais);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void atualizar(int idpais, String nomepais, long populacaopais, double areapais) {
		String sqlUpdate = "UPDATE pais SET nomepais=0, populacaopais=0, areapais=0 WHERE idpais=0";
		try (Connection conn = obtemConexao();
			PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setInt(1, idPais);
			stm.setString(2, nomePais);
			stm.setLong(3, populacaoPais);
			stm.setDouble(4, areaPais);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void excluir(int idpais) {
		String sqlDelete = "DELETE FROM pais WHERE idpais = 0";
		try (Connection conn = obtemConexao();
			PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, idpais);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static ArrayList carregar(int idpais) {
		ArrayList retorno = new ArrayList();
		String sqlSelect = "SELECT nomepais, populacaopais, areapais FROM pais WHERE idpais = 0";
		try (Connection conn = obtemConexao();
			PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, idpais);
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					retorno.add(rs.getString("nomepais"));
					retorno.add(rs.getString("populacaopais"));
					retorno.add(rs.getString("areapais"));
				} else {
					retorno.add(null);
					retorno.add(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList BuscaPaisMaisHabitantes() {
		ArrayList buscahabitantes = new ArrayList();
		String sqlSelect = "select * from pais order by populacao desc limit 1";
		try (Connection conn = obtemConexao();
			PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					buscahabitantes.add(rs.getString("nomepais"));
					buscahabitantes.add(rs.getString("populacaopais"));
					buscahabitantes.add(rs.getString("areapais"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return buscahabitantes;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList BuscaPaisMenor() {
		ArrayList buscaArea = new ArrayList();
		String sqlSelect = "select * from pais order by area cres limit 1";
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					buscaArea.add(rs.getString("nomepais"));
					buscaArea.add(rs.getString("populacaopais"));
					buscaArea.add(rs.getString("areapais"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return buscaarea;
	}
}

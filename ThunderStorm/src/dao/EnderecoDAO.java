package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Endereco;

public class EnderecoDAO {
	
	public int criar(Endereco endereco) {
		String sqlInsert = "INSERT INTO Endereco(idusuario,tipodeendereco, cep, endereco, estado, cidade, numero, complemento) VALUES (?,?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			
			stm.setInt(1, endereco.getIdUsuario());
			stm.setString(2, endereco.getTipoDeEndereco());
			stm.setString(3, endereco.getCEP());
			stm.setString(4, endereco.getEndereco());
			stm.setString(5, endereco.getEstado());
			stm.setString(6, endereco.getCidade());
			stm.setString(7, endereco.getNumero());
			stm.setString(8, endereco.getComplemento());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					endereco.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return endereco.getId();
	}

	public void atualizar(Endereco endereco) {
		String sqlUpdate = "UPDATE Endereco SET idusuario = ?,tipodeendereco=?, cep=?, endereco=?, estado=?, cidade=?, numero=?, complemento=? WHERE id=?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setInt(1, endereco.getIdUsuario());
			stm.setString(2, endereco.getTipoDeEndereco());
			stm.setString(3, endereco.getCEP());
			stm.setString(4, endereco.getEndereco());
			stm.setString(5, endereco.getEstado());
			stm.setString(6, endereco.getCidade());
			stm.setString(7, endereco.getNumero());
			stm.setString(8, endereco.getComplemento());
			stm.setInt(9, endereco.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void excluir(int id) {
		String sqlDelete = "DELETE FROM Endereco WHERE id = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, id);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Endereco carregar(int id) {
		Endereco endereco = new Endereco();
		endereco.setId(id);
		String sqlSelect = "SELECT idusuario,tipodeendereco, cep, endereco, estado, cidade, numero, complemento FROM Endereco WHERE endereco.id = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, endereco.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					endereco.setIdUsuario(rs.getInt("idusuario"));
					endereco.setTipoDeEndereco(rs.getString("tipodeendereco"));
					endereco.setCEP(rs.getString("cep"));
					endereco.setEndereco(rs.getString("endereco"));
					endereco.setEstado(rs.getString("estado"));
					endereco.setCidade(rs.getString("cidade"));
					endereco.setNumero(rs.getString("numero"));
					endereco.setComplemento(rs.getString("complemento"));
				} else {
					endereco.setId(-1);
					endereco.setIdUsuario(0);
					endereco.setTipoDeEndereco(null);
					endereco.setCEP(null);
					endereco.setEndereco(null);
					endereco.setEstado(null);
					endereco.setCidade(null);
					endereco.setNumero(null);
					endereco.setComplemento(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return endereco;
	}
	
	public ArrayList<Endereco> pesquisarEndereco() {
		Endereco endereco;
		ArrayList<Endereco> lista = new ArrayList<>();
		String sqlSelect = "SELECT idusuario,tipodeendereco, cep, endereco, estado, cidade, numero, complemento FROM Endereco";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					endereco = new Endereco();
					endereco.setIdUsuario(rs.getInt("idusuario"));
					endereco.setTipoDeEndereco(rs.getString("tipodeendereco"));
					endereco.setCEP(rs.getString("cep"));
					endereco.setEndereco(rs.getString("endereco"));
					endereco.setEstado(rs.getString("estado"));
					endereco.setCidade(rs.getString("cidade"));
					endereco.setNumero(rs.getString("numero"));
					endereco.setComplemento(rs.getString("complemento"));
					lista.add(endereco);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}

	public ArrayList<Endereco> pesquisarEndereco(String chave) {
		Endereco endereco;
		ArrayList<Endereco> lista = new ArrayList<>();
		String sqlSelect = "SELECT idusuario,tipodeendereco, cep, endereco, estado, cidade, numero, complemento FROM Endereco where upper(endereco) like ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, "%" + chave.toUpperCase() + "%");
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					endereco = new Endereco();
					endereco.setIdUsuario(rs.getInt("idusuario"));
					endereco.setTipoDeEndereco(rs.getString("tipodeendereco"));
					endereco.setCEP(rs.getString("cep"));
					endereco.setEndereco(rs.getString("endereco"));
					endereco.setEstado(rs.getString("estado"));
					endereco.setCidade(rs.getString("cidade"));
					endereco.setNumero(rs.getString("numero"));
					endereco.setComplemento(rs.getString("complemento"));
					lista.add(endereco);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}
}

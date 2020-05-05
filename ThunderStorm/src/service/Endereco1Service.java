package service;

import java.util.ArrayList;

import model.Endereco;
import dao.EnderecoDAO;

public class Endereco1Service {
	EnderecoDAO dao;
	
	public Endereco1Service(){
		dao = new EnderecoDAO();
	}
	public ArrayList<Endereco> pesquisarEndereco(){
		return dao.pesquisarEndereco();
	}
	public ArrayList<Endereco> pesquisarEndereco(String chave){
		return dao.pesquisarEndereco(chave);
	}
}

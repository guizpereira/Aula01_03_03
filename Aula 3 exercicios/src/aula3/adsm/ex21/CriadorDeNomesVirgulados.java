package aula3.adsm.ex21;

public class CriadorDeNomesVirgulados implements CriadorDeNomes{

	@Override
	public Nome criar(String s) {
		String[] sep = s.split(", ");
		return new Nome (sep[1], sep[0]);
	}

}

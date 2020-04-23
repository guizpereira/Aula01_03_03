package aula5.adsm.ex81.ex82;

public class Teste {

	public static void main(String[] args) {

		ConsomeNoticia agregadorTopico = new AgregadorTopico("Games");
		ConsomeNoticia agregadorMensal = new AgregadorMensal();

		NoticiarioAssina noticiario = new NoticiarioAssina(agregadorTopico);
		noticiario.notificaNoticia("Ubisoft divulga vídeo com tour em VR pela Notre-Dame", 10, 03, "Games");
		new Consumidor("Carlos Eduardo", noticiario);
		noticiario.notificaNoticia("Competições oficiais de Valorant não mostrarão sangue dos personagens", 10, 02, "Games");
		noticiario.notificaNoticia("Dublador de Reno, de Final Fantasy VII, morre aos 55 anos", 03, 04, "Games");
		noticiario.notificaNoticia("Dragon Ball Z: Kakarot receberá modo Card Game em nova atualização", 15, 04, "Games");
		noticiario.notificaNoticia("Mortal Kombat: A Vingança de Scorpion está disponível digitalmente no Brasil", 16, 04, "Games");
		noticiario.notificaNoticia("Free Fire: Evento de Páscoa oferece roupas raras e chance de ganhar 19.999 dimas", 16, 04, "Games");
		noticiario.notificaNoticia("Resident Evil 3 chega a mais de 2 milhões de cópias vendidas em 5 dias", 13, 04, "Games");
		new Consumidor("Erika Guedes", noticiario);
		noticiario.notificaNoticia("Assassin's Creed 2 está gratuito para PC", 14, 04, "Games");
		new Consumidor("Ericson Guedes", noticiario);
		noticiario.notificaNoticia("Médicos preveem que Brasil não volta ao normal antes de agosto", 14, 04, "Saúde");
		noticiario.notificaNoticia("Xiaomi lança purificador de ar capaz de eliminar o vírus H1N1.", 15, 04, "Técnologia");
		noticiario.notificaNoticia("Remasterização de Call of Duty: Modern Warfare 3 já está pronta", 10, 04, "Games");
		noticiario.notificaNoticia("Você sabia? Big Brother Brasil já teve seu próprio game para PC", 04, 04, "Games");


		noticiario = new NoticiarioAssina(agregadorMensal);
		new Consumidor("Anderson", noticiario);
		noticiario.notificaNoticia("Médicos preveem que Brasil não volta ao normal antes de agosto", 14, 03, "Saúde");
		noticiario.notificaNoticia("Xiaomi lança purificador de ar capaz de eliminar o vírus H1N1.", 15, 03, "Técnologia");
		noticiario.notificaNoticia("Remasterização de Call of Duty: Modern Warfare 3 já está pronta", 10, 04, "Games");
		noticiario.notificaNoticia("Você sabia? Big Brother Brasil já teve seu próprio game para PC", 04, 04, "Games");
		noticiario.notificaNoticia("Competições oficiais de Valorant não mostrarão sangue dos personagens", 10, 04, "Games");
		noticiario.notificaNoticia("Dublador de Reno, de Final Fantasy VII, morre aos 55 anos", 03, 04, "Games");
		noticiario.notificaNoticia("Dragon Ball Z: Kakarot receberá modo Card Game em nova atualização", 15, 04, "Games");
		noticiario.notificaNoticia("Mortal Kombat: A Vingança de Scorpion está disponível digitalmente no Brasil", 16, 04, "Games");
		noticiario.notificaNoticia("Free Fire: Evento de Páscoa oferece roupas raras e chance de ganhar 19.999 dimas", 16, 04, "Games");
		noticiario.notificaNoticia("Resident Evil 3 chega a mais de 2 milhões de cópias vendidas em 5 dias", 13, 05, "Games");
	}

}

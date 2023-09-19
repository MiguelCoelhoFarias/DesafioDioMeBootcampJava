package com.diome.model;

import com.diome.controller.Internet;
import com.diome.util.Celular;
import com.diome.util.MusicPlayer;

public class Iphone {

	public static void main (String[] args) {
		MusicPlayer ipod= new MusicPlayer();
		Celular iphone = new Celular();
		Internet navegador = new Internet();
		
		
		System.out.println("Musica: ");
		ipod.PlayMusic();
		ipod.SaveMusic();
		ipod.PauseMusic();
		ipod.NextMusic();
		ipod.BackMusic();
		
		System.out.println();
		System.out.println("Celular:");
		iphone.TurnOn();
		iphone.AcceptCall();
		iphone.BoxMail();
		iphone.RecuseCall();
		iphone.DonotDisturbe();
		iphone.TurnOff();
		
		System.out.println();
		System.out.println("Internet: ");
		navegador.HomeSearch();
		navegador.NewGuide();
		navegador.Refresh();
		navegador.PrivateSearch();
	}

}

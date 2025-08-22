package br.edu.ifpb.padroes.atv3.musicas.facade;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.adapter.MusicService;
import br.edu.ifpb.padroes.atv3.musicas.decorator.Player;

import java.util.Arrays;

public class MusicFacade {
    private final MusicService musicService;
    private final Player player;

    public MusicFacade(MusicService musicService, Player player) {
        this.musicService = musicService;
        this.player = player;
    }

    public void showMusics() {
        musicService.getMusics().forEach(m ->
                System.out.println("id: " + m.id() + " título: " + m.titulo() + " ano: " + m.ano() + " artista: " + m.artista()));
    }

    public void playMusic(String id) {
        Musica musica = musicService.getMusics()
                .stream()
                .filter(m -> m.id().equals(id))
                .findFirst()
                .orElse(null);

        player.tocarMusica(musica);
    }
}

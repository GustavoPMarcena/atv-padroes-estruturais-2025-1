package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MusicCountDecorator implements Player{
    private final Player player;
    private Map<String, Integer> totalMusicCount = new HashMap<>();
    private Map<String, Integer> totalArtistCount = new HashMap<>();
    private Map<String, Integer> totalGenreCount = new HashMap<>();


    public MusicCountDecorator(Player player) {
        this.player = player;
    }

    @Override
    public void tocarMusica(Musica musica) {
        player.tocarMusica(musica);
        checkMusicCount(musica);
        System.out.println();
    }

    private void checkMusicCount (Musica musica) {
        totalMusicCount.merge(musica.id(), 1, Integer::sum);
        totalArtistCount.merge(musica.artista(), 1, Integer::sum);
        totalGenreCount.merge(musica.genero(), 1, Integer::sum);
        System.out.println("Música \"" + musica.titulo() + "\" tocada " + totalMusicCount.get(musica.id()) + " vezes");
        System.out.println("Artista \"" + musica.artista() + "\" tocado " + totalArtistCount.get(musica.artista()) + " vezes");
        System.out.println("Gênero \"" + musica.genero() + "\" tocado " + totalGenreCount.get(musica.genero()) + " vezes");
    }
}

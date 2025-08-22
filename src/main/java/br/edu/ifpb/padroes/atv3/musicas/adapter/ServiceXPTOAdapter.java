package br.edu.ifpb.padroes.atv3.musicas.adapter;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.xpto.ClientHttpXPTO;
import br.edu.ifpb.padroes.atv3.musicas.xpto.Song;

import java.util.List;

public class ServiceXPTOAdapter implements MusicService{

    private final ClientHttpXPTO client;

    public ServiceXPTOAdapter(ClientHttpXPTO client) {
        this.client = client;
    }

    @Override
    public List<Musica> getMusics() {
        List<Song> songs = client.findAll();
        return songs.stream()
                .map(song -> new Musica(song.id(), song.title(), song.artist(), song.year(), song.genre()))
                .toList();
    }

}

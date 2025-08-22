package br.edu.ifpb.padroes.atv3.musicas.proxy;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.adapter.MusicService;

import java.util.List;

public class MusicProxy implements MusicService {
    private final MusicService musicService;
    private List<Musica> listOfMusics;

    public MusicProxy(MusicService musicService) {
        this.musicService = musicService;
    }

    @Override
    public List<Musica> getMusics() {
        if(listOfMusics != null) return listOfMusics;
        listOfMusics = musicService.getMusics();
        return listOfMusics;
    }
}

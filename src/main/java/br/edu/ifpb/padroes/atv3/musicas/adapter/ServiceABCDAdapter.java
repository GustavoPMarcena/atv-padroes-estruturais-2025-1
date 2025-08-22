package br.edu.ifpb.padroes.atv3.musicas.adapter;

import br.edu.ifpb.padroes.atv3.musicas.abcd.ClienteHttpABCD;
import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

import java.util.List;

public class ServiceABCDAdapter implements MusicService{

    private final ClienteHttpABCD client;

    public ServiceABCDAdapter(ClienteHttpABCD client) {
        this.client = client;
    }

    @Override
    public List<Musica> getMusics() {
        return client.listarMusicas();
    }

}

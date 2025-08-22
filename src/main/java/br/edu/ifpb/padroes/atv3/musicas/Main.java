package br.edu.ifpb.padroes.atv3.musicas;

import br.edu.ifpb.padroes.atv3.musicas.adapter.MusicService;
import br.edu.ifpb.padroes.atv3.musicas.adapter.ServiceXPTOAdapter;
import br.edu.ifpb.padroes.atv3.musicas.decorator.MusicCountDecorator;
import br.edu.ifpb.padroes.atv3.musicas.decorator.Player;
import br.edu.ifpb.padroes.atv3.musicas.facade.MusicFacade;
import br.edu.ifpb.padroes.atv3.musicas.proxy.MusicProxy;
import br.edu.ifpb.padroes.atv3.musicas.servico.TocadorMusica;
import br.edu.ifpb.padroes.atv3.musicas.xpto.ClientHttpXPTO;

public class Main {
    public static void main(String[] args) {

        MusicService service = new ServiceXPTOAdapter(new ClientHttpXPTO());
        MusicService cachedService = new MusicProxy(service);
        Player player = new MusicCountDecorator(new TocadorMusica());

        MusicFacade facade = new MusicFacade(cachedService, player);

        facade.showMusics();

        facade.playMusic("1077");
        facade.playMusic("1077");
        facade.playMusic("1077");
        facade.playMusic("1077");
        facade.playMusic("1077");
        facade.playMusic("1077");

        facade.playMusic("829d");
        facade.playMusic("fb8b");
    }
}

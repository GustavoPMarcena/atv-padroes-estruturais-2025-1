package br.edu.ifpb.padroes.atv3.musicas.servico;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.decorator.Player;

public class TocadorMusica implements Player {

    @Override
    public void tocarMusica(Musica musica) {
        if (musica == null)
            throw new MusicaNaoEncontradaException();

        System.out.println("Tocando musica: " + musica.titulo());
    }

}

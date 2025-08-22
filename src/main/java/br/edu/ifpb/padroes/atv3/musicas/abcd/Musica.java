package br.edu.ifpb.padroes.atv3.musicas.abcd;

public record Musica(String id, String titulo, String artista, Long ano, String genero) {
    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", ano=" + ano +
                ", genero='" + genero + '\'' +
                '}';
    }
}

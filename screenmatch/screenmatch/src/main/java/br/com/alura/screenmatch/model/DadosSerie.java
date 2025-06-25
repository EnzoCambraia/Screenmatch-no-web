package br.com.alura.screenmatch.model;
// O fato de usarmos record aqui é por que não vamos mexer com esses dados, apenas representá-los posteriormente
// @JsonAlias apelidará o campo de atributo do Json como nos casos abaixo oque antes era Title com o JsonAlias passa a se referir como titulo
// @JsonProperty servirá tanto para serialização de Jsons como a deserialização também, fazendo o processo de ler e escrever a mesma coisa que leu no Json
// sendo que o JsonAlias apenas lê de forma referenciada e não escreve.

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // Estamos dizendo para o Jackson não tentar converter oque não foi mapeado, por padrão, vem false, setamos para true para não ocorrer essa tentativa
// que trigga uma exceção chamada UnrecognizedPropertyException

public record DadosSerie(@JsonAlias("Title") String titulo, @JsonAlias("totalSeasons") Integer totalTemporadas, @JsonAlias("imdbRating") String avaliacao) {
}

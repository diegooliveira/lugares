package br.com.ps.lugares;

public class Lugar {

	private final Integer andar;

	private final Integer posicao;

	public Lugar(Integer andar, Integer posicao) {
		super();
		this.andar = andar;
		this.posicao = posicao;
	}

	public String getId() {
		return "FL" + andar + "S" + posicao;
	}

	public Integer getAndar() {
		return andar;
	}

	public Integer getPosicao() {
		return posicao;
	}

}

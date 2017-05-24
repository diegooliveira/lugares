package br.com.ps.lugares;

public class Mudanca {

	final Pair<Lugar, Lugar> movementacao;

	private final String name;

	private final String ci;

	public Mudanca(Lugar from, Lugar to, String name, String ci) {
		movementacao = new Pair<Lugar, Lugar>(from, to);

		this.name = name;
		this.ci = ci;
	}

	public String getName() {
		return name;
	}

	public Pair<Lugar, Lugar> getMovementacao() {
		return movementacao;
	}

	public String getCi() {
		return ci;
	}

}

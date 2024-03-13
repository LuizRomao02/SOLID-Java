package br.com.luizromao02.rh.service.promocao;

import br.com.luizromao02.rh.ValidacaoException;
import br.com.luizromao02.rh.model.Cargo;
import br.com.luizromao02.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();

		if (Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerentes nao podem ser promovidos!");
		}

		if(!metaBatida) {
			throw new ValidacaoException("Funcionario nao bateu a meta!");
		}
		
		Cargo novoCargo = cargoAtual.getProximoCargo();
		funcionario.promover(novoCargo);
	}
}

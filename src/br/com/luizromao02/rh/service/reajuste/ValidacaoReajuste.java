package br.com.luizromao02.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.luizromao02.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);
}

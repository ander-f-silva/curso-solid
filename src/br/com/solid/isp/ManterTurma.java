package br.com.solid.isp;

import java.util.LinkedList;
import java.util.List;

import br.com.solid.isp.vo.Turma;

public class ManterTurma implements Cadastrar<Turma> {

	private List<Turma> turmas = new LinkedList<Turma>();
	
	@Override
	public void adicionar(Turma turma) {
		turmas.add(turma);
		
	}

	@Override
	public void deletar(Turma turma) {
		turmas.add(turma);
		
	}

	@Override
	public Turma consultar(Long id) {
		return turmas.get(id.intValue());
		
	}

	@Override
	public void atualizar(Turma turma) {
	
		
	}

	@Override
	public List<Turma> listar() {
		return turmas;
	}

}

package br.edu.ifpb.mt.gerenciadores;

import br.edu.ifpb.mt.daca.dao.DAO;
import br.edu.ifpb.mt.daca.dao.PessoaDAO;
import br.edu.ifpb.mt.daca.entities.Aluno;
import br.edu.ifpb.mt.daca.entities.Livro;
import br.edu.ifpb.mt.daca.entities.Pessoa;
import br.edu.ifpb.mt.daca.fachada.Fachada;

public class GerenciadorGeral implements Fachada{
	
	PessoaDAO pessoaDao = new PessoaDAO();

	@Override
	public void AddPessoa(Pessoa p) {
		
		pessoaDao.save(p);
		
	}

	@Override
	public void ExcluirPessoa(Pessoa p) {
		pessoaDao.delete(p);
		
	}

	@Override
	public void EditarPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuscarPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ExcluirLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EditarLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuscarLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AlugarLivro(Livro l, Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DevolverLivro(Livro l, Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

}

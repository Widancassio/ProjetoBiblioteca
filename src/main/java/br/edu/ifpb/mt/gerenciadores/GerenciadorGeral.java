package br.edu.ifpb.mt.gerenciadores;

import br.edu.ifpb.mt.daca.dao.DAO;
import br.edu.ifpb.mt.daca.dao.PessoaDAO;
import br.edu.ifpb.mt.daca.entities.Aluno;
import br.edu.ifpb.mt.daca.entities.Livro;
import br.edu.ifpb.mt.daca.entities.Pessoa;
import br.edu.ifpb.mt.daca.fachada.Fachada;

public class GerenciadorGeral implements Fachada {

	PessoaDAO pessoaDao = new PessoaDAO();

	public void AddPessoa(Pessoa p) {

		pessoaDao.save(p);

	}

	public void ExcluirPessoa(Pessoa p) {
		pessoaDao.delete(p);

	}

	public void EditarPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		
	}

	public void BuscarPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		
	}

	public void AddLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	public void ExcluirLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	public void EditarLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	public void BuscarLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	public void AlugarLivro(Livro l, Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	public void DevolverLivro(Livro l, Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

}

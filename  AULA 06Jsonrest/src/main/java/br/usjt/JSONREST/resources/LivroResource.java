package br.usjt.JSONREST.resources;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.JSONREST.model.Livro;
import br.usjt.JSONREST.repository.LivroRepository;

@RestController
@RequestMapping ("/livros")
public class LivroResource {
	@Autowired
	private LivroRepository livroRepo;

	@GetMapping ("/lista")
	public List <Livro> todosOsLivros (){
		return livroRepo.findAll();
	}

	@GetMapping ("/{id}")
	public Livro buscarPeloId (@PathVariable Long id) {
		return livroRepo.getOne(id);
	}


	@PostMapping ("/salvar")
	@ResponseStatus (HttpStatus.CREATED)
	public void salvar ( @RequestBody Livro livro, HttpServletResponse response) {
		Livro l = livroRepo.save(livro);
		URI uri = ServletUriComponentsBuilder.

				fromCurrentServletMapping().path("/{id}").
				buildAndExpand(l.getId()).
				toUri();

		response.setHeader("Location", uri.toASCIIString());
	}


	@PostMapping ("/salvar2")
	//@ResponseStatus (HttpStatus.CREATED) agora desnecessária
	public ResponseEntity<Livro> salvar2 ( @RequestBody Livro livro, HttpServletResponse
			response) {
		Livro l = livroRepo.save(livro);
		URI uri = ServletUriComponentsBuilder.

				fromCurrentServletMapping().path("/livros/{id}").
				buildAndExpand(l.getId()).
				toUri();
		//desnecessário também
		//response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(l);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Livro> atualizar(@RequestBody Livro livro){
		Livro l = livroRepo.findById(livro.getId()).get();
		/* Precisa copiar os atributos de livro para l
		 * se fizer l = livro você tira o livro que atachou na
		 * persitência e coloca um novo. Aí vai inserir em vez
		 * de atualizar.
		 */
		l.setAutor(livro.getAutor());
		l.setTitulo(livro.getTitulo());
		l.setEdicao(livro.getEdicao());
		l.setNumeroPaginas(livro.getNumeroPaginas());
		l = livroRepo.save(l);
		return ResponseEntity.status(HttpStatus.OK).body(l);
	}

	@DeleteMapping("/{id}")
	public void excluirPeloId(@PathVariable Long id) {
		Livro l = livroRepo.getOne(id);
		livroRepo.delete(l);
	}
}

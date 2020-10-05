package br.com.jbasketball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jbasketball.model.Jogo;
import br.com.jbasketball.repository.Jogos;

@Controller
public class JogoController {
	
	@Autowired
	private Jogos jogos;
	
	/**
	 * Método que chama o formulário para cadastro de um jogo
	 * @param jogo
	 * @return
	 */
	@GetMapping("/jogo/novo")
	public ModelAndView novo(Jogo jogo) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jogo/CadastroJogo");
		mv.addObject("jogo", new Jogo());
		return mv;
	}
	
	/**
	 * Método que salva um jogo
	 * @param jogo
	 * @return
	 */
	@PostMapping("/jogos")
	public ModelAndView salvar(Jogo jogo) {
		ModelAndView mv = new ModelAndView();
		jogos.save(jogo);
		mv.setViewName("redirect:/jogos");				
		
		return mv;
	}
	
	/**
	 * Método que apresenta a lista de jogos cadastrados
	 * @param jogo
	 * @return
	 */
	@GetMapping("/jogos")
	public ModelAndView lista(Jogo jogo) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jogo/ListaJogos");
		mv.addObject("jogosList", jogos.findAll());
		return mv;
	}
}

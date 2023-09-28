package com.example.WORKBOT.Controller;


import com.example.WORKBOT.Model.FormData;

import com.example.WORKBOT.Repository.AgroDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {
    private String Nome;
    private Model model1;
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("formData", new FormData());
        return "formulario";
    }

    @PostMapping("/processar")
    public String processarFormulario(FormData formData, Model model) {
        // Faça algo com os dados do formulário, por exemplo, salvar em um banco de dados
        System.out.println("Nome: " + formData.getNome());
        System.out.println("Email: " + formData.getEmail());
        System.out.println("Nome: " + formData.getAtividade());
        System.out.println("Email: " + formData.getEstado());
        System.out.println("Nome: " + formData.getMunicipio());
        System.out.println("Email: " + formData.getPropriedade());
        System.out.println("Nome: " + formData.getCpf());
        System.out.println("Email: " + formData.getTelefone());
        Nome = formData.getMunicipio();
        model1 = model;
        // Você pode retornar uma página de confirmação ou outra resposta adequada
        //List<agroData> pessoasEncontradas = pessoaRepository.findByMunContaining(formData.getMunicipio());
        //model.addAttribute("pessoas", pessoasEncontradas);
        return "lista-pessoas";
    }
    private List<Long> pessoasSelecionadas = new ArrayList<>();
    @Autowired
    private AgroDataRepository pessoaRepository;


    @PostMapping("/selecionar-pessoa")
    public String selecionarPessoa(@RequestParam Long id) {
        pessoasSelecionadas.add(id);
        return "redirect:/lista-pessoas"; // Redireciona de volta para a página de resultados
    }

    @GetMapping("/nomes-selecionados")
    public String exibirNomesSelecionados(Model model) {
        //List<String> nomesSelecionados = pessoaRepository.findNomesByIds(pessoasSelecionadas);
        //model.addAttribute("nomesSelecionados", nomesSelecionados);
        return "nomes-selecionados"; // Página com nomes selecionados
    }

    @GetMapping("/lista-pessoas")
    public String exibirTabelaResultados(Model model) {
        //List<agroData> pessoasEncontradas = pessoaRepository.findByMunContaining(Nome);
        //model.addAttribute("pessoas", pessoasEncontradas);
        System.out.println(Nome);
        return "lista-pessoas"; // Nome da página a ser exibida
    }
}

package org.example.Controller;

import org.example.Model.Agricultor;
import org.example.Model.Agro;
import org.example.Model.AgroData;
import org.example.Repositores.AgroDataRepository;
import org.example.Service.Contagem;
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
    Contagem contagem = new Contagem();
    private int contage = 0;
    @Autowired
    AgroDataRepository agroDataRepository;
    private String Prop;
    private List<Long> pessoasSelecionadas = new ArrayList<>();
    private String Nome;
    private Model model1;
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("formData", new Agricultor());
        return "formulario";
    }
    @PostMapping("/processar")
    public String processarFormulario(Agricultor formData, Model model) {
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
        Prop = formData.getPropriedade();
        // Você pode retornar uma página de confirmação ou outra resposta adequada
        List<AgroData> pessoasEncontradas = agroDataRepository.findByMunicipio(Nome);
        System.out.println(pessoasEncontradas);
        System.out.println(Nome);
        model.addAttribute("pessoas", pessoasEncontradas);
        return "lista-pessoas";
    }
    @PostMapping("/selecionar-pessoa")
    public String selecionarPessoa(@RequestParam Long id) {
        pessoasSelecionadas.add(id);
        contage+=1;
        return "redirect:/lista-pessoas"; // Redireciona de volta para a página de resultados
    }
    @GetMapping("/Temporaries")
    public String Tempo(Model model) {
        return "Final"; // Nome da página a ser exibida
    }



    @GetMapping("/lista-pessoas")
    public String exibirTabelaResultados(Model model) {
        List<AgroData> pessoasEncontradas = agroDataRepository.findByMunicipio(Nome);
        model.addAttribute("pessoas", pessoasEncontradas);
        System.out.println(Nome);
        return "lista-pessoas"; // Nome da página a ser exibida
    }
    @GetMapping("/nomes-selecionados")
    public String exibirNomesSelecionados(Model model) {
        List<AgroData> nomesSelecionados = agroDataRepository.findNomesById(pessoasSelecionadas);
        double conversaoUnica = Conversor(Prop);

        List<Agro> Manipulacao = new ArrayList<>();
        for (AgroData agroData : nomesSelecionados) {
            // Copie os elementos para a nova lista (substitua NovoTipo pelo seu tipo real)
            Agro novoObjeto = new Agro();

            // Copie os valores dos atributos de AgroData para NovoTipo
            novoObjeto.setSemente_ideal_solo(agroData.getSemente_ideal_solo());
            novoObjeto.setDesc(agroData.getDesc());
            novoObjeto.setClima_Predominante(agroData.getClima_Predominante());
            novoObjeto.setTempo(agroData.getTempo());
            double a =Double.parseDouble(agroData.getEspacamentoMax());
            novoObjeto.setQtd_Plantas_Hectar(String.valueOf((Math.round(contagem.Espacamento(a, conversaoUnica))/contage)-1));
            int T = Integer.parseInt(novoObjeto.getQtd_Plantas_Hectar())/contage;
            novoObjeto.setDespesas(String.valueOf(contagem.PrecoDespesa(T, Double.parseDouble(agroData.getDespesa()))));
            novoObjeto.setLucro(String.valueOf(contagem.Lucro(Integer.parseInt(agroData.getQtdProduzidaPe()), T, Double.parseDouble(agroData.getLucro()))));


            //novoObjeto.setInformacaoAdicional("Informação adicional aqui");

            // Adicione o objeto com informações adicionais à nova lista
            Manipulacao.add(novoObjeto);
        }
        model.addAttribute("nomesSelecionados", Manipulacao);
        return "nomes-selecionados"; // Página com nomes selecionados
    }
    public double Conversor(String Hec){
        double Hectares = Double.parseDouble(Hec);
        double cmQuadrado = Hectares * 10000 * 10000;
        System.out.println(cmQuadrado);
        return cmQuadrado;
    }
}

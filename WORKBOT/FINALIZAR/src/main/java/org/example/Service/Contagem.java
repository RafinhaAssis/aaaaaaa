package org.example.Service;

import org.springframework.stereotype.Service;


public class Contagem {
    public double Conversor(String Hec){
        double Hectares = Double.parseDouble(Hec);
        double cmQuadrado = Hectares * 10000 * 10000;
        System.out.println(cmQuadrado);
        return cmQuadrado;
    }

    public double Espacamento(double espacoPlanta, double Hectarescm2){
        double areaMudaCentimetrosQuadrados = (espacoPlanta/2) * (espacoPlanta*2);
        areaMudaCentimetrosQuadrados = areaMudaCentimetrosQuadrados+(espacoPlanta*espacoPlanta);
        System.out.println((int)Hectarescm2/areaMudaCentimetrosQuadrados);
        return Hectarescm2/areaMudaCentimetrosQuadrados;
    }

    public double PrecoDespesa(int qtdPlantasHectares, double Preco){
        //Despesas por colheita
        return qtdPlantasHectares*Preco;
    }

    public double Lucro(int qtdProduzidoPlanta, int qtdPlantas, double Lucro){
        //Lucro por colheita
        return (qtdProduzidoPlanta*qtdPlantas)*Lucro;
    }

    public double LucroDespesaAnual(double x, double y){
        //Faturamento ou despesa Anual
        return (365/x)*y;
    }
}

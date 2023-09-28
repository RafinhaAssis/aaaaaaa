package com.example.WORKBOT.Service;

public class Contador {
    public double Conversor(String Hec){
        double Hectares = Double.parseDouble(Hec);
        double cmQuadrado = Hectares * 10000 * 10000;
        System.out.println(cmQuadrado);
        return cmQuadrado;
    }

    public double Espacamento(double espacoPlanta, double Hectarescm2){
        double areaMudaCentimetrosQuadrados = (espacoPlanta/2) * (espacoPlanta*2);
        areaMudaCentimetrosQuadrados = areaMudaCentimetrosQuadrados+(espacoPlanta*espacoPlanta);
        return (int)Hectarescm2/areaMudaCentimetrosQuadrados;
    }

    public double PrecoDespesa(int qtdPlantasHectares, double Preco){
        //Despesas por colheita
        return qtdPlantasHectares*Preco;
    }

    public double Lucro(double qtdProduzidoPlanta, int qtdPlantas, double Lucro){
        //Lucro por colheita
        return (qtdProduzidoPlanta*qtdPlantas)*Lucro;
    }

    public double LucroDespesaAnual(double x, double y){
        //Faturamento ou despesa Anual
        return (365/x)*y;
    }


}

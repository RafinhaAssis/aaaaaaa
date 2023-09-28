package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.example.Model.AgroData;
import org.example.Repositores.AgroDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class Main implements CommandLineRunner {
    private final AgroDataRepository agroDataRepository;

    @Autowired
    public Main(AgroDataRepository agroDataRepository) {
        this.agroDataRepository = agroDataRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    public void run(String... args) throws Exception {


        try (FileReader fileReader = new FileReader("C:\\Users\\logonrmlocal\\Downloads\\WORKBOT (2)\\WORKBOT\\WORKBOT\\src\\main\\resources\\templates\\Agro.csv");
             CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT)) {

            for (CSVRecord csvRecord : csvParser) {
                AgroData agroData = new AgroData();
                agroData.setPais(csvRecord.get(0));
                agroData.setSigla(csvRecord.get(1));
                agroData.setClima_Predominante(csvRecord.get(2));
                agroData.setMunicipio(csvRecord.get(3));
                agroData.setCodigoIbge(csvRecord.get(4));
                agroData.setTiposolo(csvRecord.get(5));
                agroData.setSemente_ideal_solo(csvRecord.get(6));
                agroData.setPh_min_solo(csvRecord.get(7));
                agroData.setPh_max_solo(csvRecord.get(8));
                agroData.setDesc(csvRecord.get(9));
                agroData.setEspacamentoMi(csvRecord.get(10));
                agroData.setEspacamentoMax(csvRecord.get(11));
                agroData.setTempo(csvRecord.get(12));
                agroData.setUmidade(csvRecord.get(13));
                agroData.setDespesa(csvRecord.get(14));
                agroData.setLucro(csvRecord.get(15));
                System.out.println(csvRecord.get(3));
                agroData.setQtdProduzidaPe(csvRecord.get(16));
                agroData.setEstacao(csvRecord.get(17));
                agroData.setValor(csvRecord.get(18));
                agroDataRepository.save(agroData);

            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
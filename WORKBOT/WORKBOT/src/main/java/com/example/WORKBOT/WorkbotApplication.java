package com.example.WORKBOT;

import com.example.WORKBOT.Model.AgroData;
import com.example.WORKBOT.Repository.AgroDataRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class WorkbotApplication implements CommandLineRunner {
	@Autowired
	private AgroDataRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(WorkbotApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// Popule o banco de dados manualmente
		/*
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Alice");
		pessoa1.setIdade(30);
		pessoaRepository.save(pessoa1);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Bob");
		pessoa2.setIdade(25);
		pessoaRepository.save(pessoa2);
		Agro
*/
		AgroData agroData = new AgroData();
		try (FileReader fileReader = new FileReader("C:\\Users\\rafael.araujo\\Downloads\\WORKBOT\\WORKBOT\\src\\main\\resources\\templates\\Agro.csv");
			 CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT)) {

			Class.forName("org.h2.Driver");
			Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "password");

			String insertQuery = "INSERT INTO agroData (Pais,Sigla,Clima_Predominante,Municipio,CodigoIbge,Mun,tiposolo,semente_ideal_solo,ph_min_solo,ph_max_solo,Desc,EspacamentoMi,EspacamentoMax,Tempo,Umidade,Despesa,Lucro,qtdProduzidaPe,Estacao,Valor) VALUES (?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

			for (CSVRecord csvRecord : csvParser) {
				String um = csvRecord.get(0); // Coluna do nome no CSV
				String dois = csvRecord.get(1); // Coluna da idade no CSV
				String tres = csvRecord.get(0); // Coluna do nome no CSV
				String quatro = csvRecord.get(1); // Coluna da idade no CSV
				String cinco = csvRecord.get(0); // Coluna do nome no CSV
				String seis = csvRecord.get(1); // Coluna da idade no CSV
				String sete = csvRecord.get(0); // Coluna do nome no CSV
				String oito = csvRecord.get(1); // Coluna da idade no CSV
				String nove = csvRecord.get(0); // Coluna do nome no CSV
				String dez = csvRecord.get(1); // Coluna da idade no CSV
				String onze = csvRecord.get(0); // Coluna do nome no CSV
				String doze = csvRecord.get(1); // Coluna da idade no CSV
				String treze = csvRecord.get(0); // Coluna do nome no CSV
				String quatorze = csvRecord.get(1); // Coluna da idade no CSV
				String quinze = csvRecord.get(0); // Coluna do nome no CSV
				String desesseis = csvRecord.get(1); // Coluna da idade no CSV
				String desetete = csvRecord.get(0); // Coluna do nome no CSV
				String desoito = csvRecord.get(1); // Coluna da idade no CSV
				String dezenove = csvRecord.get(0); // Coluna do nome no CSV


				preparedStatement.setString(1, um);
				preparedStatement.setString(2, dois);
				preparedStatement.setString(3, tres);
				preparedStatement.setString(4, quatro);
				preparedStatement.setString(5, cinco);
				preparedStatement.setString(6, seis);
				preparedStatement.setString(7, sete);
				preparedStatement.setString(8, oito);
				preparedStatement.setString(9, nove);
				preparedStatement.setString(10, dez);
				preparedStatement.setString(11, onze);
				preparedStatement.setString(12, doze);
				preparedStatement.setString(13, treze);
				preparedStatement.setString(14, quatorze);
				preparedStatement.setString(15, quinze);
				preparedStatement.setString(16, desesseis);
				preparedStatement.setString(17, desetete);
				preparedStatement.setString(18, desoito);
				preparedStatement.setString(19, dezenove);

				preparedStatement.executeUpdate();
			}

			preparedStatement.close();
			connection.close();

			System.out.println("Dados inseridos com sucesso!");

		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}

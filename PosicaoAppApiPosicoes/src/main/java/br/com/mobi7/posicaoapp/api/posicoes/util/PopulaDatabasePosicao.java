package br.com.mobi7.posicaoapp.api.posicoes.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import br.com.mobi7.posicaoapp.api.posicoes.models.Posicao;
import br.com.mobi7.posicaoapp.api.posicoes.repository.PosicaoRepository;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.text.SimpleDateFormat;

@Configuration
public class PopulaDatabasePosicao {

	@Bean
	CommandLineRunner initDatabase(PosicaoRepository posicaoRepository) {

		List<String[]> posicoes = posicoesCSV();
		SimpleDateFormat dataformatada = new SimpleDateFormat(
				"EEE MMM dd yyyy HH:mm:ss 'GMT'z '(Hora oficial do Brasil)'", Locale.ENGLISH);

		return args -> {
			for (String[] registro : posicoes) {
				posicaoRepository.save(new Posicao(registro[0], dataformatada.parse(registro[1]),
						Integer.parseInt(registro[2]), Double.parseDouble(registro[4]), Double.parseDouble(registro[3]),
						Boolean.parseBoolean(registro[5])));
			}
		};

	}

	private List<String[]> posicoesCSV() {
		List<String[]> posicoes = null;

		try {
			Reader reader = Files.newBufferedReader(Paths.get(".\\dados\\posicoes.csv"));
			CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
			posicoes = csvReader.readAll();
			csvReader.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return posicoes;
	}

}

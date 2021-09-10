package br.com.mobi7.posicaoapp.api.pontos.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import br.com.mobi7.posicaoapp.api.pontos.models.PontoInteresse;
import br.com.mobi7.posicaoapp.api.pontos.repository.PontoRepository;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Configuration
public class PopulaDatabasePontoInteresse {

	@Bean
	CommandLineRunner initDatabase(PontoRepository pontoRepository) {

		List<String[]> base_pois_def = base_pois_defCSV();

		return args -> {
            for (String[] record : base_pois_def) {             	
            	pontoRepository.save(new PontoInteresse(record[0], Integer.parseInt(record[1]), Double.parseDouble(record[2]), Double.parseDouble(record[3])));
            }
		};

	}

    private List<String[]> base_pois_defCSV() {
        List<String[]> base_pois_def = null;
        
        try {
            Reader reader = Files.newBufferedReader(Paths.get(".\\dados\\base_pois_def.csv"));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            base_pois_def = csvReader.readAll(); 
            csvReader.close();
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return base_pois_def;
    }

}

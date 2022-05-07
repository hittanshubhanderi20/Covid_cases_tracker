package io.javabrains.coronavirustracker.services;


import io.javabrains.coronavirustracker.models.LocationStats;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;


@Service
public class CoronaVirusDataService {

    private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/hittanshubhanderi/covid_cases_tracker/main/covid-cases-data%20-%20Sheet1%20(2).csv";

    private List<LocationStats> allStats = new ArrayList<>();

    public List<LocationStats> getAllStats() {
        return allStats;
    }


    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public void fetchVirusData() throws IOException, InterruptedException {
        List<LocationStats> newStats = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(VIRUS_DATA_URL))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        StringReader csvBodyReader = new StringReader(httpResponse.body());
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
        for (CSVRecord record : records) {
            LocationStats locationStat = new LocationStats();
            locationStat.setCountry(record.get("Country"));
            locationStat.setContinent(record.get("Continent"));
            locationStat.setCumulative_cases(Integer.parseInt(record.get("Cumulative_cases")));
            locationStat.setCumulative_deaths(Integer.parseInt(record.get("Cumulative_deaths")));


            locationStat.setIndia_Region(record.get("India_Region"));
            locationStat.setIndia_Confirme_Cases(Integer.parseInt(record.get("India_Confirme_Cases")));
            locationStat.setIndia_Active_Cases(Integer.parseInt(record.get("India_Active_Cases")));
            locationStat.setIndia_Cured_Discharged(Integer.parseInt(record.get("India_Cured_Discharged")));
            locationStat.setIndia_Death(Integer.parseInt(record.get("India_Death")));


            locationStat.setVac_Countries(record.get("Vac_Countries"));
            locationStat.setTOTAL_VACCINATION(Integer.parseInt(record.get("TOTAL_VACCINATION")));
            locationStat.setVACCINES_USED(Integer.parseInt(record.get("VACCINES_USED")));
            locationStat.setVACCINES_USED_NAME(record.get("VACCINES_USED_NAME"));

            System.out.println(locationStat);
            newStats.add(locationStat);
        }
        this.allStats = newStats;
    }
}

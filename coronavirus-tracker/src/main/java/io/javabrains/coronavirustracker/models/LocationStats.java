package io.javabrains.coronavirustracker.models;

public class LocationStats {

    private String continent;
    private String country;
    private String cumulative_cases;
    private String cumulative_deaths;
    private String India_Region;
    private String India_Confirme_Cases;
    private String India_Active_Cases;
    private String India_Cured_Discharged;
    private String India_Death;
    private String Vac_Countries;
    private String TOTAL_VACCINATION;
    private String VACCINES_USED;
    private String VACCINES_USED_NAME;


    //private int latestTotalCases;

    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public int getCumulative_cases() {
        return Integer.parseInt(cumulative_cases);
    }
    public void setCumulative_cases(int cumulative_cases) {
        this.cumulative_cases = String.valueOf(cumulative_cases);
    }

    public int getCumulative_deaths() {
        return Integer.parseInt(cumulative_deaths);
    }
    public void setCumulative_deaths(int cumulative_deaths) {
        this.cumulative_deaths = String.valueOf(cumulative_deaths);
    }

    public String getIndia_Region() {
        return India_Region;
    }
    public void setIndia_Region(String India_Region) {
        this.India_Region = India_Region;
    }

    public int getIndia_Confirme_Cases() {
        return Integer.parseInt(India_Confirme_Cases);
    }
    public void setIndia_Confirme_Cases(int India_Confirme_Cases) {
        this.India_Confirme_Cases= String.valueOf(India_Confirme_Cases);
    }

    public int getIndia_Active_Cases() {
        return Integer.parseInt(India_Active_Cases);
    }
    public void setIndia_Active_Cases(int India_Active_Cases) {
        this.India_Active_Cases= String.valueOf(India_Active_Cases);
    }

    public int getIndia_Cured_Discharged() {
        return Integer.parseInt(India_Cured_Discharged);
    }
    public void setIndia_Cured_Discharged(int India_Cured_Discharged) {
        this.India_Cured_Discharged= String.valueOf(India_Cured_Discharged);
    }

    public int getIndia_Death() {
        return Integer.parseInt(India_Death);
    }
    public void setIndia_Death(int India_Death) {
        this.India_Death= String.valueOf(India_Death);
    }

    public String getVac_Countries() {
        return Vac_Countries;
    }
    public void setVac_Countries(String Vac_Countries) {
        this.Vac_Countries = Vac_Countries;
    }

    public int getTOTAL_VACCINATION() {
        return Integer.parseInt(TOTAL_VACCINATION);
    }
    public void setTOTAL_VACCINATION(int TOTAL_VACCINATION) {
        this.TOTAL_VACCINATION= String.valueOf(TOTAL_VACCINATION);
    }

    public int getVACCINES_USED() {
        return Integer.parseInt(VACCINES_USED);
    }
    public void setVACCINES_USED(int VACCINES_USED) {
        this.VACCINES_USED= String.valueOf(VACCINES_USED);
    }

    public String getVACCINES_USED_NAME() {
        return VACCINES_USED_NAME;
    }
    public void setVACCINES_USED_NAME(String VACCINES_USED_NAME) {
        this.VACCINES_USED_NAME = VACCINES_USED_NAME;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", cumulative_cases=" + cumulative_cases +
                ", cumulative_deaths=" + cumulative_deaths +
                ", India_Region='" + India_Region + '\'' +
                ", India_Confirme_Cases=" + India_Confirme_Cases +
                ", India_Active_Cases=" + India_Active_Cases +
                ", India_Cured_Discharged=" + India_Cured_Discharged +
                ", India_Death=" + India_Death +
                ", Vac_Countries=" + Vac_Countries +
                ", TOTAL_VACCINATION=" + TOTAL_VACCINATION +
                ", VACCINES_USED=" + VACCINES_USED +
                ", VACCINES_USED_NAME=" + VACCINES_USED_NAME +
                '}';
    }
}

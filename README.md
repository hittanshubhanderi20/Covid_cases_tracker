# 🦠 COVID-19 Cases Tracker (Java Web App)

![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Built with](https://img.shields.io/badge/Built%20With-Java%20%7C%20Spring%20Boot%20%7C%20Thymeleaf-blue.svg)
![UI Framework](https://img.shields.io/badge/UI-Bootstrap%205-lightgrey.svg)

---

## 📊 Project Overview

This is a **Spring Boot web application** that tracks and displays **global and regional COVID-19 data** using an interactive frontend powered by **Thymeleaf** and **Bootstrap 5**.

The application fetches up-to-date case statistics, vaccination data, and provides dynamic tables segmented by:
- 🌍 Countries & Continents
- 🇮🇳 Indian regions
- 💉 Vaccine usage and coverage

---

## 🔍 Key Features

- 🌐 Global COVID-19 case & death data by continent and country
- 🇮🇳 India-specific active, confirmed, and cured cases by state/region
- 💉 Vaccination statistics and vaccine distribution insights
- 🗺️ Integrated data visualizations with world/India maps
- 🔄 Auto-populated tables via Thymeleaf templating
- 📊 Enhanced interactivity with DataTables.js

---

## 🧱 Tech Stack

| Layer           | Technologies Used                              |
|------------------|------------------------------------------------|
| Backend          | Java 11, Spring Boot                          |
| Frontend         | HTML5, Thymeleaf, Bootstrap 5                 |
| Styling & Tables | Bootstrap, DataTables                         |
| Data Processing  | Java Services & POJOs                         |
| Deployment       | Spring Boot embedded server (Tomcat)         |

---

## 🗂 Project Structure

```

Covid-Case-Tracker/
├── src/main/java/
│   ├── controller/
│   │   └── HomeController.java
│   ├── model/
│   │   └── LocationStats.java
│   ├── service/
│   │   └── CoronaVirusDataService.java
│   └── application/
│       └── CoronavirusTrackerApplication.class
├── src/main/resources/templates/
│   └── home.html                   # Thymeleaf UI Template
├── static/                         # Bootstrap, JS, CSS assets (CDN linked)
├── pom.xml                         # Maven build configuration
└── README.md

````

---

## 📸 Preview

### 🌍 Global Case Summary
Displays cumulative cases and deaths by continent and country.
![Map](https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/COVID-19_Outbreak_World_Map.svg/1200px-COVID-19_Outbreak_World_Map.svg.png)

### 🇮🇳 India Case Breakdown
Shows total, active, and recovered cases by Indian state.
![India Map](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/India_COVID-19_cases_density_map.svg/1200px-India_COVID-19_cases_density_map.svg.png)

---

## ▶️ How to Run

### 1. Clone the Repository
```bash
git clone https://github.com/hittanshubhanderi20/Covid_cases_tracker.git
cd Covid_cases_tracker
````

### 2. Open in your IDE (e.g., IntelliJ or Eclipse)

### 3. Run the Spring Boot Application

Use `CoronavirusTrackerApplication` class or:

```bash
mvn spring-boot:run
```

### 4. Visit the Web App

```
http://localhost:8080/
```

You’ll see a dashboard with interactive tables and maps.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙋‍♂️ Contact

Built with ❤️ by Hittanshu Bhanderi
Connect via [LinkedIn](https://www.linkedin.com/in/hittanshubhanderi/)

---

# MidsemPapers

> A searchable archive of previous-year mid-semester question papers, organised by branch, semester and subject.

Mid-semester exams come around twice a semester, and the single most useful thing to study from is what was actually asked last time. Those papers usually live in scattered WhatsApp groups, blurry photos and dead Drive links. This project collects them in one place and makes them searchable.

<!-- Replace this with a real screenshot once deployed -->
<!-- ![Screenshot](docs/screenshot.png) -->

**Live site:** https://YOUR-DOMAIN-HERE

---

## Features

- Browse papers by branch, semester and subject
- Direct in-browser preview and download
- Paper upload and moderation flow for contributed papers
- Mobile-first layout — most students open this on a phone the night before

## Tech stack

| Layer | Technology                                      |
|---|-------------------------------------------------|
| Backend | Java 21, Spring Boot 3.9.8                      |
| Web | Spring MVC + Thymeleaf                          | |
| Build | Maven                                           |
| Storage | Paper images served from the local filesystem — no database |
| Deployment | *(e.g. Railway, Render, AWS EC2)*               |

There is no database. Paper images live on disk and are served as static resources, with the browse structure driven by the folder layout.
## Getting started

### Prerequisites

- JDK 21 or newer
- Maven 3.9+

### Setup

Clone the repository:

```bash
git clone https://github.com/YOUR-USERNAME/YOUR-REPO.git
cd YOUR-REPO
```

Running locally:

```bash
./mvnw spring-boot:run
```

The app starts on <http://localhost:8080>.

### Building a production JAR

```bash
./mvnw clean package
java -jar target/midsempapers-0.0.1-SNAPSHOT.jar
```

### Running the tests

```bash
./mvnw test
```
## Adding a paper

Papers are organised by folder. To add one, drop the image into the matching directory:

```
src/main/resources/static/images/<semester>/<subject_code>_<monthyear_of_exam>.jpeg
```

For example:

```
src/main/resources/static/images/1st-sem/bt201_july26.jpeg
```

Guidelines:

- Keep filenames lowercase and hyphenated, with no spaces
- Use `.jpeg` or `.webp`; compress large scans so pages load quickly on mobile data
- Make sure the scan is readable end to end and no part of the page is cut off
- Combine all scans in 1 file, if a paper spans multiple pages
## Project structure

```
src/main/java/com/yourname/midsempapers/
├── config/          # Spring configuration classes
├── controller/      # MVC controllers and route handlers
├── service/         # Browsing, search and file-listing logic
└── LnctApplication.java
 
src/main/resources/
├── static/
│   ├── images       # Paper images, organised by branch/semester/subject
        ├── 1st-sem
        ├── 2nd-sem
│   ├── css/
│   └── js/
├── templates/       # Thymeleaf templates
└── application.properties
```

## Contributing

Contributions are welcome — both code and question papers.

### Contributing papers

1. Fork the repository
2. Add your scans following the folder convention above
3. Open a pull request listing the branch, semester, subject and year of each paper
### Contributing code

1. Fork the repository
2. Create a branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m "Add your feature"`
4. Push the branch: `git push origin feature/your-feature`
5. Open a pull request describing what changed and why
   Please keep pull requests focused on a single concern, and run `./mvnw test` before submitting.

## Roadmap

- [ ] Solution keys alongside papers
- [ ] Jpeg downloads for papers
- [ ] Subject-wise frequently-asked-questions analysis
- 
## License

Distributed under the MIT License. See [`LICENSE`](LICENSE) for details.

## Acknowledgements

Thanks to everyone who has scanned, uploaded and labelled a paper. This is only useful because of them.
 
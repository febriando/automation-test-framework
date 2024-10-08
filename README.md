# Automation Test Framework

## Deskripsi Proyek
Framework ini dibangun untuk mengotomatisasi pengujian Web UI dan API. Proyek ini mengintegrasikan beberapa teknologi seperti Java, Gradle, Cucumber, Selenium, Rest Assured, dan GitHub Actions. Framework ini juga menghasilkan laporan pengujian dalam format HTML dan JSON.

## Struktur Proyek
- `src/test/java/webtests`: Berisi implementasi pengujian Web UI menggunakan Selenium.
- `src/test/java/apitests`: Berisi implementasi pengujian API menggunakan Rest Assured.
- `src/test/resources/features/web`: Berisi file fitur untuk skenario pengujian Web UI (menggunakan format Gherkin).
- `src/test/resources/features/api`: Berisi file fitur untuk skenario pengujian API.
- `.github/workflows/`: Berisi konfigurasi untuk GitHub Actions.

## Tools dan Library yang Digunakan
- **Java**: Bahasa pemrograman utama.
- **Gradle**: Build automation tool.
- **Cucumber**: Library untuk menjalankan skenario pengujian yang ditulis dalam format Gherkin.
- **Selenium**: Library untuk pengujian otomatis pada Web UI.
- **Rest Assured**: Library untuk pengujian otomatis API.
- **GitHub Actions**: Untuk otomatisasi pipeline CI/CD.

## Cara Menjalankan Pengujian
1. **Clone Repository:**
   ```bash
   git clone https://github.com/febriando/automation-test-framework.git
   cd repository-name

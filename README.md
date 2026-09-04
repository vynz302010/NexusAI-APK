# NexusAI Android App

WebView APK untuk NexusAI — AI chat & rental platform by VynzzDEV.

---

## Cara Deploy ke GitHub dan Dapat APK

### Step 1: Buat repo GitHub baru

1. Buka github.com
2. Klik tombol "+" > "New repository"
3. Nama repo: NexusAI-APK
4. Set ke Public
5. JANGAN centang "Add README" (biarkan kosong)
6. Klik "Create repository"

### Step 2: Upload project ini ke GitHub

Buka Command Prompt atau Git Bash di folder NexusAI-APK, lalu jalankan:

    git init
    git add .
    git commit -m "Initial NexusAI APK"
    git branch -M main
    git remote add origin https://github.com/USERNAME/NexusAI-APK.git
    git push -u origin main

Ganti USERNAME dengan username GitHub lo.

### Step 3: Enable GitHub Actions permissions

1. Di repo GitHub, klik Settings
2. Klik Actions > General (di sidebar kiri)
3. Scroll ke bawah ke "Workflow permissions"
4. Pilih "Read and write permissions"
5. Klik Save

### Step 4: Tunggu build selesai

1. Klik tab "Actions" di repo lo
2. Lo bakal lihat workflow "Build NexusAI APK" berjalan
3. Tunggu sekitar 3-5 menit sampai hijau

### Step 5: Download APK

Setelah build selesai, ada dua cara download:

CARA A - Via Releases (paling mudah):
- Klik tab "Releases" di repo lo
- Download file app-release.apk

CARA B - Via Actions Artifacts:
- Klik tab Actions > klik build yang sudah selesai
- Scroll ke bawah ke bagian "Artifacts"
- Download "NexusAI-APK"

### Install ke HP

1. Transfer APK ke HP Android
2. Buka file manager di HP, cari APK-nya
3. Tap untuk install
4. Kalau muncul "Install from unknown sources" — tap Settings > allow
5. Install selesai, NexusAI muncul di app drawer

---

## Update URL NexusAI

Kalau URL Cloudflare Tunnel lo berubah, edit file ini:

    app/src/main/java/com/vynzzdev/nexusai/MainActivity.java

Cari baris:

    private static final String TARGET_URL = "https://moore-xbox-sunshine-phones.trycloudflare.com/";

Ganti URL-nya, lalu push ke GitHub. APK baru otomatis ter-build.

---

by VynzzDEV

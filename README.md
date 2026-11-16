# YourDreamReader Studio

Android MVP based on the supplied YourDreamReader Studio source.

## Features
- Russian first-run setup, author pseudonym and pilot/full-story preference
- Five starter genres and five sample pilot novellas (three chapters each)
- Searchable library, story details, chapter reader, favorites
- Local reading progress and preferences (WebView local storage)
- Pink, gradient and dark reader presentation; adjustable text size
- Android wrapper (min SDK 23)

## Build APK
Open this folder in Android Studio and run the `app` configuration, or use:

```bash
gradle assembleDebug
```

GitHub Actions builds `app-debug.apk` on pushes to `main` and stores it as a workflow artifact.

## Notes
This is an offline-first MVP. Cloud sync, publishing tools, account authentication, multilingual translations, and signed release builds are not included yet.

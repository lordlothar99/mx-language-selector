# Mendix "Language Selector" module

This module is a ready-to-use 'Language Selector' drop-down widget which you can easily include in your application. The available languages are the ones configured in Mendix Studio Pro.

## Configuration
1. ``ACT__LoadLanguages`` microflow has to be executed each time you add / remove a language in Mendix Studio Pro ; either you set it as a startup script, either you execute it manually on your app; it will detect the languages you configured in Mendix Studio (System.Language entities), and create 1 item for each language. The code of System.Language are "en_US", or "fr_FR", but the module only retains the first 2 letters uppercase (so in this case your dropdown would have 2 items : "EN" and "FR").
2. Just add the ``LanguageSelector`` snippet somewhere in your application (for example in global layout, so the user will always see it).
3. If needed, you can add the ``LanguagesOverview`` snippet to your application, so administrators can update / delete / reload languages

## Notes
* Changing the language in the drop down will automatically refresh the UI.
* The dropdown works with anonymous users too
* Feel free to download the project from [Github](https://github.com/lordlothar99/mx-language-selector), there's a runnable demo inside

## Dependencies
Community Commons

## Mendix version
8+

=====================================================================================================
!!!!!!!!!!!!!!!!!!!! Ansatz 1 und 2 funktionieren nicht, Lösung unten, dritter Ansatz !!!!!!!!!!!!!!!
=====================================================================================================

Erster Ansatz:
==============
Download Eclipse PDE+SDK
https://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops4/R-4.23-202203080310/eclipse-SDK-4.23-win32-x86_64.zip&mirror_id=1045

Install Marketplace Client über Help/ Install New Software/ All available sites/ filter "Marketplace"

Install über Help/Marketplace:
// *
// Papyrus SysML 1.6.2.2.0
// Papyrus Software Designer
WindowBuilder
XText 2.26.0

Install Antlr über Help/ Install New Software/ Add http://download.itemis.com/updates/
[hier nur Xtext Antlr ausgewählt]

// *
// Install Papyrus über Help/ Install New Software/ Add https://download.eclipse.org/modeling/mdt/papyrus/updates/releases/2022-03/
// [hier alles ausgewählt]
// Install Papyrus Designer über Help/ Install New Software/ Add https://download.eclipse.org/modeling/mdt/papyrus/components/designer/

// * beide Varianten bringen Null-Pointer-Fehler im Haupt-Eclipse beim Schließen der XText-Runtime



Zweiter Ansatz:
===============
Download Eclipse for Java and DSL Developers
https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2022-03/R/eclipse-dsl-2022-03-R-win32-x86_64.zip&mirror_id=1045

https://download.eclipse.org/eclipse/updates/4.23/

// nicht weiter verfolgt, Export von RCP4 funktioniert nicht



Dritter Ansatz:
===============

Download Eclipse PDE+SDK
https://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops4/R-4.23-202203080310/eclipse-SDK-4.23-win32-x86_64.zip&mirror_id=1045

Install XText über Help/ Install New Software/ Add https://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases
Installation Instructions
    Choose Help -> Install New Software... from the menu bar and Add....
    Insert one of the update site URLs above. This site aggregates all the necessary and optional components and dependencies of Xtext.
    Select the Xtext SDK from the category Xtext and complete the wizard by clicking the Next button until you can click Finish.
    After a quick download and a restart of Eclipse, Xtext is ready to use.

Install Antlr über Help/ Install New Software/ Add http://download.itemis.com/updates/
[hier nur Xtext Antlr ausgewählt]

Install Papyrus über Help/ Install New Software/ Add https://download.eclipse.org/modeling/mdt/papyrus/updates/releases/2022-03/
[hier nur Papyrus/Papyrus for UML ausgewählt]

Install Papyrus Designer über Help/ Install New Software/ Add https://download.eclipse.org/modeling/mdt/papyrus/components/designer/
[hier nur Papyrus SW Designer/Papyrus Java profile, library an code generation ausgewählt]

Install WindowBuilder über Help/ Install New Software/ Add https://download.eclipse.org/windowbuilder/latest/
[hier alle ausgewählt]




########################### Nur für Testzwecke für die Version 2023-09 #######################
Download Eclipse PDE+SDK
https://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops4/R-4.29-202309031000/eclipse-platform-4.29-win32-x86_64.zip

Install XText über Help/ Install New Software/ Add https://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases
Installation Instructions
    Choose Help -> Install New Software... from the menu bar and Add....
    Insert one of the update site URLs above. This site aggregates all the necessary and optional components and dependencies of Xtext.
    Select the Xtext SDK from the category Xtext and complete the wizard by clicking the Next button until you can click Finish.
    After a quick download and a restart of Eclipse, Xtext is ready to use.

Install Antlr über Help/ Install New Software/ Add http://download.itemis.com/updates/
[hier nur Xtext Antlr ausgewählt]



https://www.eclipse.org/Xtext/releasenotes.html
Xtext and Java 17
Xtext now supports running on Java 17 with Java 8 and 11 targets.
Source and Target 17 are not supported yet and are planned for Xtext 2.27.0.
This will also require dropping Java 8 in the next release.

1. Eclipse starten
2a. Menü Window/Preferences/Java/Installed JREs
	- jdk-20 auswählen und Remove
	- Add...
		Standard VM auswählen, Next
		JRE home Directory setzen auf C:\Program Files\Java\jdk-18.0.1.1
		Finish
		Apply and Close
2b.	Menü Window/Preferences/Java/Installed JREs/Execution Environments	
	JavaSE-11 auswählen und rechts Checkbox jdk-18.0.1.1 ankreuzen (bzw. auf das lokal installierte Java)
	Apply and Close
3. Menü Window/Preferences/Java/Compiler/JDK Compliance auf 11 setzen
	Apply and Close
4. XText-Projekt anlegen 
	(Darauf achten, dass im New Xtext Project Wizard unter Java version das Execution environment auf JavaSE-11 gesetzt ist)
5. run as MWE2-Workflow
6. Feature-Projekt und Updatesite-Projekt anlegen
7. Andere physische Eclipse-Instanz starten, Menü Help/Install New Software

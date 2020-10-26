Normes de codification
======================

Dans cet atelier, vous serez initié à l'utilisation d'outil servant à faire la
mise en forme automatique du code source.

Objectifs
---------

* Manipuler les outils de mise en forme automatique.
* Consulter une norme de codification.

Exercices
---------

1. Trouver la norme de codification pour le Java. Garder le lien pour en faire
   la lecture après l'atelier.
[exemple](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf)
2. Ouvrir un projet Java, comme un TP du cours INF1120.
3. Saccager l'indentation et la mise en page du code source afin qu'il compile
   toujours mais que vous ayez l'impression que le code a été écrit par un élève
   de maternelle.
4. Dans le menu `Code` de IntelliJ, expérimenter les fonctionnalités suivantes :
   * Comment with Line Comment;
   * Comment with Block Comment;
   * Reformat Code;
   * Show Reformat File Dialog;
   * Auto-Indent Lines;
   * Optimize Imports.
5. Aller dans les Préférences, sous Editor > Code Style > Java. Expérimenter
   avec les valeurs configurables de cet outil et le beautifier utilisé au point
   précédent.


Plugins et analyse de code
==========================

L'analyse statique du code source est une excellente façon d'avoir une idée
rapide sur la qualité du code sour ce d'un projet. Pour faire ce type d'analyse,
nous devons ajouter des fonctionnalités à IntelliJ à l'aide de plugins.

Objectifs
---------

* Installer des plugins dans IntelliJ.
* Manipuler des outils d'analyse statique.

Exercices
---------

1. Installez le plugin Checkstyle-IDEA dans IntelliJ.

2. À l'aide de Checkstyle, faites une analyse du code source de votre projet de
   session. Configurez Checkstyle pour utiliser les règles de style de Sun.

3. Faites quelques améliorations à votre projet de session, selon les
   recommandations de Checkstyle.

4. Installez le plugin PMDPlugin dans IntelliJ.

5. Faites une analyse statique du code source de votre projet de session.
   Observez bien les résultats de l'analyse. Quelles conclusions pouvez-vous
   tirer sur la qualité du code de votre projet basées sur les résultats de
   l'analyse statique?

6. Faites quelques améliorations à votre projet de session, selon les éléments
   soulevés par PMD.

7. Intégrez Checkstyle et PMD au build Maven en modifiant le fichier `POM.xml`.




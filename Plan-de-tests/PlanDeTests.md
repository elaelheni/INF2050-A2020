Liste des exigences
===============
- TP1.1 : Les champs d'un fichier d'entrée doivent toujours etre séparés par des virgules.
-  TP1.2 : A la sortie, la liste des arrondissements devra etre triée par ordre alphabétique.
- TP1.3 : Les champs d'un fichier d'entrée doivent toujours etre présents : date, heure, parc, arrondissement, description.
- TP1.4 : La date doit etre une chaine de caractères de la forme : `AAAA-MM-jj` suivant la norme `ISO8601`.
- TP1.5 : L'heure doit etre une chaine de caractères de la forme : `HH:mm`.
- TP1.6 : Le champ parc doit contenir une chaine de caractère ayant le nom d'un parc.
- TP1.7 :  Les noms des fichiers d'entrée et de sortie sont reçus en paramètres au programme.
- TP1.8 : Terminer l'execution avec un message d'erreur à la console si entrée non conforme. 



Plan de tests
==========

| N.  | Fonctionnalité | Résultat attendu           | Description                   | Données  |                                                                                          
| :----: | :-------------- | :--------------------------- | :----------------------------- | :---------- |
|  C1   |   TP1.1                       |  Message d'erreur                          | Séparation des champs éronnée  |     Données complètes, séparées par autre qu'une virgule `,` (expl : ` ` `.`..)                                  |
|  C2   |  TP1.4                        | Message d'erreur                           | Champ manquant                         | Données complètes, champ date manquant (2 tests fonctionnels)
| C3    | TP1.4                         | Message d'erreur                           | Champ manquant                         | Données complètes, champ heure manquant (2 tests fonctionnels)
| C4    | TP1.4                         | Message d'erreur                           | Champ manquant                         | Données complètes, champ parc manquant (2 tests fonctionnels)
|  C5   | TP1.4                         | Message d'erreur                           | Champ manquant                         | Données complètes, champ arrondissement manquant (2 tests fonctionnels)
| C6    | TP1.4                         | Message d'erreur                           | Champ manquant                         | Données complètes, champ description manquant (2 tests fonctionnels)
| C7    | TP1.5                         | Message d'erreur                           | Format de date érroné                  | Données complètes, format de date érroné
| C8    | TP1.6                         | Message d'erreur                           | Format d'heure erroné                  | Données complètes, format d'heure érroné
| C9    | TP1.7                         | Message d'erreur                           | Nom de parc non conventionnel  | Données complètes, chaine de caractères non conventionnelle pour le nom d'un parc (` `, `,./"';=` .. )
| C10  | TP1.8                         | Message d'erreur                           | Nombre de paramètres erroné     | 0 paramètes passés au programme
| C11  | TP1.8                         | Message d'erreur                           | Nombre de paramètres erroné     | >2 paramètes passés au programme
| C12  | TP1.8                         | Message d'erreur                           |  Fichier non existant                     | 2 paramàtres , fichier d'entrée n'existe pas
| C13  | TP1.8                         | Champs séparés par des `,`, Arrondissements triès par ordre alphabétique | Données complètes | 2 paramètres, fichier d'entrée contenant des données complètes



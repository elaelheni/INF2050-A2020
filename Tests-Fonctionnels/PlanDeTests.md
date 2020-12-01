Liste des exigences
===============
- TP1.1 : Les champs d'un fichier d'entrée doivent toujours etre séparés par des virgules. (peu importe l'extension du fichier c'est le contenu qui compte).
-  TP1.2 : A la sortie, la liste des arrondissements devra etre triée par ordre alphabétique.
- TP1.3 : Les champs d'un fichier d'entrée doivent toujours etre présents : `date, heure, parc, arrondissement, description.`
- TP1.4 : Le champ `date` doit etre présent et doit etre une chaine de caractères de la forme : `AAAA-MM-jj` suivant la norme `ISO8601`.
- TP1.5 : Le champ `heure` doit etre present et doit etre une chaine de caractères de la forme : `HH:mm`.
- TP1.6 : Le champ `Parc` doit etre présent et différent d'une chaine vide.
- TP1.7 : Le champ `Arrondissement` doit etre présent et différent d'une chaine vide.
- TP1.8 : Le champ `Description` doit etre présent et different d'une chaine vide.
- TP1.9 :  Les noms des fichiers d'entrée et de sortie sont reçus en paramètres au programme.
- TP1.10 : Terminer l'execution avec un message d'erreur significatif à la console si entrée non conforme. 



Plan de tests
==========

| N.  | Fonctionnalité | Résultat attendu           | Description                   | Données  |                                                                                          
| :----: | :-------------- | :--------------------------- | :----------------------------- | :---------- |
|  C1   |   TP1.1  |  Message d'erreur  | Séparation des champs éronnée  |  Données complètes, séparées par autre qu'une virgule `,` (expl : ` ` `.`..)                                  |
| C2 | TP1.1  | clacul du nombre d'interventions, champs séparés par des `,`, arrondissements triès par ordre alphabétique | Données complètes | 2 paramètres, fichier d'entrée contenant des données complètes sans erreur, extension du fichier d'entrée est DIFFERENTE de `.csv`|
|  C3  |  TP1.3| Message d'erreur | Champ manquant   | Données complètes, champ date manquant|
| C4    | TP1.3  | Message d'erreur | Champ manquant | Données complètes, champ heure manquant |
| C5    | TP1.3 | Message d'erreur | Champ manquant | Données complètes, champ parc manquant |
|  C6   | TP1.3 | Message d'erreur  | Champ manquant  | Données complètes, champ arrondissement manquant |
| C7   | TP1.3  | Message d'erreur| Champ manquant | Données complètes, champ description manquant |
| C8    | TP1.4 | Message d'erreur | Champ erroné | Données complètes, format de date érroné |
| C9    | TP1.5   | Message d'erreur  | Champ erroné | Données complètes, format d'heure érroné |
| C10    | TP1.6    | Message d'erreur  | Champ erroné | Données complètes, chmap parc erroné (reçoit ` ` ou `null` ) |
| C11    | TP1.7    | Message d'erreur  | Champ erroné | Données complètes, chmap arrondissement erroné (reçoit ` ` ou `null` ) |
| C12    | TP1.8    | Message d'erreur  | Champ erroné | Données complètes, chmap description erroné (reçoit ` ` ou `null` ) |
| C13  | TP1.9 | Message d'erreur    | Nombre de paramètres erroné     | 0 paramètes passés au programme |
| C14  | TP1.9  | Message d'erreur  | Nombre de paramètres erroné     | >2 paramètes passés au programme |
| C15  | TP1.9   | Message d'erreur  |  Fichier non existant | 2 paramàtres , fichier d'entrée n'existe pas |
| C16  | TP1.9  | clacul du nombre d'interventions, champs séparés par des `,`, arrondissements triès par ordre alphabétique | Données complètes | 2 paramètres, fichier d'entrée contenant des données complètes sans erreur |

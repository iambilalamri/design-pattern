Element of reusable object oriented software by GoF <strong>(Gang of four)</strong><br/>
Check this link for more illustration: [design-pattern](https://refactoring.guru/fr/design-patterns/factory-method)

## Pattern Adapter
L’Adaptateur est un patron de conception structurel qui permet de faire collaborer des objets ayant des interfaces normalement incompatibles.

## Pattern Visitor
Visiteur est un patron de conception comportemental qui vous permet de séparer les algorithmes et les objets sur lesquels ils opèrent.<br/>

Il permet d’ajouter de nouveaux comportements à une hiérarchie de classes sans modifier l’existant.

## Pattern Factory (Fabrique)
Fabrique est un patron de conception de création qui définit une interface pour créer des objets dans une classe mère, mais délègue (representer par) le choix des types d’objets à créer aux sous-classes.

## Pattern Abstract Factory
Fabrique abstraite est un patron de conception qui permet de créer des familles d’objets apparentés sans préciser leur classe concrète.

## Pattern Observer
L’Observateur est un patron de conception comportemental qui permet de mettre en place un mécanisme de souscription pour envoyer des notifications à plusieurs objets, au sujet d’événements concernant les objets qu’ils observent.

## Pattern Singleton 
Singleton est un patron de conception de création qui garantit que l’instance d’une classe n’existe qu’en un seul exemplaire, tout en fournissant un point d’accès global à cette instance.

## Pattern Prototype
Prototype est un patron de conception qui crée de nouveaux objets à partir d’objets existants sans rendre le code dépendant de leur classe, et il evite le couplage fort.
[couplage](https://waytolearnx.com/2020/03/difference-entre-couplage-faible-et-couplage-fort-en-java.html)


## Pattern Builder
Monteur est un patron de conception de création qui permet de construire des objets complexes étape par étape. Il permet de produire différentes variations ou représentations d’un objet en utilisant le même code de construction.

## Pattern Pont (Bridge)
Le Pont est un patron de conception structurel qui permet de séparer une grosse classe ou un ensemble de classes connexes en deux hiérarchies — abstraction et implémentation — qui peuvent évoluer indépendamment l’une de l’autre.<br/>
Autrement dit: Decouple an abstraction from its implementation so that the two can vary independently

## Difference between Pont and Adapter
The main difference between an adaptor and a bridge pattern, is that a bridge pattern serves to decouple an abstraction class from its implementation, and an adaptor pattern converts the interface between classes with less inheritance.

## Pattern Composite
Composite est un patron de conception structurel qui permet d’agencer les objets dans des arborescences afin de pouvoir traiter celles-ci comme des objets individuels.

## Pattern Decorator
Décorateur est un patron de conception structurel qui permet d’affecter dynamiquement de nouveaux comportements à des objets en les plaçant dans des emballeurs qui implémentent ces comportements.

## Pattern Façade
Façade est un patron de conception structurel qui procure une interface offrant un accès simplifié à une librairie, un framework ou à n’importe quel ensemble complexe de classes.

## Pattern Flyweight
Poids mouche est un patron de conception structurel qui permet de stocker plus d’objets dans la RAM en partageant les états similaires entre de multiples objets, plutôt que de stocker les données dans chaque objet.

## Pattern Proxy
La Procuration est un patron de conception structurel qui vous permet d’utiliser un substitut pour un objet. Elle donne le contrôle sur l’objet original, vous permettant d’effectuer des manipulations avant ou après que la demande ne lui parvienne.
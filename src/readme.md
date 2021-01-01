Element of reusable object oriented software by GoF <strong>(Gang of four)</strong><br/>
Check this link for more illustration: [design-pattern](https://refactoring.guru/fr/design-patterns/factory-method)

## Pattern Adapter
L�Adaptateur est un patron de conception structurel qui permet de faire collaborer des objets ayant des interfaces normalement incompatibles.

## Pattern Visitor
Visiteur est un patron de conception comportemental qui vous permet de s�parer les algorithmes et les objets sur lesquels ils op�rent.<br/>

Il permet d�ajouter de nouveaux comportements � une hi�rarchie de classes sans modifier l�existant.

## Pattern Factory (Fabrique)
Fabrique est un patron de conception de cr�ation qui d�finit une interface pour cr�er des objets dans une classe m�re, mais d�l�gue (representer par) le choix des types d�objets � cr�er aux sous-classes.

## Pattern Abstract Factory
Fabrique abstraite est un patron de conception qui permet de cr�er des familles d�objets apparent�s sans pr�ciser leur classe concr�te.

## Pattern Observer
L�Observateur est un patron de conception comportemental qui permet de mettre en place un m�canisme de souscription pour envoyer des notifications � plusieurs objets, au sujet d��v�nements concernant les objets qu�ils observent.

## Pattern Singleton 
Singleton est un patron de conception de cr�ation qui garantit que l�instance d�une classe n�existe qu�en un seul exemplaire, tout en fournissant un point d�acc�s global � cette instance.

## Pattern Prototype
Prototype est un patron de conception qui cr�e de nouveaux objets � partir d�objets existants sans rendre le code d�pendant de leur classe, et il evite le couplage fort.
[couplage](https://waytolearnx.com/2020/03/difference-entre-couplage-faible-et-couplage-fort-en-java.html)


## Pattern Builder
Monteur est un patron de conception de cr�ation qui permet de construire des objets complexes �tape par �tape. Il permet de produire diff�rentes variations ou repr�sentations d�un objet en utilisant le m�me code de construction.

## Pattern Pont (Bridge)
Le Pont est un patron de conception structurel qui permet de s�parer une grosse classe ou un ensemble de classes connexes en deux hi�rarchies � abstraction et impl�mentation � qui peuvent �voluer ind�pendamment l�une de l�autre.<br/>
Autrement dit: Decouple an abstraction from its implementation so that the two can vary independently

## Difference between Pont and Adapter
The main difference between an adaptor and a bridge pattern, is that a bridge pattern serves to decouple an abstraction class from its implementation, and an adaptor pattern converts the interface between classes with less inheritance.

## Pattern Composite
Composite est un patron de conception structurel qui permet d�agencer les objets dans des arborescences afin de pouvoir traiter celles-ci comme des objets individuels.

## Pattern Decorator
D�corateur est un patron de conception structurel qui permet d�affecter dynamiquement de nouveaux comportements � des objets en les pla�ant dans des emballeurs qui impl�mentent ces comportements.

## Pattern Fa�ade
Fa�ade est un patron de conception structurel qui procure une interface offrant un acc�s simplifi� � une librairie, un framework ou � n�importe quel ensemble complexe de classes.

## Pattern Flyweight
Poids mouche est un patron de conception structurel qui permet de stocker plus d�objets dans la RAM en partageant les �tats similaires entre de multiples objets, plut�t que de stocker les donn�es dans chaque objet.

## Pattern Proxy
La Procuration est un patron de conception structurel qui vous permet d�utiliser un substitut pour un objet. Elle donne le contr�le sur l�objet original, vous permettant d�effectuer des manipulations avant ou apr�s que la demande ne lui parvienne.
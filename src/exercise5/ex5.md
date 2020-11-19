# Exercise 5

## Code Smell
## [Feature Envy](https://refactoring.guru/smells/feature-envy)
Classe Basket utiliza mais os dados da Classe Item mais do que seus prórprios dados no método getTotalPrice.

## Refactoring
## [Move Method](https://refactoring.guru/move-method)
A melhor forma para refatorar esse código é mover o método _getTotalPrice_ para a classe de Item, pois para o calculo total são usados apenas seus próprios atributos
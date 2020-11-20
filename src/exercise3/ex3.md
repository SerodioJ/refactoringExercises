# Exercise 3

## Code Smell
## [Middle Man](https://refactoring.guru/smells/middle-man)
A classe Person executa somente uma ação, e a mesma é apenas delegada para a classe Department. Ou seja, esse método poderia ser removido da classe Person.

## Refactoring
## [Remove Middle Man](https://refactoring.guru/remove-middle-man)
Para resolver o problema, podemos remover esse método intermediário e forçar o cliente a usar o método da classe Department diretamente.
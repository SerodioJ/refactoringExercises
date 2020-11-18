# Exercise 2

## Code Smell
## [Data Class](https://refactoring.guru/smells/data-class)
Classe Employee é utilizada apenas para armazenar dados (possui apenas getter e setters) - lazy class.

## Refactoring
Mergear as duas classes Employee e JobItem em apenas uma só - Employee - inline class.
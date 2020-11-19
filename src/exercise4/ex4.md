# Exercise 4

## Code Smells
## [Incomplete Library Class](https://refactoring.guru/smells/incomplete-library-class)
Classe Course está incompleta, podendo apresentar comportamentos indesejados.

## [Inappropriate Intimacy](https://refactoring.guru/smells/inappropriate-intimacy)
Na main de App, são realizadas mudanças de atributos privados da Classe Person sem utilização de setters, apenas com getters. Encapsulamento falho.

## Refactoring

## [Introduce foreign Method](https://refactoring.guru/introduce-foreign-method)
Completar o construtor para atribuir os valores passados como parametro para os atributos da classe
Completar a classe isAdvanced para retornar o valor do atributo

## [Move Method](https://refactoring.guru/move-method)
Criar metodos de adicionar e remover courses na propria classe Person, tendo em vista que fez sentido a propria classe Person gerenciar seus courses ao inves do client ter que puxar todos os metodos e setar novamente.
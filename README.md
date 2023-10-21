# Computer of Theory
## Intro
The code in this repository is related to the Computer Theory activity requested by professor Jefferson Morais from the Federal University of Pará.

## About the Automaton
This automata accept the following sentences:

Regular Expression: (100)<sup>*</sup>

L(G) = {ε, 100, 100100, 100100100, 100100100100, ... 100100100100100100100100}.

## Automaton Diagram

![afd1](https://github.com/feliperasan/finite_and_deterministic_automata/assets/32422863/1cc11856-54e8-4c13-81ee-1f134d49a4f0)

## Pseudo-code

```
atualState type integer;
function boolean processor with parameter entrada:
    broken entrada parameter in array of chars
    for each char in array entrada:
    case atualState is equal 0:
        and if char entrada is equal empty:
            atualState remains in 0 and return false, false is final state;
        else if char entrada is equal 1 then:
            atualState assign 1
    case atualState is equal 1:
        and if char entrada is equal 0 then:
            atualstate assign 2
    case atualState is equal 2:
        and if char entrada is equal 0 then:
            atualstate assign 0 and return false, false is final state;

    return finalState == 0 (Boolean)
    
```

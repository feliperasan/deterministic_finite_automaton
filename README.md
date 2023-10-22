# Computer of Theory
## Intro
The code in this repository is related to the Computer Theory activity requested by professor Jefferson Morais from the Federal University of Pará.

## About the Automaton
This automata accept the following sentences:

Regular Expression: ε | 0 | (100)<sup>*</sup>

L = {ε, 0, 0100, 00100, 100, 100100, 100100100, 100100100100, ..., 100100100100100100100100}.

## Automaton Diagram
JFlap Image:
![image](https://github.com/feliperasan/finite_and_deterministic_automata/assets/32422863/f5689248-6ce8-4afa-bab9-3aba36ba97c5)

## Pseudo-code

```
atualState type integer;
function boolean process with parameter entrada:
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

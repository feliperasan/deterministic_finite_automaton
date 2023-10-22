# Computer of Theory 📝
The code in this repository is related to the Computer Theory activity requested by professor Jefferson Morais from the Federal University of Pará.

## Question 1
### About the Automaton 🤔
This automata accept the following sentences:

Regular Expression **(A)**: ε | 0 | (100)<sup>*</sup>

Regular Expression **(B)**: ε | b | (b)<sup>* </sup>a(b)<sup>* </sup> a(b)<sup>*</sup> b

L(a) = {ε, 0, 0100, 00100, 100, 100100, 100100100, 100100100100, ..., 100100100100100100100100}

L(b) = {ε, b, aab, babab, ababb, bababb, bababababbb, ..., abababababababab}

### Automata Diagram 🤔

![Automato](https://user-images.githubusercontent.com/32422863/277182612-fd216edc-4231-4e54-80c9-619cebffb0f6.png)


### Pseudo-code A 🤔

``` sh
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

    return finalState is equal 0? Yes true return valid sentence otherwise invalid;
    
```

### Pseudo-code B 🤔

### Question 2



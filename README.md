# Associacao-EmpresaFuncionario
### Laboratório de Programação Aula 3

Associação de Classes em Java.
_______

**EXERCÍCIO**

    Classe Empresa
      Atributos:
        - String nome
        - int qtdFunc
      Métodos
         - Empresa (_,_)
         - get(), set()

    Classe Funcionario
       Atributos
          - String nome
          - double salBruto
          - boolean PJ
          - Empresa empresa
       Métodos
          - Funcionario (_,_,_,_)
          - get(), set()
          - double getSalario()


    Algoritmo do método getSalario()
                 SE (PJ=='VERDADEIRO') ENTÃO
                        SALARIO = BRUTO*0,8 - 0,01*QTDFUNC
                 SENÃO
                          SALARIO = BRUTO*0,9 - 0,02*QTDFUNC
                  FIM SE

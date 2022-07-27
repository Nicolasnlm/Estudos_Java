

public class Pilares{
 

    /*

============== Pilares do POO ================

   Encapsulamento, Herança e Polimorfismo

   >>Encapsulamento

  Cápsula, como uma pilha por exemplo. Uma pilha
 é em formato de cápsula para proteger você dos
 elementos químicos dentro da mesma e para se 
 proteger de danos externos. Outro motivo para encapsular
 uma pilha é criar um padrão, certos dispositivos 
 usam determinados tamanhos e modelos de pilhas por
 exemplo. Ou seja, em POO, proteger o código do programador,
 o código caso modificado não prejudicar o programa e funcionar
 em interfaces e padrões, da forma que o resultado seja sempre
 o mesmo.

  Definição de Encapsular na POO:
   - "Ocultar partes independentes da implementação,
   permitindo construir partes invisíveis ao mundo exterior."

    O objeto interage com o mundo exterior sem necessariamente o 
   usuário precisar saber como ele funciona, a comunicação entre
   o exterior e interior do objeto é chamada de "Mensagem", e o
   canal de comunicação externa é chamado de "Interface". Ou seja,
   seria como os polos da pilha.

  Definição de Interface:
   - "Lista de serviços fornecidos por um componente. É o contato com
   o mundo exterior, que define o que pode ser feito com um objeto dessa
   classe."

   -- Métodos Abstratos
    São aqueles métodos em que não são diretamente escritos na 
    Interface

==========================================================================

    >>Herança

    As classes podem ser "mães", onde as classes filhas podem herdar características
    e comportamentos.

    Definição de Herança na POO:
     - "Permite criar uma nova classe na definição de outra
     classe previamente existente"


     --Navegação pela Árvore de Herança

       
            |A|   
             |                 Toda sub-classe herda todos os atributos
    ---------------------      da sua super-classe. Quando um classe não 
    |        |         |       é filha de outra super-classe, ela é chamada
   |AA|     |AB|      |AC|     de <raiz>. As classes que ainda não possuem filhas,
    |        |          |      são chamadas de <folhas>. As classes "netas" são 
  |AAA|   -------     |ACA|    chamadas de <descendentes> e as "avós" de <ancestrais>.
          |     |                Quando de percorre a Árvore de cima para baixo, chama-se
        |ABA|  |ABB|           de <Especialização>, quando de baixo para para cima, <Generalização>.
                   
          |
       ------- 
       |     |
    |ABAA|  |ABAB|
    

    >Tipos de Herança

    1.Herança de Implementação (Herança Pobre): Quando a classe filha herda os atributos
    e métodos, porém não implementa nada nenhuma funcionalidade nova. 
   
    2.Herança para Diferença: Quando uma a sub-classe herda os atributos da
    mãe e implementa novas funcionalidades ou atributos.

    

    >Abstrato e Final

    -Classe Abstrata: Não pode ser instanciada, só pode servir como progenitora. Ou seja,
    não pode gerar objetos, mas as filhas da mesma podem.

    -Método Abstrato: Declarado mas não implementado na progenitora.

    -Classe Final: Estéril. Não pode ser herdada por outra classe, é obrigatoriamente uma
    folha.

    -Método Final: Não pode ser sobrescrito pela suas sub-classes, é obrigatoriamente herdado.
    
================================================================================================

>>Polimorfismo

 Permite um mesmo nome represente vários comportamentos diferentes. Os métodos podem
 possuir assinaturas iguais ou diferentes baseadas na quantidade e tipos de parâmetros.
 

>Tipos de Polimorfismo (2 principais)

1.Polimorfismo de Sobreposição: Quando substituímos um método de uma superclasse na sua
subclasse, usando a mesma assinatura.

2.Polimorfismo de Sobrecarga: Possui assinaturas diferentes dentro de uma mesma classe. 



    



  



    


*/

}


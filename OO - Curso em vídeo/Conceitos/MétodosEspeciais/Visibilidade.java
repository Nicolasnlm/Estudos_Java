package OO.MétodosEspeciais;
/*    Visibilidade dos Objetos e Classes


--> Diagrama de Classes dentro da UML(Linguagem Modular Unificada)

 Na UML, o modelo de Classes é tratada como uma retângulo, para simplificar
ao máximo a compreensão. Por exemplo, fácil desenhar um carro, mas e uma aula
ou um compromisso?

 ______________________
|----------------------|
|       Caneta         |
|----------------------|                      
|  + Modelo            |
|  - Cor               |
|  # Ponta             |
|  # Tampada           |
|----------------------|
| + escrever()         |
| + rabiscar()         |
| - tampar()           |
|______________________|



--> Modificadores de Visibilidade

 Indicam os níveis de acesso aos componentes nas
 classes.

  | +      // Público - A classe atual e todas as outras tem acesso
  | -     // Privado - Somente a classe atual
  | #    // Protegido  - A classe atual e todas as suas subsequentes(filhas)



  Classe Caneta

  publico modelo: Caractere;
  publico cor: Caractere;
  privado ponta: Real;
  protegido carga: Inteiro;
  protegido tampada: Logico;
  
  publico Metodo escrever()

  Privado Metodo rabiscar()

  c1 = nova Caneta
  c1.modelo = "Bic"
  c1.cor = "Azul"
  c1.ponta = 0.5 //Impossível na ponta
  c1.carga = 80% //Impossível trocar a carga


--> Mudando a Visibilidade 





*/


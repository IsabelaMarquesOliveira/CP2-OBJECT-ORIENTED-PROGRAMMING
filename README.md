CP2 - OBJECT-ORIENTED PROGRAMMING
Isabela Marques de Oliveira | RM: 567230

Refatoração do sistema FiapDelivery, corrigindo os erros do código legado com encapsulamento, herança e associação.

A classe Veiculo é a classe mãe, com placa e capacidade de carga (privados). Caminhao e Moto herdam dela e adicionam seus próprios atributos: quantidadeEixos e possuiBau. A capacidade não aceita valores negativos.

A classe Pacote tem código, peso e status. Todo pacote começa como "Pendente" e pode ser alterado com atualizarStatus(novoStatus).

A classe Rota associa um Pacote a um Veiculo. Como usa a classe mãe, aceita tanto Caminhao quanto Moto. Use iniciarEntrega() para levar o pacote, que muda o status para "Em trânsito".

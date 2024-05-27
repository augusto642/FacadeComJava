# Compras Online

Este projeto demonstra um sistema de compras online utilizando o padrão de projeto Facade em Java. O sistema inclui funcionalidades para gerenciar um carrinho de compras, processar pagamentos e enviar confirmações de compra por e-mail.

## Descrição do Sistema

O sistema de compras online permite que os usuários adicionem itens ao carrinho, processem o pagamento e recebam uma confirmação por e-mail. Para simplificar a interação com esses componentes, utilizamos o padrão de projeto Facade, que fornece uma interface unificada para um conjunto de interfaces em um subsistema.

### Funcionalidades

1. **Adicionar Item ao Carrinho**: Os usuários podem adicionar itens ao carrinho especificando o nome do item e a quantidade desejada.
2. **Remover Item do Carrinho**: Os usuários podem remover itens do carrinho especificando o nome do item e a quantidade a ser removida.
3. **Finalizar Compra**: Ao finalizar a compra, o sistema processa o pagamento e envia uma confirmação por e-mail ao usuário.

### Padrão de Projeto Utilizado

#### Facade

O padrão de projeto Facade é utilizado para fornecer uma interface simplificada para interagir com múltiplos subsistemas. No nosso sistema, a classe `SistemaCompraOnline` atua como a fachada, coordenando as operações entre os subsistemas `CarrinhoDeCompras`, `ProcessamentoPagamento` e `EnvioEmail`.

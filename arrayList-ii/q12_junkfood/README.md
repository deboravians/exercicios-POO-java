# Junkfood
Máquinas de junk food só servem pra 2 coisas: vender comidas que fazem mal pra saúde e rejeitar as notas velhas que você tem.

O objetivo dessa atividade é implementar uma classe responsável por uma máquina de vender JunkFood. Na máquina existem várias espirais (slots). Uma espiral contém uma certa quantidade de produtos do mesmo tipo e mesmo preço. O usuário coloca o dinheiro, compra o produto e recebe o troco.

## Funcionalidades
Seu sistema deverá ser capaz de:

- Iniciando a máquina
  - Iniciar a máquina definindo o número de espirais.
    - Se já houver uma máquina, então apague tudo e inicie uma nova máquina.
  - Mostrar o conteúdo de cada espiral.
    - Índice, nome do produto, quantidade de produtos e preço.
    - Coloque um “empty” no nome do produto para informar que não há produto definido.
- Algo pra comer
  - Definir quais produtos há em cada espiral passando as informações do produto.
- Resetar uma espiral
  - Limpar todas as informações da espiral voltando ao seu estado original.
- Dinheiro vai
  - Inserir dinheiro na espiral.
    - Abstraia como o dinheiro vai. Crédito, débito, bitcoin, cédula nova ou velha.
  - Receba o dinheiro do usuário e vá adicionando ao saldo.
  - Alterar o mostrar máquina para mostrar o saldo também.
- Comida vem, Dinheiro vem, Erros também
  - Permitir que o cliente possa comprar um produto de uma espiral.
    - Verificar se a espiral existe.
    - Verificar se existe o produto e se o valor do pagamento é suficiente.
    - Tratar todos esses erros.
    - Mostrar o nome do produto que ele pediu.
  - Quando o cliente pedir o troco, mostre o quanto ele tinha de saldo e zere o saldo.
    
## Diagrama
![Diagrama](https://github.com/deboravians/exercicios-POO-java/blob/main/arrayList-ii/q12_junkfood/diagrama.png)
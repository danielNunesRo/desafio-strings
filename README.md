# Desafio 1: Strings

Após ler o coding style do kernel Linux, você descobre a mágica que é
ter linhas de código com no máximo 80 caracteres cada uma.

Assim, você decide que de hoje em diante seus e-mails enviados também
seguirão um padrão parecido e resolve desenvolver um plugin para te ajudar
com isso. Contudo, seu plugin aceitará no máximo 40 caracteres por linha.

Implemente uma função que receba:
1. um texto qualquer
2. um limite de comprimento

## Implementação

Implementei uma solução em Java que formata textos de acordo com um limite de caracteres por linha e com alinhamento justificado.

### Funcionalidades

- **Limite de 40 caracteres por linha**: O texto é quebrado em linhas que não ultrapassam 40 caracteres.
- **Alinhamento justificado**: As linhas (exceto a última) são justificadas para que todas tenham exatamente 40 caracteres.

### Como Usar

1. Clone o repositório.
2. Compile o projeto Java.
3. Utilize a classe `IdwallFormatter` para formatar o texto conforme os exemplos de entrada.

### Exemplo de Uso

```plaintext
In the beginning God created the heavens and the earth. Now the earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters.

And God said, "Let there be light," and there was light. God saw that the light was good, and he separated the light from the darkness. God called the light "day," and the darkness he called "night." And there was evening, and there was morning - the first day.

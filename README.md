# Championship

Este trabalho em Java tem como objetivo simular um campeonato de futebol utilizando Java e orientação a objetos.

## Funcionamento básico

Há 4 classes importantes nesse código. A classe "Team" representa um time e suas características. A classe "Game" representa um jogo que ocorreu ou ocorrerá. A classe "Calendar" representa o calendário de jogos. Por fim, a classe "Counter" representa a parte do sistema que contabilizará os resultados do jogo, ou seja, o contador.

O funcionamento básico ocorre em duas etapas. Primeiro, é necessário criar os times que vão jogar. Após isso, criam-se os jogos e, nesses jogos, fica determinado quem jogará com quem e quando o jogo ocorrerá. Após, cria-se um calendário (que é, basicamente, uma lista de todos os jogos) e, por fim, um contador que, ao ser construído, recebe o calendário previamente criado. Repare que, nessa primeira etapa, o algoritmo percorre os objetos do mais baixo nível (que são os times) até o mais alto nível (que é o contador).

Depois disso, é feito o caminho inverso. O contador 'varre' o calendário e acessa cada um os jogos. Caso o jogo tenha sido jogado (ou seja, ele ocorreu numa data anterior a atual), ele acessa os times participantes da partida e atualiza seus dados do campeonato.

O contador também guarda uma lista de times pare que, depois dos stats dos times serem atualizados, ele consiga ordená-los como num ranking.

Note que optamos por usar ArrayLists nesse trabalho, porque é algo sobre o qual estávamos querendo aprender.

Além disso, perceba que a classe Date existe só para haver uma boa formatação de datas.

## Os testes

Cada uma dessas classes principais possui um arquivo de teste para podermos testar os maiores pontos de erro, que são, na nossa visão, atribuições erradas a variáveis muito importantes. Por exemplo, o arquivo CounterTest possui um teste para ver se a lista de times contém todos os times necessários, visto que isso é algo muito importante.

Além desses testes pequenos de partes específicas do código, há também dois que simulam uma situação hipotética mais geral. Em um deles, o FourTeamsTest simula um campeonato completo com 4 times jogando no modelo todos-contra-todos. Já o UncompletedChampionshipTest simula um campeonato aos mesmos moldes do anteior (mas com 5 times) que ainda não acabou.

Obs: o código e seus comentários internos foram escritos em inglês.
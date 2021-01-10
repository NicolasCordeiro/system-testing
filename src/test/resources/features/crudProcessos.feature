#language: pt

@agapito
Funcionalidade: CRUD de Processos

  Contexto: Cadastro de um Processo
    Dado que o usuário está na página inicial
    E o usuário clica no menu processos
    E o usuário clica no botão novo processo
    E o usuário informar no campo "vara" o valor "3"
    E o usuário informar no campo "numero processo" o valor "4"
    E o usuário informar no campo "natureza" o valor "Guarda"
    E o usuário informar no campo "partes" o valor "Jose x Maria"
    E o usuário informar no campo "urgente" o valor "Sim"
    E o usuário informar no campo "arbitramento" o valor "Não"
    E o usuário informar no campo "assistente social" o valor "Gisele"
    E o usuário informar no campo "data entrada" o valor "20/10/2020"
    E o usuário informar no campo "status" o valor "Aguardando"

  Cenário: Criar um novo processo
    Quando o usuário clicar em salvar
    Então o usuário deveria ver a mensagem "Processo foi criado com sucesso."


  Esquema do Cenario: Validação do cadastro de processo, com esquema de cenário (<id_processo>)
    Dado que o usuário está na página inicial
    E o usuário clica no menu processos
    E o usuário clica no botão novo processo
    E o usuário informar no campo "vara" o valor "<vara>"
    E o usuário informar no campo "numero processo" o valor "<numero_processo>"
    E o usuário informar no campo "natureza" o valor "<natureza>"
    E o usuário informar no campo "partes" o valor "<partes>"
    E o usuário informar no campo "urgente" o valor "<urgente>"
    E o usuário informar no campo "arbitramento" o valor "<arbitramento>"
    E o usuário informar no campo "assistente social" o valor "<assistente_social>"
    E o usuário informar no campo "data entrada" o valor "<data_entrada>"
    E o usuário informar no campo "data saida" o valor "<data_saida>"
    E o usuário informar no campo "data agendamento" o valor "<data_agendamento>"
    E o usuário informar no campo "status" o valor "<status>"
    E o usuário informar no campo "observacao" o valor "<observacao>"
    Quando o usuário clicar em salvar
    Então o usuário deveria ver a mensagem "<mensagem>"

    Exemplos:
      |	id_processo	|	vara		|	numero_processo	|	natureza	|	partes				|	urgente	|	arbitramento	|	assistente_social	|	data_entrada|	data_saida	|data_agendamento|	status		|observacao	|	mensagem						                |
      |	1			| São Paulo		|	00112456		|	criminal	|	Guilherme x Nicolas	|	Sim		|	Não				|	Rosa				|	01/02/2020	|				|				|	Em Andamento|			|	Processo foi criado com sucesso.	            |
      |	2			|       		|	00229877		|	civil		|	Guilherme x Nicolas	|	Sim		|	Não				|	Maria				|	19/04/2020	|				|				|	Aguardando	|			|	Vara não pode ser deixado em branco	            |
      |	3			| Santo Andre	|	00219709		|	empresarial	|	Guilherme x Nicolas	|	Não		|	Não				|	Fernando			|	16/08/2020	|				|				|	Aguardando	|			|	Processo foi criado com sucesso.                |
      |	4			| Cotia			|	01237663		|	criminal	|	Guilherme x Nicolas	|	Sim		|	Sim				|	Joice				|		        |				|				|	Arquivado	|			|	Data entrada não pode ser deixado em branco     |

  Cenário: Detalhar um processo criado
    Quando o usuário clicar em salvar
    E o usuário deveria ver a mensagem "Processo foi criado com sucesso."
    E o usuário clicar no botão voltar
    Quando o usuário clicar em mostrar
    Então o usuário deveria ver no campo "vara" o valor "3"
    E o usuário deveria ver no campo "numero processo" o valor "4"
    E o usuário deveria ver no campo "natureza" o valor "Guarda"
    E o usuário deveria ver no campo "partes" o valor "Jose x Maria"
    E o usuário deveria ver no campo "urgente" o valor "S"
    E o usuário deveria ver no campo "arbitramento" o valor "N"
    E o usuário deveria ver no campo "assistente social" o valor "Gisele"
    E o usuário deveria ver no campo "data entrada" o valor "2020-10-20"
    E o usuário deveria ver no campo "status" o valor "Aguardando"


  Cenário: Alterar um processo criado
    Quando o usuário clicar em salvar
    E o usuário deveria ver a mensagem "Processo foi criado com sucesso."
    E o usuário clicar no botão editar
    E o usuário informar no campo "natureza" o valor "Natureza Editada"
    Quando o usuário clicar em salvar
    Então o usuário deveria ver a mensagem "Processo atualizado com sucesso."

  Cenário: Deletar um processo criado
    Quando o usuário clicar em salvar
    E o usuário deveria ver a mensagem "Processo foi criado com sucesso."
    E o usuário clicar no botão voltar
    Quando o usuário clicar em apagar
    Então o usuário deve clicar em ok para confirmar a deleção
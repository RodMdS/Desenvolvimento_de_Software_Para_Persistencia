# Software_Para_Persistencia
Atividades da disciplina de Desenvolvimento de Software para persistência pela Universidade Federal do Ceará - Campus Quixadá

## YodaBookStore
Yoda tem uma pequena livraria e gostaria de criar um pequeno sistema que torne automático o processo de vendas e compras dos livros. Na livraria do Yoda tem três tipos de livros, a saber: aventura, drama e comédia. Todos os livros possuem nome, valor, quantidade em estoque e um identificador único (isbn). Os livros de aventura possuem ilustrações; os livros de drama podem possuir capa dura; e os de comédia podem possuir capa tipo brochura. Sobre os clientes, Yoda precisa dos seguintes dados: nome, cpf, data de nascimento e endereço. Yoda gostaria de adicionar e remover clientes. Ele também gostaria de adicionar livros no sistema, vender livros e consultar qual o seu estoque de livros. Sua tarefa é implementar o sistema da livraria do Yoda. Não precisa utilizar interface gráfica. Contudo, é necessário uma navegabilidade no sistema mesmo que via teclado. Utilize manipulação de arquivo (sem serialização) para salvar os dados dos clientes e serialização para salvar dos dados dos livros.

## csv_to_xml_to_json
Escreva uma aplicação (preferencialmente em JAVA) para ler o(s) arquivo(s) CSV dos dados escolhidos e grave-os em um arquivo XML (arquivo destino) utilizando a API DOM. Adicione valores como atributos, se achar mais conveniente do que uma tag interna (você deve avaliar se faz mais sentido como uma tag interna ou como atributo). Se forem vários arquivos CSV com tabelas relacionadas (chaves estrangeiras, relações tem-um, é-um), a árvore do seu XML será mais complexa, com mais nós internos. Nesse caso, seu trabalho será melhor avaliado.

Elabore arquivos DTD e XML Schema que validem o XML gerado. Você pode testar suas validações com o programa xmllint, no terminal do Linux (também é possível instalá-lo no Windows, mas em muitas versões do Linux ele já está instalado). 

Escreva uma aplicação (preferencialmente em JAVA) que lê o XML acima utilizando a API SAX. Você deve ler os dados do XML em objetos em memória. O resultado da sua aplicação deve ser a persistência desses objetos em um arquivo JSON.

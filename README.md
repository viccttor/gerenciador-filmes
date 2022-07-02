# 🎓 Gerenciador de Filmes 🎓 

Station One - back-end.

## 

##  🛠️ Tecnologias e Ferramentas

* Java 11
* Spring Boot
* JPA Hibernate
* PostgreSQL
* Eclipse IDEA
* Postman

## 🔎Funcionalidades

* Cadastro de filme
* Listagem de Filmes
* Busca de filme por id
#

## Estrutura da API
### Filme Controller

| Rest   | URL                          | Função                            |
|--------|------------------------------|-----------------------------------|
| POST    	| /gerenciador-filmes/cadastro-de-filmes       	| Cadastrar um filme |
| GET   	| /gerenciador-filmes/listagem-de-filmes     	| Listar Todos os filmes cadastrados               |
| GET    	| /gerenciador-filmes/buscas-de-filmes-por-id 	| Buscar filme por id           |



###### Apresentação

1. Cadastro de filme
2. Listagem de Filmes
3. Busca de filme por id

### Utilizando á API

* Cadastrando Filme - 01

```
{
  "id": 0,
  "titulo": "Harry Potter e a Pedra Filosofal",
  "descricao": "Harry Potter é um garoto órfão que vive infeliz com seus tios, os Dursleys. 
Ele recebe uma carta contendo um convite para ingressar em Hogwarts, uma famosa escola especializada 
em formar jovens bruxos. Inicialmente, Harry é impedido de ler a carta por seu tio, mas logo recebe a 
visita de Hagrid, o guarda-caça de Hogwarts, que chega para levá-lo até a escola. Harry adentra um mundo 
mágico que jamais imaginara, vivendo diversas aventuras com seus novos amigos, Rony Weasley e Hermione Granger",
  "autor": " J. K. R"
}
```
```
{
  "id": 0,
  "titulo": "Harry Potter e a Câmara Secreta",
  "descricao": "Após as sofríveis férias na casa dos tios, Harry Potter se prepara para voltar a Hogwarts e começar
 seu segundo ano na escola de bruxos. Na véspera do início das aulas, a estranha criatura Dobby aparece em seu quarto 
e o avisa de que voltar é um erro e que algo muito ruim pode acontecer se Harry insistir em continuar os estudos de bruxaria. 
O garoto, no entanto, está disposto a correr o risco e se livrar do lar problemático.",
  "autor": " J. K. R"
}
```

```
{
  "id": 0,
  "titulo": "Harry Potter e o Prisioneiro de Azkaban",
  "descricao": "É o início do terceiro ano na escola de bruxaria Hogwarts. Harry, Ron e Hermione têm muito o que aprender. 
Mas uma ameaça ronda a escola e ela se chama Sirius Black. Após doze anos encarcerado na prisão de Azkaban, ele consegue escapar e 
volta para vingar seu mestre, Lord Voldemort. Para piorar, os Dementores, guardas supostamente enviados para proteger Hogwarts e seguir 
os passos de Black, parecem ser ameaças ainda mais perigosas.",
  "autor": " J. K. R"
}
```
* Listagem de Filmes

```
Não precisa de parâmetros.
```

* Buscar por id

```
id: 1
```
#### ✒️Autor - [Victor Henrique](https://github.com/viccttor) | [Linkedin](https://www.linkedin.com/in/viccttor/)
#
<div>
 <a href="http://crud-sample-full.herokuapp.com/crud-sample" target="_blank"><img src="https://img.shields.io/badge/Heroku-430098?style=for-the-badge&logo=heroku&logoColor=white" target="_blank"></a> 
</div>

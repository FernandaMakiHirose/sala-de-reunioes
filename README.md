# Gerenciador de salar de reuniões com Java e Angular
Desenvolvi uma API com Spring Boot para gerenciar salas de reunião, utilizei o Spring Data para persistência de dados e o banco in-memory H2 e o Front End que irá consumir essa API será uma SPA escrita em Angular.

## Pré-requisitos
- Java.
- Node.JS.
- IDE.

## Conteúdo Extra
- Desenvolver SPAs: uma aplicação web que roda em uma única página e atualiza só o que você desejar. 
- O que são Lifecycle Hooks? Isso é realizado pelo Angular criando o componente, renderizando, criando e renderizando seus filhos, verificando modificações nas propriedades e no DOM, realizando alterações, destruindo e removendo o DOM. 
- ngOnChanges(): Também é chamado quando há alteração de propriedade dentro do seu componente.
- ngOnInit(): Este é chamado depois do ngOnChanges(), só é chamado uma única vez, inicializa o componente, define e exibe suas propriedades de entrada. 
- ngDoCheck(): É chamado durante todas verificações de mudança durante a execução, geralmente depois que o NgOnInit é chamado.
- ngAfterContentInit(): Só é executado uma vez depois que o primeiro ngDoCheck é chamado, semelhando ao ngDoCheck, mas projetado para vizualização do componente.
- ngAfterContentChecked(): Este hook é chamado depois que o conteúdo projetado para a visualização do componente é inicializado, após o ngAfterContentInit e ngDoCheck forem chamados.
- ngAfterViewInit(): Chamado após as visualizações dos componentes e seus subsequentes filhos, após a execução do hook ngAfterContentChecked.
- ngOnDestroy(): É chamado antes do componente ser removido do DOM. É feito a limpeza do componente, desde a desanexação de event handlers até a desinscrição de observables. 

## Versão do projeto
9.0.0-rc.7.

## Comandos
Dentro da pasta client-angular:
>npm install

Logo em seguida:
>ng serve

Abra no seu navegador para criar um room:
>http://localhost:4200/add

Abra no seu navegador para ver o room criado:
>http://localhost:4200/rooms 

Para gerar um novo componente:
>ng generate component component-name

Build do projeto - Armazenado dentro da pasta `dist/`:
>ng build  

Produção do build:
>--prod

Teste unitário:
>ng test 

Teste end-to-end:
>ng e2e 

Verificar versão do Node.JS:
>node -v

Verificar versão do NPM:
>npm -v

Instalar Angular do projeto:
>npm install -g @angular/cli@9.0.0-rc.7

Verificar a versão do Angular:
>ng --version

Criar projeto:
>ng new client-room

## Sobre a Autora
Oi, eu sou a Fernanda! Estou aqui para contribuir com meu conhecimento e espero poder ajudar no desenvolvimento profissional de cada um de vocês.

[![Linkedin Badge](https://img.shields.io/badge/-Fernanda_Maki_Hirose-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/fernanda-maki-hirose-801117208/)](https://www.linkedin.com/in/fernanda-maki-hirose-801117208/)  [![Gmail Badge](https://img.shields.io/badge/-femahi2020@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:femahi2020@gmail.com)](mailto:femahi2020@gmail.com)

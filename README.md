Modelo de Domínio para E-Commerce

Sobre o Projeto

Este projeto é um sistema simples de e-commerce feito em Java. Ele foi inspirado em um modelo de domínio que organiza as partes principais de um sistema de vendas online, como produtos, pedidos e pagamentos.

Funcionalidades

Usuários: Cadastro e gerenciamento de informações como nome, e-mail e senha.

Produtos: Listagem, descrição, preço e categorias.

Pedidos: Registro de pedidos com itens e status (ex.: aguardando pagamento, pago, enviado, entregue, cancelado).

Pagamentos: Registro de pagamento associado a um pedido.

Como Funciona

Entidades Principais:

Produto: Tem um nome, descrição, preço e imagem. Pertence a uma ou mais categorias.

Categoria: Organiza produtos por tipo (ex.: Eletrônicos, Roupas).

Usuário: Representa o cliente que faz pedidos.

Pedido: Contém itens e um status que indica o progresso (ex.: pago, enviado).

Item do Pedido: Mostra a quantidade e o preço de um produto em um pedido.

Pagamento: Relacionado a um pedido e registra o momento do pagamento.

Tecnologias Utilizadas

Java: Linguagem de programação principal do projeto.

Spring Framework: Para injeção de dependência e gerenciamento de componentes.

Spring Boot: Para facilitar a configuração e execução do projeto.

Hibernate: Para mapeamento objeto-relacional (ORM).

Maven: Para gerenciar dependências e o ciclo de vida do build.

H2 Database: Banco de dados em memória usado para testes.

Requisitos

Java 11 ou superior.

Maven ou Gradle (para gerenciar dependências).

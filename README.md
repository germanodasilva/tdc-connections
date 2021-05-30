# TDC Connections - 2021
## _Simplicidade num ecosistema de apps Java: Como resolver isso com Quarkus_



![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)

### Introdução
O Quarkus é um framework Java nativo em Kubernetes e de stack completo que foi desenvolvido para máquinas virtuais Java (JVMs) e compilação nativa. Ele otimiza essa linguagem especificamente para containers, fazendo com que essa tecnologia seja uma plataforma eficaz para ambientes serverless, de nuvem e Kubernetes.

O Quarkus foi desenvolvido para funcionar com os padrões, frameworks e bibliotecas Java mais utilizados, como o Eclipse MicroProfile, Spring, Apache Kafka, RESTEasy (JAX-RS), Hibernate ORM (JPA), Infinispan, Camel e muitos outros.

A solução de injeção de dependência do Quarkus é baseada em Contexts and Dependency Injection (CDI). Além disso, ela inclui um framework para ampliar a funcionalidade e configurar, inicializar e integrar frameworks na sua aplicação.

Ele também oferece as informações corretas ao GraalVM (uma máquina virtual universal para executar aplicações escritas em diversas linguagens, incluindo Java e JavaScript) para compilação nativa da aplicação.

### Provisionando a infraestrutura 
A Red Hat disponibiliza para os desenvolvedores duas formas de ter sua plataforma de containers:


#### Code Ready Containers
Permite a criação de um cluster Openshift local com as features de desenvolvimento habilitadas.
https://cloud.redhat.com

#### Red Hat Developers
Disponibiliza por 30 dias consecutivos um ambiente de Sandbox provisionado nas nuvens públicas. 
https://developers.redhat.com/developer-sandbox/get-started

## Criando a estrutura para o projeto
Você pode criar a estrutura, namespaces, deploy de produtos através da console web ou via CLI.

#### 1 Criando a namespace
![Criando namespace](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/main/img/01-namespace.png)
```sh
oc login --token=<token-gerado> --server=https://api.crc.testing:6443
oc new-project tdc-connections-2021
```

#### 2 Validando o acesso a namespace

![Criando namespace](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/main/img/02-namespace-2.png)

#### 3 Mudando na console a visão para Desenvolvedor
![Criando namespace](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/main/img/03-namespace-developer.png)
#### 4 Implantando o Red Hat Single Sign On no OPenshift
![Criando namespace](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/main/img/04-select-sso.png)

![Criando namespace](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/main/img/05-propertie-sso.png)
![Criando namespace](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/main/img/06-install-template.png)

### Configurando a autorização do SSO

#### 1
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-01.png)

#### 2
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-02.png)

#### 3
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-03.png)

#### 4
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-04.png)

#### 5
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-05.png)

#### 6
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-06.png)

#### 7
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-07.png)

#### 8
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-08.png)

#### 9
![Configurando o SSO](https://raw.githubusercontent.com/germanodasilva/tdc-connections-2021/developer/img/sso-09.png)




   




| Plugin | README |
| ------ | ------ |
| Dropbox | [plugins/dropbox/README.md][PlDb] |
| GitHub | [plugins/github/README.md][PlGh] |
| Google Drive | [plugins/googledrive/README.md][PlGd] |
| OneDrive | [plugins/onedrive/README.md][PlOd] |
| Medium | [plugins/medium/README.md][PlMe] |
| Google Analytics | [plugins/googleanalytics/README.md][PlGa] |

   
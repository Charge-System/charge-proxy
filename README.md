Charge Proxy - Sistema de Gerenciamento de Cobranças

- Executando o projeto
Para limpar a pasta target/, compilar o projeto e gerar o WAR:
Abra o painel do Maven -> Lifecycle -> clean -> package

- Cria imagem contendo o .WAR da aplicação no servidor Apache TomCat
``docker build -t charge-images/chargeproxy:1.0 .``

- Iniciar o Swarm na Aplicação Docker
``docker swarm init``

- Subir serviços no Swarm
``docker stack deploy -c docker-swarm.yml app``

- Verifique se os serviços estão em execução
``docker service ls``



Para expor o serviço local utilizamos o **ngrok**. Ele cria um túnel entre o serviço local e o acesso externo. Para utilizar, 
se faz necessário baixar ele em ``https://ngrok.com/download/windows?tab=download``.
Após baixar, rode o .exe, isso vai abrir um temrinal na tela, para expor o serviço presente no webhook do ASAAS, digite: 
``ngrok http 8081``
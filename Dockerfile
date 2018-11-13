FROM ubuntu:latest
RUN apt-get update
RUN apt-get -y install curl wget openssh-client sshpass unzip rsync
RUN apt-get clean
RUN apt-get install -y gnupg
RUN curl -sL https://deb.nodesource.com/setup_8.x | bash -
RUN apt-get -y install nodejs
RUN npm install -g @angular/cli
RUN apt-get -y install git
CMD ["bash"]

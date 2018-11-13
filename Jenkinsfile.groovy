node{
checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'bd99e736-db20-4244-aec5-e0c6c8f6b7fd', url: 'https://github.com/chitrarathkumar/angularnode.git']]])
stage 'build'
    sh "docker build -t maven-jdk-8-docker-image:$BUILD_ID ."
    sh "docker tag maven-jdk-8-docker-image:$BUILD_ID maven-jdk-8-docker-image:latest"
}

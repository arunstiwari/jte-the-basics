void  call(){
    stage("Git: clone repository"){
        String repoUrl = config.repoUrl;
        String branch = config.branch;
        String credentialsId = config.credentialsId;

        checkout([$class: 'GitSCM', branches: [[name: branch]], extensions: [], gitTool: 'Default', userRemoteConfigs: [[credentialsId: credentialsId, url: repoUrl]]] )
    }
}
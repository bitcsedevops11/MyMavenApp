pipeline{
agent any
tools{
maven 'Maven'
}
stages{
stage('Checkout'){
steps{
git branch:'master',url:'https://github.com/bitcsedevops11/MyMavenApp.git'
}
}
stage('Build'){
steps{
sh 'mvn clean package'}
}
stage('Archive'){
steps{
archiveArtifacts artifacts:'target/*.jar',fingerprint:true
}
}
}
post{
success{
echo 'Build success'
}
failure{
echo 'Build failed'
}
}
}


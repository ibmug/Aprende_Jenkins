def call(Map config){
    node{
        echo ${config.message}
        sh '''
        echo "Hello, World, this is a groovy file by PirataGomo!"
        git version
        java -version
        mvn -version
        '''
    }
}
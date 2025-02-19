def call(){
    node{
        sh '''
        echo "Hello, World, this is a groovy file by PirataGomo!" > /tmp/hello.txt
        git version
        java -version
        mvn -version
        '''
    }
}
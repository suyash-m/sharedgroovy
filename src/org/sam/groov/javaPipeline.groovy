def call( Map pipelineDefinition){

pipeline{

agent any

stages{
 stage('Build'){

echo "Hello ${pipelineDefinition.name}"

 }


}

}

}

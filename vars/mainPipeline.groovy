import src.org.sam.groov.*
def call(){
 checkout scm
echo 'Loading pipeline definition'
		Map pipelineDefinition = readYaml file: 'pipelineconfig.yml'
pipelinetype= pipelineDefinition.pipelineType

switch(pipelinetype) {

    case 'java':
    javaPipeline pipelineDefinition
break;


}
}

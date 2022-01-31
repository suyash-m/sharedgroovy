imprt src.org.sam.groov
node{
def call(){

echo 'Loading pipeline definition'
		Map pipelineDefinition = readYaml file: 'pipelineconfig.yml'
pipelinetype= pipelineDefinition.pipelineType

switch(pipelinetype) {

    case 'java':
    javaPipeline pipelineDefinition
   break;

}
}
}


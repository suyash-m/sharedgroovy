imprt src.org.sam.groov

def call(){

echo 'Loading pipeline definition'
Map pipelineDefinition = readYaml file: 'pipelineconfig.yml'
	echo '${pipelineDefinition.pipelineType}'
pipelinetype= pipelineDefinition.pipelineType

switch(pipelinetype) {

    case 'java':
    javaPipeline pipelineDefinition
   break;

}
}



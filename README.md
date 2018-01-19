# question-service

## Overview
This is a spring-boot micro-service. It contains exam-type and questions in json format.

#### Build the project

	gradle clean assemble
	
### Post request

	curl -i -X POST -H "Content-Type:application/x-www-form-urlencoded" -d 'examType=test&questions={"questions":[{"qno":"1","q":"is Seg1 and is already deployed in FDBS00301 space Create a new environment variable with the value and make it available to the application.Five"},{"qno":"2","q":"docker Q2"},{"qno":"3","q":"docker"}]}' https://question-service-anemic-allonym.cf-apps.biarca.com/postQuestions

 
### Get request 
	https://question-service-anemic-allonym.cf-apps.biarca.com/getQuestions?examType=docker

#### How to run in local environment:

	$ Java -jar build/libs/question service-0.0.1-SNAPSHOT.jar
    

#### How to run in Pivotal CloudFoundry
	$ cf push
	
#### Cloud Dependent services
 	1.MySQL DB service with the name 'question-db'
	2.Eureka serivce with the name 'eureka-service'
  	3.Configuration serivce with the name 'config-service'
  	
#### Sample JSON Request to question service .
```
https://question-service-homogeneous-otoscope.cf-apps.biarca.com/postQuestions
Content-Type: application/x-www-form-urlencoded
```
JSON Parameters for Cloud Foundry
```
examType=Cloud Foundry&questions={
    "questions": [{
            "qno": "1",
            "q": "Push the application named \" application1 \" In the \"biarca-APP1 \"  space using php buildpack. Make sure it is in running state."
        },
        {
            "qno": "2",
            "q": "In the  \"biarca-APP2 \" space you will find an application \" application2 \" already running.<ul><li>Please change the number of application instances to 2.</li><li>Please increase the memory limit to 768M.</li></ul>"
        },
        {
            "qno": 3,
            "q": "Push the docker image to the space name \"biarca-APP3\"<ul><li>Use image  \"immerseexams/biarcatest\"</li><li>App name should be \"dockerapp\"</li><li>App should have unique route</li><li>App should have at least 512M of memory.</li></ul>"
        }
    ]
}

```
JSON Parameters for Couchbase
```
examType=Couchbase&questions={
	"questions": [{
			"qno": "1",
			"q": "<p>Create bucket with name bucket</p>"			
		}
		
	]
}
```
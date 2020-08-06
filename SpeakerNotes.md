__Speaker Notes__

@Naresh

1. __Project Selection__ : 
Survey Application with APIs to configure survey definition, participants, questions and answers, send the survey details, receive Survey response and
process and save results, create reports.
Since this is an existing feature in REMS which we intend to modernize, this project helped us build a prototype which we can enhance and incorporate more behaviors to be able to create
the complete product in near future.

@Supriya

2. __MVP and Project Enablers__  

We have listed down behaviors associated with the product, however, we decided to go with some behaviors to create a runnable project with essential base behaviors,
those being, Survey configuration  of the components (CRUD on SurveyDefinition, Participant, Questions and Answers), asynchronous communication to Participants with
unique Survey details.

 * _Github_ - source control strategy : We used individual branching to build code and Pull requests to merge, review being mandatory for each merge.
 * _Git Projects_ – Behaviors were defined for all features of the product, granularity being tasks that can be established in a day’s time. Out of all the                             behaviors, we selected the MVP ones and worked on the same to move it through the Kanban board.
 * MOM : To track project progress

@Prashanti

3. __Tech stack what and Why__ : 

Below is the Tech Stack we chose to build this project :

* SpringBoot – To build the survey microservices, integrate each, create email communication.
* Velocity Engine - Email template.
* Kafka (Confluent and Dockerised) – To send and receive Survey communication over messaging queue.
* Docker (Containerization) – To build each service in a container and compose them together using docker compose to bring up the applications.
* Selenium and RestAsssured for testing end to end.
* Git actions - CI used during the build
* Mckesson concourse Pipeline - CI-CD

@Corban
4. __Project Architecture__ : 

* HLD 
* Modules/Microservices :
  * SurveyApi - Survey components creation and integration (CRUD on SurveyDefinition, Participant, Questions and Answers), trigger survey to Kafka Producer.
  * ProducerApi – Create Kafka topic and publish the same to Kafka Server
  * ConsumerApi – Consumer the sent topic to create email communication and trigger the same.

@Sanket
5. __Actual Demo__ :

* MVN Test (Git actions CI with maven build showcase)
* Selenium workflow to load the configuration
  * Creating Survey definition
  * Adding participants
  * Adding Question and answers
  * Triggering Correspondence from SurveyDefinition

@Corban

6. __Retrospective__ :

* Added Retro from MOM
* Github actions refactoring fun kafka producer/ consumer sample project good team collaboration object conversion 
* Using reflection is hard in meta programming.
* Priorities for each team member's task should be identified at the time of assignment
* Cloud Services are expensive
* Development Environment can break anytime and kill your time
* Kafka with Spring book
* Service Factory Implementation can break your code and Tests
* Kafka String/Json (Requires Serialization) Implementations
* Kafka Networking
* Environment variables
* Kafka vs Spring classpath for JSON deserialization.
* Team collaboration
* Team's enthusiasm to take up new tasks and determination to finish the work.
* Git Hub transfer ownership
* Setting up concourse pipelines
* Kafka from confluent is easy simple setup
* Swagger integration is simple
* Little things matter ex '=' or ' '
* Save v/s Update to identify why not updating. Missing Setter implementation on Entity, method Implementation exists.
* Method Definition in Abstract and Implementation has same definition. So it's infinite recursion and faces stake overflow error.
* Selenium, TestNJ, RestAssured having fun with
* Port 9000 not to be used for Survey. Port mapping to be reviewed w.r.t. OS port usage. Springdoc open Api usage for swagger. 
* Springfox dependency issues. Kafka : Consumer to have Producer as trusted package. 
* VPN for email connectivity.
* End to end automated testing identified uncovered behaviors To integrate Mckesson CI/CD pipeline the Github Repository's visibility has to be internal

# Test Framework

Test Framework is intended to create, maintain and execute E2E test cases.
Test documentation is maintained within the src/test/resources folder. Test case is represented by yaml file containing test steps.
Test step resembles a user's utterance in the dialog with the chatbot and contains information about expected chatbot's response, so that each scenario can be verified.

Tests are run using parameterised class TestRunner.java, which iterates through yaml files and executes test steps one by one for each provided test case.
Results of each execution are generated using allure reporting and can be published as a part of the CI/CD pipeline step.

An important pre-requisite for testing is an external service, which can be called by chatbot-test-framework to actually reach chatbot and get the response back.
This external service can be implemented separately or within the current project.

Current project is only intended for testing of WhatsApp chatbots. If other messengers are required, they have to be implemented separately. However, a set of interfaces is highly recommended in this case, so that messaging process can be properly set on the necessary abstraction level.

### Usage

#### To execute automated test cases and build a report:

* Install allure:
  <details>
    <summary>For Linux</summary>
    <ul>
        <li>sudo apt-add-repository ppa:qameta/allure</li> 
        <li>sudo apt-get update</li>
        <li>sudo apt-get install allure</li>
    </ul>
  </details>
  <details>
    <summary>For Mac</summary>
    <ul>
        <li>Navigate to <a href="https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/">Allure</a></li> 
        <li>Download .zip file and save at some allure-directory.</li>
        <li>Update PATH variable: export PATH=/Users/{username}/{allure-directory}/bin:$PATH</li>
    </ul>
  </details>
* ```mvn clean test```
* ```mvn allure:serve```
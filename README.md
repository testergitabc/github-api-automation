## GitHub API Automation
This automation test suite includes the tests for testing of the GitHub APIs at <https://developer.github.com/v3>

# github-api-automation
Automation project

# Tests
1. Testing of the "Licenses" end point, verify the response 200 and the response content is validated
2. Testing github's gitignore templates api, verifying 200 response and validating specific template(eg Java)

# Running the test
1. cd to project root directory <project-root>
2. gradlew clean build runTests - build and run the test
3. Test reports will be avaialable at <project-root>/build/reports/

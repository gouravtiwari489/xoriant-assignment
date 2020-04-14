Steps to set-up project on local:

- clone the project on local by hitting following command from terminal: 
git clone https://github.com/gouravtiwari489/xoriant-assignment.git

- after cloning run following command ro build project on local: ./gradlew clean build
- once the build is successful, run the following command: ./gradlew bootRun

- add the data by hitting the following end-point: http://localhost:8899/base  (please pass id field in input request 
body, sample json is attached in email for input request,
didn't use h2 DB, storing the data 
in map for time being, let me know if you want me to add h2 DB configuration, will add it)

- http://localhost:8899/base/1 (1 is the path variable which is the record which was added with the id as 1, and pass 
the json you want to compare with base as body)

- In response you will get the difference between base and input to be compared, sample response attached in email
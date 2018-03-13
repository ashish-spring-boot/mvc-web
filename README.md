# mvc-web
an mvc web app with spring boot and spring-boot-starter-web


Spring boot components used:
1. Spring boot starter web
2. Spring boot starter data jpa
3. Thymeleaf
4. H2 database

The app is hosted on Amazon Elastic beanstalk at the url:
http://mvcweb-env.us-east-2.elasticbeanstalk.com

The following endpoints have been exposed:

1. GET /user?id=user_id
2. POST /add 
     Request Body:
         {
            "userId":"1",
            "firstName":"fname",
            "middleName":"m name",
            "lastName":"l name",
            "age":21
         }
